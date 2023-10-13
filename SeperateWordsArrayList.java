import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SeperateWordsArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        // int beginIndex = 0;

        // Seperating String using substring and adding into arraylist
        // for (int i = 0; i < s1.length(); i++) {
        //     if (s1.charAt(i) == ' ') {
        //         arrayList.add((s1.substring(beginIndex, i)).trim());
        //         beginIndex = i;
        //     }
        //     if (i == s1.length() - 1) {
        //         arrayList.add((s1.substring(beginIndex, s1.length())).trim());
        //     }
        // }
        // System.out.println(arrayList);


        // seperating String using split() method
        String[] arr = s1.split(" ");

        for (String str : arr) {
            arrayList.add(str);
        }

        System.out.println(arrayList);

        // Marging Strings from Arraylist
        String s2 = "";
        for (int i = 0; i < arrayList.size(); i++) {
            s2 += arrayList.get(i) + " ";
        }
        System.out.println(s2);


        // Reversing ArrayList
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // Reverse Arralist
        // ArrayList<String> arrayList2 = new ArrayList<String>();
        // for(int i=arrayList.size()-1;i>=0;i--){
        // arrayList2.add(arrayList.get(i));
        // }
        // System.out.println(arrayList2);

        // s2="";
        // for(int i=0;i<arrayList.size();i++){
        // s2=s2+arrayList.get(i)+" ";
        // }

        // System.out.println(s2);
        scanner.close();
    }
}