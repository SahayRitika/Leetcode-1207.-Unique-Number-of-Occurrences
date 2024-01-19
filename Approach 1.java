class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            map.put(arr[i],count);
            count=0;
        }
        System.out.println(map);
        List<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            list.add(m.getValue());
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int f=0;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                // System.out.println(list.get(i)+" "+list.get(j));
                if(list.get(i)==list.get(j))
                f++;
            }
            if(f>1)
            return false;
            f=0;
        }
        return true;
    
    }
}
