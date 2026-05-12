
public class VariableTypes {
    // Java has several types of variables, including:
    // 1. Local Variables: These are declared inside a method and can only be used within that method.
    // 2. Instance Variables: These are declared inside a class but outside of any method. They are associated with an instance of the class and can be accessed using the object reference.
    // 3. Static Variables: These are declared inside a class but outside of any method and are marked with the static keyword. They belong to the class rather than any specific instance and can be accessed using the class name.
    // 4. Final Variables: These are variables that cannot be changed once they have been assigned a value. They are declared using the final keyword.

    // Example of local variable
    public void localVariableExample() {
        int localVar = 10; // This is a local variable
        System.out.println("Local Variable: " + localVar);
    }

    // Example of instance variable
    int instanceVar = 20; // This is an instance variable

    // Example of static variable
    static int staticVar = 30; // This is a static variable

    // Example of final variable
    final int finalVar = 40; // This is a final variable

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.localVariableExample();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + VariableTypes.staticVar);
        System.out.println("Final Variable: " + obj.finalVar);
    }
}
