class Assignment4{

    int a = 10,b = 20;

    void m1(){
        System.out.println("Outer Method\n");
    }

    class Assignment4Inner{
        int a=100,b=200;

        void m2(){
            m1();

            System.out.println("Outer Variables: "+Assignment4.this.a+"\t"+Assignment4.this.b);
            System.out.println("Inner Variables: "+this.a+"\t"+this.b);
            

        }
    }

    public static void main(String[] args){

        Assignment4 ao = new Assignment4();
        Assignment4.Assignment4Inner ai = ao.new Assignment4Inner();

        //new Assignment4().new Assignment4Inner().m1();

        ai.m2();
    }
}