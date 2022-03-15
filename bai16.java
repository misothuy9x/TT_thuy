import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        //S(n) = x + x^2/1 + 2 + x^3/1 + 2 + 3 + … + x^n/1 + 2 + 3 + …. + N
        int n,x;
        float S =0, T=1; 
        long M=0;
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
            M += i;
            S += T/M;
            
        }
        System.out.println("Tong day so S(n) = "+S);
    }
}
