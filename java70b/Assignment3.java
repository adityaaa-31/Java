class Assignment3{

    int a,b;

    Assignment3(){
        this(100,200);
    }

    Assignment3(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Variale 1:"+a+"\nVariable 2:"+b);
    }

    public static void main(String[] args){

        Assignment3 a3 = new Assignment3();
    }


}