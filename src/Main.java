public class Main {
    public static void main(String[] args) {
        task1();
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
}