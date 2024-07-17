package OOPS.Class_Objects;

public class Main1 {

    public static void main(String[] args) {
        Human siva = new Human(20,100000,"sivapriyan",false);
        Human rahul = new Human(20,10000,"rahul",false);

        System.out.println(siva.name);
        System.out.println(Human.population);

    }

}
