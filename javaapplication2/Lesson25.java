package javaapplication2;
import javaapplication2.Mechenosec;
import javaapplication2.Pingvin;
interface Speakable{
    default void speak(){
    System.out.println("Somebody speaks");      
    
    }
}
public class Lesson25{
    public static void main (String[] args){
        Mechenosec m = new Mechenosec("Миша");
     //   System.out.println(m.name);
     //   m.swim();
     //   m.eat();
      //  m.sleep();
    
    Animal l = new Lev("Lion");
 //   System.out.println(l.name);
 //   l.eat();
 //   l.sleep();
 Speakable sp = new Pingvin("Pi");
//  sp.speak();
 Mammal l2 = new Lev("Lion2");
  //  System.out.println(l2.name);
  //  l2.eat();
  //  l2.sleep();
  //  l2.run();
   Pingvin s = new Pingvin("Pin");
  //  System.out.println(s.name);
//  s.speak();
//   s.fly();
 //   s.sleep();
  //   s.eat();
  Vorobey v = new Vorobey("Vasia");
     Speakable[] speak = new Speakable[]{s,sp,l2,v};
     Animal[] anim = {m,l,l2,s,v};
     for (Speakable a:speak){
         if(a instanceof Bird){
             ((Bird)a).speak();
             ((Bird)a).eat();
            ((Bird)a).sleep();
            ((Bird)a).fly();
         }
     }
}
   
}



