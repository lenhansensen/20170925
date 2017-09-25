import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, b, c, sum;
        System.out.print("請輸入第一個整數:");
        a=input.nextInt();
        System.out.print("請輸入第二個整數:");
        b=input.nextInt();
        System.out.print("請輸入第三個整數:");
        c=input.nextInt();
        sum=a+b-c;
        System.out.printf("%d+%d-%d=%d", a,b,c,sum);
        input.close();
    }
}
