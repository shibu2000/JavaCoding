import java.util.*;
class Palindrom {
    public static void main(String[] args) {
        int rem, sum=0, org,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        org=n;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(org==sum){
            System.out.println("Reverse: "+sum);
            System.out.println(org+" is palindrom");
        }else{
            System.out.println("Reverse: "+sum);
            System.out.println(org+" isn't palindrom");
        }
        sc.close();
    }
}
