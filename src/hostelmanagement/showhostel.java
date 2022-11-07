/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class showhostel extends javax.swing.JFrame {

    /**
     * Creates new form showhostel
     */
    public showhostel() {
        initComponents();
         show_user();
        
    }
    public ArrayList<User> userList(){
        ArrayList<User> userList =new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HOSTELMANAGEMENTSYSTEM;selectMethod=cursor", "sa", "123456");
            String query1="Select * FROM hostel0";
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(query1);
            User user;
            while(rs.next()){
                user=new User(rs.getInt("hostel_id"),rs.getInt("number_of_students"),rs.getString("hostel_phone_number"),rs.getString("location"));
                userList.add(user);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
    public void show_user(){
        ArrayList<User> list =userList();
        DefaultTableModel model= (DefaultTableModel)jTable_hostel_User.getModel();
        Object[] row =new Object [6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).gethostel_id();
            row[1]=list.get(i).getnumber_of_students();
            row[2]=list.get(i).gethostel_phone_number();
            row[3]=list.get(i).getlocation();
            model.addRow(row);
            
            }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_hostel_User = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jTable_hostel_User.setBackground(new java.awt.Color(204, 204, 255));
        jTable_hostel_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_hostel_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "hostel number", "total student", "phone number", "location"
            }
        ));
        jTable_hostel_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_hostel_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_hostel_User);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 79, 1200, 621);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("HOSTEL INFORMATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 24, 322, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\Books and note 3.1\\Project\\back_1.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 10, 60, 60);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 15, 33, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_hostel_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_hostel_UserMouseClicked
       
    }//GEN-LAST:event_jTable_hostel_UserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        home s=new home();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(showhostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showhostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showhostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showhostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showhostel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_hostel_User;
    // End of variables declaration//GEN-END:variables
}
