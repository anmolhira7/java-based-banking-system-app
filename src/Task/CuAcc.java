
package Task;
import java.sql.*;
import javax.swing.*;
public class CuAcc extends javax.swing.JFrame {

    /**
     * Creates new form CuAcc
     */
    public CuAcc() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        cmbday.addItem("---Select Date---");
        for (int i = 1; i <= 30; i++) {
            cmbday.addItem(i);
        }
        cmbmonth.addItem("---Select Month---");
        for (int i = 1; i <= 12; i++) {
            cmbmonth.addItem(i);
        }
        cmbyear.addItem("---Select Year---");
        for (int i = 12; i <= 100; i++) {
            cmbyear.addItem(2018-i);
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfirst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tmiddle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tlast = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tpass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cmbday = new javax.swing.JComboBox();
        cmbmonth = new javax.swing.JComboBox();
        cmbyear = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        tphone = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 347, 78);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 220, 90, 17);
        getContentPane().add(tfirst);
        tfirst.setBounds(280, 210, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 210, 110, 30);
        getContentPane().add(tmiddle);
        tmiddle.setBounds(650, 210, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 210, 90, 30);
        getContentPane().add(tlast);
        tlast.setBounds(960, 210, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 320, 90, 40);
        getContentPane().add(tpass);
        tpass.setBounds(650, 320, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 310, 60, 40);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setText("Male");
        getContentPane().add(r1);
        r1.setBounds(290, 310, 80, 25);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("Female");
        getContentPane().add(r2);
        r2.setBounds(290, 340, 110, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("E-Mail");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(850, 320, 80, 30);
        getContentPane().add(temail);
        temail.setBounds(960, 320, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 410, 80, 40);

        taddress.setColumns(20);
        taddress.setRows(5);
        jScrollPane1.setViewportView(taddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 410, 220, 120);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date of Birth");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(520, 410, 120, 30);

        cmbday.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(cmbday);
        cmbday.setBounds(620, 410, 80, 30);

        getContentPane().add(cmbmonth);
        cmbmonth.setBounds(700, 410, 80, 30);

        getContentPane().add(cmbyear);
        cmbyear.setBounds(780, 410, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Phone Number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(890, 400, 130, 40);

        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });
        getContentPane().add(tphone);
        tphone.setBounds(1040, 400, 150, 30);

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        submit.setMargin(new java.awt.Insets(0, 0, 1, 0));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(610, 520, 100, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back icon.png"))); // NOI18N
        jButton2.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 10, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton3.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1170, 20, 60, 61);

        lbltime.setText("date and time");
        getContentPane().add(lbltime);
        lbltime.setBounds(870, 30, 190, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Customer Account Creation Form");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 120, 310, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1964, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Employee.Tasks ob=new Employee.Tasks();
      ob.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login.Login ob=new Login.Login();
        ob.setVisible(true);
      this.setVisible(false);         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      try {
            String day = cmbday.getSelectedItem().toString();
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

            String query = "insert into customerinfo(fname,mname,lname,gender,email,password,phone,dob,address,date)values('" + tfirst.getText() + "','" + tmiddle.getText() + "','" + tlast.getText() + "','" + gender + "','" + temail.getText() + "','" + tpass.getText() + "','" + tphone.getText() + "','" + day + "-" + month + "-" + year + "','" + taddress.getText() + "','" + sdate + "')";
            int re = st.executeUpdate(query);
            if (re > 0){
                String msg="Your Account has been created successfully";
              //  JOptionPane.showMessageDialog(null, "Welcome:" + tfirst.getText() + " Your Account has Been created Successfully!");
                query = "select max(uid) from customerinfo";
                ResultSet rs = st.executeQuery(query);
                rs.next();
                String userid = rs.getString(1).toString();

                JOptionPane.showMessageDialog(null,msg+" Account Numer:" + rs.getString(1));

            }
            else{
                JOptionPane.showMessageDialog(null,"Account creation failed");
            }

            query = "select max(uid) from customerinfo";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String userid = rs.getString(1).toString();
            System.out.println("ID =" + userid);

          
            query = "insert into trans(acno,fname,mname,lname,balance)values('" + userid + "','" + tfirst.getText() + "','" + tmiddle.getText() + "','" + tlast.getText() + "','" + 0 + "')";
            re = st.executeUpdate(query);
            if (re > 0) {
                JOptionPane.showMessageDialog(null, "Transaction Account created Successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
    }                                          
      
        
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(CuAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbday;
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JComboBox cmbyear;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea taddress;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfirst;
    private javax.swing.JTextField tlast;
    private javax.swing.JTextField tmiddle;
    private javax.swing.JTextField tpass;
    private javax.swing.JTextField tphone;
    // End of variables declaration//GEN-END:variables
}
