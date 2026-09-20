class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(bucket[map.get(key)]==null){
                bucket[map.get(key)]=new ArrayList<>();
            }
            bucket[map.get(key)].add(key);
        }
        int ans[]=new int[k];
        int j=0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int num : bucket[i]){
                    if(j==k){
                        break;
                    }
                    ans[j++]=num;
                }
                
            }
        }
        return ans;
    }
}
