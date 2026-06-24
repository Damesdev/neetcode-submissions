class Solution {
    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }
        if(strs.size() == 1 && strs.get(0).isEmpty()) {
            return " ";
        }
        return String.join("--!#%", strs);
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) {
            return new ArrayList<>();
        }
        if(str.equals(" ")) {
            return Arrays.asList("");
        }
        return Arrays.asList(str.split("--!#%",-1));
    }
}