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
class Userstudenthostel {
    private String  location,student_name;
    
    public Userstudenthostel( String location,String student_name)
    {
       
        this.location=location;
        this.student_name=student_name;
       
       
    }
    
    
    
    public String getlocation(){
        return location;
    }
    
    public String getstudent_name(){
        return student_name;
    }
    
}
