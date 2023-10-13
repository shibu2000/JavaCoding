import java.util.*;
class Reverse {
    static void main(){
        String s1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer the String: ");
        String s2=sc.next();
        for(int i=s2.length()-1;i>=0;i--){
            s1=s1+s2.charAt(i);
        }
        System.out.println(s1);
        sc.close();

        
    }    
    public static void main(String[] args) {
        main();
    }
}
