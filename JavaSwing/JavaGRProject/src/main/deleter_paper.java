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
public class deleter_paper extends javax.swing.JFrame {

    /**
     * Creates new form deleter_paper
     */
    public deleter_paper() {
        initComponents();
    }
    String code;
    public deleter_paper(String scode) {
        initComponents();
        showrec_tb.setEnabled(false);
        code=scode;
        PublicFunctions pf=new PublicFunctions();
        try
        {
            pf.Query="Select Distinct(testid) from marks where scode='"+scode+"'";
            pf.getrec();
            while(pf.r.next())
            {
                testid_cb.addItem(pf.r.getString(1));
            }
            pf.Query="Select sname from subjects where scode='"+code+"'";
            pf.getrec();
            pf.r.next();
            subname_lb.setText(pf.r.getString(1));
        }
        catch(Exception e)        {           
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

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        year_lb1 = new javax.swing.JLabel();
        year_lb = new javax.swing.JLabel();
        testid_cb = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showrec_tb = new javax.swing.JTable();
        subname_lb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close_lb = new javax.swing.JLabel();
        logout_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(25, 118, 211));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grlogo.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        year_lb1.setBackground(new java.awt.Color(255, 255, 255));
        year_lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year_lb1.setForeground(new java.awt.Color(255, 0, 0));
        year_lb1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        year_lb1.setText("Subject : ");
        jPanel1.add(year_lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        year_lb.setBackground(new java.awt.Color(255, 255, 255));
        year_lb.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        year_lb.setForeground(new java.awt.Color(25, 118, 211));
        year_lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        year_lb.setText("Select Test");
        jPanel1.add(year_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        testid_cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testid_cbItemStateChanged(evt);
            }
        });
        testid_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testid_cbActionPerformed(evt);
            }
        });
        testid_cb.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                testid_cbInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(testid_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 160, 30));

        jButton1.setBackground(new java.awt.Color(25, 118, 211));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 110, 30));

        showrec_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm no", "Name of Students", "Enter Obtain Marks", "Total Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showrec_tb.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(showrec_tb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 210));

        subname_lb.setBackground(new java.awt.Color(255, 255, 255));
        subname_lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subname_lb.setForeground(new java.awt.Color(255, 0, 0));
        subname_lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(subname_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 630, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        close_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        close_lb.setToolTipText("Close");
        close_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lbMouseClicked(evt);
            }
        });

        logout_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_to_30px.png"))); // NOI18N
        logout_lb.setToolTipText("Log Out");
        logout_lb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_lbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 542, Short.MAX_VALUE)
                .addComponent(logout_lb)
                .addGap(16, 16, 16)
                .addComponent(close_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(close_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lbMouseClicked
System.exit(0);
    }//GEN-LAST:event_close_lbMouseClicked

    private void logout_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lbMouseClicked
new TeacherMenu().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_logout_lbMouseClicked

    private void testid_cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testid_cbItemStateChanged
PublicFunctions pf =new PublicFunctions();
        pf.emptyTable(showrec_tb);
        try
        {
            DefaultTableModel model=(DefaultTableModel) showrec_tb.getModel();
            pf.Query="Select m.admno,s.name,obtain,total from marks m, student s where scode='"+code+"' and testid='"+testid_cb.getSelectedItem().toString()+"' and m.admno=s.admno";
            pf.getrec();
            int i=0;
            while(pf.r.next())
            {
                if(pf.r.getString(3).equals("NULL")){
                    model.addRow(new Object[] {pf.r.getString(1),pf.r.getString(2)});
                    showrec_tb.setValueAt(pf.r.getString(4), i, 3);
                }
                else{
                    model.addRow(new Object[] {pf.r.getString(1),pf.r.getString(2),pf.r.getFloat(3),pf.r.getString(4)});
                }
                i++;
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_testid_cbItemStateChanged

    private void testid_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testid_cbActionPerformed

    }//GEN-LAST:event_testid_cbActionPerformed

    private void testid_cbInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_testid_cbInputMethodTextChanged

    }//GEN-LAST:event_testid_cbInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int dlt=JOptionPane.showConfirmDialog(this,"Do you Really want to Delete all\n Records of sub : "+subname_lb.getText()+"\nPaper Id : "+testid_cb.getSelectedItem(),"Confirm", JOptionPane.YES_NO_OPTION);
    if(dlt==0){
        PublicFunctions pf=new PublicFunctions();
        try{
            pf.Query="Delete from marks where testid='"+testid_cb.getSelectedItem().toString()+"' && scode='"+code+"'";
            pf.updtrec();
            JOptionPane.showMessageDialog(this, "Records Deleted Sucessfully..!!!");
            new TeacherMenu().setVisible(true);
            this.setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error while delete Records..!!!"); return;
        }
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
            java.util.logging.Logger.getLogger(deleter_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleter_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleter_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleter_paper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleter_paper().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_lb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout_lb;
    private javax.swing.JTable showrec_tb;
    private javax.swing.JLabel subname_lb;
    private javax.swing.JComboBox testid_cb;
    private javax.swing.JLabel year_lb;
    private javax.swing.JLabel year_lb1;
    // End of variables declaration//GEN-END:variables
}