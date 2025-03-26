
package javaapplication2;


public abstract class Fish extends Animal{
   
    public Fish(String name){
             super(name);
       this.name=name;
     
        
    }
    
     
    
    @Override
     public void sleep(){
         System.out.println("Всегда интересно наблюдать как спят рыбы");
     }
     abstract void swim();
        
     
}
