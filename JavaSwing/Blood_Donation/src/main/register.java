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
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
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
        user_lb = new javax.swing.JLabel();
        ffname = new javax.swing.JTextField();
        pass_lb = new javax.swing.JLabel();
        fpass = new javax.swing.JPasswordField();
        user_lb1 = new javax.swing.JLabel();
        fuser = new javax.swing.JTextField();
        user_lb2 = new javax.swing.JLabel();
        flname = new javax.swing.JTextField();
        pass_lb1 = new javax.swing.JLabel();
        fdob = new javax.swing.JTextField();
        pass_lb2 = new javax.swing.JLabel();
        pass_lb3 = new javax.swing.JLabel();
        fm = new javax.swing.JRadioButton();
        ff = new javax.swing.JRadioButton();
        pass_lb4 = new javax.swing.JLabel();
        pass_lb5 = new javax.swing.JLabel();
        pass_lb6 = new javax.swing.JLabel();
        pass_lb7 = new javax.swing.JLabel();
        fcpass = new javax.swing.JPasswordField();
        fmobile = new javax.swing.JTextField();
        faddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        femail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user_lb.setBackground(new java.awt.Color(255, 255, 255));
        user_lb.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        user_lb.setForeground(new java.awt.Color(0, 0, 153));
        user_lb.setText("First Name");

        ffname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        pass_lb.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb.setText("Password");

        fpass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        user_lb1.setBackground(new java.awt.Color(255, 255, 255));
        user_lb1.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        user_lb1.setForeground(new java.awt.Color(0, 0, 153));
        user_lb1.setText("Username");

        fuser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        user_lb2.setBackground(new java.awt.Color(255, 255, 255));
        user_lb2.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        user_lb2.setForeground(new java.awt.Color(0, 0, 153));
        user_lb2.setText("Last Name");

        flname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        pass_lb1.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb1.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb1.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb1.setText("DOB");

        fdob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        pass_lb2.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb2.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        pass_lb2.setForeground(new java.awt.Color(204, 0, 0));
        pass_lb2.setText("YYYYMMDD");

        pass_lb3.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb3.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb3.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb3.setText("Gender");

        buttonGroup1.add(fm);
        fm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fm.setText("M");

        buttonGroup1.add(ff);
        ff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ff.setText("F");

        pass_lb4.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb4.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb4.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb4.setText("Address");

        pass_lb5.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb5.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb5.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb5.setText("Email");

        pass_lb6.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb6.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb6.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb6.setText("Mobile");

        pass_lb7.setBackground(new java.awt.Color(255, 255, 255));
        pass_lb7.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        pass_lb7.setForeground(new java.awt.Color(0, 0, 153));
        pass_lb7.setText("Confirm Pass");

        fcpass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        fmobile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        faddress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        femail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_lb)
                                    .addComponent(user_lb1)
                                    .addComponent(pass_lb3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ffname, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(fuser))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(fm)
                                        .addGap(45, 45, 45)
                                        .addComponent(ff))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pass_lb)
                                    .addComponent(pass_lb5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fpass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pass_lb7)
                                .addGap(18, 18, 18)
                                .addComponent(fcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_lb2)
                                    .addComponent(pass_lb1)
                                    .addComponent(pass_lb6)
                                    .addComponent(pass_lb4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faddress, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flname, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fdob, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pass_lb2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_lb)
                    .addComponent(ffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_lb2)
                    .addComponent(flname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_lb1)
                    .addComponent(fuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_lb1)
                    .addComponent(fdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_lb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_lb3)
                    .addComponent(fm)
                    .addComponent(ff)
                    .addComponent(pass_lb6)
                    .addComponent(fmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pass_lb5)
                        .addComponent(pass_lb4)
                        .addComponent(faddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_lb)
                    .addComponent(fpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_lb7)
                    .addComponent(fcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Query="";
Connection c;
Statement s;
ResultSet r;
String fname=ffname.getText();
String lname=flname.getText();
String user=fuser.getText();
String dob=fdob.getText();
String gender="";
    if(ff.isSelected())
        gender="F";
    if(fm.isSelected())
        gender="M";
String mobile=fmobile.getText();
String email=femail.getText();
String add=faddress.getText();
String pass=fpass.getText();
String cpass=fcpass.getText();
if(pass.equals(cpass))
{
        try
        {
            Query="insert into register values('"+fname+"','"+lname+"','"+user+"','"+dob+"','"+gender+"','"+mobile+"','"+email+"','"+add+"','"+pass+"')";
            Class.forName("java.sql.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/BloodDonation", "root", "gaurav");
            s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate(Query);  
            JOptionPane.showMessageDialog(this, "Sucessfuly Registered..!!!");
            new login().setVisible(true);
            this.setVisible(false);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Something Wrong..!!!"+e);return;
        }
}
else
{
    JOptionPane.showMessageDialog(this, "Passwords Does not match..!!!");return;
}
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField faddress;
    private javax.swing.JPasswordField fcpass;
    private javax.swing.JTextField fdob;
    private javax.swing.JTextField femail;
    private javax.swing.JRadioButton ff;
    private javax.swing.JTextField ffname;
    private javax.swing.JTextField flname;
    private javax.swing.JRadioButton fm;
    private javax.swing.JTextField fmobile;
    private javax.swing.JPasswordField fpass;
    private javax.swing.JTextField fuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel pass_lb;
    private javax.swing.JLabel pass_lb1;
    private javax.swing.JLabel pass_lb2;
    private javax.swing.JLabel pass_lb3;
    private javax.swing.JLabel pass_lb4;
    private javax.swing.JLabel pass_lb5;
    private javax.swing.JLabel pass_lb6;
    private javax.swing.JLabel pass_lb7;
    private javax.swing.JLabel user_lb;
    private javax.swing.JLabel user_lb1;
    private javax.swing.JLabel user_lb2;
    // End of variables declaration//GEN-END:variables
}