import java.util.*;
class Vehicle{
int id;
String name;
String type; 
double price;
boolean rented; 

Vehicle (int id,String name,String type,double price){
this.id=id;
this.name=name;
this.type=type;
this.price=price; 
this.rented=false;
} 

void showdisplay(){
System.out.println("ID" + id );
System.out.println("NAME OF THE VEHICLE " + name);
System.out.println("TYPE OF VEHICLE" + type);
System.out.println("PRICE OF RENTING"+ price);

if(rented==true){
   System.out.println("STATUS" + "IT IS RENTED");
}
else{
   System.out.println("STATUS" + "IT IS AVAILABLE");
}
}
   } 

class Car extends Vehicle{
   int seats;
   Car(int id,String name,String type,double price,int seats){
      super(id,name,type,price);
      this.seats=seats;
   } 
   
      void showdisplay(){
         super.showdisplay();
      System.out.println("SEATS" + seats);
   }  
}  
class Bike extends Vehicle{
   int engineCC;
   Bike(int id,String name,String type,double price,int engineCC){
      super(id,name,type,price);
      this.engineCC=engineCC;
   }
   void showdisplay(){
      super.showdisplay();
      System.out.println("ENGINE CC" + engineCC);
   }
}
public class CARandBIKEms {

static Scanner sc = new Scanner(System.in);

static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

static void addVehicle() {

    System.out.println("1. Add Car");
    System.out.println("2. Add Bike");

    int choice = sc.nextInt();

    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    if (choice == 1) {

        System.out.print("Enter Seats: ");
        int seats = sc.nextInt();

        vehicles.add(new Car(id, name, "Car", price, seats));

        System.out.println("Car Added Successfully!");

    } else if (choice == 2) {

        System.out.print("Enter Engine CC: ");
        int engineCC = sc.nextInt();

        vehicles.add(new Bike(id, name, "Bike", price, engineCC));

        System.out.println("Bike Added Successfully!");

    } else {
        System.out.println("Invalid Choice!");
    }
}

static void displayVehicles() {

    if (vehicles.isEmpty()) {

        System.out.println("No Vehicles Available!");

    } else {

        for (int i = 0; i < vehicles.size(); i++) {

            vehicles.get(i).showdisplay();
            System.out.println("----------------");
        }
    }
}
}

