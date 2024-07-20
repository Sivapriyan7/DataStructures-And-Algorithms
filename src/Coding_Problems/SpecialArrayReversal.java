package Coding_Problems;

class SpecialArrayReversal {
    public static String reverse(String str)
    {
        //complete the function here
        char[] strArray = str.toCharArray();
        int start = 0, end = str.length()-1;
        String result;

        while (start < end)
        {
            if(Character.isLetter(strArray[start]) && Character.isLetter(strArray[end]))
            {
                char temp = strArray[start];
                strArray[start] = strArray[end];
                strArray[end] = temp;
                start++;
                end--;
            }
            if (!Character.isLetter(strArray[start]))
            {
                start++;
            }
            if (!Character.isLetter(strArray[end])) {
                end--;
            }
        }
        result = String.copyValueOf(strArray);
        return result;
    }

    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        System.out.println(reverse(str));
    }
}
