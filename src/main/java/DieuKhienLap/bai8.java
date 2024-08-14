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
public class bai8 {
public static void main(String[] args) {
// TODO code application logic here
int n;
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("=====Tinh tong day so :s=1+2+3+ ...+ n ====");
//b1. Đọc giá trị n từ bàn phím
System.out.print("Cho biet n:");
n= sc.nextInt();
//b2.Duyệt dãy số và cộng dồn vào sum
for (int i = 1; i <= n; i++) {
sum +=i;
}
//b3.Xuất kết quả
System.out.println("Tong day so:" + sum);
}
}
