import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        //S(n)=x + x^2 + x^3 + … + x^n
        int n;
        float x, S = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co so x = ");
        x = sc.nextFloat();
        System.out.println("Nhap luy thua n = ");
        n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            S += (float)Math.pow(x, i);
        }
        System.out.println("Tong day so S(n) = "+S);
        sc.close();

    }
}
