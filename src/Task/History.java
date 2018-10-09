package Task;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class History extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    public History() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        uid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/history.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Transaction History");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 110, 155, 30);

        l1.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        l1.setText("WHITE BANK");
        l1.setToolTipText("");
        getContentPane().add(l1);
        l1.setBounds(380, 10, 347, 78);

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("User Id");
        getContentPane().add(id);
        id.setBounds(470, 220, 80, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 280, 670, 180);

        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        getContentPane().add(uid);
        uid.setBounds(630, 220, 240, 30);

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 470, 80, 40);

        lbltime.setText("jLabel3");
        getContentPane().add(lbltime);
        lbltime.setBounds(760, 20, 280, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1130, 10, 60, 60);

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1958, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        try {
            String id=uid.getText();
            Login.DbConfiguration ob=new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn=DriverManager.getConnection(ob.URL,ob.USERID,ob.PASSWORD);
            Statement st = cn.createStatement();
            String sql="select * from history where acno='"+id+"'";
            ResultSet rs=st.executeQuery(sql);
            if (rs.next()) {
                String heading[] = {"Account Number", "Withdrawl/Deposit", "Date","Amount"};
                Object val[][] = new Object[1][4];
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
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
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }//GEN-LAST:event_uidActionPerformed

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTable table;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
