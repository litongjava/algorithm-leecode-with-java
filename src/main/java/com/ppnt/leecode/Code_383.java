package com.ppnt.leecode;

/**
 * @author Ping E Lee
 *
 */
public class Code_383 {

  public static void main(String[] args) {
    Code_383 code = new Code_383();
    Solution solution = code.new Solution();
    String ransomNote = "a", magazine = "b";
    System.out.println(solution.canConstruct(ransomNote, magazine));
    ransomNote = "aa";
    magazine = "ab";
    System.out.println(solution.canConstruct(ransomNote, magazine));
    ransomNote = "aa";
    magazine = "aab";
    System.out.println(solution.canConstruct(ransomNote, magazine));
    ransomNote = "aab";
    magazine = "baa";
    // 期望结果也是true
    System.out.println(solution.canConstruct(ransomNote, magazine));
    ransomNote = "a";
    magazine = "b";
    System.out.println(solution.canConstruct(ransomNote, magazine));
    ransomNote = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    magazine = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    System.out.println(solution.canConstruct(ransomNote, magazine));
  }

  class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int length = ransomNote.length();
      int length2 = magazine.length();
      
      if (length > length2) {
        return false;
      }
      if(length2<2) {
        return ransomNote.equals(magazine);
      }
      short[] cnt = new short[26];
      for (int i = 0; i < length2; i++) {
        cnt[magazine.charAt(i) - 'a']++;
      }
      for (int i = 0; i < length; i++) {
        int index = ransomNote.charAt(i) - 'a';
        cnt[index]--;
        if (cnt[index] < 0) {
          return false;
        }
      }
      return true;
    }
  }
}
