/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Category {
    private int id;
    private String name;
    
    public Category(){
        
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getName(){
        return this.name+"!";
    }
    public void setName(String name){
        this.name=name;
    }
}
