import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        //T(n) = 1 x 2 x 3…x N
        long T =1;
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
            T *= i;
        }
        System.out.println("Tich la: "+T);
    }
}
