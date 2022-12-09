public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int money = 15000;
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
        int addPeople = 0;
        for (int year = 1; year <= 10; year++) {
            Y = Y + totalInYear + addPeople;

            System.out.println("Год " + year + " численность населения составляет " + Y);
        }


    }

    public static void task4() {
        System.out.println("Задание 4");

        int deposit = 15_000;
        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit = deposit / 100 * 7 + (deposit);
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int deposit = 15_000;
        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit = deposit / 100 * 7 + (deposit);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println(deposit);
    }

    public static void task6() {
        System.out.println("Задание 6");
        int deposit = 15_000;
        int month = 12;
        int year = 9;
        int allMonth = year * month;
        for (int i = 1; i <= allMonth; i++) {
            deposit = deposit / 100 * 7 + (deposit);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task7() {
        System.out.println("Задание 7");

        int firstFriday =3;
        for (int allFrides = firstFriday; allFrides <= 31; allFrides = allFrides +7) {
            System.out.println("Сегодня пятница, " + allFrides + "-е число. Необходимо подготовить отчет");
        }
    }
}


