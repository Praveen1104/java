
import java.util.*;
//collections is is a framework 
//is set of classes and interfaces that implement data structures and algorithms to store and manipulate data efficiently
//collection is interface that provides methods to store and manipulate groups of objects
//

class Student {

    private String name;
    private int age;

}

public class CollectionApiList {

    public static void main(String[] args) {

        //ArrayList 
        ArrayList<Student> students = new ArrayList<Student>();

        //ArraList is a class that implements the List interface and provides a dynamic array to store elements. It allows for fast access to elements and is efficient for 
        //adding and removing elements at the end of the list. However, it can 
        //be less efficient for adding and removing elements in the middle of the list, as it may require shifting elements to maintain the order.
        //LinkedList  
        //it implements doubly linked list where the elements
        //stored as nodes.
        //maintains the order of elements
        //duplicates are alowed
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Hello");
        ll.add("World");
        System.out.println(ll);
        ll.set(1, "Java"); //set method is used to update the 
        //element at the specified index in the list. 
        System.out.println(ll);

        ll.remove(0);
        //remove method is used to remove the element at the specified index the list.
        System.out.println(ll);

        //iterating List 
        for (String st : ll) {
            System.out.println(st);
        }
    }
}
