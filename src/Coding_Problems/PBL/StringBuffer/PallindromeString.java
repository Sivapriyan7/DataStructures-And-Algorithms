package Coding_Problems.PBL.StringBuffer;

//public class PallindromeString {
//}


class PallindromeString {
        public static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left <= right) {
                char charLeft = s.charAt(left);
                char charRight = s.charAt(right);

                if(!Character.isLetterOrDigit(charLeft))
                {
                    left++;
                }
                else if(!Character.isLetterOrDigit(charRight))
                {
                    right--;
                }
                else
                {
                    if(Character.toLowerCase(charLeft) != Character.toLowerCase(charRight))
                    {
                        return false;
                    }
                    left++;
                    right--;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String s = "P";
        System.out.println(isPalindrome(s));
    }
    }
