import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Tính S(n) = 1^2 + 2^2 + … + n^2
        long sum =0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            if(n <1){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <1);
        for(int i =1; i<= n; i++){
            sum += i*i;
        }
        System.out.println("Tong day so: "+ sum);
    }
}
