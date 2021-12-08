
package SuperKeyword;


public class Car extends Vehicle{
    //colour,weight,attribute
    
    int gear;
    Car(String c, double w,int g){
        super(c, w); //calling the constructor of vehicle
        gear =g;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear :"+gear);
    }
}
