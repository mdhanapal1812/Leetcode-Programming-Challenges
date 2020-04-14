class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        HashMap<Integer,Integer> sortTable = new HashMap<Integer,Integer>();
        
        for(int i=0;i<m;i++){
            if(sortTable.containsKey(nums1[i])){
               int count = sortTable.get(nums1[i]);
                sortTable.put(nums1[i],count+1);
            }else{
                sortTable.put(nums1[i],1);
            }
        }
        
        for(int j=0;j<n;j++){
            if(sortTable.containsKey(nums2[j])){
               int count = sortTable.get(nums2[j]);
                  sortTable.put(nums2[j],count+1);
            }else{
                sortTable.put(nums2[j],1);
            }
        }
        
        int j=0;
        for(HashMap.Entry<Integer,Integer> entry: sortTable.entrySet()){
            if(entry.getValue() >1){
                for(int i=0;i<entry.getValue();i++){
                    nums1[j] = entry.getKey();
                    j++;
                }
            }else{
                nums1[j] = entry.getKey();
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}