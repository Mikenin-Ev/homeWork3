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







    }
}