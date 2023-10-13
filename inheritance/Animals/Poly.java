package Animals;
import Collection02.*;
class Animal{
    void animalSound(){
        System.out.println("Animals can produce different animalSounds");
    }
}
class Cat extends Animal{
    void animalSound(){
        System.out.println("The cat says: Mew Meeew");
    }
}
class Dog extends Animal{
    void animalSound(){
        System.out.println("The Dog says: bow boww");
    }
}
class Poly {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();       
        Dog d1 = new Dog();
        a1.animalSound();
        c1.animalSound();
        d1.animalSound(); 
        ArrayListDemo a1Pack=new ArrayListDemo();
        a1Pack.listSample();

        
    }
}
