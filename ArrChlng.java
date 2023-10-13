import java.util.*;
import java.io.*;
class ArrChlng {
    public static int ArrayChallenge(int[] arr) {
        int len=arr.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+arr[i];
        }
        arr[0]=sum;
        return arr[0];
    }
    public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
        int arr[]={0,0,2,3,7,1};
        System.out.print(ArrayChallenge(arr));
    }
}
