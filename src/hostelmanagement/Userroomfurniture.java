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
class Userroomfurniture {
    private String  room_name,furniture_type;
    
    public Userroomfurniture( String room_name,String furniture_type)
    {
       
        this.room_name=room_name;
        this.furniture_type=furniture_type;
       
       
    }
    
    
    
    public String getroom_name(){
        return room_name;
    }
    
    public String getfurniture_type(){
        return furniture_type;
    }

    
}
