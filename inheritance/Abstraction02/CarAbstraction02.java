package Abstraction02;
abstract class Car{
    int milage=20;
    abstract void breakTyp();
    abstract void tyreTyp();
    void details(){
        System.out.println("======BMW======");
        System.out.println("Milage is: "+milage);
    }
}
class CarOpen extends Car{
    String breakTyp="ABS";
    String tyreTyp="Tubeless";
    @Override
    void breakTyp() {
        System.out.println("The Break Type is: "+breakTyp);
    }
    @Override
    void tyreTyp() {
        System.out.println("Tyre Types: "+tyreTyp);
    }
}
class CarAbstraction02 {
    public static void main(String[] args) {
        Car c1=new CarOpen();
        c1.details();
        c1.breakTyp();
        c1.tyreTyp();
    }
}
