class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // hash map -> String ,List<String>
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] str=strs[i].toCharArray();
            Arrays.sort(str);
            String a=Arrays.toString(str);
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<>(Arrays.asList(strs[i])));
            }else{
                List list=map.get(a);
                list.add(strs[i]);
            }
        }
        List<List<String>> result=new ArrayList<>(map.values());
        return result;
    }
}
