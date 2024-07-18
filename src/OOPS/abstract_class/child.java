package OOPS.abstract_class;

public class child extends Parent{

    public  child(int age)
    {
        this.age = age;
    }
    @Override
    void career()
    {
        System.out.println("I'm going to be rich and "+age);
    }

    @Override
    void job()
    {
        System.out.println("I am Engineer");
    }
}
