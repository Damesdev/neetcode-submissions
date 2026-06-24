class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap();

        for(String string : strs){
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }

        return new ArrayList<List<String>>(anagrams.values());
    }
}
