/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author lenovo
 */
public class billinfo extends javax.swing.JFrame {

     Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public billinfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        billnumber = new javax.swing.JTextField();
        studentnumber = new javax.swing.JTextField();
        billmethod = new javax.swing.JTextField();
        billamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        billtype = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        jLabel1.setText("Bill number");

        jLabel2.setText("Student NUMBER");

        jLabel3.setText("Amount");

        jLabel4.setText("Method");

        jLabel5.setText("Date");

        billamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billamountActionPerformed(evt);
            }
        });

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Bill Type");

        billtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(date_chooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(billnumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentnumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(billamount, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(billmethod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(billtype, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(billnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(billamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(billmethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(billtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billamountActionPerformed

    private void billtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billtypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bill_id=billnumber.getText();
        String student_id=studentnumber.getText();
        
        String amount=billamount.getText();
        String method=billmethod.getText();
        String type=billtype.getText();
        
        
        
        
        int billid=Integer.parseInt(bill_id);
        int studentid=Integer.parseInt(student_id);
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
        String date=sdf.format(date_chooser.getDate());
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HOSTELMANAGEMENTSYSTEM;selectMethod=cursor", "sa", "123456");
            
            Statement stm=con.createStatement();
            
            String sql=" INSERT INTO bill0 VALUES("+billid+","+studentid+",'"+amount+"','"+method+"','"+date+"','"+type+"')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"inserted");
            con.close();
             showstudent s=new showstudent();
        s.setVisible(true);
        setVisible(false);
            
            
        
        
        }catch(Exception e){
            
        }
                                            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String bill_id=billnumber.getText();
        String student_id=studentnumber.getText();
        
        String amount=billamount.getText();
        String method=billmethod.getText();
        String type=billtype.getText();
        
        
        
        
        int billid=Integer.parseInt(bill_id);
        int studentid=Integer.parseInt(student_id);
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
        String date=sdf.format(date_chooser.getDate());
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HOSTELMANAGEMENTSYSTEM;selectMethod=cursor", "sa", "123456");
            
            Statement stm=con.createStatement();
            
            String sql=" UPDATE  bill0 SET student_id="+studentid+",amount='"+amount+"',payment_method='"+method+"',billing_date='"+date+"',bill_type='"+type+"' where bill_id="+billid+" " ;
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"updated");
            con.close();
             showstudent s=new showstudent();
        s.setVisible(true);
        setVisible(false);
            
            
        
        
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String bill_id=billnumber.getText();
        String student_id=studentnumber.getText();
        
        String amount=billamount.getText();
        String method=billmethod.getText();
        String type=billtype.getText();
        
        
        
        
        int billid=Integer.parseInt(bill_id);
        int studentid=Integer.parseInt(student_id);
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
        String date=sdf.format(date_chooser.getDate());
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HOSTELMANAGEMENTSYSTEM;selectMethod=cursor", "sa", "123456");
            String sql=" DELETE FROM bill0 where bill_id=? " ;
            pst=con.prepareStatement(sql);
            
            pst.setString(1, studentnumber.getText());
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "deleted");
            showstudent s=new showstudent();
            s.setVisible(true);
            setVisible(false);
                
            
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
                
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   
        
    

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
            java.util.logging.Logger.getLogger(hostelinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hostelinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hostelinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hostelinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hostelinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    
    // End of variables declaration                   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billamount;
    private javax.swing.JTextField billmethod;
    private javax.swing.JTextField billnumber;
    private javax.swing.JTextField billtype;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField studentnumber;
    // End of variables declaration//GEN-END:variables
}
