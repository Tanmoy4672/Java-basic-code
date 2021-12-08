
package encapsulation.problem;

public class EncapsulationProblem {

    public static void main(String[] args) { 
        Person ob1 = new Person();
        ob1.setName("Tanmoy");
        ob1.setAge(21);
        System.out.println("Name: "+ob1.getName());  
        System.out.println("Age: "+ob1.getAge());
    }    
}
