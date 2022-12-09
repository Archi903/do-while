public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int money = 29000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + money;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int j = 10; j > 0; j--) {
            System.out.print(j + (" "));
        }
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задание 3");

        int Y = 12_000_000;
        int human = 1000;
        int oneHuman = Y / human;
        int birth = oneHuman * 18;
        int death = oneHuman * 8;
        int totalInYear = birth - death;
        int addPeople =0;
        for(int year = 1; year <= 10; year ++) {
            Y = Y + totalInYear + addPeople;

            System.out.println("Год " + year + " численность населения составляет " + Y);
        }


    }
}
