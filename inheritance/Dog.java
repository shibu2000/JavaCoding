class Animal{
    int x=10;
    void show01(){
        System.out.println("Class Animal x="+x);
    }
}
class Dog extends Animal{
    String sound="Gheu Gheu";
    void show02(){
        System.out.println("Dog sound="+sound+" Animal no."+x);
    }
    public static void main(String[] args) {
        Animal d1=new Dog(); //upcasting (All the properties of subclass are locked)
        Dog d2=(Dog) d1; //downcasting(Unlock the lock properties)

        System.out.println(d1.x);
        d1.show01();
        //System.out.println(d1.sound);
        d2.show02();


    }
}