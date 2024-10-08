package Leetcode_Questions;

class Solution {
    public static int compareVersion(String version1, String version2) {
        var v1 = version1.split("\\.");
        var v2 = version2.split("\\.");
        for (int i=0; i<v1.length; i++)
        {
            System.out.println(v1[i]);
        }
        for (int i=0; i<v2.length; i++)
        {
            System.out.println(v2[i]);
        }
        System.out.println("----");
        for (var i=0; i < Math.max(v1.length, v2.length); i++) {
            var num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            var num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("#########");

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.10.10","1.0010"));
    }
}