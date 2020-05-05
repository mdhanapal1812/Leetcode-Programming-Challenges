class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        ArrayList<String>given = new ArrayList<String>();
        char[] chars = paragraph.toCharArray();
        ArrayList<String>bannedWords = new ArrayList<String>();
        
        for(int i= 0;i<banned.length;i++){
            bannedWords.add(banned[i]);
        }
       
        
        String word = "";
        String resultantString = "";
        int max = 0;
        HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
        for(int i=0;i<chars.length;i++){
        
            if(Character.isLetter(chars[i])){
                word = word + chars[i];
                if((i+1 == chars.length) && (resultantString == "")){
                    resultantString = word.toLowerCase();
                }
            }else{
                if(word != ""){
                  String lower = word.toLowerCase();
                    given.add(lower);
                    if(!bannedWords.contains(lower)){
                
                        if(wordCount.containsKey(lower)){
                            int k = wordCount.get(lower);
                            wordCount.put(lower,k+1);
                            if((k+1) > max){
                                max = k+1;
                                resultantString = lower;
                            }
                        }else{
                            if(max == 0){
                               max = 1;
                                resultantString = lower;
                            }
                            wordCount.put(lower,1);
                        }
                    }
                 word = "";   
                }
                
            }
        }
        
        System.out.println(" given is : "+given);
        
        return resultantString;
        
    }
}