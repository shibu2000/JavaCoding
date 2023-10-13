package Exception01;
import java.util.ArrayList;

import Exception.*;
import java.util.Scanner;
public class Exp04 extends Exo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            a2.add(sc.nextInt());
        }
        System.out.println("Enter the number you want to search: ");
        int key=sc.nextInt();
        searchKey(key, a2); //protected
        //Exo03.show(a2); // private
        Exp02.show();
    }
}
