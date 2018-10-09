package Task;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class UpdateC extends javax.swing.JFrame {
    public String a;

    public UpdateC() {

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbltime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        verify = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ch1 = new javax.swing.JCheckBox();
        chmiddle = new javax.swing.JCheckBox();
        chlast = new javax.swing.JCheckBox();
        chgender = new javax.swing.JCheckBox();
        chphone = new javax.swing.JCheckBox();
        chaddress = new javax.swing.JCheckBox();
        chdate = new javax.swing.JCheckBox();
        chemail = new javax.swing.JCheckBox();
        update = new javax.swing.JButton();
        tfirst = new javax.swing.JTextField();
        tmiddle = new javax.swing.JTextField();
        tlast = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        taddress = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        temail = new javax.swing.JTextField();
        cmbday = new javax.swing.JComboBox();
        cmbmonth = new javax.swing.JComboBox();
        cmbyear = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 102, 102));
        lbltime.setText("DATE AND TIME");
        getContentPane().add(lbltime);
        lbltime.setBounds(850, 20, 200, 40);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mybank.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(475, 11, 346, 78);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Account update form");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 110, 190, 50);

        jLabel3.setText("User ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 180, 50, 40);

        verify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check1.png"))); // NOI18N
        verify.setMargin(new java.awt.Insets(0, 0, 1, 0));
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        getContentPane().add(verify);
        verify.setBounds(760, 163, 60, 70);
        getContentPane().add(tid);
        tid.setBounds(500, 180, 220, 30);

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
        jScrollPane1.setBounds(90, 250, 1220, 70);

        ch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ch1.setText("First name");
        getContentPane().add(ch1);
        ch1.setBounds(160, 370, 97, 20);

        chmiddle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chmiddle.setText("Middle Name");
        getContentPane().add(chmiddle);
        chmiddle.setBounds(420, 370, 120, 20);

        chlast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chlast.setText("Last Name");
        getContentPane().add(chlast);
        chlast.setBounds(690, 370, 100, 20);

        chgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chgender.setText("Gender");
        getContentPane().add(chgender);
        chgender.setBounds(980, 540, 80, 20);

        chphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chphone.setText("Phone");
        getContentPane().add(chphone);
        chphone.setBounds(980, 370, 70, 20);

        chaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chaddress.setText("Address ");
        getContentPane().add(chaddress);
        chaddress.setBounds(160, 470, 100, 30);

        chdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chdate.setText("Date of birth");
        chdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chdateActionPerformed(evt);
            }
        });
        getContentPane().add(chdate);
        chdate.setBounds(420, 470, 130, 20);

        chemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chemail.setText("Email");
        getContentPane().add(chemail);
        chemail.setBounds(980, 460, 70, 20);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateicon.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(590, 620, 50, 50);
        getContentPane().add(tfirst);
        tfirst.setBounds(270, 370, 120, 30);
        getContentPane().add(tmiddle);
        tmiddle.setBounds(550, 370, 120, 30);
        getContentPane().add(tlast);
        tlast.setBounds(800, 370, 140, 30);
        getContentPane().add(tphone);
        tphone.setBounds(1060, 370, 120, 30);
        getContentPane().add(taddress);
        taddress.setBounds(270, 470, 120, 30);

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setText("Male");
        getContentPane().add(r1);
        r1.setBounds(1070, 540, 57, 20);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("Female");
        getContentPane().add(r2);
        r2.setBounds(1070, 570, 73, 20);
        getContentPane().add(temail);
        temail.setBounds(1060, 460, 120, 30);

        cmbday.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DATE", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbday);
        cmbday.setBounds(570, 470, 70, 20);

        cmbmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MONTH", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        getContentPane().add(cmbmonth);
        cmbmonth.setBounds(640, 470, 80, 20);

        cmbyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008\t", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", " " }));
        cmbyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbyearActionPerformed(evt);
            }
        });
        getContentPane().add(cmbyear);
        cmbyear.setBounds(720, 470, 80, 20);

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
        jButton8.setBounds(1210, 10, 59, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golden.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 1958, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            ResultSet rs;
            int re;
            String query;
            String id = tid.getText();
            if (ch1.isSelected()) {
                query = "update customerinfo set fname='" + tfirst.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                 //   JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="firstname is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

            if (chmiddle.isSelected()) {
                query = "update customerinfo set mname='" + tmiddle.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                   // JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="middle is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 
            
            if (chlast.isSelected()) {
                query = "update customerinfo set lname='" + tlast.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                   // JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="lastname is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

          
            if (chphone.isSelected()) {
                query = "update customerinfo set phone='" + tphone.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                   // JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="phone is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

            if (chaddress.isSelected()) {
                query = "update customerinfo set address='" + taddress.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                   // JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="address is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

            if (chemail.isSelected()) {
                query = "update customerinfo set email='" + temail.getText() + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
               //     JOptionPane.showMessageDialog(null, "Update is Successfull");
                 a+="email is updated";   
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

            if (chgender.isSelected()) {
                String gender = "";
                if (r1.isSelected() == true) {
                    gender = r1.getLabel();

                } else {
                    gender = r2.getLabel();
                }

                query = "update customerinfo set gender='" + gender + "' where uid='" + id + "'";
                re = st.executeUpdate(query);
                if (re > 0) {
                    //JOptionPane.showMessageDialog(null, "Update is Successfull");
                    a+="gender is updated";
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }

            } 

            if (chdate.isSelected()) {
                String day = cmbday.getSelectedItem().toString();
                String month = cmbmonth.getSelectedItem().toString();
                String year = cmbyear.getSelectedItem().toString();
                
                query="update customerinfo set dob='"+day+"-"+month+"-"+year+"' where uid='"+id+"'";
                re = st.executeUpdate(query);
                if (re > 0) {
                  //  JOptionPane.showMessageDialog(null, "Update is Successfull");
                   a+="date is updated"; 
                   JOptionPane.showMessageDialog(null, a);
                    query = "select * from customerinfo where uid='" + id + "'";
                    rs=st.executeQuery(query);
                   String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }  

                } else {
                    JOptionPane.showMessageDialog(null, "Update failed to Execute \nEither user id not entered or Userid is Incorrect");
                }
            }
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        try {
            Login.DbConfiguration ob = new Login.DbConfiguration();
            Class.forName(ob.DRIVER);
            Connection cn = DriverManager.getConnection(ob.URL, ob.USERID, ob.PASSWORD);
            Statement st = cn.createStatement();
            String query = "select * from customerinfo where uid='" + tid.getText() + "'";
            ResultSet rs = st.executeQuery(query);
            String heading[] = {"First Name", "Middle Name", "Last Name", "Gender", "Email", "Password", "Phone", "Date of Birth", "Address", "Creation Date"};
            Object val[][] = new Object[1][10];
            if (rs.next()) {
                val[0][0] = rs.getString(2);
                val[0][1] = rs.getString(3);
                val[0][2] = rs.getString(4);
                val[0][3] = rs.getString(5);
                val[0][4] = rs.getString(6);
                val[0][5] = rs.getString(7);
                val[0][6] = rs.getString(8);
                val[0][7] = rs.getString(9);
                val[0][8] = rs.getString(10);
                val[0][9] = rs.getString(11);
               DefaultTableModel dft =new DefaultTableModel(val,heading);
               table.setModel(dft);
               
            }

            else
            {
                JOptionPane.showMessageDialog(null,"No Data Found");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error"+e);
        }
      
    }//GEN-LAST:event_verifyActionPerformed

    private void chdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chdateActionPerformed

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

    private void cmbyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbyearActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JCheckBox chaddress;
    private javax.swing.JCheckBox chdate;
    private javax.swing.JCheckBox chemail;
    private javax.swing.JCheckBox chgender;
    private javax.swing.JCheckBox chlast;
    private javax.swing.JCheckBox chmiddle;
    private javax.swing.JCheckBox chphone;
    private javax.swing.JComboBox cmbday;
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JComboBox cmbyear;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTable table;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfirst;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tlast;
    private javax.swing.JTextField tmiddle;
    private javax.swing.JTextField tphone;
    private javax.swing.JButton update;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
