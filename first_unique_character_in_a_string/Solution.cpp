class Solution {
    public int firstUniqChar(String s) {
        int key = 0;
        HashMap<Character,Integer> uniqueTable = new HashMap<Character,Integer>();
        char []word = s.toCharArray();
        for(int i=0;i<word.length;i++){

            if(uniqueTable.containsKey(word[i])){
                int count = uniqueTable.get(word[i]);
                uniqueTable.put(word[i],count+1);
            }else{
                uniqueTable.put(word[i],1);
            }
        }
        
        if(uniqueTable.isEmpty()){
            return -1;
        }
        Double min = Double.POSITIVE_INFINITY;
        for(HashMap.Entry<Character,Integer>entry:uniqueTable.entrySet()){
            if(entry.getValue() == 1){
                key = entry.getKey();
                for(int i=0;i<word.length;i++){
                    if(word[i] == key){
                        if(i<min){
                            min = (double)i;
                        }
                    }
                }
            }
        }
        if(min == Double.POSITIVE_INFINITY){
            return -1;
        }

        Double newData = new Double(min);
        return newData.intValue();
    }
}