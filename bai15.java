import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        //S(n)= 1 + 1/1 + 2 + 1/ 1 + 2 + 3 + ….. + 1/ 1 + 2 + 3 + …. + N
        int n;
        float S =0, T=0; 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            if(n <1){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <1);
        for(int i =1; i <= n; i++){
            T = T+i;
            S += 1.0 /T; 

        }
        System.out.println("Tong day so S(n) = "+S);
    }
}
