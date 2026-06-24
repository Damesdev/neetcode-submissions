class Solution {
    public boolean isAnagram(String s, String t) {
        List<String> listS = new ArrayList<String>(Arrays.asList(s.split("")));
        List<String> listT = new ArrayList<String>(Arrays.asList(t.split("")));

        Collections.sort(listS);
        Collections.sort(listT);

        return listS.equals(listT);
    }
}
