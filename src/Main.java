//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int a = 100000;
        byte b = 66;
        short c = 32000;
        long d = 5600L;
        float e = 35.68f;
        double f = 52.31;
        System.out.println("Задача 1");
        //System.out.printf("Значение переменной a с типом int равно "+a+"\n");
        String nameA = "a";
        String typeA = "int";
        String nameB = "b";
        String typeB = "byte";
        String nameC = "c";
        String typeC = "short";
        String nameD = "d";
        String typeD = "long";
        String nameE = "e";
        String typeE = "float";
        String nameF = "f";
        String typeF = "double";
        System.out.println(String.format("Значение переменной %s с типом %s равно %d", nameA, typeA, a));
        System.out.println(String.format("Значение переменной %s с типом %s равно %d", nameB, typeB, b));
        System.out.println(String.format("Значение переменной %s с типом %s равно %d", nameC, typeC, c));
        System.out.println(String.format("Значение переменной %s с типом %s равно %d", nameD, typeD, d));
        System.out.println(String.format("Значение переменной %s с типом %s равно %f", nameE, typeE, e));
        System.out.println(String.format("Значение переменной %s с типом %s равно %f", nameF, typeF, f));

        //Задание 2
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        //Задание 3
        byte studLP = 23;
        byte studAS = 27;
        byte studEA = 30;
        short paperTotal = 480;
        int paperToStud = paperTotal / (studLP + studEA + studAS);
        System.out.println("Задача 3");
        System.out.println(String.format("На каждого ученика рассчитано %d листов бумаги", paperToStud));

        //Задание 4
        byte bottleProdCap = 16;
        byte time1 = 2;
        int bottleProdCap1 = bottleProdCap * time1;
        String time1N = "2 минуты";
        byte time2 = 20;
        int bottleProdCap2 = bottleProdCap * time2;
        String time2N = "20 минут";
        short time3 = 60*24;
        int bottleProdCap3 = bottleProdCap * time3;
        String time3N = "сутки";
        short time4 = 3*60*24;
        int bottleProdCap4 = bottleProdCap * time4;
        String time4N = "3 дня";
        int time5 = 30*60*24;
        int bottleProdCap5 = bottleProdCap * time5;
        String time5N = "месяц";
        System.out.println("Задача 4");
        System.out.println(String.format("За %s машина произвела %d штук бутылок", time1N, bottleProdCap1));
        System.out.println(String.format("За %s машина произвела %d штук бутылок", time2N, bottleProdCap2));
        System.out.println(String.format("За %s машина произвела %d штук бутылок", time3N, bottleProdCap3));
        System.out.println(String.format("За %s машина произвела %d штук бутылок", time4N, bottleProdCap4));
        System.out.println(String.format("За %s машина произвела %d штук бутылок", time5N, bottleProdCap5));

        //Задание 5
        byte totalPaintCans = 120;
        byte oneClassPaintCansWhite = 2;
        byte oneClassPaintCansBrown = 4;
        int totalClassAmount = totalPaintCans / (oneClassPaintCansWhite + oneClassPaintCansBrown);
        int totalPaintCansWhite = totalClassAmount * oneClassPaintCansWhite;
        int totalPaintCansBrown = totalClassAmount * oneClassPaintCansBrown;
        System.out.println("Задача 5");
        System.out.println(String.format("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски", totalClassAmount, totalPaintCansWhite, totalPaintCansBrown));

        //Задание 6
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeignt = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        float breakfastWeightG = bananas * bananaWeight + (milk / 100) * milkWeight + iceCream * iceCreamWeignt + eggs * eggWeight;
        float breakfastWeightKG = breakfastWeightG / 1000;
        System.out.println("Задача 6");
        System.out.println(String.format("Вес завтрака в граммах - %f", breakfastWeightG));
        System.out.println(String.format("Вес завтрака в килограммах - %f", breakfastWeightKG));
        //System.out.println("Вес завтрака в килограммах - " + breakfastWeightKG);

        //Задание 7
        byte totalWeightToLoseKG = 7;
        short dietDayOutput1 = 250;
        short dietDayOutput2 = 500;
        String dietDays1 = "250 грамм в день";
        String dietDays2 = "500 грамм в день";
        String dietDays3 = "cреднем весе в день";
        int daysToLoseWeight1 = (totalWeightToLoseKG * 1000) / dietDayOutput1;
        int daysToLoseWeight2 = (totalWeightToLoseKG * 1000) / dietDayOutput2;
        int daysToLoseWeight3 = (totalWeightToLoseKG * 1000) / ((dietDayOutput1 + dietDayOutput2) / 2);
        System.out.println("Задача 7");
        System.out.println(String.format("Срок похудения при диете на %s - %d", dietDays1, daysToLoseWeight1));
        System.out.println(String.format("Срок похудения при диете на %s - %d", dietDays2, daysToLoseWeight2));
        System.out.println(String.format("Срок похудения при диете на %s - %d", dietDays3, daysToLoseWeight3));

        //Задание 8
        int monthWageMasha = 67760;
        int monthWageDenis = 83690;
        int monthWageKristine = 76230;
        double newMonthWageMasha = monthWageMasha * 1.1;
        double newMonthWageDenis = monthWageDenis * 1.1;
        double newMonthWageKristine = monthWageKristine * 1.1;
        int yearWageMasha = monthWageMasha * 12;
        int yearWageDenis = monthWageDenis * 12;
        int yearWageKristine = monthWageKristine * 12;
        double newYearWageMasha = newMonthWageMasha * 12;
        double newYearWageDenis = newMonthWageDenis * 12;
        double newYearWageKristine = newMonthWageKristine * 12;
        double diffYearWageMasha = newYearWageMasha - yearWageMasha;
        double diffYearWageDenis = newYearWageDenis - yearWageDenis;
        double diffYearWageKristine = newYearWageKristine - yearWageKristine;
        String M = "Маша";
        String D = "Денис";
        String K = "Кристина";
        System.out.println("Задача 8");
        System.out.println(String.format("%s теперь получает %f рублей. Годовой доход вырос на %f рублей", M, newMonthWageMasha, diffYearWageMasha));
        System.out.println(String.format("%s теперь получает %f рублей. Годовой доход вырос на %f рублей", D, newMonthWageDenis, diffYearWageDenis));
        System.out.println(String.format("%s теперь получает %f рублей. Годовой доход вырос на %f рублей", K, newMonthWageKristine, diffYearWageKristine));
    }
}