import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        //S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1)
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
        for(int i =1; i<= n; i++){
            sum += 1.0/(2*i+1);
        }
        System.out.println("Tong day so tren la: "+sum);
    }
    
}
