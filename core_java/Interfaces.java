//prevent tightly coupling between classes and to achieve abstraction and
// multiple inheritance in Java
// An interface in Java is a reference type, similar to a class, that can contain only
//constants, method signatures, default methods, static methods, and nested types.
//It cannot contain instance fields or constructors. Interfaces are used to specify a contract
//that classes can implement. A class that implements an interface must provide implementations for

interface Computer {

    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding on a laptop");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding on a desktop");
    }
}

class Programmer {

    void program(Computer computer) {
        computer.code();
    }
}

//multiple inheritance using interfaces
interface A {

    void methodA();
}

interface B {

    void methodB();
}

class C implements A, B {

    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }
}

public class Interfaces {

    // An interface in Java is a reference type, similar to a class, that can contain only 
    //constants, method signatures, default methods, static methods, and nested types. 
    //It cannot contain instance fields or constructors. Interfaces are used to specify a contract 
    //that classes can implement. A class that implements an interface must provide implementations for 
    //all of the methods declared in the interface. Interfaces are declared 
    //using the 'interface' keyword and can be implemented by any class, from any 
    //inheritance tree. They are often used to achieve abstraction and 
    //multiple inheritance in Java.
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        programmer.program(laptop);
        programmer.program(desktop);

        C c = new C();
        c.methodA();
        c.methodB();
    }
}

// Here is the complete, production-ready, compile-and-run Java code for the decoupled notification system.Save this whole snippet into a single file named Main.java and execute it.java// ==========================================
// // 1. THE INTERFACE CONTRACT (The Middleman)
// // ==========================================
// interface MessageSender {
//     void send(String message);
// }
// // ==========================================
// // 2. CONCRETE IMPLEMENTATIONS
// // ==========================================
// class EmailSender implements MessageSender {
//     @Override
//     public void send(String message) {
//         System.out.println("[EMAIL] Sending: " + message);
//     }
// }
// class SmsSender implements MessageSender {
//     @Override
//     public void send(String message) {
//         System.out.println("[SMS] Sending: " + message);
//     }
// }
// class PushNotificationSender implements MessageSender {
//     @Override
//     public void send(String message) {
//         System.out.println("[PUSH] Sending: " + message);
//     }
// }
// // ==========================================
// // 3. DECOUPLED SERVICE (Depends only on Interface)
// // ==========================================
// class AppNotificationService {
//     // Look: No mention of EmailSender or SmsSender here!
//     private final MessageSender sender; 
//     // Constructor Injection: Pass the dependency from outside
//     public AppNotificationService(MessageSender sender) {
//         this.sender = sender;
//     }
//     public void notifyUser(String msg) {
//         // Business logic runs cleanly, completely unaware of the underlying channel
//         this.sender.send(msg); 
//     }
// }
// // ==========================================
// // 4. RUNNABLE APPLICATION ENTRY POINT
// // ==========================================
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("--- Starting App In Decoupled Mode ---\n");
//         // Use Case A: App operates via Email
//         MessageSender emailChannel = new EmailSender();
//         AppNotificationService emailService = new AppNotificationService(emailChannel);
//         emailService.notifyUser("Account created successfully!");
//         System.out.println("----------------------------------------");
//         // Use Case B: Switch to SMS seamlessly without modifying AppNotificationService
//         MessageSender smsChannel = new SmsSender();
//         AppNotificationService smsService = new AppNotificationService(smsChannel);
//         smsService.notifyUser("Your validation code is 9921.");
//         System.out.println("----------------------------------------");
//         // Use Case C: Easily add a brand new channel (Push) later
//         MessageSender pushChannel = new PushNotificationSender();
//         AppNotificationService pushService = new AppNotificationService(pushChannel);
//         pushService.notifyUser("Someone liked your picture!");
//     }
// }
// Use code with caution.Why this is "Perfect" DecouplingOpen/Closed Principle: The AppNotificationService is closed to modification but open to extension. You can add a WhatsAppSender tomorrow, and you will not have to touch a single line of your core business logic class.Easy Testing: You can pass a fake, temporary mock object matching MessageSender into your test environment, eliminating the need to send real text messages during automated testing.If you are setting this up in an IDE, I can show you how to integrate a factory pattern to automatically pick the correct channel at runtime. Would you like to add that layer next?
