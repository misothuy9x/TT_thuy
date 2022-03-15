import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        //S(n) = x + x^3 + x^5 + … + x^2n + 1
        int n;
        float x, S = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co so x = ");
        x = sc.nextFloat();
        System.out.println("Nhap luy thua n = ");
        n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            S += (float)Math.pow(x,(2*i+1));
        }
        System.out.println("Tong day so S(n) = "+S);
        sc.close();
    }
}
