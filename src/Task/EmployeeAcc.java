/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import java.sql.*;
import javax.swing.*;

public class EmployeeAcc extends javax.swing.JFrame {

    public EmployeeAcc() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        cmbdate.addItem("DATE");
        for (int i = 1; i <= 30; i++) {
            cmbdate.addItem(i);
        }
        cmbmonth.addItem("Month");
        for (int i = 1; i <= 12; i++) {
            cmbmonth.addItem(i);
        }
        cmbyear.addItem("Year");
        for (int i = 12; i <= 100; i++) {
            cmbyear.addItem(2018 - i);
        }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbdate = new javax.swing.JComboBox();
        cmbmonth = new javax.swing.JComboBox();
        cmbyear = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfirst = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbstate = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tmiddle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tlast = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        Submit = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tuid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taddress = new javax.swing.JTextArea();
        temail = new javax.swing.JTextField();
        tpass = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel16.setText("Date of Birth");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(630, 450, 130, 40);

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(910, 200, 61, 24);

        getContentPane().add(cmbdate);
        cmbdate.setBounds(780, 450, 80, 20);

        cmbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmonthActionPerformed(evt);
            }
        });
        getContentPane().add(cmbmonth);
        cmbmonth.setBounds(860, 450, 90, 20);

        getContentPane().add(cmbyear);
        cmbyear.setBounds(950, 450, 80, 20);

        jLabel17.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 204, 255));
        jLabel17.setText("Employee Account Registration form");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(417, 100, 423, 24);

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel9.setText("State");
        jLabel9.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLabel9CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(910, 370, 61, 24);

        tfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfirstActionPerformed(evt);
            }
        });
        getContentPane().add(tfirst);
        tfirst.setBounds(310, 280, 150, 30);

        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });
        getContentPane().add(tphone);
        tphone.setBounds(310, 360, 150, 30);

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 350, 71, 24);

        cmbstate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------Select States------------", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerela", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalya", "Nagaland", "Odhisa", "Punjab", "Rajasthan", "Sikkim", "Tamil Naidu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West bengal", "---------------------UNION TERRITORIES-----------------", "Andaman and Nikobar", "Chandigarh", "Dadar and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshdweep", "Puducherry", " ", " ", " ", " ", " ", " " }));
        getContentPane().add(cmbstate);
        cmbstate.setBounds(990, 370, 200, 24);

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel13.setText("Middle Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 270, 120, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 347, 78);
        getContentPane().add(tmiddle);
        tmiddle.setBounds(670, 270, 160, 29);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 280, 91, 24);

        jLabel14.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel14.setText("Last Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(880, 280, 89, 24);
        getContentPane().add(tlast);
        tlast.setBounds(990, 280, 190, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel5.setText("Phone Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 360, 128, 24);

        jLabel15.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel15.setText("Password");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 200, 90, 24);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        r1.setText("Male");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(670, 330, 67, 33);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        r2.setText("Female");
        getContentPane().add(r2);
        r2.setBounds(670, 370, 85, 33);

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        Submit.setMargin(new java.awt.Insets(0, 0, 1, 0));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(650, 590, 51, 50);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(877, 30, 220, 40);

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel4.setText("User ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 200, 80, 30);
        getContentPane().add(tuid);
        tuid.setBounds(310, 200, 150, 30);

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 450, 80, 40);

        taddress.setColumns(20);
        taddress.setRows(5);
        jScrollPane1.setViewportView(taddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 430, 320, 130);

        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        getContentPane().add(temail);
        temail.setBounds(980, 200, 190, 30);
        getContentPane().add(tpass);
        tpass.setBounds(670, 200, 160, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1260, 10, 59, 60);

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
        jLabel3.setBounds(0, 0, 1958, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfirstActionPerformed

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jLabel9CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel9CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9CaretPositionChanged

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {
            String date = cmbdate.getSelectedItem().toString();
            String month = cmbmonth.getSelectedItem().toString();
            String year = cmbyear.getSelectedItem().toString();
            String gender = "";
            if (r1.isSelected() == true) {
                gender = r1.getLabel();
            } else {
                gender = r2.getLabel();
            }

            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            java.util.Date dt = new java.util.Date();
            String sdate = (dt.getYear() + 1900) + "-" + (dt.getMonth() + 1) + "-" + dt.getDate() + " "
                    + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds();
            String query = "insert into employeeinfo(uid,fname,mname,lname,gender,phone,address,date,state,dob,password,email)values('" + tuid.getText() + "','" + tfirst.getText() + "','" + tmiddle.getText() + "','" + tlast.getText() + "','" + gender + "','" + tphone.getText() + "','" + taddress.getText() + "','" + sdate + "','" + cmbstate.getSelectedItem().toString() + "','" + date + "-" + month + "-" + year + "','" + tpass.getText() + "','" + temail.getText() + "')";
            int re = st.executeUpdate(query);
            if (re > 0) {
                
               JOptionPane.showMessageDialog(null, "WELCOME:" + tfirst.getText() + "\tYour Account has been created Successfully");
                query = "select max(uid) from employeeinfo";
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Account id:" + rs.getString(1));
                }
                tuid.setText("");
                tfirst.setText("");
                tmiddle.setText("");
                tlast.setText("");
                tphone.setText("");
                taddress.setText("");
                tpass.setText("");
                temail.setText("");
                cmbstate.setSelectedIndex(0);
                cmbdate.setSelectedIndex(0);
                cmbmonth.setSelectedIndex(0);
                cmbyear.setSelectedIndex(0);
                r1.setSelected(false);
                r2.setSelected(false);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void cmbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmonthActionPerformed

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

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbdate;
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JComboBox cmbstate;
    private javax.swing.JComboBox cmbyear;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextArea taddress;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfirst;
    private javax.swing.JTextField tlast;
    private javax.swing.JTextField tmiddle;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tphone;
    private javax.swing.JTextField tuid;
    // End of variables declaration//GEN-END:variables
}
