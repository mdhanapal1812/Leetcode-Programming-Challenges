class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        
        HashMap<Integer,Integer> inter = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
            if(inter.containsKey(nums1[i])){

                int count = inter.get(nums1[i]);
                inter.put(nums1[i],count+1);
            }else{
      
                inter.put(nums1[i],1);
            }
        }
        
        int k = 0;
        for(int i=0;i<nums2.length;i++){
            if(inter.containsKey(nums2[i])){
                int count = inter.get(nums2[i]);
                if(count >0){
                inter.put(nums2[i],count-1);
                nums1[k++] = nums2[i];
                }
            }
        }
        
        
        return Arrays.copyOfRange(nums1,0,k);
     
    }
}