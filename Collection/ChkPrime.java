import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ChkPrime {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> a1 = new ArrayList<Integer>();
   
    public static void ShowMenu(){
        System.out.println("Type 'M' to show menu----");
        if(sc.next()=="M"){
            System.out.println("Hello");
            DisplayMsg();
        }
    }
    
    public boolean Is_Prime(){

        return false;
        
    }
    static public void DisplayMsg(){
        int tmp;
        System.out.println("=====================MENU=START=======================");
        System.out.println("1. Add one number: ");
        System.out.println("2. Add multiple number");
        System.out.println("3. Delete one element");
        System.out.println("4. Remove all element");
        System.out.println("5. Search element");
        System.out.println("6. Sort the elements in ascending order");
        System.out.println("7. Search greatest element");
        System.out.println("8. Search lowest element");
        System.out.println("9. Display all the elements");
        System.out.println("10. Exit");
        System.out.println("=====================MENU=ENDS=======================");
        tmp=sc.nextInt();
        GetInput(tmp);
    }
    static public void AddElmnt(){
        System.out.println("Enter the number to add: ");
        int n=sc.nextInt();
        a1.add(n);
        System.out.println("Number added Successfully");
        ShowMenu();
    }
    public static void AddMulElmnt(){
        System.out.println("Enter how many elements you want to add");
        int total=sc.nextInt();
        System.out.println("Enter "+total+" numbers one by one: ");
        for(int i=0;i<total;i++){
            a1.add(sc.nextInt());
        }
        ShowMenu();
    }
    static public void GetInput(int getInput){
        switch (getInput) {
            case 1:
                AddElmnt();
                DisplayMsg();
            case 2:
                AddMulElmnt();
                DisplayMsg();
            // case 3:
            //     DelElmnt();
            //     DisplayMsg();
            // case 4:
            //     RmvAll();
            //     DisplayMsg();
            // case 5:
            //     ScrchElmnt();
            //     DisplayMsg();
            case 6:
                Collections.sort(a1);
                System.out.println("--Sorted--");
                System.out.println(a1);
                ShowMenu();
            // case 7:
            //     ScrGrtst();
            //     DisplayMsg();
            // case 8:
            //     ScrLwst();
            //     DisplayMsg();
            case 9:
                System.out.println(a1);
                ShowMenu();
            case 10:
                System.out.println("Exiting........");
                break;
            default:
                System.out.println("Enter valid Input: ");
                ShowMenu();
        }
    }
    public static void main(String[] args) {
        DisplayMsg();
        
        
        
        
    }
}
