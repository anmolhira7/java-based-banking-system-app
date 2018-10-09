package Task;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Deposit extends javax.swing.JFrame {

    public Deposit() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Abc ob = new Abc();
        ob.start();
    }

    class Abc extends Thread {

        public void run() {
            while (true) {
                java.util.Date dt = new java.util.Date();
                String cdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                        + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();
                lbltime.setText(cdate);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        Verify = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Deposit = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 20, 346, 78);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel2.setText("Account ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 200, 150, 33);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setText("Amount in Rupees");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 510, 212, 33);

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setText("Deposit Money");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 110, 174, 33);
        getContentPane().add(amt);
        amt.setBounds(667, 505, 208, 33);

        Verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check1.png"))); // NOI18N
        Verify.setMargin(new java.awt.Insets(0, 0, 1, 0));
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });
        getContentPane().add(Verify);
        Verify.setBounds(891, 190, 70, 60);
        getContentPane().add(tid);
        tid.setBounds(670, 200, 202, 33);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 280, 452, 162);

        Deposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deposit.png"))); // NOI18N
        Deposit.setMargin(new java.awt.Insets(0, 0, 1, 0));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        getContentPane().add(Deposit);
        Deposit.setBounds(620, 580, 101, 100);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(880, 40, 160, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back icon.png"))); // NOI18N
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 10, 60, 60);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1170, 10, 59, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1958, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
        try {
            String id = tid.getText();
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String sql = "select * from trans where acno='" + id + "'";
            ResultSet rs = st.executeQuery(sql);

            String[] heading = {"First Name", "Last Name", "Balance"};//setting table heading
            Object[][] val = new Object[1][3]; //column[1] and rows[3] of table

            if (rs.next()) {
                val[0][0] = rs.getString(2);//first name from database
                val[0][1] = rs.getString(4);//last name
                val[0][2] = rs.getString(5);//Balance
                DefaultTableModel dft = new DefaultTableModel(val, heading);
                table.setModel(dft);
            } else {
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                while (df.getRowCount() > 0) {
                    for (int i = 0; i < df.getRowCount(); i++) {
                        df.removeRow(i);
                    }
                }
                JOptionPane.showMessageDialog(null, "UserId not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }//GEN-LAST:event_VerifyActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        try {
            int amount = Integer.parseInt(amt.getText());
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String sql = "select * from trans where acno='" + tid.getText() + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int amt = rs.getInt(5);
                //System.out.println(amt);
                int total = amt + amount;
                sql = "update trans set balance='" + total + "' where acno='"+ tid.getText() +"'" ;
                int re = st.executeUpdate(sql);
                if (re > 0) {

                    JOptionPane.showMessageDialog(null, "Deposit successfull");
                  
                    String[] heading = {"First Name", "Last Name", "Balance"};
                    Object[][] val = new Object[1][3];
                    sql = "select * from trans where acno='" + tid.getText() + "'";
                    rs = st.executeQuery(sql);
                    if (rs.next()) {
                        val[0][0] = rs.getString(2);//first name from database
                        val[0][1] = rs.getString(4);//last name
                        val[0][2] = rs.getString(5);//Balance
                        DefaultTableModel dft = new DefaultTableModel(val, heading);
                        table.setModel(dft);
          
                                 
                    }
                    
                    java.util.Date dt = new java.util.Date();
                    String cdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                            + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();

                    String d = "d";
                    sql = "insert into history(acno,w_d,date,amount)values('" + tid.getText() + "','" + d + "','" + cdate + "','"+amount+"')";
                    int sd = st.executeUpdate(sql);
                   
                    if (sd > 0) {
                            
                    } else {
                        JOptionPane.showMessageDialog(null, "error inserting one or more entries in the database.");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Failed to Deposit");
                    DefaultTableModel df = (DefaultTableModel) table.getModel();
                    while (df.getRowCount() > 0) {
                        for (int i = 0; i < df.getRowCount(); i++) {
                            df.removeRow(i);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Userid or amount is not correct");
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                while (df.getRowCount() > 0) {
                    for (int i = 0; i < df.getRowCount(); i++) {
                        df.removeRow(i);
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

    }//GEN-LAST:event_DepositActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Employee.Tasks ob = new Employee.Tasks();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Login.Login ob = new Login.Login();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposit;
    private javax.swing.JButton Verify;
    private javax.swing.JTextField amt;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTable table;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}
