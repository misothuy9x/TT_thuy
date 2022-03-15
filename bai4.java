import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        //Tính S(n) = ½ + ¼ + … + 1/2n
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
            sum += 1.0/(2*i);
        }
        System.out.println("Tong day so tren la: "+sum);
    }
}
