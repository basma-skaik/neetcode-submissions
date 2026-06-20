// s="jar" length = 3
// t="jam" length = 3
// sChars = ['j','a','r']
// tChars = ['j','a','m']
// After sorting: 
// sChars = ['a','j','r']
// tChars = ['a','j','m']
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar,tChar);
    }
}
