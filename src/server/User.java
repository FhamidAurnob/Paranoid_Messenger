/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * 
 */
public class User {
    //String Name;
    String name;
    String pass;
   // String pass2;
   // String email;
   // String dob;
    
    private String room;

    public User(String name, String pass) {
        //this.Name = Name;
        this.name = name;
        this.pass = pass;
        //this.pass2 = pass2;
        //this.email = email;
        //this.dob = dob;
    }

    public User(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    
    public void setRoom(String room) {
        this.room = room;
    }
    
    
}
