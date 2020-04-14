class Solution {
    public boolean isAnagram(String s, String t) {
        int i;
        int a[] = new int[255];
        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();
        for(i=0;i<firstWord.length;i++){
            int value = firstWord[i];
            a[value]++;
        }
        for(i = 0;i<secondWord.length;i++){
            int value = secondWord[i];
            a[value]--;
        }
        
        for(i=0;i<a.length;i++){
            if(a[i] != 0){
                return false;
            }
        }
        
        return true;
    }
}