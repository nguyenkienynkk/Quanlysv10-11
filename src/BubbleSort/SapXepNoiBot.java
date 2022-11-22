package BubbleSort;


import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int n, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= 1; j--) {

                if (array[j] < array[j - 1]) {
                    tempSort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempSort;
                }
            }
        }

        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}