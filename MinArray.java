
import java.util.Arrays;
import java.util.Scanner;


public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Nhap do dai mang :");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Do dai khong duoc vuot qua 10");
            }
        } while (size > 10);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu vi tri " + i + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang : " + Arrays.toString(array));

        int min = array[0];
        for (int j = 0; j < size; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Gia tri nho nhat cua mang la : " + min);
    }
}
