//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte byteVar = 127;
        System.out.println("Задача № 1 ");
        System.out.println(" ");
        System.out.println("Значение переменной byteVar c типом byte равно " + byteVar);
        short shortVar = 30000;
        System.out.println("Значение переменной shortVar c типом byte равно " + shortVar);
        int intVar = 200000;
        System.out.println("Значение переменной intVar c типом int равно " + intVar);
        long longVar = 3000000L;
        System.out.println("Значение переменной longVar c типом long равно " + longVar);
        float floatVar = 35.2356f;
        System.out.println("Значение переменной floatVar c типом float равно " + floatVar);
        double doubleVar = 35.235678967;
        System.out.println("Значение переменной doubleVar c типом double равно " + doubleVar);
        System.out.println(" ");

        System.out.println("Задача № 2 ");
        float floatType = 27.12f;
        long longType = 987678965549L;
        double doubleType = 2.786;
        short shortType1 = 569;
        short shortType2 = -159;
        int intType = 27897;
        byte byteType = 67;
        System.out.println("float: " + floatType);
        System.out.println("long: " + longType);
        System.out.println("double: " + doubleType);
        System.out.println("short: " + shortType1 + " и " + shortType2);
        System.out.println("int: " + intType);
        System.out.println("byte: " + byteType);
        System.out.println(" ");

        System.out.println("Задача № 3 ");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int totalList = 480;
        int oneStudentGet = totalList / (class1 + class2 + class3);
        System.out.println("На каждого ученика расчитано " + oneStudentGet + " листов бумаги.");
        System.out.println(" ");

        System.out.println("Задача № 4 ");
        int bottlesFor2Minutes = 16;
        int bottlesFor1Minutes = bottlesFor2Minutes / 2;
        int bottlesFor20Minutes = bottlesFor1Minutes * 20;
        System.out.println("Эа 20 минут машина произвела " + bottlesFor20Minutes + " бутылок");
        int bottlesFor1Day = bottlesFor1Minutes * 60 * 24;
        System.out.println("За сутки машина произвела " + bottlesFor1Day + " бутылок");
        int bottlesFor3Day = bottlesFor1Day * 3;
        System.out.println("Эа три дня машина произвела " + bottlesFor3Day + " бутылок");
        int bottlesFor1Month = bottlesFor1Day * 30;
        System.out.println("За один месяц машина произвела " + bottlesFor1Month + " бутылок");
        System.out.println(" ");

        System.out.println("Задача № 5 ");
        int allPaint = 120;
        int oneClassPaint = 2 + 4;
        int allClassPaint = allPaint / oneClassPaint;
        int whitePaint = allClassPaint * 2;
        int brownPaint = allClassPaint * 4;
        System.out.println("В школе, в которой " + allClassPaint + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println(" ");

        System.out.println("Задача № 6 ");
        int bananas = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int totalWeightGr = bananas + milk + iceCream + eggs;
        float totalWeightKg = totalWeightGr / (float) 1000;
        System.out.println("Общий вес завтрака составляет " + totalWeightGr + " граммов или " +
                totalWeightKg + " килограммов");
        System.out.println(" ");

        System.out.println("Задача № 7 ");
        int endResult = 7 * 1000;
        int minPerDay = 250;
        int maxPerDay = 500;
        int minResult = endResult / minPerDay;
        int maxResult = endResult / maxPerDay;
        int averageResult = endResult / ((minPerDay + maxPerDay) / 2);
        System.out.println(" Для снижения веса на 7 килограмм спортсмену понадобится: минимум " + maxResult +
                " максимум " + minResult + " дней, но в среднем - это составит " + averageResult + " дней");
        System.out.println(" ");

        System.out.println("Задача № 8");
        int mashaSalary = 67760;
        int dinisSalary = 83690;
        int christinaSalary =  76230;
        int mashaBonus = mashaSalary / 10;
        int dinisBonus = dinisSalary / 10;
        int christinaBonus = christinaSalary / 10;
        int newMashaSalary = mashaSalary + mashaBonus;
        int newDinisSalary = dinisSalary + dinisBonus;
        int newChristinaSalary = christinaSalary + christinaBonus;
        int mashaSalaryDifferenceYr = (newMashaSalary - mashaSalary) * 12;
        int dinisSalaryDifferenceYr = (newDinisSalary - dinisSalary) * 12;
        int christinaSalaryDifferenceYr = (newChristinaSalary - christinaSalary) * 12;
        System.out.println("Маша теперь получает " + newMashaSalary + "рублей. Годовой доход вырос на " +
                mashaSalaryDifferenceYr + " рублей в год");
        System.out.println("Динис теперь получает " + newDinisSalary + " рублей. Годовой доход вырос на " +
                dinisSalaryDifferenceYr + " рублей в год");
        System.out.println("Динис теперь получает " + newChristinaSalary + " рублей. Годовой доход вырос на " +
                christinaSalaryDifferenceYr + " рублей в год");
    }
}