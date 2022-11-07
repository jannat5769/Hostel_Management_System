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
public class showstaff extends javax.swing.JFrame {

    /**
     * Creates new form showstaff
     */
    public showstaff() {
        initComponents();
        show_user();
    }
    public ArrayList<Userstaff> userList(){
        ArrayList<Userstaff> userList =new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HOSTELMANAGEMENTSYSTEM;selectMethod=cursor", "sa", "123456");
            String query1="Select * FROM staff0";
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(query1);
            Userstaff user;
            while(rs.next()){
                user=new Userstaff(rs.getInt("staff_id"),rs.getInt("hostel_id"),rs.getString("staff_name"),rs.getString("staff_phone_number"),rs.getString("staff_city"),rs.getString("staff_nid"),rs.getString("staff_role"));
                userList.add(user);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
    public void show_user(){
        ArrayList<Userstaff> list =userList();
        DefaultTableModel model= (DefaultTableModel)jTable_staff_User.getModel();
        Object[] row =new Object [7];
        for(int i=0;i<list.size();i++){
             row[0]=list.get(i).getstaff_id();
            row[1]=list.get(i).gethostel_id();
            row[2]=list.get(i).getstaff_name();
            
            
            row[3]=list.get(i).getstaff_phone_number();
            row[4]=list.get(i).getstaff_city();
           row[5]=list.get(i).getstaff_nid();
           row[6]=list.get(i).getstaff_role();
            
            model.addRow(row);
            
           }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_staff_User = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("STAFF INFORMATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(434, 25, 269, 24);

        jTable_staff_User.setBackground(new java.awt.Color(153, 153, 255));
        jTable_staff_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_staff_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "staff_id", "hostel_id", "staff_name", "staff_phone_number", "staff_city", "staff_nid", "staff_role"
            }
        ));
        jScrollPane1.setViewportView(jTable_staff_User);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 74, 1200, 626);

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\Books and note 3.1\\Project\\back_1.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 50, 50);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 10, 33, 50);

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
            java.util.logging.Logger.getLogger(showstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showstaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_staff_User;
    // End of variables declaration//GEN-END:variables
}
