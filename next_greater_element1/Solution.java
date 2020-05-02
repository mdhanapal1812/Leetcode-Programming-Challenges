class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        int found = 0;
        int k;
        for(int i=0;i<=nums1.length-1;i++){
            for(int j=0;j<=nums2.length-1;j++){
                if(nums1[i] == nums2[j]){
                    
                    for(k= j+1;k<=nums2.length-1;k++){
                        if(nums2[k] > nums2[j]){
                            found = 1;
                            break;
                        }
                    }
                    
                    if(found == 1){
                    output[i] = nums2[k];
                    }else{
                        output[i] = -1;
                    }
                    found = 0;
                    break;
                }
            }
        }
        
        return output;
    }
}