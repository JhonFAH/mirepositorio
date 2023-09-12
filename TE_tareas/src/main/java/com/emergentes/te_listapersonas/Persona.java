
package com.emergentes.te_listapersonas;

    
public class Persona {
    private int id;
    private String tarea;
    
    
    public Persona(){
        this.id=0;
        this.tarea="";
       
    
    }
     public int getId(){
         return id;
     
     }     
     public void setId(int id){
         this.id=id;
     
     }
     public String getTarea(){
         return tarea;
     }
     public void setTarea(String tarea){
         this.tarea=tarea;
     }
    
            
            
            
}
