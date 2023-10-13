import java.util.Arrays;

class Sample01 {
    public static void main(String[] args) {
        int[] arr={5,3,8,10,15,7};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }   
}
