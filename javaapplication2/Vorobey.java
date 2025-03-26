
package javaapplication2;

public class Vorobey extends Bird{
   
  public Vorobey(String name){
      super(name);
      this.name=name;
   
  }  
  @Override
    void eat(){
        System.out.println("Воробей любит есть зерно");
    }
  @Override
    public void sleep(){
          System.out.println("Воробьи спят в гнезде");
     }
  @Override
     public void fly(){
        System.out.println("Воробьи летают очень хорошо");  
     }
  @Override
      public void speak(){
        System.out.println("Воробьи  умеют чирикать");
    }
     
}

