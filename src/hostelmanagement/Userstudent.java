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
class Userstudent {
     private int student_id,hostel_id ;
    private String  student_name,student_city,institute,student_phone_number,admit_date;
    
    public Userstudent( int student_id,int hostel_id,String student_name,String student_city,String institute,String student_phone_number,String admit_date)
    {
        this.student_id=student_id;
       this.hostel_id=hostel_id;
       this.student_name=student_name;
       this.student_city=student_city;
       this.institute=institute;
       this.student_phone_number=student_phone_number;
       this.admit_date=admit_date;
    
    }
     public int getstudent_id(){
        return student_id;
    } 
    public int gethostel_id(){
        return hostel_id;
    }    
    public String getstudent_name(){
        return student_name;
    }
    public String getstudent_city(){
        return student_city;
    }
    public String getinstitute(){
        return institute;
    }
   
    public String getstudent_phone_number(){
        return student_phone_number;
    }
    public String getadmit_date(){
        return admit_date;
    }
    
    
}
