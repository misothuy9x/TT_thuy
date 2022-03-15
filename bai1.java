import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
       // Tính S(n) = 1 + 2 + 3 + … + n
        long sum = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la:" );
        n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println("Tong day so tu 1 den " +n+" la: "+sum);


    }
}
