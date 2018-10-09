package Task;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Transfer extends javax.swing.JFrame {

    /**
     * Creates new form Transfer
     */
    public Transfer() {
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
        sid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        transfer = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        verify1 = new javax.swing.JButton();
        verify2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(475, 11, 346, 78);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("From Account Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 140, 220, 32);
        getContentPane().add(sid);
        sid.setBounds(570, 140, 232, 32);

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 210, 550, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("To Account Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 370, 210, 24);
        getContentPane().add(rid);
        rid.setBounds(580, 370, 261, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 560, 104, 28);
        getContentPane().add(amt);
        amt.setBounds(580, 560, 271, 28);

        transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction.png"))); // NOI18N
        transfer.setMargin(new java.awt.Insets(0, 0, 1, 0));
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer);
        transfer.setBounds(610, 620, 100, 70);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("Date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(860, 30, 210, 31);

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 440, 550, 110);

        verify1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check1.png"))); // NOI18N
        verify1.setMargin(new java.awt.Insets(0, 0, 1, 0));
        verify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify1ActionPerformed(evt);
            }
        });
        getContentPane().add(verify1);
        verify1.setBounds(850, 120, 71, 60);

        verify2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check1.png"))); // NOI18N
        verify2.setMargin(new java.awt.Insets(0, 0, 1, 0));
        verify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify2ActionPerformed(evt);
            }
        });
        getContentPane().add(verify2);
        verify2.setBounds(860, 360, 70, 60);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1210, 10, 59, 60);

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1958, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        try {
          
            int se = Integer.parseInt(sid.getText());
            int re = Integer.parseInt(rid.getText());
            int amount = Integer.parseInt(amt.getText());
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String query = "select * from trans where acno='" + sid.getText() + "'";//TO check sender id in database
            ResultSet rs = st.executeQuery(query);

            rs.next();
            int senderid = rs.getInt(1);//to fetch Sender id  from database

            query = "select * from trans where acno='" + rid.getText() + "'";//To check Receiver id in database
            rs = st.executeQuery(query);
            rs.next();
            int receiverid = rs.getInt(1);//To fetch Reciever id 

            if (se == senderid && re == receiverid)// matching sender/receiver id with corresponding database id's'
            {
                query = "select * from trans where acno='" + sid.getText() + "'"; //Checking sender's Account Balance
                rs = st.executeQuery(query);
                rs.next();
                int dbamount = rs.getInt(5);
                if (dbamount >= amount) {
                    query = "update trans set balance=balance-" + amount + " where acno='" + sid.getText() + "'";
                    int r = st.executeUpdate(query);
                    if (r > 0) {
                        query = "update trans set balance=balance+" + amount + " where acno='" + rid.getText() + "'";
                        r = st.executeUpdate(query);
                        if (r > 0) {
                            JOptionPane.showMessageDialog(null, "Transaction is sucessfull of Rs\t" + amount);
                            
                            
               query = "select * from trans where acno='" + sid.getText() + "'";
             rs = st.executeQuery(query);
            if (rs.next()) {
                String heading[] = {"First Name", "Last Name", "Curent Balance"};
                Object val[][] = new Object[1][3];
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(4);
                val[0][2] = rs.getString(5);

                DefaultTableModel dft = new DefaultTableModel(val, heading);
                table1.setModel(dft);  
               
                
                java.util.Date dt = new java.util.Date();
                    String cdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                            + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();

                    String w = "w";
                  String sql = "insert into history(acno,w_d,date,amount)values('" + se + "','" + w + "','" + cdate + "','"+amount+"')";
                    int sd = st.executeUpdate(sql);
                   
                    if (sd > 0) {
                            
                    } else {
                        JOptionPane.showMessageDialog(null, "error inserting one or more entries in the database.");
                    }
                
                String d = "d";
                   sql = "insert into history(acno,w_d,date,amount)values('" + re + "','" + d + "','" + cdate + "','"+amount+"')";
                     sd = st.executeUpdate(sql);
                   
                    if (sd > 0) {
                            
                    } else {
                        JOptionPane.showMessageDialog(null, "error inserting one or more entries in the database.");
                    }
                
                
                            
            }
            
                
             query = "select * from trans where acno='" + rid.getText() + "'";
             rs = st.executeQuery(query);
            if (rs.next()) {
                String head[] = {"First Name", "Last Name", "Curent Balance"};
                Object va[][] = new Object[1][3];
                va[0][0] = rs.getString(2);
                va[0][1] = rs.getString(4);
                va[0][2] = rs.getString(5);

                DefaultTableModel df = new DefaultTableModel(va, head);
                table2.setModel(df);
                amt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "User id not Found");
            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Transaction failed");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Transaction Failed");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You don't have Sufficient Balance.Please recharge your account");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Transaction failed due to an Error" + e);
        }

    }//GEN-LAST:event_transferActionPerformed

    private void verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify1ActionPerformed
        try {
            String id = sid.getText();
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
                table1.setModel(dft);
            } else {
                DefaultTableModel df = (DefaultTableModel) table1.getModel();
                while (df.getRowCount() > 0) {
                    for (int i = 0; i < df.getRowCount(); i++) {
                        df.removeRow(i);
                    }

                }
                JOptionPane.showMessageDialog(null, "User id not Found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_verify1ActionPerformed

    private void verify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify2ActionPerformed
        try {
            String id = rid.getText();
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
                table2.setModel(dft);
            } else {
                JOptionPane.showMessageDialog(null, "User id not Found");
            }

        } catch (Exception e) {
            DefaultTableModel df = (DefaultTableModel) table2.getModel();
            while (df.getRowCount() > 0) {
                for (int i = 0; i < df.getRowCount(); i++) {
                    df.removeRow(i);
                }

            }
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }//GEN-LAST:event_verify2ActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField sid;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JButton transfer;
    private javax.swing.JButton verify1;
    private javax.swing.JButton verify2;
    // End of variables declaration//GEN-END:variables
}
