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
class Userfurniture {
     private int room_id,furniture_id ;
    private String  furniture_type;
    
    public Userfurniture( int room_id,int furniture_id,String furniture_type)
    {
        this.room_id=room_id;
       this.furniture_id=furniture_id;
       
       
       
       this.furniture_type=furniture_type;
    
    }
     public int getroom_id(){
        return room_id;
    } 
    public int getfurniture_id(){
        return furniture_id;
    }    
    public String getfurniture_type(){
        return furniture_type;
    }
    
    
    
    
}
