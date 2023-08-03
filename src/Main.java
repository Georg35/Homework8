import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] box = new float[]{1.57f, 7.654f, 9.986f};
        int[] shelf = new int[]{3, 5, 7, 9};
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        float[] box = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        int[] shelf = new int[]{3, 5, 7, 9};
        for (int i = 0; i < shelf.length; i++) {
            if (i == shelf.length - 1) {
                System.out.println(shelf[i]);
                break;
            }
            System.out.print(shelf[i] + ", ");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }

            System.out.print(arr[i] + ", ");
        }
        float[] box = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        int[] shelf = new int[]{3, 5, 7, 9};
        for (int i = 3; i >= 0; i--) {
            if (i == 0) {
                System.out.println(shelf[i]);
                break;
            }
            System.out.print(shelf[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 != 0)
            arr[i]++;}
            {
                System.out.println(Arrays.toString(arr));
            }
        }
    }





