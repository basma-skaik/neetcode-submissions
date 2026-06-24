class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            if(!group.containsKey(sortedWord)){
                group.put(sortedWord, new ArrayList<>());
            }
            group.get(sortedWord).add(strs[i]);
        }
        
        return new ArrayList<>(group.values());
    }
}
