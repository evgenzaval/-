import java.util.Scanner;

public class ВесЦилиндров {

    static int vPlite;
    static int divider;
    static int razmer;
    static double kolvo;
    static double p;
    static String cyl;
    public static void main(String[] args) {
         int skolko = 0;
        int plotnost = 0;
        System.out.println("Введите размер цилиндров");
        Scanner d = new Scanner(System.in);
        if (d.hasNextInt()) {
            razmer = d.nextInt();
        } else {
            d.next();
        }
        getquantity(razmer);
        double k = (p * kolvo) / (600 * 150.0);
        double ves = p * 0.0001;
        System.out.println("Площадь скорлупы цилиндра = " + (int) p + " мм²");
        System.out.println("Площадь цилиндров в плите = " + (int) (p * kolvo) + " мм²");
        String result = String.format("%.4f", ves);
        String result2 = String.format("%.4f", ves * 0.8);
        String result6 = String.format("%.4f", k);
        System.out.println("Коэффициент площади = " + result6);
        System.out.println("Вес одного цилиндра(100) = " + result + " кг");
        System.out.println("Вес одного цилиндра(80) = " + result2 + " кг");
        System.out.println("Введите количество цилиндров");
        if (d.hasNextInt()) {
            skolko = d.nextInt();
        } else {
            d.next();
        }
        if (skolko>=0) {
            if (skolko!=11&&skolko%10==1&&skolko%100!=11)
                cyl = " цилиндра";
            else
                cyl = " цилиндров";
            String result3 = String.format("%.3f", skolko * ves * 0.8);
            String result4 = String.format("%.3f", skolko * ves);
            System.out.println("Вес " + skolko + cyl + "(100) = " + result4 + " кг");
            System.out.println("Вес " + skolko + cyl + "(80) = " + result3 + " кг");
        } else {
            System.out.println("Введены некорректные значения ");
        }
    }

    static void getquantity(int razmer) {
        int chrazmer = 0;
        int diameter = 0;
        int s = 0;

        int divider = 0;

        divider = razmer % 10;

        chrazmer = razmer - divider;

        if (chrazmer % 1000 == 0) {

            s = 100;

            diameter = chrazmer / 10000;

        } else {

            s = (chrazmer % 1000) / 10;

            diameter = chrazmer / 1000;

        }
        if (razmer == 18202) {
            vPlite = 40;
        } else if (razmer == 21202 || razmer == 25202) {
            vPlite = 32;
        } else if (razmer == 76204) {
            vPlite = 30;
        } else if (razmer == 28202 || razmer == 32202 || razmer == 89204) {
            vPlite = 28;
        } else if (razmer == 35202) {
            vPlite = 25;
        } else if (razmer == 38202 || razmer == 42202 || razmer == 108204) {
            vPlite = 24;
        } else if (razmer == 114204) {
            vPlite = 23;
        } else if (razmer == 45202 || razmer == 76304) {
            vPlite = 22;
        } else if (razmer == 48202 || razmer == 21302 || razmer == 25302) {
            vPlite = 21;
        } else if (razmer == 89304) {
            vPlite = 20;
        } else if (razmer == 133204) {
            vPlite = 19;
        } else if (razmer == 54202 || razmer == 57202 || razmer == 60202 || razmer == 159204 || razmer == 165204 || razmer == 28302 || razmer == 32302 || razmer == 35302) {
            vPlite = 18;
        } else if (razmer == 64202) {
            vPlite = 17;
        } else if (razmer == 169204 || razmer == 38302 || razmer == 108304 || razmer == 18402 || razmer == 21402) {
            vPlite = 16;
        } else if (razmer == 70202 || razmer == 114304 || razmer == 219306 || razmer == 25402) {
            vPlite = 15;
        } else if (razmer == 76202 || razmer == 42302 || razmer == 45302 || razmer == 48302 || razmer == 54302 || razmer == 57302) {
            vPlite = 14;
        } else if (razmer == 133304 || razmer == 89404 || razmer == 54504) {
            vPlite = 13;
        } else if (razmer == 89202 || razmer == 219204 || razmer == 60302 || razmer == 64302 || razmer == 70302 || razmer == 159304 || razmer == 108404 || razmer == 32402 || razmer == 35402 || razmer == 64504) {
            vPlite = 12;
        } else if (razmer == 114404 || razmer == 38402 || razmer == 76504 || razmer == 10502 || razmer == 18704) {
            vPlite = 11;
        } else if (razmer == 165304 || razmer == 273306 || razmer == 219406 || razmer == 40402 || razmer == 42402 || razmer == 45402 || razmer == 18502 || razmer == 21502 || razmer == 159506 || razmer == 169506 || razmer == 219508 || razmer == 89504 || razmer == 21704 || razmer == 25704 || razmer == 28704 || razmer == 32704) {
            vPlite = 10;
        } else if (razmer == 76302 || razmer == 133303 || razmer == 325306 || razmer == 133404 || razmer == 48402 || razmer == 25502 || razmer == 273508 || razmer == 108504 || razmer == 60604 || razmer == 219608 || razmer == 35704 || razmer == 38704 || razmer == 18804) {
            vPlite = 9;
        } else if (razmer == 159404 || razmer == 165404 || razmer == 273406 || razmer == 54402 || razmer == 57402 || razmer == 60402 || razmer == 64402 || razmer == 28502 || razmer == 32502 || razmer == 35502 || razmer == 219506 || razmer == 114504 || razmer == 64604 || razmer == 70604 || razmer == 76604 || razmer == 169606 || razmer == 273608 || razmer == 89604 || razmer == 21804 || razmer == 25804 || razmer == 28804) {
            vPlite = 8;
        } else if (razmer == 114202 || razmer == 89302 || razmer == 70402 || razmer == 325508 || razmer == 38502 || razmer == 42502 || razmer == 45502 || razmer == 48502 || razmer == 133504 || razmer == 60603 || razmer == 18602 || razmer == 21602 || razmer == 25602 || razmer == 28602 || razmer == 108604 || razmer == 219708 || razmer == 42704 || razmer == 45704 || razmer == 48704 || razmer == 54704 || razmer == 57704 || razmer == 60704 || razmer == 64704) {
            vPlite = 7;
        } else if (razmer == 133202 || razmer == 108302 || razmer == 325406 || razmer == 76402 || razmer == 89402 || razmer == 54502 || razmer == 57502 || razmer == 60502 || razmer == 273506 || razmer == 375508 || razmer == 426508 || razmer == 108503 || razmer == 114503 || razmer == 159504 || razmer == 165504 || razmer == 169504 || razmer == 32602 || razmer == 35602 || razmer == 38602 || razmer == 325608 || razmer == 375608 || razmer == 114604 || razmer == 133604 || razmer == 219808 || razmer == 18702 || razmer == 54703 || razmer == 70704 || razmer == 76704 || razmer == 89704 || razmer == 64703) {
            vPlite = 6;
        } else if (razmer == 32804 || razmer == 35804 || razmer == 38804 || razmer == 42804 || razmer == 45804 || razmer == 48804 || razmer == 54804 || razmer == 57804 || razmer == 60804 || razmer == 64804 || razmer == 18803 || razmer == 21803 || razmer == 25803 || razmer == 28803 || razmer == 32803 || razmer == 211004 || razmer == 251004) {
            vPlite = 6;
        } else if (razmer == 64502 || razmer == 70502 || razmer == 76502 || razmer == 325506 || razmer == 133503 || razmer == 42602 || razmer == 45602 || razmer == 48602 || razmer == 54602 || razmer == 57602 || razmer == 426608 || razmer == 108603 || razmer == 114603 || razmer == 159604 || razmer == 165604 || razmer == 169604 || razmer == 273708 || razmer == 219908 || razmer == 21702 || razmer == 25702 || razmer == 28702 || razmer == 32702 || razmer == 108704 || razmer == 114704 || razmer == 76703 || razmer == 89703 || razmer == 70804 || razmer == 76804 || razmer == 80804 || razmer == 89804) {
            vPlite = 5;
        } else if (razmer == 35803 || razmer == 38803 || razmer == 42803 || razmer == 45803 || razmer == 48803 || razmer == 54803 || razmer == 18903 || razmer == 21903 || razmer == 25903 || razmer == 28903 || razmer == 32903 || razmer == 281004 || razmer == 321004 || razmer == 351004 || razmer == 381004 || razmer == 421004) {
            vPlite = 5;
        } else if (razmer == 159202 || razmer == 165302 || razmer == 325304 || razmer == 219303 || razmer == 89502 || razmer == 108502 || razmer == 159503 || razmer == 219504 || razmer == 169503 || razmer == 165503 || razmer == 273504 || razmer == 64602 || razmer == 70602 || razmer == 76602 || razmer == 133603 || razmer == 159603 || razmer == 165603 || razmer == 169603 || razmer == 219604 || razmer == 325708 || razmer == 273908 || razmer == 2191008 || razmer == 35702 || razmer == 38702 || razmer == 42702 || razmer == 45702 || razmer == 48702 || razmer == 57702 || razmer == 133704 || razmer == 159704 || razmer == 165704 || razmer == 169704 || razmer == 108703 || razmer == 60602) {
            vPlite = 4;
        } else if (razmer == 108804 || razmer == 114804 || razmer == 133804 || razmer == 57803 || razmer == 60803 || razmer == 64803 || razmer == 70803 || razmer == 76803 || razmer == 80803 || razmer == 35903 || razmer == 38903 || razmer == 42903 || razmer == 45903 || razmer == 48903 || razmer == 54903 || razmer == 57903 || razmer == 60903 || razmer == 64903 || razmer == 70903 || razmer == 76904 || razmer == 89904 || razmer == 108904 || razmer == 108905 || razmer == 114905 || razmer == 133905 || razmer == 451004 || razmer == 481004 || razmer == 541004 || razmer == 571004 || razmer == 601004 || razmer == 641004 || razmer == 701004 || razmer == 761004 || razmer == 891004 || razmer == 181003 || razmer == 211003 || razmer == 251003 || razmer == 281003 || razmer == 321003 || razmer == 351003 || razmer == 381003 || razmer == 421003) {
            vPlite = 4;
        } else if (razmer == 219503 || razmer == 89602 || razmer == 273604 || razmer == 375708 || razmer == 426708 || razmer == 325808 || razmer == 375808 || razmer == 426808 || razmer == 325908 || razmer == 375908 || razmer == 2731008 || razmer == 3251008 || razmer == 3751008 || razmer == 219704 || razmer == 133703 || razmer == 60702 || razmer == 64702 || razmer == 70702 || razmer == 159804 || razmer == 165804 || razmer == 169804 || razmer == 89803 || razmer == 108803 || razmer == 114803 || razmer == 133803 || razmer == 76903 || razmer == 89903) {
            vPlite = 3;
        } else if (razmer == 114904 || razmer == 133904 || razmer == 159904 || razmer == 159905 || razmer == 165904 || razmer == 165905 || razmer == 169904 || razmer == 169905 || razmer == 219905 || razmer == 451003 || razmer == 481003 || razmer == 541003 || razmer == 571003 || razmer == 601003 || razmer == 641003 || razmer == 701003 || razmer == 761003) {
            vPlite = 3;
        } else if (razmer == 325303 || razmer == 325403 || razmer == 159402 || razmer == 325504 || razmer == 273503 || razmer == 219603 || razmer == 325604 || razmer == 426908 || razmer == 4261008 || razmer == 273704 || razmer == 89702 || razmer == 114702 || razmer == 159703 || razmer == 165703 || razmer == 169703 || razmer == 219703 || razmer == 219804 || razmer == 273804 || razmer == 159803 || razmer == 165803 || razmer == 169803 || razmer == 108903 || razmer == 114903 || razmer == 133903 || razmer == 165903 || razmer == 169903 || razmer == 219904 || razmer == 273904 || razmer == 273905 || razmer == 325905 || razmer == 891003 || razmer == 1081003 || razmer == 1141003 || razmer == 1331003 || razmer == 1591003 || razmer == 1651001 || razmer == 1691003 || razmer == 2191004 || razmer == 2731005 || razmer == 3251005) {
            vPlite = 2;
        } else if (razmer == 325503 || razmer == 273603 || razmer == 325603 || razmer == 325704 || razmer == 273703 || razmer == 325804 || razmer == 219803 || razmer == 219903 || razmer == 325904) {
            vPlite = 1;
        } else if (vPlite == 0) {
            razmer = 0;
            System.out.println("Данного размера нет в базе, ");
        System.out.println("рассчитать коэффициент не получится");
        }
        kolvo = 1.0 * vPlite / divider;
        ploshad(diameter, s);

    }
    static void ploshad(int truba, int stenka) {
        double bpl = (stenka + truba / 2) * (stenka + truba / 2) * 3.14;
        double mpl = (truba / 2) * (truba / 2) * 3.14;
        p = bpl - mpl;
        
    }

}
