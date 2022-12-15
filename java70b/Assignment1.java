class Assignment1{
    
    int a = 10;;
    String b = "Hello";

    static void m1(){
        Assignment1 a2 = new Assignment1();

        System.out.println("INT: "+a2.a+"  Str: "+a2.b);
    }

    static void m2(){        
        
        Assignment1 a22 = new Assignment1();

        System.out.println("INT: "+a22.a+"  Str: "+a22.b);
    }

    public static void main(String[] args){

        Assignment1 a1 = new Assignment1();
        a1.m1();
        Assignment1.m2();
    }

}