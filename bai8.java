import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        //S(n) = ½ + ¾ + 5/6 + … + 2n + 1/ 2n + 2
        float sum =0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            
        } while (n <1);
        for(int i=0; i<=n;i++){
            sum += (float)(2*i+1)/(2*i+2);
        }
        System.out.println("Tong la: "+sum);
    }
}
