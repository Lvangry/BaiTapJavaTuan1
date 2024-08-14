/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DieuKhienLap;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguỷn duong N: ");
        int N = scanner.nextInt();

        int count = countDivisors(N);
        System.out.println("So uoc cua " + N + " là: " + count);
    }

    // Hàm đếm số ước số của một số nguyên dương
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}

