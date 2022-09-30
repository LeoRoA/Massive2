public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        int sumPay = sum;
        for (int i = 0; i < arr.length; i++) {
            sumPay = sumPay + arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sumPay);
    }

    public static void task2() {
        System.out.println("Task 2");
        int minPay = 200_000;
        int maxPay = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPay) {
                maxPay = arr[i];
            }
            if (arr[i] < minPay) {
                minPay = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minPay, maxPay);
    }

    public static void task3() {
        System.out.println("Task 3");
        int sum = 0;
        int[] arr = generateRandomArray();
        float averagePay = 0;
        int sumPay = sum;
        for (int i = 0; i < arr.length; i++) {
            sumPay = sumPay + arr[i];
        }
        averagePay = (float) sumPay / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averagePay);
    }

    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        if (!Character.isUpperCase(reverseFullName[0])){
            for (int i = reverseFullName.length-1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }

        }

    }
    }