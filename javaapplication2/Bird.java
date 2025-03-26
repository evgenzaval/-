
package javaapplication2;

public abstract class Bird extends Animal implements Speakable{
  public  Bird(String name){
      super(name);
        this.name=name;
        
    }
    
  @Override
    public void speak(){
        System.out.println(name + " sings");
    }
       
     
  abstract void fly();
        
    
}
