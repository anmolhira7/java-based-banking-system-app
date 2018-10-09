package Task;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Withdraw extends javax.swing.JFrame {

    public Withdraw() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        verify = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tamt = new javax.swing.JTextField();
        withdrawl = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        lbltime = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(492, 11, 346, 78);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Withdraw  Money");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(596, 107, 220, 33);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setText("User Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(482, 166, 107, 33);

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
        jScrollPane1.setBounds(482, 220, 452, 116);

        verify.setText("Verify");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        getContentPane().add(verify);
        verify.setBounds(903, 174, 61, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Amount");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(482, 370, 116, 28);
        getContentPane().add(tamt);
        tamt.setBounds(624, 370, 292, 28);

        withdrawl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/withdraw 1.png"))); // NOI18N
        withdrawl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        withdrawl.setMargin(new java.awt.Insets(0, 0, 1, 0));
        withdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawlActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawl);
        withdrawl.setBounds(690, 420, 100, 90);
        getContentPane().add(tid);
        tid.setBounds(641, 169, 197, 33);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(860, 30, 220, 40);

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
        jButton8.setBounds(1200, 10, 59, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1958, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        try {
            String id = tid.getText();
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String query = "select * from trans where acno='" + id + "'";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                String heading[] = {"First Name", "Last Name", "Curent Balance"};
                Object val[][] = new Object[1][3];
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(4);
                val[0][2] = rs.getString(5);

                DefaultTableModel dft = new DefaultTableModel(val, heading);
                table.setModel(dft);
            } else {
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                while (df.getRowCount() > 0) {
                    for (int i = 0; i < df.getRowCount(); i++) {
                        df.removeRow(i);
                    }

                }
                JOptionPane.showMessageDialog(null, "User id not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }//GEN-LAST:event_verifyActionPerformed

    private void withdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawlActionPerformed
        try {
            int id = Integer.parseInt(tid.getText());
            Login.DbConfiguration ob1 = new Login.DbConfiguration();
            Class.forName(ob1.DRIVER);
            Connection cn = DriverManager.getConnection(ob1.URL, ob1.USERID, ob1.PASSWORD);
            Statement st = cn.createStatement();
            String query = "select * from trans where acno='" + tid.getText() + "'";
            ResultSet sp = st.executeQuery(query);

            if (sp.next()) {
                int dbal = sp.getInt(5);
                int bal = Integer.parseInt(tamt.getText());//to convert form's amount textfield to integer 
                if (bal <= dbal) {
                    query = "update trans set balance=balance-" + bal + " where acno='" + tid.getText() + "'";
                    int re = st.executeUpdate(query);
                    if (re > 0) {
                        JOptionPane.showMessageDialog(null, bal + "\tRupees is deducted Successfully");
                        // tid.setText("");
                      //  tamt.setText("");

//                    DefaultTableModel df=(DefaultTableModel)table.getModel();
//                    while(df.getRowCount()>0)
//                    {
//                        for(int i=0;i<df.getRowCount();i++)
//                        {
//                            df.removeRow(i);
//                        }
//                            
//                    }
                    }
                    String sid = tid.getText();
                    Login.DbConfiguration ob = new Login.DbConfiguration();
                    Class.forName(ob.DRIVER);
                    Connection c = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
                    Statement s = c.createStatement();
                    String qu = "select * from trans where acno='" + sid + "'";
                    ResultSet rs = st.executeQuery(qu);
                    if (rs.next()) {
                        String heading[] = {"First Name", "Last Name", "New Balance"};
                        Object val[][] = new Object[1][3];
                        val[0][0] = rs.getString(2);
                        val[0][1] = rs.getString(4);
                        val[0][2] = rs.getString(5);

                        DefaultTableModel dft = new DefaultTableModel(val, heading);
                        table.setModel(dft);
                        java.util.Date dt = new java.util.Date();
                        String cdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                                + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();

                        String d = "w";
                        String sql = "insert into history(acno,w_d,date,amount)values('" + tid.getText() + "','" + d + "','" + cdate + "','"+tamt.getText()+"')";
                        int sd = st.executeUpdate(sql);
                        tamt.setText("");
                        if (sd > 0) {

                        } else {
                            JOptionPane.showMessageDialog(null, "error inserting one or more entries in the database.");
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Your Balance is not Sufficient.Please recharge Your Account");
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error" + e);
        }


    }//GEN-LAST:event_withdrawlActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTable table;
    private javax.swing.JTextField tamt;
    private javax.swing.JTextField tid;
    private javax.swing.JButton verify;
    private javax.swing.JButton withdrawl;
    // End of variables declaration//GEN-END:variables
}
