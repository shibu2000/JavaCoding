package Exception;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Exo03 {
    
    protected static void searchKey(int key, ArrayList<Integer> arrList) {
        int x=Collections.binarySearch(arrList, key);
        System.out.println("Index: "+x);
        if(x>=0){
            System.out.println(key+" Found at "+x+" Position");
        }else{
            throw new IndexOutOfBoundsException(key+" Not Found");
        }
        
    }
    private static void show(ArrayList<Integer> a1) {
        System.out.println("List : "+a1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        System.out.println("Enter how many number you wants to add in list: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Number: ");
        for(int i=0;i<n;i++){
            a1.add(sc.nextInt());
        }
        System.out.println("Enter the number you want to search: ");
        int key=sc.nextInt();
        show(a1);
        searchKey(key, a1);
        sc.close();
    }

}
