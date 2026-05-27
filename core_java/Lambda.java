
interface Test {

    void m1();
}

interface Test2 {

    int m2(int a, int b);
}

public class Lambda {

    public static void main(String[] args) {
        //without functional interface how its working - > because Runnable is a functional interface and it has 
        //only one abstract method run() so we can use lambda expression to implement it
        Runnable r = () -> System.out.println("Hello World");
        r.run();

        //with functional interface
        //no parameter and no return type
        Test t = () -> System.out.println("Interface method implemented using lambda expression");
        t.m1();
        //parameter and return type
        Test2 t2 = (a, b) -> a + b;
        int result = t2.m2(10, 20);
        System.out.println(result);

        //lambda expression with multiple statements
        Test t3 = () -> {
            System.out.println("Multiple statements in lambda expression");
            System.out.println("This is the second statement");
        };
        t3.m1();

        //lambda expression with single statement
        Test t4 = () -> System.out.println("Single statement in lambda expression");
        t4.m1();

    }
}
//types of lambda expression
//1. no parameter and no return type    
//2. single parameter 
//3. multiple parameters
//4. single statement and multiple statements
