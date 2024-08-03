package Coding_Problems.Accenture;

public class ArrayStringsAreEqual {

    public static boolean arrayStrEqual(String[] str1,String[] str2)
    {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        for (int i=0; i<str1.length; i++)
        {
            string1.append(str1[i]);
        }
        for (int i=0; i<str2.length; i++)
        {
            string2.append(str2[i]);
        }
        return string1.toString().equals(string2.toString());
    }

    public static void main(String[] args) {
        String[] str1 = {"asn","nb"};
        String[] str2 = {"snnb","a"};

        System.out.println(arrayStrEqual(str1,str2));

    }
}
