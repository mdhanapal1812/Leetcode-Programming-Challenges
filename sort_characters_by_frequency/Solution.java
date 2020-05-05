class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> result = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(result.containsKey((s.charAt(i)))){
                int k = result.get((s.charAt(i)));
                    result.put((s.charAt(i)),k+1);
            }else{
                result.put((s.charAt(i)),1);
            }
        }
        
        List<Character>characters = new ArrayList<>(result.keySet());
        Collections.sort(characters,(a,b)->result.get(b)-result.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(char c : characters){
            int values = result.get(c);
            for(int i = 0;i<values;i++){
                sb.append(c);
            }
        }
        
        
 
        return sb.toString();
    }
}