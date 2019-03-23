package DesignPatterns.Singleton;

public class SingletonDemo extends Thread {

    public void run()
    {
        try {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

            System.out.println(Singleton.getInstance());
        }
        catch (Exception e) {
            System.out.println ("Exception is caught");
        }
    }

    public static void main(String args[]) {
        /*Singleton singletonInstance = Singleton.getInstance();
        System.out.println(singletonInstance);
        System.out.println(Singleton.getInstance());*/

        SingletonDemo t1 = new SingletonDemo();
        t1.start();

        SingletonDemo t2 = new SingletonDemo();
        t2.start();

    }
}
