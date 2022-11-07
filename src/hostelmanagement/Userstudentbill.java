/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

/**
 *
 * @author USER
 */
class Userstudentbill {
     private int amount ;
    private String  student_name;
    
    public Userstudentbill( String student_name,int amount)
    {
        this.student_name=student_name;
       this.amount=amount;
       
    }
    
    public String getstudent_name(){
        return student_name;
    }
    public int getamount(){
        return amount;
    } 
    
}
