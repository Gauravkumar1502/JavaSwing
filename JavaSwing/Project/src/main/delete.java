/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gaurav
 */
public class delete extends javax.swing.JFrame {

    /**
     * Creates new form delete
     */
    public delete() {
        initComponents();
    }
    String subcode,subname;
    int yearsem;
    public delete(String cname, int cyear,String subname,String scode) {
        initComponents();
        this.setLocationRelativeTo(null);
        stram_lb.setText(cname);
        year_lb.setText(""+cyear);
        jButton4.setEnabled(false);
        showrec_tb.setEnabled(false);
        sub_lb.setText(subname);
        subcode=scode;
        subname=subname;
        yearsem=cyear;
        this.setLocationRelativeTo(null);
        PublicFunctions pf =new PublicFunctions();
        try{
            pf.Query="Select admno,name from student where course ='"+cname+"' && year_sem="+cyear +" && status ='Persuing'";
            pf.getrec();
            DefaultTableModel model=(DefaultTableModel) showrec_tb.getModel();
            while(pf.r.next())
            {
                int admno =Integer.parseInt(pf.r.getString(1));
                String student_name =pf.r.getString(2);
                model.addRow(new Object[] {admno,student_name} );
            }
        }catch(Exception e){}
    }
    void status()
    {
        int present=0,absent=0;
        for(int i=0;i<showrec_tb.getRowCount();i++)
        {
            if(showrec_tb.getValueAt(i, 2)==true)
                present++;
            else
                absent++;
        }
        st_lb.setText("Present = "+present+"        Absent = "+absent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        subject_tf = new javax.swing.JLabel();
        stram_lb = new javax.swing.JLabel();
        subject_tf2 = new javax.swing.JLabel();
        sub_lb = new javax.swing.JLabel();
        subject_tf3 = new javax.swing.JLabel();
        year_lb = new javax.swing.JLabel();
        subject_tf1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showrec_tb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        subject_tf4 = new javax.swing.JLabel();
        st_lb = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        dd = new javax.swing.JComboBox();
        subject_tf5 = new javax.swing.JLabel();
        mm = new javax.swing.JComboBox();
        subject_tf6 = new javax.swing.JLabel();
        yy = new javax.swing.JComboBox();
        subject_tf7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_cancel_35px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 241, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subject_tf.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf.setText("Subject :");
        jPanel1.add(subject_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 90, -1));

        stram_lb.setBackground(new java.awt.Color(255, 255, 255));
        stram_lb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        stram_lb.setText("Stream : ");
        jPanel1.add(stram_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 290, -1));

        subject_tf2.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf2.setText("Stream : ");
        jPanel1.add(subject_tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        sub_lb.setBackground(new java.awt.Color(255, 255, 255));
        sub_lb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        sub_lb.setText("Stream : ");
        jPanel1.add(sub_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 290, -1));

        subject_tf3.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf3.setText("Year/Sem :");
        jPanel1.add(subject_tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        year_lb.setBackground(new java.awt.Color(255, 255, 255));
        year_lb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        year_lb.setText("Stream : ");
        jPanel1.add(year_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 240, -1));

        subject_tf1.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf1.setText("Date : ");
        jPanel1.add(subject_tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 90, -1));

        showrec_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm no", "Name of Students", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showrec_tb.getTableHeader().setReorderingAllowed(false);
        showrec_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showrec_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showrec_tb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 780, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Note : - If a Student is Present Just click on \"Attendance\" Field of that student");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        subject_tf4.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf4.setText("Status  : ");
        jPanel1.add(subject_tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 20));

        st_lb.setBackground(new java.awt.Color(255, 255, 255));
        st_lb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        st_lb.setText("Status  : ");
        jPanel1.add(st_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 690, 20));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, 30));

        dd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 50, -1));

        subject_tf5.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subject_tf5.setText("DD");
        jPanel1.add(subject_tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 50, -1));

        mm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 50, -1));

        subject_tf6.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subject_tf6.setText("MM");
        jPanel1.add(subject_tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 40, -1));

        yy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019", "2020", "2021", "2022" }));
        jPanel1.add(yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 70, -1));

        subject_tf7.setBackground(new java.awt.Color(255, 255, 255));
        subject_tf7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        subject_tf7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subject_tf7.setText("YYYY");
        jPanel1.add(subject_tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 60, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 100, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void showrec_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showrec_tbMouseClicked
        status();
    }//GEN-LAST:event_showrec_tbMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int dlt=JOptionPane.showConfirmDialog(this,"Do you Really want to Delete","Confirm", JOptionPane.YES_NO_OPTION);
if(dlt==0){   
        String date=yy.getSelectedItem().toString()+mm.getSelectedItem().toString()+dd.getSelectedItem().toString();
        String Q="";
        try
        {
            for(int i=0;i<showrec_tb.getRowCount();i++){
                String att="P";
                if(showrec_tb.getValueAt(i, 2)==true)
                att="P";
                else
                att="A";
                Q="Delete from attendance where scode='"+subcode+"' && date_of_at='"+date+"'";
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection c=DriverManager.getConnection("jdbc:odbc:Marks_Record_Sys","root","gaurav");
                Statement  s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                s.executeUpdate(Q);
            }
            JOptionPane.showMessageDialog(this, "Records Deleted..!!");
            new TeacherMenu().setVisible(true);    this.setVisible(false);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "SOmething wrong..!!");
        }
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PublicFunctions pf=new PublicFunctions();
        try
        {
            String date=yy.getSelectedItem().toString()+mm.getSelectedItem().toString()+dd.getSelectedItem().toString();
            pf.Query="select Status from attendance where scode='"+subcode+"' && date_of_at='"+date+"'";
            pf.getrec();
            int i=0;
            while(pf.r.next()){
                if(pf.r.getString(1).equals("P"))
                showrec_tb.setValueAt(true, i, 2);
                else
                showrec_tb.setValueAt(false, i, 2);
                i++;
            }
            jButton4.setEnabled(true);
        }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox mm;
    private javax.swing.JTable showrec_tb;
    private javax.swing.JLabel st_lb;
    private javax.swing.JLabel stram_lb;
    private javax.swing.JLabel sub_lb;
    private javax.swing.JLabel subject_tf;
    private javax.swing.JLabel subject_tf1;
    private javax.swing.JLabel subject_tf2;
    private javax.swing.JLabel subject_tf3;
    private javax.swing.JLabel subject_tf4;
    private javax.swing.JLabel subject_tf5;
    private javax.swing.JLabel subject_tf6;
    private javax.swing.JLabel subject_tf7;
    private javax.swing.JLabel year_lb;
    private javax.swing.JComboBox yy;
    // End of variables declaration//GEN-END:variables
}