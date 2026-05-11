public class DataTypes{
    public static void main(String[] args){
        System.out.println("Data Types in Java");
        System.out.println("1. Primitive Data Types");
        System.out.println("2. Non-Primitive Data Types");

        // Primitive Data Types
        System.out.println("1. Primitive Data Types");
        System.out.println("a. byte: 8-bit signed integer");
        byte num1=8;
        System.out.println("byte type : "+num1);
        System.out.println("b. short: 16-bit signed integer");
        short num2=16;
        System.out.println("short type : "+num2);
        System.out.println("c. int: 32-bit signed integer");
        int num3=32;
        System.out.println("int type : "+num3);
        System.out.println("d. long: 64-bit signed integer");
        long num4=64;
        System.out.println("long type : "+num4);
        System.out.println("e. float: 32-bit floating point");
        float num5=50.5f;
        System.out.println("float type : "+num5);
        System.out.println("f. double: 64-bit floating point");
        double num6=60.6;
        System.out.println("double type : "+num6);
        System.out.println("g. char: 16-bit Unicode character");
        char num7='A'; //(Unicode character)
        System.out.println("char type : "+num7);
        System.out.println("h. boolean: true or false");
        boolean num8=true;
        System.out.println("boolean type : "+num8);


        // Non-Primitive Data Types
        System.out.println("2. Non-Primitive Data Types");
        System.out.println("a. String: A sequence of characters");
        String str="Hello, World!";
        System.out.println("String type : "+str);
        System.out.println("b. Arrays: A collection of similar data types");
            int[] arr={1,2,3,4,5};
            System.out.println("Array type : "+arr);
        System.out.println("c. Classes: A blueprint for creating objects");
            class Person{
                String name;
                int age;
                Person(String name, int age){
                    this.name=name;
                    this.age=age;
                }
            }
            Person person1=new Person("John", 30);
            System.out.println("Class type : "+person1.name+" "+person1.age);
        

    }
}