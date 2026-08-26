class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> partnerMap = new HashMap<>();
        partnerMap.put('(', ')');
        partnerMap.put('{', '}');
        partnerMap.put('[', ']');

        List<Character> stack = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(partnerMap.containsKey(curr)){
                stack.add(curr);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                
                char lastOpening = stack.remove(stack.size() - 1);
                if(partnerMap.get(lastOpening) != curr){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
