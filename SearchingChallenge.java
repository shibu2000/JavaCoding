import java.util.*;
import java.io.*;

class SearchingChallenge {
    public static void main(String[] args) {
        String s = "3aabacbebebe"; // 12
        char sn = s.charAt(0);
        int count = sn - '0'; // 3
        int len = s.length();
        System.out.println(len);
        char[] arr = new char[len - 1];
        String subStr="";

        for (int i = 1; i < len; i++) {
            arr[i - 1] = s.charAt(i);
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (count > 0) {
                subStr = String.valueOf(arr[i-1]);
                System.out.println("subStr: "+subStr);
                if (arr[i - 1] == arr[i]) {
                    subStr = subStr + String.valueOf(arr[i]);
                    System.out.println("subStr1: "+subStr);
                } else {
                    subStr = subStr + String.valueOf(arr[i]);
                    System.out.println("subStr2: "+subStr);
                    count = count - 1;
                    System.out.println("Count= "+count);
                }
            } else {
                break;
            }
        }
        System.out.println(subStr);
    }

}
