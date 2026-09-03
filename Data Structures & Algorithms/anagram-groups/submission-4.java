class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> responseMap = new HashMap();
        for(String string : strs){
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            responseMap.putIfAbsent(sortedString, new ArrayList<>());
            responseMap.get(sortedString).add(string);
        }
        return new ArrayList<>(responseMap.values());
    }
}
