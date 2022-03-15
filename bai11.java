import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        //S(n) = 1 + 1.2 + 1.2.3 + … + 1.2.3….N
        int n;
        long S=0, P=1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            if(n <1){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <1);
        for(int i =1; i<= n; i++){
            P = P*i;
            S = S+P;

        }
        System.out.println("Tong day so tren: "+S);
    }
}
