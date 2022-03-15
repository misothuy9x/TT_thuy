import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        //Liệt kê tất cả các “ước số” của số nguyên dương n
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n= ");
            n = sc.nextInt();
            if(n <=0){
                System.out.println("Moi ban nhap lai!");
            }
        } while (n <=0);
        for(int i =1; i <= n; i++){
            if(n % i == 0){
                System.out.println("Cac uoc so nguyen duong cua "+n +" la: "+i);
            }

        }
        
    }
}
