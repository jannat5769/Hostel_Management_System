/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

/**
 *
 * @author lenovo
 */
class Userbill {
    private int student_id,bill_id ,amount;
    private String  payment_method,billing_date,bill_type;
    
    public Userbill( int bill_id,int student_id,int amount,String payment_method,String billing_date,String bill_type)
    {
        this.bill_id=bill_id;
       this.student_id=student_id;
       
       this.amount=amount;
       this.payment_method=payment_method;
       this.billing_date=billing_date;
       this.bill_type=bill_type;
    
    }
     public int getbill_id(){
        return bill_id;
    } 
    public int getstudent_id(){
        return student_id;
    }    
    public int getamount(){
        return amount;
    }
    public String getpayment_method(){
        return payment_method;
    }
    public String getbilling_date(){
        return billing_date;
    }
   
    public String getbill_type(){
        return bill_type;
    }
    
    
    
    
}
