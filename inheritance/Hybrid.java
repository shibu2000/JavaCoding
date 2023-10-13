class Father{
    static String hairType="Straight";
    static String bldTyp="AB+";
    void details01(){
        System.out.println("Father's hair type: "+hairType+" and Blood Type: "+bldTyp);
		System.out.println("========================================================");
		
    }
}
class Son extends Father{
    void details02(){
        super.details01();
        System.out.println("Son's hair type: "+hairType+" and Blood Type: "+bldTyp);
		System.out.println("========================================================");
    }
}
class Doughter extends Father{
    static String bldTyp02="A+";
    void details03(){
        System.out.println("Doughter's hair type: "+hairType+" and Blood type "+bldTyp02);
		System.out.println("========================================================");
    }
}
class DoughterSon extends Doughter{
    static String hairType02="Curly";
    void details04(){
        System.out.println("Son of Doughter's hair type: "+hairType02+" and Blood type "+bldTyp02);
		System.out.println("========================================================");
    }
}
class Hybrid {
    public static void main(String[] args) {
        DoughterSon d1=new DoughterSon();
        Son s1=new Son();
		s1.details02();
        d1.details03();
        d1.details04();
    }
}
