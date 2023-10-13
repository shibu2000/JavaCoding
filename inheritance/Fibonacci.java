public class Fibonacci {
    public static void main(String[] args) {
        int n=4;
        int s1=1;
        int s2=0;
        int sum=0;
        System.out.println(sum);
        for(int i=0;i<n;i++){
            sum=s1+s2;
            s1=s2;
            s2=sum;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
