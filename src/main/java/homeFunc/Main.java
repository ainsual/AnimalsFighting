package homeFunc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] listInt = {5, 4, 4, 2, 3, 1};
        float[] listFloat = {
                0.1f,
                7.0f,
                8.1f,
                1.1f
        };
        double[] listDouble = {
                10.6,
                1.1,
                2.5,
                2.2,
                10.9
        };

        char[] listChar = {
                'b',
                'a',
                'p',
                'u'
        };
        // list int
        System.out.println("int: ");
        print(listInt);
        sort(listInt);
        print(listInt);

        // list float
        System.out.println("float: ");
        print(listFloat);
        sort(listFloat);
        print(listFloat);

        //list double
        System.out.println("double: ");
        print(listDouble);
        sort(listDouble);
        print(listDouble);

        // list char
        System.out.println("char: ");
        print(listChar);
        sort(listChar);
        print(listChar);
    }
    // bauble sort
    public static void sort(int[] list) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < list.length - 1; ++i) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    swap = true;
                }
            }
        } while (swap);

    }

    public static void sort(float[] list) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < list.length - 1; ++i) {
                if (list[i] > list[i+1]) {
                    float temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void sort(double[] list) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < list.length - 1; ++i) {
                if (list[i] > list[i+1]) {
                    double temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void sort(char[] list) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < list.length - 1; ++i) {
                if (list[i] > list[i+1]) {
                    char temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }
    // вывод списков
    public static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static void print(float[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static void print(char[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static void print(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
