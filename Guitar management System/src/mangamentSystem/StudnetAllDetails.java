package mangamentSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class StudnetAllDetails extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public StudnetAllDetails() {
        super("Student");
        initComponents();
        conn = databaseConnection.connection();
        this.setLocationRelativeTo(null);
        showinfo();
    }

    public void showinfo() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet res = stmt.executeQuery(sql);
            valuetable.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valuetable = new javax.swing.JTable();
        search_txt = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        parent_phone = new javax.swing.JTextField();
        student_pass = new javax.swing.JTextField();
        chng_email = new javax.swing.JTextField();
        student_phone = new javax.swing.JTextField();
        update_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        student_name = new javax.swing.JTextField();
        student_email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valuetable.setBackground(new java.awt.Color(204, 204, 255));
        valuetable.setForeground(new java.awt.Color(51, 51, 51));
        valuetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial No", "Name", "Email", "Password", "Phone", "Address", "Parent Phone", "Joining Date", "Age", "Id"
            }
        ));
        valuetable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                valuetableMouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(valuetable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 410));

        search_txt.setText("Search By id");
        search_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_txtFocusGained(evt);
            }
        });
        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        jPanel1.add(search_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 200, 30));

        btn_search.setBackground(new java.awt.Color(83, 192, 199));
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 130, 30));

        parent_phone.setText("Parent Phone");
        parent_phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                parent_phoneFocusGained(evt);
            }
        });
        parent_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parent_phoneActionPerformed(evt);
            }
        });
        jPanel1.add(parent_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 500, 150, 30));

        student_pass.setText("Student Password");
        student_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                student_passFocusGained(evt);
            }
        });
        student_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_passActionPerformed(evt);
            }
        });
        jPanel1.add(student_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 130, 30));

        chng_email.setText("Studnent Address");
        chng_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chng_emailFocusGained(evt);
            }
        });
        chng_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chng_emailActionPerformed(evt);
            }
        });
        jPanel1.add(chng_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 160, 30));

        student_phone.setText("Student Phone");
        student_phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                student_phoneFocusGained(evt);
            }
        });
        student_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_phoneActionPerformed(evt);
            }
        });
        jPanel1.add(student_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 150, 30));

        update_btn.setBackground(new java.awt.Color(83, 192, 199));
        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 120, 30));

        remove_btn.setBackground(new java.awt.Color(83, 192, 199));
        remove_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("Remove");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        jPanel1.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 120, 30));

        student_name.setText("Student Name");
        student_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                student_nameFocusGained(evt);
            }
        });
        student_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_nameActionPerformed(evt);
            }
        });
        jPanel1.add(student_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 150, 30));

        student_email.setText("Student Email");
        student_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                student_emailFocusGained(evt);
            }
        });
        student_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_emailActionPerformed(evt);
            }
        });
        jPanel1.add(student_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txtActionPerformed

    private void search_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_txtFocusGained
        // TODO add your handling code here:
        search_txt.setText("");
    }//GEN-LAST:event_search_txtFocusGained

    private void parent_phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_parent_phoneFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_parent_phoneFocusGained

    private void parent_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parent_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parent_phoneActionPerformed

    private void student_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_student_passFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_student_passFocusGained

    private void student_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_passActionPerformed

    private void chng_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chng_emailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_chng_emailFocusGained

    private void chng_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chng_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chng_emailActionPerformed

    private void student_phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_student_phoneFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_student_phoneFocusGained

    private void student_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_phoneActionPerformed

    private void student_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_student_nameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_student_nameFocusGained

    private void student_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_nameActionPerformed

    private void student_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_student_emailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_student_emailFocusGained

    private void student_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_emailActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // search
        try {

            conn = databaseConnection.connection();
            stmt = conn.createStatement();
            String userID = search_txt.getText();

            String sql = "SELECT * FROM student WHERE stdId = '" + userID + "'";

            rs = stmt.executeQuery(sql);

            if (rs.next()) {

                String name = rs.getString("stdName");
                student_name.setText(name);

                String email = rs.getString("stdEmail");
                student_email.setText(email);

                String pass = rs.getString("stdPass");
                student_pass.setText(pass);

                String adress = rs.getString("stdAddress");
                chng_email.setText(adress);

                String phone = rs.getString("stdPhone");
                student_phone.setText(phone);

                String prtPhone = rs.getString("prntNum");
                parent_phone.setText(prtPhone);

            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is invailed");
            }
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_btn_searchActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // Remove
        try {

            conn =databaseConnection.connection();
            stmt = conn.createStatement();
            String userID = search_txt.getText();

            String sql = "DELETE * FROM student WHERE stdId = " + userID +"\"";
            stmt.executeQuery(sql);
            if (rs.next()) {

                dispose();
                StudnetAllDetails object = new StudnetAllDetails();
                object.show();

            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is invailed");
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_remove_btnActionPerformed

    private void valuetableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valuetableMouseDragged
        // TODO add your handling code here:
        dispose();
                adminPortal object = new adminPortal();
                object.show();
    }//GEN-LAST:event_valuetableMouseDragged

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
            java.util.logging.Logger.getLogger(StudnetAllDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudnetAllDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudnetAllDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudnetAllDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudnetAllDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JTextField chng_email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField parent_phone;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTextField student_email;
    private javax.swing.JTextField student_name;
    private javax.swing.JTextField student_pass;
    private javax.swing.JTextField student_phone;
    private javax.swing.JButton update_btn;
    private javax.swing.JTable valuetable;
    // End of variables declaration//GEN-END:variables
}
