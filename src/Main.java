public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        int[] expenses = new int[5];
        expenses[0] = 6027;
        expenses[1] = 3000;
        expenses[2] = 10000;
        expenses[3] = 20000;
        expenses[4] = 27000;
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        System.out.println("Задача 2");
        int maxExpenses = expenses[0];
        int minExpenses = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
        System.out.println("Задача 3");
        double average = (double) sum / 5;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
        System.out.println(".");
    }
}