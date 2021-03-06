/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaurav
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        male_rb.setSelected(true);
        student_rb.setSelected(true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        close_lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lname_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dob_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobile_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        address_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        reg = new javax.swing.JLabel();
        cpass_pf = new javax.swing.JPasswordField();
        pass_pf = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        adm_rb = new javax.swing.JRadioButton();
        teacher_rb = new javax.swing.JRadioButton();
        student_rb = new javax.swing.JRadioButton();
        back_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grlogo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 200, 200));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 240, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 240, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 240, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 240, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 10, 340));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 240, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 10));

        close_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        close_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lbMouseClicked(evt);
            }
        });
        jPanel2.add(close_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        fname_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        fname_tf.setForeground(new java.awt.Color(60, 60, 60));
        fname_tf.setBorder(null);
        fname_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fname_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fname_tfMouseEntered(evt);
            }
        });
        fname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fname_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_tfFocusGained(evt);
            }
        });
        jPanel2.add(fname_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 40));

        jLabel6.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 150, -1));

        lname_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        lname_tf.setForeground(new java.awt.Color(60, 60, 60));
        lname_tf.setBorder(null);
        lname_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lname_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lname_tfMouseEntered(evt);
            }
        });
        lname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lname_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                lname_tfFocusGained(evt);
            }
        });
        jPanel2.add(lname_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 240, 40));

        jLabel2.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Gender");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        male_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male_rb);
        male_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        male_rb.setText("Male");
        jPanel2.add(male_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, -1));

        female_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female_rb);
        female_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        female_rb.setText("Female");
        jPanel2.add(female_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));

        jLabel3.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Date of Birth");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 150, -1));

        email_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        email_tf.setForeground(new java.awt.Color(60, 60, 60));
        email_tf.setBorder(null);
        email_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                email_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                email_tfMouseEntered(evt);
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
        jPanel2.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 40));

        jLabel4.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        dob_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        dob_tf.setForeground(new java.awt.Color(60, 60, 60));
        dob_tf.setBorder(null);
        dob_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dob_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dob_tfMouseEntered(evt);
            }
        });
        dob_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dob_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                dob_tfFocusGained(evt);
            }
        });
        jPanel2.add(dob_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 240, 40));

        jLabel5.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Mobile");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, -1));

        mobile_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        mobile_tf.setForeground(new java.awt.Color(60, 60, 60));
        mobile_tf.setBorder(null);
        mobile_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobile_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobile_tfMouseEntered(evt);
            }
        });
        mobile_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobile_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobile_tfFocusGained(evt);
            }
        });
        jPanel2.add(mobile_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 240, 40));

        jLabel7.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 150, -1));

        jLabel10.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Address");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 170, -1));

        address_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
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
        jPanel2.add(address_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 240, 40));

        jLabel11.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Confirm Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 170, -1));

        jLabel12.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Username");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, -1));

        username_tf.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        username_tf.setForeground(new java.awt.Color(60, 60, 60));
        username_tf.setBorder(null);
        username_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                username_tfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                username_tfMouseEntered(evt);
            }
        });
        username_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_tfFocusGained(evt);
            }
        });
        jPanel2.add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 40));

        reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/regi.jpg"))); // NOI18N
        reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel2.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 150, 40));

        cpass_pf.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cpass_pf.setForeground(new java.awt.Color(60, 60, 60));
        cpass_pf.setBorder(null);
        cpass_pf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpass_pfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cpass_pfMouseEntered(evt);
            }
        });
        jPanel2.add(cpass_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 260, 40));

        pass_pf.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pass_pf.setForeground(new java.awt.Color(60, 60, 60));
        pass_pf.setBorder(null);
        pass_pf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass_pfMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass_pfMouseEntered(evt);
            }
        });
        jPanel2.add(pass_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, 40));

        jLabel8.setFont(new java.awt.Font("Aparajita", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Select User Type");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 130, -1));

        adm_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(adm_rb);
        adm_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        adm_rb.setText("     Admin");
        jPanel2.add(adm_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 120, -1));

        teacher_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(teacher_rb);
        teacher_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        teacher_rb.setText("     Teacher");
        jPanel2.add(teacher_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 110, -1));

        student_rb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(student_rb);
        student_rb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        student_rb.setText("     Student");
        jPanel2.add(student_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 120, -1));

        back_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_arrow_30px_1.png"))); // NOI18N
        back_lb.setToolTipText("Go Back to Login");
        back_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_lbMouseClicked(evt);
            }
        });
        jPanel2.add(back_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lbMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_close_lbMouseClicked

    private void fname_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname_tfMouseEntered

    }//GEN-LAST:event_fname_tfMouseEntered

    private void fname_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname_tfMouseExited

    }//GEN-LAST:event_fname_tfMouseExited

    private void fname_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fname_tfFocusGained

    }//GEN-LAST:event_fname_tfFocusGained

    private void fname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fname_tfFocusLost

    }//GEN-LAST:event_fname_tfFocusLost

    private void lname_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname_tfMouseEntered
      
    }//GEN-LAST:event_lname_tfMouseEntered

    private void lname_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname_tfMouseExited
      
    }//GEN-LAST:event_lname_tfMouseExited

    private void lname_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lname_tfFocusGained
      
    }//GEN-LAST:event_lname_tfFocusGained

    private void lname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lname_tfFocusLost
       
    }//GEN-LAST:event_lname_tfFocusLost

    private void email_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_tfMouseEntered
       
    }//GEN-LAST:event_email_tfMouseEntered

    private void email_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_tfMouseExited
 
    }//GEN-LAST:event_email_tfMouseExited

    private void email_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusGained
       
    }//GEN-LAST:event_email_tfFocusGained

    private void email_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tfFocusLost
        
    }//GEN-LAST:event_email_tfFocusLost

    private void dob_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dob_tfMouseEntered
      
    }//GEN-LAST:event_dob_tfMouseEntered

    private void dob_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dob_tfMouseExited
    
    }//GEN-LAST:event_dob_tfMouseExited

    private void dob_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_tfFocusGained
       
    }//GEN-LAST:event_dob_tfFocusGained

    private void dob_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_tfFocusLost
      
    }//GEN-LAST:event_dob_tfFocusLost

    private void mobile_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_tfMouseEntered
     
    }//GEN-LAST:event_mobile_tfMouseEntered

    private void mobile_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobile_tfMouseExited
       
    }//GEN-LAST:event_mobile_tfMouseExited

    private void mobile_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_tfFocusGained
    
    }//GEN-LAST:event_mobile_tfFocusGained

    private void mobile_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_tfFocusLost
      
    }//GEN-LAST:event_mobile_tfFocusLost

    private void address_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_tfMouseEntered
        
    }//GEN-LAST:event_address_tfMouseEntered

    private void address_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address_tfMouseExited
      
    }//GEN-LAST:event_address_tfMouseExited

    private void address_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_tfFocusGained
       
    }//GEN-LAST:event_address_tfFocusGained

    private void address_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tfFocusLost

    private void username_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_tfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfMouseExited

    private void username_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_tfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfMouseEntered

    private void username_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfFocusGained

    private void username_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfFocusLost

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
String fname="",lname="",user="",pass="",gender="M",email="",add="",utype="";
int dob=0,mobile=0;
fname=fname_tf.getText();
lname=lname_tf.getText();
user=username_tf.getText().toLowerCase();
try{
    dob=Integer.parseInt(dob_tf.getText());
    mobile=Integer.parseInt(mobile_tf.getText());
}catch(NumberFormatException e)
{
    JOptionPane.showMessageDialog(this, "Enter a Valid Birth Date or Mobile number.","Error",JOptionPane.INFORMATION_MESSAGE);return;
}
    if(male_rb.isSelected()) gender="M";
if(female_rb.isSelected()) gender="F";
email=email_tf.getText().toLowerCase();
add=address_tf.getText().toLowerCase();
if(adm_rb.isSelected())
    utype="Admin";
else if(teacher_rb.isSelected())
    utype="Teacher";
else
    utype="Student";

if(pass_pf.getText().equals(cpass_pf.getText()))
    pass=pass_pf.getText();
else{
    JOptionPane.showMessageDialog(this, "Password Does't match..!!");
    pass_pf.setText("");
    cpass_pf.setText("");return;
}
//Fileds Validation
if(fname.equals("")){
    JOptionPane.showMessageDialog(null, "Enter First Name.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
if(lname.equals("")){
    JOptionPane.showMessageDialog(null, "Enter last Name.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
if(user.equals("")){
    JOptionPane.showMessageDialog(null, "Enter Username Name.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
if(pass.equals("")){
    JOptionPane.showMessageDialog(null, "Enter Password.!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}

//insert new record
PublicFunctions pf=new PublicFunctions();
String teacher_passcode="gaurav";
String Admin_passcode="GR";
if(utype.equals("Admin")){
    String ret_pass=JOptionPane.showInputDialog(this,"Enter Admin Pass Code : ","Confirm", JOptionPane.YES_NO_OPTION);
    System.err.println(ret_pass);
    if(ret_pass.equals(Admin_passcode)){}else{JOptionPane.showMessageDialog(null, "plz Enter Correct Pass Code..!!"); return;}
}
if(utype.equals("Teacher")){
    String ret_pass=JOptionPane.showInputDialog(this,"Enter Teacher Pass Code : ","Confirm", JOptionPane.YES_NO_OPTION);
    System.err.println(ret_pass);
    if(ret_pass.equals(teacher_passcode)){}else{JOptionPane.showMessageDialog(null, "plz Enter Correct Pass Code..!!"); return;}
}try{
pf.Query="insert into register values ('"+fname+"','"+lname+"','"+user+"','"+dob+"','"+gender+"','"+mobile+"','"+email+"','"+add+"','"+pass+"','"+utype+"');";
pf.updtrec();
}catch(Exception e){return;}
JOptionPane.showMessageDialog(null, "Sucessfully Registered..!!");
new login().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_regMouseClicked

    private void cpass_pfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpass_pfMouseExited

    }//GEN-LAST:event_cpass_pfMouseExited

    private void cpass_pfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpass_pfMouseEntered

    }//GEN-LAST:event_cpass_pfMouseEntered

    private void pass_pfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pfMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_pfMouseExited

    private void pass_pfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_pfMouseEntered

    private void back_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_lbMouseClicked
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_lbMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tf;
    private javax.swing.JRadioButton adm_rb;
    private javax.swing.JLabel back_lb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel close_lb;
    private javax.swing.JPasswordField cpass_pf;
    private javax.swing.JTextField dob_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JTextField fname_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField lname_tf;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JTextField mobile_tf;
    private javax.swing.JPasswordField pass_pf;
    private javax.swing.JLabel reg;
    private javax.swing.JRadioButton student_rb;
    private javax.swing.JRadioButton teacher_rb;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
