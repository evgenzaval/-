
package javaapplication2;

public class Mechenosec extends Fish{
    public Mechenosec(String name){
        super(name);
       this.name=name;
    
    }
    @Override
     public void swim(){
         System.out.println("Меченосец красивая рыба, которая быстро плавает");
     }
    @Override
     public void eat(){
       System.out.println("Меченосец не хищная рыба и она ест обычный рыбий корм");   
      }
}
