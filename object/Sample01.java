class Sample01 {
    void mo(){
        System.out.println("Mooooooooo");
    }
    static void fo(Sample01 s2){
        s2.mo();
        System.out.println(s2);
    }
    public static void main(String[] args){
        Sample01 s1=new Sample01();
        System.out.println(s1);
        fo(s1);
    }
}
