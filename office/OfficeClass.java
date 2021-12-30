import java.util.Scanner;

abstract class staff{

    protected int id;
    protected String name;

  /*  staff(int id, String name){
        this.id = id;
        this.name = name;
    } */

    abstract void display();
    abstract void getStaff();

}


public class OfficeClass extends staff {

    String dept;

    void getStaff(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter staff id, name and dept");
        id = sc.nextInt();
        name = sc.next();
        dept = sc.next();

    }
    void display(){

        System.out.println("Name: "+name+"\tID: "+id+"\tDepartment: "+dept+"\n");
    }
        
        public static void main(String[] args) {
            
            int n;

            Scanner sc = new Scanner(System.in);

            System.out.println("How many members do you want?");
            n = sc.nextInt();

            OfficeClass st[] = new OfficeClass[n];

            for(int i = 0; i < n; i++){

                st[i] = new OfficeClass();
                st[i].getStaff();
               

            }

            System.out.println("\t-----DETAILS-----");
            for(int i = 0; i < n; i++){
                st[i].display();
            }


        }
}
