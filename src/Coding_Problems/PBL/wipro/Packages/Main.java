package wipro.Packages;

public class Main {
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        // Accessing variables from Foundation class
        // obj.var1; // This will give a compilation error because var1 is private
        System.out.println("var2 (default access) = " + obj.var2);
        System.out.println("var3 (protected access) = " + obj.var3);
        System.out.println("var4 (public access) = " + obj.var4);
    }
}
