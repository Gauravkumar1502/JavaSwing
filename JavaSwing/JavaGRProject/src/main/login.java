package main;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        showpass_lb.setVisible(false);
        login_lb.setFocusCycleRoot(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close_lb = new javax.swing.JLabel();
        login_lb = new javax.swing.JLabel();
        wel_lb = new javax.swing.JLabel();
        by_lb = new javax.swing.JLabel();
        user_lb = new javax.swing.JLabel();
        showpasspic_lb = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        user_tf = new javax.swing.JTextField();
        pass_lb = new javax.swing.JLabel();
        pass_pf = new javax.swing.JPasswordField();
        reg_lb = new javax.swing.JLabel();
        for_lb = new javax.swing.JLabel();
        loginbt_lb = new javax.swing.JLabel();
        userpic_lb = new javax.swing.JLabel();
        passpic_lb = new javax.swing.JLabel();
        showpass_lb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grlogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 200, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginlogo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 260));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("<html>Do not wait;  “Start where you are. Use what you have. Do what you can.”<BR><br>—Arthur Ashe</html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 350, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        close_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lbMouseClicked(evt);
            }
        });
        jPanel2.add(close_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        login_lb.setBackground(new java.awt.Color(255, 255, 255));
        login_lb.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        login_lb.setForeground(new java.awt.Color(25, 118, 211));
        login_lb.setText("Login");
        jPanel2.add(login_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 40));

        wel_lb.setBackground(new java.awt.Color(0, 0, 0));
        wel_lb.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        wel_lb.setForeground(new java.awt.Color(25, 118, 211));
        wel_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wel_lb.setText("<html>Welcome to Students Marks keeping System</Html>");
        jPanel2.add(wel_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 340, -1));

        by_lb.setBackground(new java.awt.Color(0, 0, 0));
        by_lb.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        by_lb.setForeground(new java.awt.Color(93, 154, 53));
        by_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        by_lb.setText("By Gaurav");
        jPanel2.add(by_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 170, -1));

        user_lb.setBackground(new java.awt.Color(255, 255, 255));
        user_lb.setFont(new java.awt.Font("AR ESSENCE", 0, 28)); // NOI18N
        user_lb.setForeground(new java.awt.Color(25, 118, 211));
        user_lb.setText("Username");
        jPanel2.add(user_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 30));

        showpasspic_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_key_2_30px.png"))); // NOI18N
        jPanel2.add(showpasspic_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 30, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 330, 10));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, -1));

        user_tf.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        user_tf.setForeground(new java.awt.Color(60, 60, 60));
        user_tf.setBorder(null);
        user_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_tfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_tfMouseExited(evt);
            }
        });
        user_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_tfActionPerformed(evt);
            }
        });
        user_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_tfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_tfFocusGained(evt);
            }
        });
        jPanel2.add(user_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 280, 40));

        pass_lb.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb.setFont(new java.awt.Font("AR ESSENCE", 0, 28)); // NOI18N
        pass_lb.setForeground(new java.awt.Color(25, 118, 211));
        pass_lb.setText("Password");
        jPanel2.add(pass_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 150, 30));

        pass_pf.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pass_pf.setForeground(new java.awt.Color(60, 60, 60));
        pass_pf.setBorder(null);
        pass_pf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass_pfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass_pfMouseExited(evt);
            }
        });
        pass_pf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_pfFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_pfFocusGained(evt);
            }
        });
        jPanel2.add(pass_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 260, 40));

        reg_lb.setBackground(new java.awt.Color(0, 0, 0));
        reg_lb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        reg_lb.setForeground(new java.awt.Color(25, 118, 211));
        reg_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reg_lb.setText("Register");
        reg_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reg_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reg_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reg_lbMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_lbMouseClicked(evt);
            }
        });
        jPanel2.add(reg_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 90, -1));

        for_lb.setBackground(new java.awt.Color(0, 0, 0));
        for_lb.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        for_lb.setForeground(new java.awt.Color(25, 118, 211));
        for_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for_lb.setText("Forget Password ?");
        for_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        for_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                for_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                for_lbMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for_lbMouseClicked(evt);
            }
        });
        jPanel2.add(for_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 140, -1));

        loginbt_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lo.png"))); // NOI18N
        loginbt_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbt_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbt_lbMouseClicked(evt);
            }
        });
        jPanel2.add(loginbt_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, 40));

        userpic_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_male_30px.png"))); // NOI18N
        jPanel2.add(userpic_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 30, 30));

        passpic_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_show_password_30px.png"))); // NOI18N
        passpic_lb.setToolTipText("Show Password");
        passpic_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passpic_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passpic_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passpic_lbMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passpic_lbMouseClicked(evt);
            }
        });
        jPanel2.add(passpic_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 30, 30));

        showpass_lb.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        showpass_lb.setForeground(new java.awt.Color(60, 60, 60));
        showpass_lb.setBorder(null);
        showpass_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showpass_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showpass_lbMouseExited(evt);
            }
        });
        jPanel2.add(showpass_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 260, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 490, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_lbMouseEntered
        reg_lb.setForeground(new Color(39, 174, 96));
        reg_lb.setFont(new Font("Aparajita", Font.BOLD, 20));
    }//GEN-LAST:event_reg_lbMouseEntered

    private void reg_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_lbMouseExited
        reg_lb.setForeground(new Color(27, 153, 229));
        reg_lb.setFont(new Font("Aparajita", Font.PLAIN, 18));
    }//GEN-LAST:event_reg_lbMouseExited

    private void for_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_for_lbMouseEntered
        for_lb.setForeground(Color.red);
        for_lb.setFont(new Font("Aparajita", Font.BOLD, 19));
    }//GEN-LAST:event_for_lbMouseEntered

    private void for_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_for_lbMouseExited
        for_lb.setForeground(new Color(27, 153, 229));
        for_lb.setFont(new Font("Aparajita", Font.PLAIN, 18));
    }//GEN-LAST:event_for_lbMouseExited

    private void close_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lbMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_close_lbMouseClicked

    private void user_tfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tfMouseEntered

    }//GEN-LAST:event_user_tfMouseEntered

    private void user_tfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tfMouseExited

    }//GEN-LAST:event_user_tfMouseExited

    private void pass_pfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pfMouseEntered
       
    }//GEN-LAST:event_pass_pfMouseEntered

    private void pass_pfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pfMouseExited
       
    }//GEN-LAST:event_pass_pfMouseExited

    private void reg_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_lbMouseClicked
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_reg_lbMouseClicked

    private void for_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_for_lbMouseClicked
        this.setVisible(false);
        new forget().setVisible(true);        
    }//GEN-LAST:event_for_lbMouseClicked

    private void showpass_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpass_lbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_showpass_lbMouseExited

    private void showpass_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpass_lbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_showpass_lbMouseEntered

    private void passpic_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passpic_lbMouseClicked
    }//GEN-LAST:event_passpic_lbMouseClicked

    private void passpic_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passpic_lbMouseEntered
        if (pass_pf.getText().equals("gfrytsdgae")) {
        }//Do Nothing
        else {
            showpass_lb.setText(pass_pf.getText());
            showpass_lb.setVisible(true);
            pass_pf.setVisible(false);
        }
    }//GEN-LAST:event_passpic_lbMouseEntered

    private void passpic_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passpic_lbMouseExited
        if (pass_pf.getText().equals("gfrytsdgae")) {
        }//Do Nothing
        else {
            showpass_lb.setText(pass_pf.getText());
            showpass_lb.setVisible(false);
            pass_pf.setVisible(true);
        }
    }//GEN-LAST:event_passpic_lbMouseExited

    private void user_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_tfFocusGained

    }//GEN-LAST:event_user_tfFocusGained

    private void user_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_tfFocusLost

    }//GEN-LAST:event_user_tfFocusLost

    private void loginbt_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbt_lbMouseClicked
String user="",pass="";
user=user_tf.getText();
pass=pass_pf.getText();
if(user.equals("") || pass.equals("")){
JOptionPane.showMessageDialog(null, "Username and Password should not be Empty.!!!","Enter full Details",JOptionPane.INFORMATION_MESSAGE);return;}
PublicFunctions pf =new PublicFunctions();
pf.Query="Select pass,UserType from register where username = '"+user+"';";
pf.getrec();
try
{   pf.r.next();
    if(pass.equals(pf.r.getString("pass")) && pf.r.getString(2).equals("Admin"))
    {
        new menu().setVisible(true);
        this.setVisible(false);
    }
    else if(pass.equals(pf.r.getString("pass")) && pf.r.getString(2).equals("Teacher"))
    {
        new TeacherMenu().setVisible(true);
        this.setVisible(false);
    }
    else if(pass.equals(pf.r.getString("pass")) && pf.r.getString(2).equals("Student"))
    {
        new view().setVisible(true);
        this.setVisible(false);
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Enter an valid Password","Wrong Password..!!",JOptionPane.ERROR_MESSAGE);
    }
}
catch(Exception e)
{
    int val=JOptionPane.showConfirmDialog(null, "User "+ user +" not Registered Yet..!\n\nIf you want to register yourself\nClick OK.!!","User not Exist",JOptionPane.YES_NO_OPTION);
    if(val==0)
    {
        new Register().setVisible(true);
        this.setVisible(false);
    }
}
    }//GEN-LAST:event_loginbt_lbMouseClicked

    private void pass_pfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pfFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_pass_pfFocusGained

    private void pass_pfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_pfFocusLost
      // TODO add your handling code here:
    }//GEN-LAST:event_pass_pfFocusLost

    private void user_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_tfActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel by_lb;
    private javax.swing.JLabel close_lb;
    private javax.swing.JLabel for_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel login_lb;
    private javax.swing.JLabel loginbt_lb;
    private javax.swing.JLabel pass_lb;
    private javax.swing.JPasswordField pass_pf;
    private javax.swing.JLabel passpic_lb;
    private javax.swing.JLabel reg_lb;
    private javax.swing.JTextField showpass_lb;
    private javax.swing.JLabel showpasspic_lb;
    private javax.swing.JLabel user_lb;
    private javax.swing.JTextField user_tf;
    private javax.swing.JLabel userpic_lb;
    private javax.swing.JLabel wel_lb;
    // End of variables declaration//GEN-END:variables
}
