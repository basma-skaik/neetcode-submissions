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

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
