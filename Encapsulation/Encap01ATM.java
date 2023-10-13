class SbiServer{
    private static int pin=5678;
    static int getPin(){
        return pin;
    }
    static void setPin(int newPin){
        pin=newPin;
    }
}
class Encap01ATM {
    public static void main(String[] args) {
        System.out.println("Old pin is "+SbiServer.getPin());
        SbiServer.setPin(1234);
        System.out.println("New Pin is "+SbiServer.getPin());
    }
}
