
package pkgstatic.block;

public class StaticBlock {

    static int id;
    static String name;
    
    //static block
    static{
        id = 4356;
        name = "Tanmoy"; 
    }
    
    static void display(){
        System.out.println("ID :"+id);
        System.out.println("Name: "+name);
        
    }
}
