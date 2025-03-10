/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbtestgui.*;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class RegistrationAD extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public RegistrationAD() {
        initComponents();
        
    }
        public static String em, uname;
    
        public boolean dupeCheck(){
            dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username1.getText()+ "' OR u_email = '" + email1.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){               
                em = resultSet.getString("u_email");
                if(em.equals(email1.getText())){
                    JOptionPane.showMessageDialog(null, "Email already USED!");
                    email1.setText("");
                }
                uname = resultSet.getString("u_username");
                if(uname.equals(username1.getText())){
                    JOptionPane.showMessageDialog(null, "Username already USED!");
                    username1.setText("");
                }
                return true;
            }else{
                return false;
            }
            }catch(SQLException ex){
                System.out.println(""+ex);
                return false;
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

        Main = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ln1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        as1 = new javax.swing.JComboBox<>();
        ut1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(135, 91, 91));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name:");
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        fname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        Main.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 210, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name:");
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        ln1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ln1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln1ActionPerformed(evt);
            }
        });
        Main.add(ln1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 210, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Username: ");
        Main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        username1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        username1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        Main.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 210, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password: ");
        Main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        pass1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        Main.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 210, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Account status:");
        Main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email:");
        Main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        email1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        email1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        Main.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 210, 30));

        cancel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        Main.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 90, 20));

        addButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });
        Main.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 90, 20));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Register your account");
        jLabel1.setToolTipText("");
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 250, 50));

        as1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Active", " " }));
        as1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                as1ActionPerformed(evt);
            }
        });
        Main.add(as1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 210, 30));

        ut1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Administrator" }));
        ut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ut1ActionPerformed(evt);
            }
        });
        Main.add(ut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 210, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Account type:");
        Main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void ln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln1ActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
if (fname.getText().isEmpty() || 
        ln1.getText().isEmpty() ||
        username1.getText().isEmpty() ||
        pass1.getText().isEmpty() || 
        email1.getText().isEmpty()) {
  
        JOptionPane.showMessageDialog(null, "Error! Complete the Information!"); 
        return;         
    } else if (pass1.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password should contain at least 8 characters");
        pass1.setText("");
        return; // Add return to stop further processing
    } else if (dupeCheck()) {
        System.out.println("ERROR, Duplicate must not exist");
        return; // Stop further execution if there is a duplicate
    } else {
        String emailText = email1.getText();
        // Email validation using regex
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        if (!emailText.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid email format!");
            return;
        }

        dbConnector dbc = new dbConnector();
        try{
    String ps = passwordHasher.hashPassword(pass1.getText());
    
    if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) "
                       + "VALUES ('" + fname.getText() + "', '" + ln1.getText() + "', '" + emailText + "', '" + 
                       username1.getText() + "', '" + ps+ "', '" + ut1.getSelectedItem() + "', '"+as1.getSelectedItem()+"')")) {          
        JOptionPane.showMessageDialog(null, "Registration Successful!");

        usersForm uf = new usersForm(); 
        uf.setVisible(true);  
        this.dispose(); 
    } else {
        JOptionPane.showMessageDialog(null, "Nuh Uh");
    }
    }catch(NoSuchAlgorithmException ex){
        System.out.println(""+ex);
    }
    }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void as1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_as1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_as1ActionPerformed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonKeyPressed

    private void ut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ut1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ut1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JButton addButton;
    public javax.swing.JComboBox<String> as1;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField email1;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField ln1;
    public javax.swing.JPasswordField pass1;
    public javax.swing.JTextField username1;
    public javax.swing.JComboBox<String> ut1;
    // End of variables declaration//GEN-END:variables
}
