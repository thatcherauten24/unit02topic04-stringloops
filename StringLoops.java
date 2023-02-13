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

public static void indexesOfAll(String text, String searchTerm){
  int[] appearances = new int[] {};
  int index = 0;
  for (index = 0; index <= text.length(); index ++) {
    if (searchTerm.equals(text.substring(index, index + 1))) {
      appearances[index] = index;
    }
  }
  Arrays.toString(appearances);
} 
  public static void main(String[] args) {
indexesOfAll("attack", "a");
  
  }
}