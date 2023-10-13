class Grandfather {
    static String owName01="Jagannath Dhara";
    static String occ01="Goldsmith";//occupation
    static String loc01="Khirpai";//location
    static void designation01(){
        System.out.println("=====Grandfather's Details======");
        System.out.println("Name: "+owName01);
        System.out.println("Occupation: "+occ01+" Location: "+loc01);
        System.out.println("==================================");
    }
}
class Father extends Grandfather{
    static String owName02="Jhantu Dhara";
    static String loc02="Kolkata";
    static void designation02(){
        System.out.println("=====Father's Details======");
        System.out.println("Father's name: "+owName01+" Occupation: "+occ01+" Location: "+loc01);
        System.out.println("name: "+owName02+" name: "+owName02+" Occupation: "+occ01+" Location: "+loc02);
        System.out.println("==================================");
    }
}
class MultiLevel_Son extends Father{
    static String owName03="Shibu Dhara";
    static String occ03="Engineer";
    //static String loc03="Kolkata";
    static void designation03(){
        System.out.println("=====My Details======");
        System.out.println("Father's name: "+owName02+" Occupation: "+occ01+" Location: "+loc02);
        System.out.println("Name: "+owName03+" name: "+owName02+" Occupation: "+occ03+" Location: "+loc02);
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        designation01();
        designation02();
        designation03();

    }
}
