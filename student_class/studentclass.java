import java.util.Scanner;


class student{

    int rollno; 
    String name;
    float per;
    static int count = 0;

    public student(String name, float per){
        count++;
        rollno = count;
        this.name = name;
        this.per = per;
        

    }

    void display(){
        System.out.println(" "+name+" "+rollno+" "+per);
    }

    float getPer(){
        return per;
    }

    static void counter(){
        System.out.println("Object created "+count);
    }

    static void sortStudent(student s[], int n){

        System.out.println(" "+n);

        for(int i = n-1; i > 0;i--){
            for(int j = 0;j < i; j++){
                if(s[j+1].getPer() < s[j+1].getPer()){
                    student t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }

        for(int i = 0; i< n;i++){
            s[i].display();
        }
    }


}


public class studentclass {

    public static void main(String[] args){

        String name;
        float per;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students?");
        int num = sc.nextInt();

        student[] p = new student[num];

        for(int i = 0;i < num; i++){

            System.out.println("Enter the name");
            name = sc.next();

            System.out.println("Enter percentage");
            per = sc.nextFloat();

            p[i] = new student(name, per);
            p[i].counter();

            

        }

       //student st = new student("s", 12);
       //System.out.println(""+st.getPer());
       student.sortStudent(p, student.count);

    }

    

    
}
