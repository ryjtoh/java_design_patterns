package creational_patterns;
/*
Singleton definition:
    - Ensures that a class only has one instance that is globally accessible.

Why a Singleton?
    - To control access to a shared resource such as a database or a file.
    - To provide global access to this instance of a class.
    - To prevent the variable from being overwritten.

How to implement a Singleton:
    - Make the default constructor private.
    - Creation/retrieval of the instance should be done in a static method

 */


public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return Singleton.instance;
    }
}
