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
class User {
    private int hostel_id ,number_of_students;
    private String hostel_phone_number,location;
    
    public User( int hostel_id,int number_of_students,String hostel_phone_number,String location)
    {
       this.hostel_id=hostel_id;
       this.number_of_students=number_of_students;
       this.hostel_phone_number=hostel_phone_number;
       this.location=location;
    
    }
    public int gethostel_id(){
        return hostel_id;
    }    
    
    public int getnumber_of_students(){
        return number_of_students;
    }
    public String gethostel_phone_number(){
        return hostel_phone_number;
    }
    public String getlocation(){
        return location;
    }
    
}
