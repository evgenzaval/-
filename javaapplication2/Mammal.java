
package javaapplication2;

public abstract class Mammal extends Animal implements Speakable{
   
 public   Mammal(String name){
     super(name);
        this.name=name;
      
        
    }
   
   
      
    
   abstract void run();
      
    
    
}
