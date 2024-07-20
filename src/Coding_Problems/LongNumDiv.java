package Coding_Problems;


class LongNumDiv
{
    static String longDivision(String S, int D){
        // code here
        long num = Long.parseLong(S);
        long ans = num/D;
        System.out.println(ans);

    return Long.toString(ans);
    }


    public static void main(String[] args) {
        System.out.println(longDivision("23232323232",23));
    }
}

