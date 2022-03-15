import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //Tính S(n) = 1 + ½ + 1/3 + … + 1/n
        float sum =0;
        int a;
        Scanner sc = new Scanner(System.in);
        do {
                System.out.println("Nhap so n = ");
                a = sc.nextInt();
                if(a<1){
                    System.out.println("Moi ban nhap lai");
                }
            
        } while (a <= 1);
        for(int i =1; i<= a; i++){
            sum += 1.0/i;
        }
        System.out.println("Tong day so: "+sum);
    }
}
