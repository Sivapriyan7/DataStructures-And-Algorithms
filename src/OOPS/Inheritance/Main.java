package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2,3,1);
        System.out.println(box1.l+" "+box1.h+" "+ box1.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight();
        System.out.println(box3.h+" "+ box3.weight);
    }
}
