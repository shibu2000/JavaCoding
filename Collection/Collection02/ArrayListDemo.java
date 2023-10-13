package Collection02;
import java.util.*;
import java.util.PriorityQueue;
public class ArrayListDemo{
    public void listSample(){
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add("Hello");
        l1.add('A');
        System.out.println(l1);
        l1.add(1,"Mahalaya");
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        System.out.println("Collection size: "+l1.size());
        Vector v1 = new Vector(l1);
        System.out.println(v1);
        System.out.println("Updated");
    }
    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue();
        p1.add("Hello");
        p1.add("Losers");
        p1.add("Welcome");
        p1.add("To");
        p1.add("10");
       // p1.poll();
        System.out.println(p1.peek());
        
    }
}
