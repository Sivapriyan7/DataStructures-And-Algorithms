//public class ScoreOfString {
//}

class ScoreOfString {
    public int scoreOfString(String s) {

        int score = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            int diff = Math.abs((int)(s.charAt(i)) - (int)(s.charAt(i+1)));
            System.out.println(s.charAt(i)-s.charAt(i+1));
//            System.out.println(diff);
            score += diff;
        }
        return score;
    }

    public static void main(String args[])
    {
        ScoreOfString s = new ScoreOfString();
        int returned_score = s.scoreOfString("zaz");
        System.out.println(returned_score);
    }
}
