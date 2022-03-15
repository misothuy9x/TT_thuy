import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        //S(n) = x^2 + x^4 + … + x^2n
        int n;
        float x, S = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co so x = ");
        x = sc.nextFloat();
        System.out.println("Nhap luy thua n = ");
        n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            S += (float)Math.pow(x,(2*i));
        }
        System.out.println("Tong day so S(n) = "+S);
        sc.close();
    }
}
