import java.security.acl.Owner;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap luy thua b: ");
        b = sc.nextDouble();
        //Tinh T= a^b
        System.out.println("Gia tri la: "+Math.pow(a, b));
    }
}
