package LinkedList_Demo;

import java.util.LinkedList;

public class StudentListDemo {

    public static void main(String[] args) {
        //student linked list
        LinkedList<Student> list = new LinkedList<Student>();

        //studnet create
        Student s1 = new Student("Tanmoy", "Eleven", 14);
        Student s2 = new Student("Samir", "Tweleve", 15);

        //adding student to the student list
        list.add(s1);
        list.add(s2);

        //print list
        for (Student s : list) {
            System.out.println("Id:" + s.id + ", Name:" + s.id + ", Classname:" + s.className);
        }
    }
}
