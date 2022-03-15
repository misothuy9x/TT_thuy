import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        //S(n) = ½ + 2/3 + ¾ + …. + n / n + 1
        float sum =0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            if(n <1){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <1);
        for(int i=1; i<=n;i++){
            sum += (float)i/(i+1);
        }
        System.out.println("Tong la: "+sum);
    }
}
