public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        HashSet<Character>characters = new HashSet<>();
        int max = 0;
        while(j <s.length()){
            if(characters.contains(s.charAt(j))){
                characters.remove(s.charAt(i));
                i++;
            }else{
                characters.add(s.charAt(j));
                j++;
                max = Math.max(max,characters.size());
            }
        }
        return max;
    }
}