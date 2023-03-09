package day_03;

public class LengthOfLastWord {
    public int lengthOfLastWordSplit(String s) {
      String[] arr = s.trim().split(" ");
      return arr[arr.length-1].length();
    }

    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && s.charAt(0) != ' ') {
            return 1;
        }

        int len = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len - i != 0 && s.charAt(i + 1) != ' ') {

                    return len - i;
                } else len = i - 1;
            }
        }
        if (s.charAt(0) != ' ') {

            return len + 1;
        }
        return 0;
    }

}
