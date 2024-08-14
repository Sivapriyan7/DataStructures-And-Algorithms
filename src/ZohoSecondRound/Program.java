package ZohoSecondRound;

public class Program {

    public static void ProgramPattern(String str)
    {
        int size = str.length();
        int pointer = size/2;
        int index = pointer+1;
        String result="";
        int space = size-1;
        for (int i=pointer; i<size; i++)
        {
            for (int j=space*2; j>=0; j-=2)
            {
                System.out.print("  ");
            }
            space--;
            if(index<=size)
            {
                result = str.substring(pointer,index++);
                System.out.print(result);
                System.out.println();
            }

        }
        pointer = 0;
        index = pointer+1;
        for (int i=pointer; i<size/2; i++)
        {
            for (int j=space*2; j>=0; j-=2)
            {
                System.out.print("  ");
            }
            space--;
            if(index<=size/2)
            {
//                result =str.substring(pointer,index++);
                System.out.print(result+str.substring(pointer,index++));
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        String S1 = "PROGRAM";
        ProgramPattern(S1);
    }
}
