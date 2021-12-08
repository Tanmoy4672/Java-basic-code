package thisKeyword;

public class Person {

    String name;
    int age;
    String colour;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String colour) {
        this(name,age);
        this.colour = colour;
    }
    
    void message(){
        System.out.println("I'm message method.");
    }
    
    void display() {
        message(); //this.message();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Colour: "+colour);
    }
    
    
}
