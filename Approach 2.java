class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        //Hashmap with frequecies
         for(int num: arr){
             map.put(num, map.getOrDefault(num,0)+1);
         }
        //Set set to store only frequencies
        Set<Integer> set=new HashSet<>(map.values());

        //Check if sizes are unique
        return map.size() == set.size();

    }
}
