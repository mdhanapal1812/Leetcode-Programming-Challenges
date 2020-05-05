class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   
        HashMap<String,List> hash = new HashMap<String,List>();
        
        for(int i=0;i<strs.length;i++){
            char []given = strs[i].toCharArray();
            Arrays.sort(given);
            String check = String.valueOf(given);
            List<String> toAdd = new ArrayList<String>();
            if(!hash.containsKey(check)){


            hash.put(check,new ArrayList());
             

            }
               hash.get(check).add(strs[i]);
           
            }
         
        
        return new ArrayList(hash.values());

    }
}