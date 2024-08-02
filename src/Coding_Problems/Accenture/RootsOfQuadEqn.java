package Coding_Problems.Accenture;

public class RootsOfQuadEqn {

    public static void findRoots(double a,double b,double c)
    {
        double root1,root2;
        double determinant = (b*b)-4*a*c;
        if(determinant>0)
        {
            root1 = (-b + Math.sqrt(determinant))/2*a;
            root2 = (-b - Math.sqrt(determinant))/2*a;
            System.out.println("root 1 "+root1 +"root 2 "+root2);
        }
        else if (determinant==0) {
            root1=root2=b/(2*a);
            System.out.println("root 1 "+root1 +"root 2 "+root2);
        }
        else {
            double realpart = -b/(2*a);
            double imaginary = Math.sqrt(-determinant)/(2*a);
            System.out.format("root1 = %.2f+%.2fi and root2 =  %.2f-%.2fi",realpart,imaginary,realpart,imaginary);
        }
    }

    public static void main(String[] args) {

        int a = 2,b = 3,c = 5;
        findRoots(a,b,c);
    }
}
