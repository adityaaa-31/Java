import java.util.Scanner;

abstract class order{

        int id;
        String description;

        Scanner sc = new Scanner(System.in);

        void getOrder(){
            System.out.println("Enter id and description");
            id = sc.nextInt();
            description = sc.next();

        }

        void displayOrder(){
            System.out.println("Id: "+id+"Description"+description);
        }

}

class PurchaseOrder extends order{

    String customerName;

    Scanner sc = new Scanner(System.in);
    
    void getCust(){
        System.out.println("Enter customer name: ");
       customerName = sc.next();
    }
    void displayCust(){
        System.out.println("Cunstomer name: "+customerName);
    }


}

class SalesOder extends order{
    String vendorName;

    Scanner sc = new Scanner(System.in);

    void getVendor(){
        System.out.println("Enter customer name: ");
        vendorName = sc.next();
    }
    void displayVendor(){
        System.out.println("Cunstomer name: "+vendorName);
    }

}



public class orderclass {
    
    public static void main(String[] args) {
        

        order o = new order();
        PurchaseOrder p = new PurchaseOrder();
        SalesOder s = new SalesOder();

        o.getOrder();
        p.getCust();
        s.getVendor();

        o.displayOrder();
        p.displayCust();
        s.displayOrder();
    }
}
