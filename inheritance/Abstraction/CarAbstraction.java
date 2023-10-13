package Abstraction;
interface Car{
    int engine=3000;
    int ftank=30;
    void engine();
    void ftank();
}
class CarOpen implements Car{
    void message(){
        System.out.println("==========Abstraction through Interface=========");
        System.out.println("=====When we don't know 100% implementation=====");
    }
    @Override
    public void engine() {
        System.out.println("Engine is: "+engine+" CC");
    }
    @Override
    public void ftank() {
        System.out.println("Fuel tank capacity is: "+ftank+" ltr");
    }
}
public class CarAbstraction {
    public static void main(String[] args) {
        CarOpen c1 = new CarOpen();
        c1.message();
        Car c2=c1;
        c2.engine();
        c2.ftank();
    }
}