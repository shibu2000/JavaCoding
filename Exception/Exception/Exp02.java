package Exception;
import java.util.Scanner;

public class Exp02 {
    static void checkArmstrong(int n){
        int tmp=n;
        int rem;
        int rev=0;
        int qub=0;
        while(n>0){
            rem=n%10;
            qub=rem*rem*rem;
            rev=rev+qub;
            n=n/10;
        }
       // System.out.println("Armstrong="+rev);
        //System.out.println("Armstrong="+rev);
        if(tmp==rev){
            System.out.println("Armstrong");
        }else{
            throw new ArithmeticException("Not Armstrong");
        }
    }
    public static void show(){
        System.out.println("Hello I'm public member from Exp02 class");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int n=sc.nextInt();
        Exp02.checkArmstrong(n);
        sc.close();
    }
}

