import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        //S(n) = 1 + x^2/2! + x^4/4! + … + x^2n/(2n)!
        int n,x;
        float S =1, T; 
        long M, N=1;
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
            T = (float) Math.pow(x, (2*i));
            M = i*2;
            N = N * M * (M - 1);
            S = S + T/N;
            
        }
        System.out.println("Tong day so S(n) = "+S);
    }
}
