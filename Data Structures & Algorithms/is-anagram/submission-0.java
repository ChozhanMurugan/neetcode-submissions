
class Solution {
    public boolean isAnagram(String s, String t) {
   char ch1[]= s.toCharArray();
   char ch2[]= t.toCharArray();
   java.util.Arrays.sort(ch1);
   java.util.Arrays.sort(ch2);
   if (java.util.Arrays.equals(ch1, ch2))
   {
    return true;
   }
   else
   {
    return false;
   }
    }
}
