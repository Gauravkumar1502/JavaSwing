/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gaurav
 */
public class managestudents extends javax.swing.JFrame {

    /**
     * Creates new form managestudents
     */
    PublicFunctions pf= new PublicFunctions();
    int max_yearsem[],i,newadmno;
    String course_type[];
    public managestudents() {
        initComponents();
        this.setLocationRelativeTo(null);
        update_bt.setEnabled(false);
        delete_bt.setEnabled(false);
        male_rb.setSelected(true);
        try{
            pf.Query="select count(*) from course";
            pf.getrec();
            pf.r.next();
            max_yearsem=new int[Integer.parseInt(pf.r.getString(1))];
            course_type=new String[Integer.parseInt(pf.r.getString(1))];
            pf.Query="select c.cname, max(c1.year_sem),ctype from course c,course_details c1 where c.cid=c1.cid group by cname;";
            pf.getrec();
            i=0;
            while(pf.r.next())
            {
                course_cb.addItem(pf.r.getString(1));
                max_yearsem[i]=Integer.parseInt(pf.r.getString(2));
                course_type[i]=pf.r.getString(3);
                i++;
                if(max_yearsem[0]>=i)   yearsem_cb.addItem(i);
            }yearsem_lb.setText(course_type[0]);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error in addig Course"+e);
        }
        setRecordsInTable();
    }
    
    
    void setRecordsInTable()
    {
        try{
            pf.Query="Select * from Student;";
            pf.getrec();
            DefaultTableModel model= (DefaultTableModel) showrecords_tb.getModel();
            while(pf.r.next())
            {
                model.addRow(new Object[] {
                                            pf.r.getString(1),
                                            pf.r.getString(2),
                                            pf.r.getString(3),
                                            pf.r.getString(4),
                                            pf.r.getString(5),
                                            pf.r.getString(6),
                                            pf.r.getString(7),
                                            pf.r.getString(10),
                                            pf.r.getString(8),
                                            pf.r.getString(9),
                                            pf.r.getString(11)
                                          } );
            }
            newadmno=Integer.parseInt(model.getValueAt(model.getRowCount()-1, 0).toString())+1;
            adm_tf.setText(""+newadmno);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erroe while setting table data into form"+e);
        }
    }
    
    
    //empty table
    void emptyTable()
    {
        DefaultTableModel model= (DefaultTableModel) showrecords_tb.getModel();
        int row=showrecords_tb.getRowCount()-1;
        while(row>=0)
            model.removeRow(row--);
    }
    
    //Set records in frame fields
    void setRecordinFrame()
    {
        add_bt.setEnabled(false);
        update_bt.setEnabled(true);
        delete_bt.setEnabled(true);
        clear_bt.setEnabled(true);
        DefaultTableModel model= (DefaultTableModel) showrecords_tb.getModel();
        int row=showrecords_tb.getSelectedRow();
        adm_tf.setText(model.getValueAt(row, 0).toString());
        name_tf.setText(model.getValueAt(row, 1).toString());
        String gen=(model.getValueAt(row, 2).toString().toUpperCase());
        if(gen.equals("M")) male_rb.setSelected(true);
        if(gen.equals("F")) female_rb.setSelected(true);
        dob_tf.setText(model.getValueAt(row, 3).toString().replace("-", ""));
        address_tf.setText(model.getValueAt(row, 4).toString());
        mobile_tf.setText(model.getValueAt(row, 5).toString());
        String course=(model.getValueAt(row, 6).toString());
        course_cb.setSelectedItem(course);
        String ys=(model.getValueAt(row, 7).toString());
        yearsem_cb.setSelectedItem(Integer.parseInt(ys));
        blood_tf.setText(model.getValueAt(row, 8).toString());
        email_tf.setText(model.getValueAt(row, 10).toString());
    }
    
    //clear frame
    void clearframe()
    {
        add_bt.setEnabled(true);
        update_bt.setEnabled(false);
        delete_bt.setEnabled(false);
        adm_tf.setText(""+newadmno);
        name_tf.setText("");
        male_rb.setSelected(true);
        dob_tf.setText("");
        address_tf.setText("");
        mobile_tf.setText("");
        email_tf.setText("");
        blood_tf.setText("");
        course_cb.setSelectedIndex(0);
        yearsem_cb.setSelectedIndex(0);
    }
    
    //get valuse from frame
    int admno,dob,year_sem,batch;
    String name,gender,address,email,bldgrp,course;
    long phone;
    void getValueFromFrame()
    {
        try{
        admno=Integer.parseInt(adm_tf.getText());
        name=name_tf.getText();
        if(male_rb.isSelected())    gender="M";
        if(female_rb.isSelected())    gender="F";
        dob=Integer.parseInt(dob_tf.getText().replace("-", ""));
        address=address_tf.getText();
        phone=Long.parseLong(mobile_tf.getText());
        email=email_tf.getText();
        bldgrp=blood_tf.getText();
        course=course_cb.getSelectedItem().toString();
        year_sem=Integer.parseInt(yearsem_cb.getSelectedItem().toString());
        batch=Integer.parseInt(batch_tf.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Enter a valid Date of birth or mobile number"); return;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        searchby_tf = new javax.swing.JTextField();
        get_panel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        name_tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        address_tf = new javax.swing.JTextField();
        mobile_tf = new javax.swing.JTextField();
        dob_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adm_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        course_cb = new javax.swing.JComboBox();
        yearsem_lb = new javax.swing.JLabel();
        yearsem_cb = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        blood_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        batch_tf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        add_bt = new javax.swing.JButton();
        update_bt = new javax.swing.JButton();
        delete_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showrecords_tb = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        searchby_cb = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        close_lb = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout_lb = new javax.swing.JLabel();
        logout_lb1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 200, 10));

        jButton1.setBackground(new java.awt.Color(25, 118, 211));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_30px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 50, 30));

        searchby_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        searchby_tf.setForeground(new java.awt.Color(60, 60, 60));
        searchby_tf.setBorder(null);
        searchby_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchby_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchby_tfMouseExited(evt);
            }
        });
        searchby_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchby_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchby_tfFocusLost(evt);
            }
        });
        searchby_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchby_tfKeyReleased(evt);
            }
        });
        jPanel1.add(searchby_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 200, 40));

        get_panel.setBackground(new java.awt.Color(255, 255, 255));
        get_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 2));
        get_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        get_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 240, 10));
        get_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 240, 10));
        get_panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 10));
        get_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 240, 10));
        get_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        get_panel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 10, 390));
        get_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, 10));
        get_panel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 240, 10));
        get_panel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 240, 10));

        name_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        name_tf.setForeground(new java.awt.Color(60, 60, 60));
        name_tf.setBorder(null);
        name_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_tfMouseEntered(evt);
            }
        });
        name_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_tfFocusLost(evt);
            }
        });
        get_panel.add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 240, 40));

        jLabel1.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Full Name");
        get_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, -1));

        jLabel2.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Gender");
        get_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        male_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male_rb);
        male_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        male_rb.setText("Male");
        get_panel.add(male_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, -1));

        female_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female_rb);
        female_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        female_rb.setText("Female");
        get_panel.add(female_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jLabel4.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Email");
        get_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        email_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        email_tf.setForeground(new java.awt.Color(60, 60, 60));
        email_tf.setBorder(null);
        email_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                email_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                email_tfMouseExited(evt);
            }
        });
        email_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_tfFocusGained(evt);
            }
        });
        get_panel.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 40));

        address_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        address_tf.setForeground(new java.awt.Color(60, 60, 60));
        address_tf.setBorder(null);
        address_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                address_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                address_tfMouseEntered(evt);
            }
        });
        address_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                address_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                address_tfFocusGained(evt);
            }
        });
        get_panel.add(address_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 40));

        mobile_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        mobile_tf.setForeground(new java.awt.Color(60, 60, 60));
        mobile_tf.setBorder(null);
        mobile_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobile_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobile_tfMouseExited(evt);
            }
        });
        mobile_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobile_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobile_tfFocusLost(evt);
            }
        });
        get_panel.add(mobile_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 240, 40));

        dob_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        dob_tf.setForeground(new java.awt.Color(60, 60, 60));
        dob_tf.setBorder(null);
        dob_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dob_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dob_tfMouseExited(evt);
            }
        });
        dob_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dob_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dob_tfFocusLost(evt);
            }
        });
        get_panel.add(dob_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 150, 40));

        jLabel3.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Date of Birth");
        get_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, -1));

        jLabel5.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Mobile");
        get_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, -1));

        jLabel10.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Address");
        get_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        jLabel9.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("YYYYMMDD");
        get_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 110, -1));

        jLabel6.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Admission no");
        get_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        adm_tf.setEditable(false);
        adm_tf.setBackground(new java.awt.Color(255, 255, 255));
        adm_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        adm_tf.setForeground(new java.awt.Color(60, 60, 60));
        adm_tf.setBorder(null);
        adm_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adm_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adm_tfMouseEntered(evt);
            }
        });
        adm_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adm_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                adm_tfFocusGained(evt);
            }
        });
        get_panel.add(adm_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 40));

        jLabel12.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Course");
        get_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, -1));

        course_cb.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        course_cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                course_cbItemStateChanged(evt);
            }
        });
        get_panel.add(course_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 30));

        yearsem_lb.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        yearsem_lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yearsem_lb.setText("Year");
        get_panel.add(yearsem_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 150, -1));

        yearsem_cb.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        get_panel.add(yearsem_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 190, 30));

        jLabel7.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Blood Group");
        get_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 140, -1));

        blood_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        blood_tf.setForeground(new java.awt.Color(60, 60, 60));
        blood_tf.setBorder(null);
        blood_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blood_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blood_tfMouseEntered(evt);
            }
        });
        blood_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                blood_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                blood_tfFocusGained(evt);
            }
        });
        get_panel.add(blood_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 240, 40));

        jLabel13.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Batch");
        get_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 20));

        batch_tf.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        batch_tf.setForeground(new java.awt.Color(60, 60, 60));
        batch_tf.setBorder(null);
        batch_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                batch_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                batch_tfMouseExited(evt);
            }
        });
        batch_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                batch_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                batch_tfFocusGained(evt);
            }
        });
        get_panel.add(batch_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 40));

        jPanel1.add(get_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 440));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_bt.setBackground(new java.awt.Color(25, 118, 211));
        add_bt.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        add_bt.setForeground(new java.awt.Color(255, 255, 255));
        add_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_user_male_40px.png"))); // NOI18N
        add_bt.setText("ADD");
        add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btActionPerformed(evt);
            }
        });
        jPanel3.add(add_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, -1));

        update_bt.setBackground(new java.awt.Color(25, 118, 211));
        update_bt.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        update_bt.setForeground(new java.awt.Color(255, 255, 255));
        update_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_update_user_40px_1.png"))); // NOI18N
        update_bt.setText("UPDATE");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });
        jPanel3.add(update_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, -1));

        delete_bt.setBackground(new java.awt.Color(25, 118, 211));
        delete_bt.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        delete_bt.setForeground(new java.awt.Color(255, 255, 255));
        delete_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_user_male_40px_1.png"))); // NOI18N
        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });
        jPanel3.add(delete_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, -1));

        clear_bt.setBackground(new java.awt.Color(25, 118, 211));
        clear_bt.setFont(new java.awt.Font("Aparajita", 1, 24)); // NOI18N
        clear_bt.setForeground(new java.awt.Color(255, 255, 255));
        clear_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_erase_40px.png"))); // NOI18N
        clear_bt.setText("CLEAR");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });
        jPanel3.add(clear_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 260, 280));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 118, 211), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showrecords_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm no", "Full Name", "Gender", "DOB", "Address", "Phone", "Course", "Year/Sem", "Blood grp", "Date of Adm", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showrecords_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showrecords_tbMouseClicked(evt);
            }
        });
        showrecords_tb.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                showrecords_tbCaretPositionChanged(evt);
            }
        });
        showrecords_tb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                showrecords_tbKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(showrecords_tb);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 200));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 910, 220));

        jLabel8.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Search By : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 90, -1));

        searchby_cb.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        searchby_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admno", "Name", "Gender", "Course" }));
        jPanel1.add(searchby_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 930, 690));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        close_lb.setToolTipText("Close");
        close_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lbMouseClicked(evt);
            }
        });
        jPanel2.add(close_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 41, 40));

        jLabel11.setFont(new java.awt.Font("Aparajita", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 118, 211));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Manage Students Records");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 0, 336, -1));

        logout_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_to_30px_1.png"))); // NOI18N
        logout_lb.setToolTipText("Back");
        logout_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_lbMouseClicked(evt);
            }
        });
        jPanel2.add(logout_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        logout_lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_to_30px.png"))); // NOI18N
        logout_lb1.setToolTipText("Back");
        logout_lb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_lb1MouseClicked(evt);
            }
        });
        jPanel2.add(logout_lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 930, 40));

        jPanel5.setBackground(new java.awt.Color(25, 118, 211));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grlogo.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 200, 200));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("<html>“Aim for the moon. If you miss, you may hit a star.” <br><br>—W. Clement Stone</html>");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 210, 130));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_lbMouseClicked

    private void name_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_tfMouseEntered

    }//GEN-LAST:event_name_tfMouseEntered

    private void name_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_tfMouseExited

    }//GEN-LAST:event_name_tfMouseExited

    private void name_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_tfFocusGained

    }//GEN-LAST:event_name_tfFocusGained

    private void name_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_tfFocusLost

    }//GEN-LAST:event_name_tfFocusLost

    private void email_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_tfMouseEntered

    }//GEN-LAST:event_email_tfMouseEntered

    private void email_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_tfMouseExited

    }//GEN-LAST:event_email_tfMouseExited

    private void email_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusGained

    }//GEN-LAST:event_email_tfFocusGained

    private void email_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusLost

    }//GEN-LAST:event_email_tfFocusLost

    private void address_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_tfMouseEntered

    }//GEN-LAST:event_address_tfMouseEntered

    private void address_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_tfMouseExited

    }//GEN-LAST:event_address_tfMouseExited

    private void address_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_tfFocusGained

    }//GEN-LAST:event_address_tfFocusGained

    private void address_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tfFocusLost

    private void mobile_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_tfMouseEntered

    }//GEN-LAST:event_mobile_tfMouseEntered

    private void mobile_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_tfMouseExited

    }//GEN-LAST:event_mobile_tfMouseExited

    private void mobile_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_tfFocusGained

    }//GEN-LAST:event_mobile_tfFocusGained

    private void mobile_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_tfFocusLost

    }//GEN-LAST:event_mobile_tfFocusLost

    private void dob_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dob_tfMouseEntered

    }//GEN-LAST:event_dob_tfMouseEntered

    private void dob_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dob_tfMouseExited

    }//GEN-LAST:event_dob_tfMouseExited

    private void dob_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_tfFocusGained

    }//GEN-LAST:event_dob_tfFocusGained

    private void dob_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_tfFocusLost

    }//GEN-LAST:event_dob_tfFocusLost

    private void add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btActionPerformed
getValueFromFrame();

if(name.equals("")){
    JOptionPane.showMessageDialog(null, "Enter First Name.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
try{
    pf.Query="insert into student values('"+admno+"','"+name+"','"+gender+"','"+dob+"','"+address+"','"+phone+"','"+course+"','"+bldgrp+"',now(),'"+year_sem+"','"+email+"','"+batch+"','Persuing');";
    pf.updtrec();
    JOptionPane.showMessageDialog(this, "New User added Sucessfully");
    emptyTable();
    setRecordsInTable();
    newadmno++;
}catch(Exception e){
    JOptionPane.showMessageDialog(this, "Error while adding new Record"+e);
}
    }//GEN-LAST:event_add_btActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
getValueFromFrame();

if(name.equals("")){
    JOptionPane.showMessageDialog(null, "Enter First Name.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
try{ 
    pf.Query="Update student set name='"+name+"', dob="+dob+", gender='"+gender+"', phone="+phone+", email='"+email+"', address='"+address+"', course='"+course+"', bloodgrp='"+bldgrp+"',year_sem="+year_sem+", email='" +email+"', batch='"+batch+"' where admno="+admno+";";
    pf.updtrec();
    JOptionPane.showMessageDialog(this, "Record Update Sucessfully");
    emptyTable();
    setRecordsInTable();
}catch(Exception e){
    JOptionPane.showMessageDialog(this, "Error while Updating a Record"+e);
}
    }//GEN-LAST:event_update_btActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
int conf=JOptionPane.showConfirmDialog(null, "Do You Really want to delete \n\n : "+name_tf.getText()+" Record","Confirm",JOptionPane.YES_NO_OPTION);
if(conf==0){
    pf.Query="Delete from student where admno='"+adm_tf.getText()+"';";
    pf.updtrec();
    JOptionPane.showMessageDialog(this, "Record Delete Sucessfully");
    emptyTable();
    setRecordsInTable();
    clearframe();
}
    }//GEN-LAST:event_delete_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
clearframe();
    }//GEN-LAST:event_clear_btActionPerformed

    private void showrecords_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showrecords_tbMouseClicked
setRecordinFrame();
    }//GEN-LAST:event_showrecords_tbMouseClicked

    private void showrecords_tbCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_showrecords_tbCaretPositionChanged

    }//GEN-LAST:event_showrecords_tbCaretPositionChanged

    private void showrecords_tbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showrecords_tbKeyReleased
setRecordinFrame();
    }//GEN-LAST:event_showrecords_tbKeyReleased

    private void adm_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adm_tfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_tfMouseExited

    private void adm_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adm_tfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_tfMouseEntered

    private void adm_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adm_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_tfFocusLost

    private void adm_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adm_tfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_tfFocusGained

    private void blood_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_tfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_blood_tfMouseExited

    private void blood_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blood_tfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_blood_tfMouseEntered

    private void blood_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blood_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_blood_tfFocusLost

    private void blood_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blood_tfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_blood_tfFocusGained

    private void course_cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_cbItemStateChanged
int seleted_course=course_cb.getSelectedIndex();
yearsem_cb.removeAllItems();
yearsem_lb.setText(course_type[seleted_course]);
for(int i=1;i<=max_yearsem[seleted_course];i++)
    yearsem_cb.addItem(i); 
    }//GEN-LAST:event_course_cbItemStateChanged

    private void searchby_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchby_tfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchby_tfMouseExited

    private void searchby_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchby_tfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchby_tfMouseEntered

    private void searchby_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchby_tfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_searchby_tfFocusGained

    private void searchby_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchby_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchby_tfFocusLost

    private void searchby_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchby_tfKeyReleased

    }//GEN-LAST:event_searchby_tfKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    pf.Query="Select * from Student where "+searchby_cb.getSelectedItem().toString()+" like '%"+searchby_tf.getText()+"%';";
    pf.getrec();
    emptyTable();
    DefaultTableModel model= (DefaultTableModel) showrecords_tb.getModel();
    while(pf.r.next())
    {
        model.addRow(new Object[] {
                                  pf.r.getString(1),
                                  pf.r.getString(2),
                                  pf.r.getString(3),
                                  pf.r.getString(4),
                                  pf.r.getString(5),
                                  pf.r.getString(6),
                                  pf.r.getString(7),
                                  pf.r.getString(10),
                                  pf.r.getString(8),
                                  pf.r.getString(9),
                                  pf.r.getString(11)
                                 } );
     }
}catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erroe while setting table data into form"+e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void batch_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batch_tfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_tfMouseEntered

    private void batch_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batch_tfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_tfMouseExited

    private void batch_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_batch_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_tfFocusLost

    private void batch_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_batch_tfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_tfFocusGained

    private void logout_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lbMouseClicked
        new menu().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_logout_lbMouseClicked

    private void logout_lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lb1MouseClicked
        new menu().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_logout_lb1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managestudents().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bt;
    private javax.swing.JTextField address_tf;
    private javax.swing.JTextField adm_tf;
    private javax.swing.JTextField batch_tf;
    private javax.swing.JTextField blood_tf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_bt;
    private javax.swing.JLabel close_lb;
    private javax.swing.JComboBox course_cb;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField dob_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JPanel get_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel logout_lb;
    private javax.swing.JLabel logout_lb1;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JTextField mobile_tf;
    private javax.swing.JTextField name_tf;
    private javax.swing.JComboBox searchby_cb;
    private javax.swing.JTextField searchby_tf;
    private javax.swing.JTable showrecords_tb;
    private javax.swing.JButton update_bt;
    private javax.swing.JComboBox yearsem_cb;
    private javax.swing.JLabel yearsem_lb;
    // End of variables declaration//GEN-END:variables
}
