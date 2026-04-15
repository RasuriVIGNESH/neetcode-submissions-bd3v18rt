class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] result=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums)map.put(i,map.getOrDefault(i,0)+1);
        Queue<Integer>pq=new PriorityQueue<>((b,a)-> (map.get(a)-map.get(b)));
        for(int i:map.keySet())pq.add(i);
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }
        return result;
    }
}
