package GeeksforGeeks;

import java.util.Scanner;

class Car{
    public void topSpeed(){
    System.out.println("Top Speed of the vehicle is 100 kmph");
    }
    public void printTopSpeed(int topSpeed){
       System.out.println("Top Speed of the vehicle is " + topSpeed+"kmph"); 
        
    }
    public void printTopSpeed(String  vehecleName,int topSpeed){
       System.out.println("Car fuel type is Petrol"); 
        
    }
    public void fuelType(){
       System.out.println("Car fuel type is Petrol"); 
        
    }
   
    
}
class SUV extends Car{
    public void fuelType(){
    System.out.println("SUV fuel type is Diesel");
    }
}
public class Encrypter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++) {
            String input = sc.nextLine();
            Car suv = new SUV();
            if(input.equals("topSpeed")){
                suv.topSpeed();
            }
            if(input.equals("fuelType")){
                suv.fuelType();
            }
            Car car = new Car();
            if(input.equals("topSpeed")){
                car.topSpeed();
            }
            if(input.equals("fuelType")){
                car.fuelType();
            }
        }
    }
}