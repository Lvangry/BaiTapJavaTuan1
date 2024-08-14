/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReNhanh;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        float km;
        Scanner scanner = new Scanner(System.in);
        long totalMoney = 0;

        System.out.print("Nhap so km da di: ");
        km = scanner.nextFloat();

        // Kiểm tra số km và tính tiền
        if (km <= 0) {
            System.out.println("So km phai lon hon 0!!! Vui long nhap lai!!!.");
        } else if (km <= 0.8) {
            totalMoney = 15000;
        } else if (km <= 5) {
            totalMoney = (long) (15000 + 13500 * (km - 0.8));
        } else {
            totalMoney = (long) (15000 + 13500 * 4 + 11000 * (km - 5));
        }

        // Giảm giá nếu trên 120 km
        if (km > 120) {
            totalMoney *= 0.9; // Giảm 10%
        }

        System.out.println("Tong tien di " + km + " km = " + totalMoney + " dong.");
    }
}

