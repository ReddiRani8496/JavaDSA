package Recursion;

public class CountVowels {
  public static void main(String[] args) {
        String str = "hello rock start";
        int total = countVowels(str);
        System.out.println(total);

        int res = totalVowels(str);
        System.out.println(res);
    }

    public static int countVowels(String str) {
        if(str.isEmpty()) return 0;
        String letter = str.substring(0,1).toLowerCase();
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            return 1 + countVowels(str.substring(1));
        }

        return countVowels(str.substring(1));
    }

    public static int totalVowels(String str) {
        if(str.isEmpty()) return 0;

        String vowels = "aeiou";
        if(vowels.contains(str.substring(0,1))) {
            return  1+ totalVowels(str.substring(1));
        }
        return totalVowels(str.substring(1));
    }
}