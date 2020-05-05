class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer>temp = new HashMap<Character,Integer>();
        
        for(int i=0;i<J.length();i++){
            if(temp.containsKey(J.charAt(i))){
                int incr = temp.get(J.charAt(i));
                temp.put(J.charAt(i),incr+1);
            }else{
                temp.put(J.charAt(i),1);
            }
        }
        int result = 0;
        
        for(int j = 0;j<S.length();j++){
            if(temp.containsKey(S.charAt(j))){
                result++;
            }
        }
        return result;
    }
}