package OOPS.abstract_class;

public abstract class Parent {

    int age;

    public static void hello()
    {
        System.out.println("I'm in abstract class");
    }

    void normal()
    {
        System.out.println("It is normal method in abstract class");
    }
    abstract void career();
    abstract void job();
}
