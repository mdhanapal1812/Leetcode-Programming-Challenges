class Solution {
    public List<String> topKFrequent(String[] words, int k) {
     
        HashMap<String,Integer>map = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                int key = map.get(words[i]);
                map.put(words[i],key+1);
            }else{
                map.put(words[i],1);
            }
        }
        
        List<String> resultant = new ArrayList(map.keySet());
        Collections.sort(resultant,(word1,word2)->map.get(word1).equals(map.get(word2)) ?
                        word1.compareTo(word2) : map.get(word2) -map.get(word1));
        
        return resultant.subList(0,k);
    }
}