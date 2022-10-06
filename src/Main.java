import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        /*task1();
        task2();
        task3();
        task4();*/
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    /*
    public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task1() {
            System.out.println("Task 1");
            int[] arr = generateRandomArray();
            int sumPay = 0;
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
            if (!Character.isUpperCase(reverseFullName[0])) {
                for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);
                }

            }
        }
    */
    public static void task5() {
        System.out.println("Task 5");
        int[][] matrix = new int[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (row == column) {
                    matrix[row][column] = 1;
                    matrix[row][(matrix.length - column) - 1] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        System.out.println("Task 6");
        int[] massive = {5, 4, 3, 2, 1};
        int[] arr = new int[massive.length];
        for (int i = 0; i < massive.length; i++) {
            arr[i] = massive[massive.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task7() {
        System.out.println("Task 7");
        int[] massive = {5, 8, 9, 32, 4};
        for (int i = 0; i < massive.length / 2; i++) {
            int a = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(massive));
    }

    public static void task8() {
        System.out.println("Task 8");
        int[] massive = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int a = 0;
        int b = 0;
        for (int i = 0; i < massive.length; i++) {
            for (int j = i; j < massive.length; j++) {
                if (massive[i] + massive[j] == -2) {
                    a = massive[i];
                    b = massive[j];
                    break;
                }
            }
            if (a != 0 || b != 0) break;
        }
        System.out.printf("Числа: %d и %d\n", a, b);
    }

    public static void task9() {
        System.out.println("Task 9");
        int[] massive = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < massive.length; i++) {
            for (int j = i; j < massive.length; j++) {
                if (massive[i] + massive[j] == -2) {
                    System.out.printf("Числа: %d и %d\n", massive[i], massive[j]);
                }
            }

        }
    }
}

