
package javaapplication2;


public class Lev extends Mammal{
    public Lev(String name){
        super(name);
        this.name=name;
        
    }
    @Override
   public void eat(){
        System.out.println("Лев, как любой хищник, любит мясо");
    }
    @Override
   public void sleep(){
          System.out.println("Большую часть дня лев спит");
     }
    public void run(){
          System.out.println("Лев - это не самая быстрая кошка");
     }
}
