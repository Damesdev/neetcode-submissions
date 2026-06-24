class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap();
        bucketSort(nums, numCount);

        int[] res = getTopKElements(numCount, k);
        return res;
    }

    private void bucketSort(int[] nums, Map<Integer, Integer> bucket){
        for(int num : nums){
            bucket.put(num, bucket.getOrDefault(num, 0) + 1);
        }
    }

    private int[] getTopKElements(Map<Integer, Integer> numCount, int k){
        int[] res = new int[k];
        int index = 0;

        while(!numCount.isEmpty() && index < k){
            int maxCount = Collections.max(numCount.values());

            Integer keyToRemove = null;
            for(Map.Entry<Integer, Integer> entry : numCount.entrySet()){
                if(entry.getValue() == maxCount){
                    res[index++] = entry.getKey();
                    keyToRemove = entry.getKey();
                    break;
                }
            }

            if(keyToRemove != null){
                numCount.remove(keyToRemove);
            }
        }
        return res;
    }
}
