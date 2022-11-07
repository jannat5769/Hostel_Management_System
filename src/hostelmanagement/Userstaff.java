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
class Userstaff {
    private int staff_id,hostel_id ;
    private String  staff_name,staff_phone_number,staff_city,staff_nid,staff_role;
    
    public Userstaff( int staff_id,int hostel_id,String staff_name,String staff_phone_number,String staff_city,String staff_nid,String staff_role)
    {
        this.staff_id=staff_id;
       this.hostel_id=hostel_id;
       this.staff_name=staff_name;
       
       
       this.staff_phone_number=staff_phone_number;
       this.staff_city=staff_city;
       this.staff_nid=staff_nid;
       this.staff_role=staff_role;
    
    }
     public int getstaff_id(){
        return staff_id;
    } 
    public int gethostel_id(){
        return hostel_id;
    }    
    public String getstaff_name(){
        return staff_name;
    }
    
    public String getstaff_phone_number(){
        return staff_phone_number;
    }
    public String getstaff_city(){
        return staff_city;
    }
    
    public String getstaff_nid(){
        return staff_nid;
    }
   
    public String getstaff_role(){
        return staff_role;
    }
    
    
    
}
