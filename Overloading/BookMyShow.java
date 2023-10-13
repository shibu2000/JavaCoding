import java.util.*;
class Book{
    void book(int num){
        System.out.println("Booked by "+num);
    }
    void book(String movn){
        System.out.println("Booked by "+movn);
    }
    void book(char movc){
        System.out.println("Booked by "+movc);
    }
    void book(String movn, char movc){
        System.out.println("Booked by "+movn+" and "+movc);
    }
}
class BookMyShow {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.book(740703824);
        b1.book("KGF");
        b1.book('A');
        b1.book("RRR",'K');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter You Name");
        String name=sc.next();
        System.out.println(name);
        sc.close();
    }

}
