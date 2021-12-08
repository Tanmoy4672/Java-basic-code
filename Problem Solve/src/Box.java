
public class Box {
    double height;
    double width;
    double depth;
    
    //double volume = height * width * depth;
    Box(double h, double w,double d){
      height = h;
      width = w;
      depth = d;
    }

    
    void displayVol(){
       double volume = height * width * depth;
        System.out.println("Result : "+volume);
    }
}

