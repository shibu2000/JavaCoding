class Fibbonaci {
    public static void main(String[] args) {
        int num=5;
        int n, num1=0, num2=1;
        for(int i=1;i<=num;i++){
            //n=n+i;
            //n=n-1;
            n=num1+num2;
            num1=num2;
            num2=n;
            System.out.println(num1+"+"+num2);
        }
        System.out.println("Total:"+n);
    }
}
