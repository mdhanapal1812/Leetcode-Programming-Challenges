class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    
 void mergeSort(int []array,int l,int r){
     if(l<r){
        int  m = (l+r)/2;
         mergeSort(array,l,m);
         mergeSort(array,m+1,r);
         merge(array,l,m,r);
     }
 }
    
    void merge(int []array,int l,int m, int r){
        int len1 = m-l+1;
        int len2 = r-m;
        
        int[] tempL = new int[len1];
        int[] tempR = new int[len2];
        
        for(int i=0;i<len1;++i){
            tempL[i] = array[l+i];
        }
        
        for(int i=0;i<len2;++i){
            tempR[i] = array[m+1+i];
        }
        
        int i=0;
        int j=0;
        int k=l;
        while(i<len1 && j<len2){
            if(tempL[i] <= tempR[j]){
                array[k] = tempL[i];
                i++;
            }else{
                array[k] = tempR[j];
                j++;
            }
            k++;
        }
        
        while(i<len1){
            array[k] = tempL[i];
            i++;
            k++;
        }
        
        while(j<len2){
            array[k] = tempR[j];
            j++;
            k++;
        }
    }
}