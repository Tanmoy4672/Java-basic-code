package mangamentSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mangamentSystem.model.Registration_Model;

public class Registration extends javax.swing.JFrame {

    String student_name;
    String stduent_email;
    String student_pass;
    String student_phone;
    String student_address;
    String parent_number;
    String join_date;
    int student_age;
    String student_id;

    //database connection
//    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    static Connection connect;
    static PreparedStatement pres;

    // for date
    SimpleDateFormat sdf;

    public Registration() {
        super("Add studnet");
        initComponents();

    }

    public void getAllTextRecord() throws SQLException {
        //all text file record that's I input
        sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//        student_name = name.getText();
//        stduent_email = email.getText();
//        student_pass = password.getText();
//        student_phone = phoneNo.getText();
//        student_address = address.getText();
//        parent_number = parentNo.getText();
//        join_date = sdf.format(joinDate.getDate());
//        student_age = Integer.parseInt(age.getText());
//        student_id = studentId.getText();

        Registration_Model model = new Registration_Model(name.getText(), email.getText(),password.getText(),
                phoneNo.getText(), address.getText(), parentNo.getText(), sdf.format(joinDate.getDate()), Integer.parseInt(age.getText()),
                RandomIdGenarate());

        // String std_name = model.getStudent_name();
        connect = databaseConnection.connection();
        String sql = "INSERT INTO student(srlNo, stdName, stdEmail, stdPass, stdPhone, stdAddress, prntNum, Joindate, stdAge, stdId) VALUES (NULL,?,?,?,?,?,?,?,?,?)";
        pres = (PreparedStatement) connect.prepareStatement(sql);

        pres.setString(1, model.getStudent_name());
        pres.setString(2, model.getEmail());
        pres.setString(3, model.getPass());
        pres.setString(4, model.getPhn());
        pres.setString(5, model.getAddress());
        pres.setString(6, model.getParent_number());
        pres.setString(7, model.getJoin_date());
        pres.setInt(8, model.getAge());
        pres.setString(9, model.getId());

        pres.execute();

        pres.close();
        connect.close();

    }
   
    
    public String RandomIdGenarate() throws SQLException{
    
        ArrayList<String> rolls = new ArrayList<>();
        
        connect = databaseConnection.connection();
        stmt = connect.createStatement();
        String sql = "SELECT stdId from student";
        rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
            rolls.add(rs.getString("stdId"));
            } 
        for (String roll : rolls) {
            System.out.println("roll ="+roll);
        }
            
        stmt.close();
        connect.close();
        
        int roll = generate(6000, 6010);
            System.out.println(roll);
            String Finalroll= "201-35-"+roll;
            
            while (true) {
                if (rolls.contains(Finalroll)) {
                    roll = generate(6000, 6010);
                    Finalroll = "201-35-"+roll;
                    System.out.println("new generated pass "+Finalroll);
                }else{
                    rolls.add(Finalroll);
                    break;
                }
                
            }
            
            
            for (String i : rolls) {
                System.out.println("Roll ="+i);
            }       
        return Finalroll;
    } 
    public static int generate(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNo = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        parentNo = new javax.swing.JTextField();
        Registration = new javax.swing.JButton();
        joinDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setForeground(new java.awt.Color(0, 0, 0));

        phoneNo.setBackground(new java.awt.Color(204, 204, 204));
        phoneNo.setForeground(new java.awt.Color(0, 0, 0));

        address.setBackground(new java.awt.Color(204, 204, 204));
        address.setForeground(new java.awt.Color(0, 0, 0));

        parentNo.setBackground(new java.awt.Color(204, 204, 204));
        parentNo.setForeground(new java.awt.Color(0, 0, 0));
        parentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentNoActionPerformed(evt);
            }
        });

        Registration.setBackground(new java.awt.Color(83, 192, 199));
        Registration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registration.setForeground(new java.awt.Color(255, 255, 255));
        Registration.setText("Registration");
        Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationActionPerformed(evt);
            }
        });

        joinDate.setBackground(new java.awt.Color(204, 204, 204));
        joinDate.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mangamentSystem/Upper image kid.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Parent No");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Phone No");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password");

        age.setBackground(new java.awt.Color(204, 204, 204));
        age.setForeground(new java.awt.Color(0, 0, 0));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(parentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(joinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(70, 70, 70)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Registration, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(joinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addComponent(Registration, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 240, 510));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mangamentSystem/exact size phone.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 370, 720));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 960));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentNoActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // trying dragging to admin Portal
        dispose();
        adminPortal object = new adminPortal();
        object.show();
    }//GEN-LAST:event_jPanel2MouseDragged

    private void RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationActionPerformed

        try {
//            if (name.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(rootPane, "Please Enter Name.");
//                name.requestFocus();
//            } else {
//                if (email.getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(rootPane, "Please Give email.");
//                    email.requestFocus();
//                } else {
//                    if (password.getText().isEmpty()) {
//                        JOptionPane.showMessageDialog(rootPane, "Please Give Password.");
//                        password.requestFocus();
//                    } else {
//                        if (phoneNo.getText().isEmpty()) {
//                            JOptionPane.showMessageDialog(rootPane, "Please Give phone Number.");
//                            phoneNo.requestFocus();
//                        } else {
//                            if (address.getText().isEmpty()) {
//                                JOptionPane.showMessageDialog(rootPane, "Please Give address.");
//                                address.requestFocus();
//                            } else {
//                                if (parentNo.getText().isEmpty()) {
//                                    JOptionPane.showMessageDialog(rootPane, "Please Give Parent Number.");
//                                    parentNo.requestFocus();
//                                } else {
//                                    if (sdf.format(joinDate.getDate()).isEmpty()) {
//                                        JOptionPane.showMessageDialog(rootPane, "Please Give Joining Date");
//                                        joinDate.requestFocus();
//                                    } else {
//                                        if (age.getText().isEmpty()) {
//                                            JOptionPane.showMessageDialog(rootPane, "Please Give Student Age.");
//                                            age.requestFocus();
//                                        } else {
//                                            if (studentId.getText().isEmpty()) {
//                                                JOptionPane.showMessageDialog(rootPane, "Please Give Student ID.");
//                                                studentId.requestFocus();
//                                            }
//                                        }
//
//                                    }
//                                }
//
//                            }
//
//                        }
//                    }
//                }
//
//            }
            getAllTextRecord();
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        adminPortal object = new adminPortal();
        object.show();
        dispose();
    }//GEN-LAST:event_RegistrationActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registration;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser joinDate;
    private javax.swing.JTextField name;
    private javax.swing.JTextField parentNo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNo;
    // End of variables declaration//GEN-END:variables
}
