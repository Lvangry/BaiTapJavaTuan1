/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang (1 ≤ n ≤ 20): ");
        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        // Xuất mảng ra màn hình
        System.out.println("Cac phan tu cua mang:");
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Tính trung bình giá trị của mảng
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        double average = sum / n;
        System.out.println("Trung binh gia tri cua mang: " + average);

        // Tìm phần tử có giá trị nhỏ nhất
        double min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);
    }
}

