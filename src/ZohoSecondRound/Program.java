package ZohoSecondRound;

public class Program {

    public static void ProgramPattern(String str)
    {
        int size = str.length();
        int print=0;
        int pointer = size/2;
        int index = pointer+1;
        String result="";
        boolean flag = false;
        for (int i=pointer; i<size; i--)
        {

            result += str.substring(pointer,index++);
        }
    }

    public static void main(String[] args) {
        String S1 = "PROGRAM";
        ProgramPattern(S1);
    }
}
