import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
            System.out.println("Not Armstrong");
        }

    }
}
