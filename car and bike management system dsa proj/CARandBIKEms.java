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

