package Login;

import java.sql.*;
import javax.swing.*;
//import mysql.DbConfiguration;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bn = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        l1.setText("WHITE BANK");
        l1.setToolTipText("");
        getContentPane().add(l1);
        l1.setBounds(470, 20, 347, 78);

        l2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 102, 102));
        l2.setText("I am ");
        l2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l2);
        l2.setBounds(460, 210, 115, 42);

        cmb.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        cmb.setForeground(new java.awt.Color(255, 102, 102));
        cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee", "Customer" }));
        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });
        getContentPane().add(cmb);
        cmb.setBounds(660, 200, 274, 54);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("User Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 310, 97, 34);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(660, 300, 219, 34);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 370, 115, 41);

        bn.setBackground(new java.awt.Color(153, 102, 255));
        bn.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        bn.setForeground(new java.awt.Color(102, 102, 255));
        bn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginicon.jpg"))); // NOI18N
        bn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        getContentPane().add(bn);
        bn.setBounds(620, 460, 70, 60);
        getContentPane().add(t2);
        t2.setBounds(660, 370, 220, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1404, 708);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        try {
          // bn.setVisible(false);
        
            String userid = t1.getText();
            String password = t2.getText();
            String type = cmb.getSelectedItem().toString();
            DbConfiguration ob = new DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            if (type.equalsIgnoreCase("Employee")) {
                String query = "select * from employeeinfo where uid='" + userid + "' and password='"
                        + password + "'";
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                   
                 //   JOptionPane.showMessageDialog(null, "Login Successfull");
                    Employee.Tasks emp = new Employee.Tasks(userid);
                    emp.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid User id or Password");
                }
            }
            if (type.equalsIgnoreCase("Customer")) {
                String query = "select * from customerinfo where uid='" + userid + "' and password='"
                        + password + "'";
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                    String fname = rs.getString(2);
                    // String lname=rs.getString(4);

                    JOptionPane.showMessageDialog(null, "Login Successfull");
//                    Customer.CustomerTask emp = new Customer.CustomerTask();
//
//                    emp.setVisible(true);
//                    this.setVisible(false);
                    Employee.Tasks emp = new Employee.Tasks();
                    emp.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid User id or Password");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }


    }//GEN-LAST:event_bnActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bn;
    private javax.swing.JComboBox cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    public static javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
