package OOPS.Class_Objects;

public class Student {

    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(Student other)
    {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
    Student()
    {
        this (23,"siva",99);
    }
    void greeting()
    {
        System.out.println("Hello my name is "+name);
    }
    void changeName(String newName)
    {
        this.name = newName;
    }
}

class Car{
    final int num = 20;
    String name;

    Car(String name)
    {
        this.name = name;
    }
}

class Main{

    public static void main(String[] args) {
        Student siva = new Student(85,"Sivapriyan",100);
        Student random = new Student(siva);
        Student random1 = new Student();
//        siva.changeName("king");
        siva.greeting();
        random1.greeting();
//        random.greeting();
        final Car car = new Car("SUPRA");
        car.name = "bugati";
        //when a non primitive is final, you cannot reassign it.
        //car = new Car("dfd")
    }
}