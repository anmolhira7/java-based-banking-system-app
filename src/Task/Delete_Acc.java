package Task;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Delete_Acc extends javax.swing.JFrame {

    public Delete_Acc() {
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

        jLabel2 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        Verify = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setText("User Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 250, 80, 30);

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        getContentPane().add(tid);
        tid.setBounds(570, 250, 210, 30);

        Verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check1.png"))); // NOI18N
        Verify.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Verify.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        Verify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Verify.setMargin(new java.awt.Insets(0, 0, 1, 0));
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });
        getContentPane().add(Verify);
        Verify.setBounds(830, 240, 70, 60);

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
        jScrollPane1.setBounds(440, 350, 452, 100);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteicon.png"))); // NOI18N
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete.setMargin(new java.awt.Insets(0, 0, 1, 0));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(630, 530, 101, 110);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Delete Customer Account");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 150, 230, 50);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("Date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(910, 40, 220, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 10, 345, 88);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 1958, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
        try {
            String id = tid.getText();
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String query = "select * from trans where acno='" + id + "'";//Fetching id from database
            ResultSet rs = st.executeQuery(query);

            String heading[] = {"First Name", "Last Name", "Curent Balance"};//setting table heading
            Object val[][] = new Object[1][3];//column[1] and rows[3] of table
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
                JOptionPane.showMessageDialog(null, "User id not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_VerifyActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            try {
                int aid = Integer.parseInt(tid.getText());//entered id
                // int amount = Integer.parseInt(amt.getText());
                Login.DbConfiguration ob1 = new Login.DbConfiguration();
                Class.forName(ob1.DRIVER);
                Connection cn = DriverManager.getConnection(ob1.URL, ob1.USERID, ob1.PASSWORD);
                Statement st = cn.createStatement();
                String query = "select * from trans where acno='" + tid.getText() + "'";
                ResultSet rs = st.executeQuery(query);
                rs.next();
                int did = rs.getInt(1);//Fetching corresponding database id
                if (aid == did) {//Matching id
                    query = "delete from trans where acno='" + aid + "'";
                    int re = st.executeUpdate(query);
                    query = "delete from customerinfo where uid='" + aid + "'";
                    re = st.executeUpdate(query);
                    if (re > 0) {
                        JOptionPane.showMessageDialog(null, aid + "\t\tAccount is deleted successfully");
                        //    tid.setText("");
                        tid.setText("");
                        DefaultTableModel df = (DefaultTableModel) table.getModel();
                        while (df.getRowCount() > 0) {
                            for (int i = 0; i < df.getRowCount(); i++) {
                                df.removeRow(i);
                            }

                        }
                        java.util.Date dt = new java.util.Date();
                        String cdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                                + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();
                        String status = "closed";
                        String sql = "insert into history(acno,w_d,date)values('" + aid + "','" + status + "','" + cdate + "')";
                        int sd = st.executeUpdate(sql);

                        if (sd > 0) {

                        } else {
                            JOptionPane.showMessageDialog(null, "error inserting one or more entries in the database.");
                        }

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "\tFailed to delete account");
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error" + e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Login.Login ob = new Login.Login();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Employee.Tasks ob = new Employee.Tasks();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Acc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Verify;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTable table;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}
