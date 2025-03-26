
import java.util.Scanner;

public class Отводы90 { 

    public static void main(String[] args) {
    char o = 9733;
    char c = 10034;  
    double r = 0;
    double correction = 0;
    double fastdrawing = 0;
    double x = 0;
    double y = 0;
    double z = 0;
    String ga = " отводов ";
    String qa = " отводов ";
    String ha = " цилиндров ";
    int diameter=0;
    int s = 0;
    int g = 0;
    int q = 0;
    int fr = 0;
    int quan = 0;
    int quat =0;   
    String goForth = null;
    System.out.println("Введите диаметр стальной трубы:");
    Scanner d = new Scanner (System.in);
    if (d.hasNextInt())
    diameter = d.nextInt();
    else
    d.next();    
     if (diameter<=0){
            System.out.println("Введите корректное значение:");
            if (d.hasNextInt())
              diameter = d.nextInt();
             else
             d.next();    
        }
    if (diameter == 21) {
         r = 28;        
        }else if (diameter == 27){
          r = 29;       
        }else if (diameter == 32){
          r = 38;      
        }else if (diameter == 38){
          r = 48;        
        }else if (diameter == 42){
          r = 48;   
        }else if (diameter == 45){
          r = 60;      
        }else if (diameter == 48){
          r = 57;           
        }else if (diameter == 57){
          r = 75;
        }else if (diameter == 60){
          r = 76;    
        }else if (diameter == 76){
          r = 100;  
        }else if (diameter == 89){
          r = 120;
        }else if (diameter == 102){
          r = 150;       
        }else if (diameter == 108){
          r = 150;       
        }else if (diameter == 114){
          r = 150;      
        }else if (diameter == 133){
          r = 190;      
        }else if (diameter == 159){
          r = 225;
        }else if (diameter == 169){
          r = 225; 
        }else if (diameter == 219){
          r = 300;        
        }else if (diameter == 273){
          r = 375;         
        }else if (diameter == 325){
          r = 450;        
        }else if (diameter == 375){
          r = 525;        
        }else if (diameter == 426){
          r = 600;       
        }else if (diameter == 530){
          r = 750;        
        }else if (diameter == 630){
          r = 900;        
        }else if (diameter == 720){
          r = 1000;        
        }else if (diameter == 820){
          r = 1200;
        }else{  
        r=diameter*1.39;
     System.out.println("Не стандартный диаметр трубы !!!");
    }
    double sheika = r-diameter/2.0;
    double zatilok = r+diameter/2.0;
    if (r>0) {   
      System.out.println("Радиус шейки отвода равен "+ sheika + " мм");
    System.out.println("Радиус затылка отвода равен "+ zatilok + " мм");
    }   
        System.out.println();
        System.out.println("Введите толщину стенки цилиндра:");
        if (d.hasNextInt())
             s = d.nextInt();
             else
             d.next();    
        if (s<=0){
            System.out.println("Введите корректное значение:");
            if (d.hasNextInt())
            s = d.nextInt();
            else
            d.next();  
        }
        if (sheika>s&&diameter>=273){
            correction = (sheika-s)/6.313750;
            x = Math.round(100*((sheika-s)/3.156875));
            fastdrawing = x/100.0;
        }else if (sheika>s){
            correction = (sheika-s)/3.732;
            x = Math.round(100*((sheika-s)/1.8660284));
            fastdrawing = x/100.0;
        }else{
            correction = sheika-s;
            y = Math.round(100*(s-sheika));
            fastdrawing = y/100.0;
        }
        if (diameter<273)
        z = 1.6077*(r + diameter/2 + s);
        else
        z = 1.5838*(r + diameter/2 + s);
        double l = 0;
        double sh = 0;
    if (z<150&&diameter>0&&s>0) {
        l=1000/3;
        fr=3;
        sh=(l - z)/2+correction;
        if (sh>=63){
        System.out.println("3 отвода в одном цилиндре "+o+o+o);
        }else{
            l=500;
            fr=2;
            sh=(l - z)/2+correction;
            System.out.println("2 отвода в одном цилиндре "+o+o);
        }
    }else if (z<=410&&diameter>0&&s>0) {
        l=500;
        fr=2;
        sh=(l - z)/2+correction;
        if (sh>50){
        System.out.println("2 отвода в одном цилиндре "+o+o);
        }else{
            l=1000;
            fr=1;
            sh=(l - z)/2+correction;
            if (sh>0)
            System.out.println("1 отвод в одном цилиндре "+o);
        }
    }else if (z<=1000&&diameter>0&&s>0) {
        l=1000;
        fr=1;
        sh=(l - z)/2+correction;
        if (sh>0){
        System.out.println("1 отвод в одном цилиндре "+o);
        }else{
            System.out.println("Меньше 1 отвода в одном цилиндре ");
        }
    }else if (z>1000&&diameter>0&&s>0) {
        l=1000;
        System.out.println("Меньше 1 отвода в одном цилиндре ");
    }
    if (diameter>0&&s>0){
    System.out.println("Длина затылка минераловатного отвода = " + Math.round(z) + " мм");
    }else{
    System.out.println("Введены некорректные значения !!!");    
    }
    if (z<l&&diameter>0&&s>0) {
        if (sheika>s&&sh>0){
     System.out.println("Длина штанины = " + Math.floor((l - z)/2) + " мм, либо " + Math.round(sh) + " мм от стыковой линии ");      
        }else if (sh>0){
     System.out.println("Длина штанины = " + Math.floor(sh) + " мм"); 
        }   
    }else{
    if ((l-z/2)>0)  
    sh = Math.floor((l-z/2));   
      if (sh>0)
    System.out.println("Длина штанины = " + sh + " мм ");    
    }
    System.out.println();
    if (diameter>0&&s>0&&sh>0&&fr>0) {
    System.out.println("Изменить ? Введите нужное количество отводов в цилиндре:");
    if (d.hasNextInt())
    g = d.nextInt();
    else
    d.next();
    if (g==11||g==12||g==13||g==14||g%10==0||g%10>=5||g%100==11||g%100==12||g%100==13||g%100==14){
            ga = " отводов ";
        }else if (g%10==1){
            ga = " отвод ";
        }else if (g%10<5) {
            ga = " отвода ";           
        }
    if (g>0){
        l=1000/g;
        }else{
        g=fr;
        if (g==11||g==12||g==13||g==14||g%10==0||g%10>=5||g%100==11||g%100==12||g%100==13||g%100==14){
            ga = " отводов ";
        }else if (g%10==1){
            ga = " отвод ";
        }else if (g%10<5) {
            ga = " отвода ";           
        }
          System.out.println("Введены некорректные значения !!!"); 
        }    
    sh = (l - z)/2+correction;
    if (z*g<1000&&g>0&&sh>0){
      System.out.print(g + ga + "в одном цилиндре ");
      for (int i=1;i<=g;i++){
       System.out.print(o);   
      }
       System.out.println();
    }
        if (diameter>0&&s>0&&g>0&&z*g<1000&&sh>0&&fr!=g){
    System.out.println("Длина затылка минераловатного отвода = " + Math.round(z) + " мм");
        }
    if (sh>0&&z<l&&diameter>0&&g>0&&s>0&&fr!=g) {
        if (sheika>s&&sh>0){
     System.out.println("Длина штанины = " + Math.floor((l - z)/2) + " мм, либо " + Math.floor(sh) + " мм от стыковой линии ");
    }else if (sh>0){
     System.out.println("Длина штанины = " + Math.floor(sh) + " мм "); 
        }  
    }else if (sh<0&&s>0&&fr!=g) {
    System.out.println("Столько не влезет :)"); 
    g=fr;
    l=1000/fr;
    if (g==1)
      ga=" отвод ";
    else
      ga=" отвода ";
    sh = (l - z)/2+correction;
    System.out.print(g + ga + "в одном цилиндре ");
    for (int i=1;i<=g;i++){
       System.out.print(o);   
      }
    }else if (diameter>0&&g>0&&s>0&&fr!=g) {
    System.out.println("Столько не влезет :)"); 
    g=fr;
    l=1000/fr;
    if (g==1)
      ga=" отвод ";
    else
      ga=" отвода ";
    sh = (l - z)/2+correction;
    System.out.print(g + ga + "в одном цилиндре ");
    for (int i=1;i<=g;i++){
       System.out.print(o);   
      }
    }  
    if (z*g<1000&&sh>0){
      System.out.println();  
      System.out.println("Сколько отводов нужно всего ? ");
    }
      if (d.hasNextInt())
      q = d.nextInt();
       else
       d.next();
      if (q==11||q==-11||q==12||q==-12||q==13||q==-13||q==14||q==-14||q%10==0||q%10>=5||q%10<=-5||q%100==11||q%100==-11||q%100==12||q%100==-12||q%100==13||q%100==-13||q%100==14||q%100==-14){
            qa = " отводов ";
        }else if (q%10==1||q%10==-1){
            qa = " отвод ";
        }else if (q%10<5||q%10>-5) {
            qa = " отвода ";
        }
       quan = q/g;
       quat = q/fr;
    if (q%fr!=0)
       quat+=1;
    if (quan==11||quan==12||quan==13||quan==14||quan%10==0||quan%10>=5||quan%100==11||quan%100==12||quan%100==13||quan%100==14){
            ha = " цилиндров ";
        }else if (quan%10==1){
            ha = " цилиндр ";   
        }else if (quan%10<5) {
            ha = " цилиндра ";
        }   
    if (q%g==0) {
       if (q<=0){
         quan=0;
         quat=0;
         ha = " цилиндров ";
       }
       System.out.println("На " + q + qa + " уйдёт " + quan + ha); 
    }else{
        quan+=1;
        if (q<=0){
          quan=0;
          quat=0;
          ha = " цилиндров ";
        }
         if (quan==11||quan==12||quan==13||quan==14||quan%10==0||quan%10>=5||quan%100==11||quan%100==12||quan%100==13||quan%100==14){
            ha = " цилиндров ";
        }else if (quan%10==1){
            ha = " цилиндр ";   
        }else if (quan%10<5) {
            ha = " цилиндра ";
        }
        System.out.println("На " + q + qa + " уйдёт " + quan + ha); 
    }
    if (quat==11||quat==12||quat==13||quat==14||quat%10==0||quat%10>=5||quat%100==11||quat%100==12||quat%100==13||quat%100==14){
            ha = " цилиндров";
        }else if (quat%10==1){
            ha = " цилиндр";   
        }else if (quat%10<5) {
            ha = " цилиндра";
        }
     if (g!=fr&&q>0)
        System.out.println("( либо " + quat + ha + ", если по " + fr +" )"); 
        }
else if (z<2020&&sh>-5) {
          System.out.println("Сколько отводов нужно всего ? ");
      if (d.hasNextInt())
      q = d.nextInt();
       else
       d.next();
      if (q==11||q==-11||q==12||q==-12||q==13||q==-13||q==14||q==-14||q%10==0||q%10>=5||q%10<=-5||q%100==11||q%100==-11||q%100==12||q%100==-12||q%100==13||q%100==-13||q%100==14||q%100==-14){
            qa = " отводов ";
        }else if (q%10==1||q%10==-1){
            qa = " отвод ";
        }else if (q%10<5||q%10>-5) {
            qa = " отвода ";
        }
    quan = q*2;
    if (quan==11||quan==12||quan==13||quan==14||quan%10==0||quan%10>=5||quan%100==11||quan%100==12||quan%100==13||quan%100==14){
            ha = " цилиндров ";
        }else if (quan%10==1){
            ha = " цилиндр ";   
        }else if (quan%10<5) {
            ha = " цилиндра ";
        }
       if (q<=0){
         quan=0;
         ha = " цилиндров ";
       }
          if (sh>-5)
       System.out.println("На " + q + qa + " уйдёт " + quan + ha);
           if (d.hasNextLine()) {
          goForth = d.nextLine();
          } else {
                    d.next();
                }
    }
    if (diameter>=273){
       if (d.hasNextLine()) {
          goForth = d.nextLine();
          } else {
                    d.next();
                }
         if  (goForth == "z") {
    if (fastdrawing>0&&s<=sheika&&z<2020)
{
      System.out.println("    " + c + " заготовка " + (int)l + " х " + (2*s+diameter) + " мм " + c);
        System.out.println("  ( x = "+ fastdrawing + " ) ( 5 резов по 18° )");
    }else if (fastdrawing>0&&z<2020){
      System.out.println("    " + c + " заготовка " + (int)l + " х " + (2*s+diameter) + " мм " + c);
        System.out.println("  ( y = "+ fastdrawing + " ) ( 5 резов по 18° )");
    }
         }
    }else if (diameter>0&&s>0){
    if (d.hasNextLine()) {
       goForth = d.nextLine();
       } else {
                    d.next();
                }
       if  (goForth == "z") {     
     if (sheika>s&&sh>0) {
       System.out.println("      заготовка " + (int)l + " х " + (2*s+diameter) + " мм");
      System.out.println("          " + c + " ( x = " + fastdrawing + " ) " + c);
    }else if (sh>0){
       System.out.println("       заготовка " + (int)l + " х " + (2*s+diameter) + " мм");
      System.out.println("          " + c + " ( y = " + fastdrawing + " ) " + c);
    }
       }
}
}
}


        
