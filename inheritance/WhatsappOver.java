class Whatsappv1{
    void features(){
        System.out.println("Features: Chats & calls");
    }
}
class Whatsappv2 extends Whatsappv1{
    void features(){
        System.out.print("Old ");
        super.features();
        System.out.println("=================================");
        System.out.println("New Features: Chats, Calls & Status");
    }
}
class WhatsappOver{
    public static void main(String[] args) {
        Whatsappv2 w1=new Whatsappv2();
        w1.features();
    }
}