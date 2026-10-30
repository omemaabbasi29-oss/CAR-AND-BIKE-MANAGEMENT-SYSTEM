import java.util.*;
public class CARandBIKEms{
int id;
String name;
String type; 
double price;
boolean rented; 

CARandBIKEms (int id,String name,String type,double price){
this.id=id;
this.name=name;
this.type=type;
this.price=price; 
this.rented=false;
} 

void display(){
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

   public static void main(String[]argss){
      Scanner sc=new Scanner(System.in);

      List<CARandBIKEms>vehicles=new ArrayList<CARandBIKEms>();


   

      }
   }
