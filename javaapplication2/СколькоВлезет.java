
import java.util.Scanner;

public class СколькоВлезет {
    static String razmer;
    static String tol;
    static String shir;
    public static void main(String[] args)throws InterruptedException{
        double a = 0;
        double b = 0;
        double diameter = 0;
        int s = 0;
        int plita = 0;
        int tolshina = 0;
        int shirina = 0;
        double sq = 0;
        double chasti =0;
        int divider = 0;
        int sk = 0;
        Scanner d = new Scanner(System.in);
        
         System.out.println("Введите размер плиты ШиринаТолщина");
     
          razmer = d.nextLine();
               
        shir = razmer.substring(0,3);
        tol = razmer.substring(3);
        shirina = Integer.valueOf(shir);
        tolshina = Integer.valueOf(tol);
        
         for (int i = 1; i<30; i++){
             if (i>=10)
                 System.out.println(" ----------------(" + i + ")--------------- ");
             else
            System.out.println(" ----------------(" + i + ")---------------- ");
         System.out.println("Введите диаметр стальной трубы");
        if (d.hasNextInt()) {
               diameter = d.nextInt();
            } else {
                d.next();
            }     
         plita = shirina*tolshina;    
        System.out.println("Введите толщину скорлупы с кратностью");
        if (d.hasNextInt()) {
                sk = d.nextInt();
            } else {
                d.next();
            }
         
         divider = sk % 10;

        s = (sk - divider)/10;
       
        if (divider == 2){
       
         if (s==20){
        a = diameter+2*s+2.5;
        b = diameter/2 + s + 6; 
        if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!"); 
        }else{
        sq = a * b;
        chasti = (int)(100*plita/sq)/100.0;
        System.out.println(chasti-1 + " частей");
        System.out.println(Math.round(100*chasti/2)/100.0-0.5 + " цилиндров");
        }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
        
        }else{
        a = diameter+2*s+3;
        b = diameter/2 + s + 4; 
         if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!"); 
        }else{
         sq = a * b + (s/1.58)*(s/2.83); 
         chasti = (int)(100*plita/sq)/100.0;
        System.out.println(chasti + " частей");
        System.out.println(Math.round(100*chasti/2)/100.0 + " цилиндров");
         }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
        
        }
         }else if (divider ==3){
             a = (diameter + 2*s)/1.1547 + 3;
            b = diameter/4 + s + 4;
             if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!");
             }else{
            sq = a * b + (s/2)*(s/3);
            chasti = (int)(100*plita/sq)/100.0;
            System.out.println(chasti + " частей");
        System.out.println(Math.round(100*chasti/3)/100.0 + " цилиндров");
             }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
              
        
        }else if (divider ==4){
             a = (diameter + 2*s)/1.415 + 3;
            b = diameter/2 + s - (diameter/2)/1.415 + 4;
             if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!");
             }else{
            sq = a * b + (s/2)*(s/3);
            chasti = (int)(100*plita/sq)/100.0;
            System.out.println(chasti + " частей");
        System.out.println(Math.round(100*chasti/4)/100.0 + " цилиндров");
             }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
             
        }else if (divider ==6){
             a = diameter/2 + s + 3;
            b = diameter/2 + s - Math.sqrt((diameter/2)*(diameter/2)-(diameter/4)*(diameter/4)) + 4;
              if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!");
             }else{
            sq = a * b;
            chasti = (int)(100*plita/sq)/100.0;
            System.out.println(chasti + " частей");
        System.out.println(Math.round(100*chasti/6)/100.0 + " цилиндров");
              }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
        
              
     }else if (divider == 8){
         a = (diameter + 2*s)/(2.61)+ s/5+2;
            b = s+diameter/26.274+2;
              if (b>=tolshina-4){
        System.out.println("Ничего не влезет !!!");
             }else{
            sq = a * b;
            chasti = (int)(100*plita/sq)/100.0;
            System.out.println(chasti + " частей");
        System.out.println(Math.round(100*chasti/8)/100.0 + " цилиндров");
              }
        System.out.println(" а габарит " + (int)a + "        б габарит " + (int)b);
        
     }
        Thread.sleep(1600);
    }
}
}