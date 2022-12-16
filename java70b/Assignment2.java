class Assignment2{


    int a = 10;
    String b="This is a Instance String";

    static int x = 20;
    static String y="This is a Static String";

    void m1(){
        System.out.println("Method 1");
        System.out.println("Instance int: " + a + " Instance: "+b);
        System.out.println("Static int: "+Assignment2.x+" Static : "+Assignment2.y+"\n");
    }

    static void m2(Assignment2 a2){
        System.out.println("Method 2");

        System.out.println("Instance int: "+a2.a+" Instance: "+a2.b);
        System.out.println("Static int: "+x+" Static: "+y);
  
    }

    public static void main(String[] args){
        Assignment2 a02 = new Assignment2();
        a02.m1();
        Assignment2.m2(a02);
    }
}