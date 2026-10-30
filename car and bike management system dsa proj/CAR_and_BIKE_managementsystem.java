import java.util.ArrayList;
import java.util.Scanner;

public class CAR_and_BIKE_managementsystem {

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
