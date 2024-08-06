package Coding_Problems.PBL.wipro.AbstractClasses;
// Abstract class Compartment
abstract class Compartment {
    public abstract void notice();
}

// Derived class FirstClass
class FirstClass extends Compartment {
    @Override
    public void notice() {
        System.out.println("Welcome to First Class compartment.");
    }
}

// Derived class Ladies
class Ladies extends Compartment {
    @Override
    public void notice() {
        System.out.println("Ladies compartment - Only ladies allowed.");
    }
}

// Derived class General
class General extends Compartment {
    @Override
    public void notice() {
        System.out.println("General compartment - All are welcome.");
    }
}

// Derived class Luggage
class Luggage extends Compartment {
    @Override
    public void notice() {
        System.out.println("Luggage compartment - Store your luggage securely.");
    }
}

