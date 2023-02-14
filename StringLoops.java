import java.util.Arrays;
public class StringLoops {

public static String reverseCharacters(String str) {
  int index = str.length();
  String str2 = "";
  for (index = str.length() - 1; index >= 0; index --) {
    str2 += str.substring(index, index + 1);
  }
  return str2;
}

public static int[] indexesOfAll(String text, String searchTerm) {
  int index = 0;
  int total = 0;
  for (index = 0; index < text.length(); index ++) {
    if (searchTerm.equals(text.substring(index, index + 1))) {
      total++;
    }
  }
  int[] appearances = new int[total];
  int appearanceNum = 0;
  for (index = 0; index < text.length(); index ++) {
    if (searchTerm.equals(text.substring(index, index + 1))) {
      appearances[appearanceNum] = index;
      appearanceNum ++;
    }
  }
  return appearances;
}

public static boolean hasRepeatedConsecutives(String word) {
  boolean twoLetters = false;
  int index = 0;
  for (index = 0; index < word.length() - 1; index ++) {
    if (word.substring(index, index + 1).equals(word.substring(index + 1, index + 2))) {
      twoLetters = true;
    }
  }




  return twoLetters;
}

public static String reverseWords(String phrase) {
  int index = phrase.length();
  for (index = phrase.length(); index >= 0; index--) {

  }

}
  public static void main(String[] args) {
    //System.out.println(reverseCharacters("academy"));
    //System.out.println(Arrays.toString(indexesOfAll("attack", "t")));
    //System.out.println(hasRepeatedConsecutives("bookkeeper"));
    System.out.println(reverseWords("the quick brown fox"));
    
  }
}