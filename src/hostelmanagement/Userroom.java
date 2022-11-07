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
class Userroom {
     private int hostel_id ,room_id,student_id;
    private String room_capacity,room_name;
    
    public Userroom( int room_id,int hostel_id,int student_id,String room_capacity,String room_name)
    {
       this.room_id=hostel_id;
       this.hostel_id=hostel_id;
       this.student_id=student_id;
       this.room_capacity=room_capacity;
       this.room_name=room_name;
    
    }
    public int getroom_id(){
        return room_id;
    }  
    public int gethostel_id(){
        return hostel_id;
    }   
    public int getstudent_id(){
        return student_id;
    }  
    
   
    public String getroom_capacity(){
        return room_capacity;
    }
    public String getroom_name(){
        return room_name;
    }
    
    
}
