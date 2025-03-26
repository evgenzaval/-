import java.util.Scanner;
public class Тройники {
public static void main(String[] args) {   
int diameter = 0;
int s = 0;
int cyl = 0;
int od = 0;
double lengthShip = 0.0;
double lengthPaz = 0.0;
double k = 0;
double tr = 0;
String ha = " ";
 System.out.println("Введите диаметр стальной трубы");
    Scanner d = new Scanner (System.in);
    if (d.hasNextInt())
    diameter = d.nextInt();
    else
      d.next();
     System.out.println("Введите толщину стенки цилиндра");
    if (d.hasNextInt())
    s = d.nextInt();
    else
      d.next();
    
    od = 2*s+diameter;
    lengthShip=101+s+0.5*diameter;
    lengthPaz=202+od;
  if ((lengthShip+lengthPaz)<500){

System.out.println("2 тройника в цилиндре");

k=2;

}else if ((lengthShip+lengthPaz)<750){

System.out.println("1.33 тройника в цилиндре");

k=1.33;

}else if ((lengthShip+lengthPaz)<1000){

System.out.println("1 тройник в цилиндре");

k=1;

}else if ((lengthShip+lengthPaz)<1500){

System.out.println("0,67 тройника в цилиндре");

k=0.67;

}

System.out.println("Сколько тройников нужно всего ?");

if (d.hasNextInt())

tr = d.nextInt();

else

d.next();

cyl = (int)Math.ceil(tr/k);
if (cyl==11||cyl==12||cyl==13||cyl==14||cyl%10==0||cyl%10>=5||cyl%100==11||cyl%100==12||cyl%100==13||cyl%100==14){
            ha = " цилиндров ";
        }else if (cyl%10==1){
            ha = " цилиндр ";   
        }else if (cyl%10<5) {
            ha = " цилиндра ";
        }   

System.out.println("Уйдёт " + cyl + ha);
System.out.println();
    
System.out.println("Заготовка шип: " + od + " х " + (int)lengthShip + " мм");
System.out.println("Заготовка паз: " + (int)lengthPaz + " х " + od + " мм");
    
    
    
    
    
    
    
    
    
    
}
}
