
public class Mail {
    static void email(String mail){
        int b =0;
        int d = 0;
        String provider = null;
        char c = ' ';
        for(int i =0; i<mail.length();i++){
             c = mail.charAt(i);
                     
            if (c=='@')
             d = (mail.indexOf(c,b))+1;
            
            if (c=='.')
                b = mail.indexOf(c,d);
        
            if(c==';'){
            provider = mail.substring(d,b);
            System.out.println(provider);
            continue;
            }
    }
             
    }
    
    public static void main(String[] args){
        email("evgen-zaval@yandex.ru;evgenzaval@gmail.com;evgenzaval@mail.ru;guliver1986@rambler.ru;");
        
    }
}
