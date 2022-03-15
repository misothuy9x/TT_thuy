import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        //S(n) = x + x^2/2! + x^3/3! + … + x^n/N!
        int n,x;
        float S =0, T=1; 
        long M=1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap co so x:");
            x= sc.nextInt();
            System.out.println("Nhap luy thua n= ");
            n = sc.nextInt();
            if(n <1){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <1);
        for(int i =1; i<= n; i++){
            T *= x;
            M *= i;
            S += T/M;
            
        }
        System.out.println("Tong day so S(n) = "+S);
    
    }
}
