interface operation {

    double PI = 3.14;
    int h = 10;
    int r = 20;

    void area();
    void volume();
}


public class cylinder implements operation {

    @Override
    public void volume() {
        double vol; 
        
        vol = PI * r * r * h;

        System.out.println("Volume: "+vol);
    }

   @Override
    public void area() {
        double area;

        area  = 2 * PI * r * h + 2 * PI * r * r;

        System.out.println("Area: "+area);
    }

    public static void main(String[] args) {
        
        cylinder c = new cylinder();

        c.area();
        c.volume();
    }
    
}
