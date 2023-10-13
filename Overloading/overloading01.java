class overloading01
{
    static void send(int a){
        System.out.println(a);
    }
    static void send(String a){
        System.out.println(a);
    }
    static void send(int a, String b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        send(11);
        send("Get job sooon");
        send(11,"Shibu");
    }
}