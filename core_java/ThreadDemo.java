//extending Thread class to create a thread

class Baking extends Thread {

    public void run() {
        System.out.println("Baking Thread using Thread Class");
        System.out.println("Taking Orders for baking...");
        System.out.println("Preparing Ingredients for Baking...");
        System.out.println("Baking...");
        System.out.println("Baking Completed!");
    }
}

//runnable interface to create a thread
class Cooking implements Runnable {

    public void run() {
        System.out.println("Cooking Thread using Runnable Interface");
        System.out.println("Taking Orders for cooking...");
        System.out.println("Preparing Ingredients for Cooking...");
        System.out.println("Cooking...");
        System.out.println("Cooking Completed!");
    }
}
//write a program that handle a state and that will increment by two threads in parallel 
//and print the state after each increment. The program should run for 10 increments.

// 3. The Shared State Class (Unchanged)
class State {

    private int value = 0;

    public synchronized void increment() {
        value++;
        System.out.println("State value: " + value);
    }
}

// 4. Thread worker class (Unchanged)
class IncrementThread implements Runnable {

    private State state;

    public IncrementThread(State state) {
        this.state = state;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            state.increment();
            System.out.println("Current thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100); // Sleep for a short time to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Baking bakingThread = new Baking();

            Cooking cookingThread = new Cooking();
            Thread thread = new Thread(cookingThread);

            System.out.println("Main Thread is running..." + i);
            bakingThread.start(); // Start the thread
            thread.start(); // Start the thread

        }

        State state1 = new State();

        // Create two threads that will increment the state
        Thread t1 = new Thread(new IncrementThread(state1));
        Thread t2 = new Thread(new IncrementThread(state1));

        t1.start();
        t2.start();
    }

    //RUN BOTH THREADS IN PARALLEL
}
