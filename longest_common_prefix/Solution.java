class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
        System.out.println("prefix is : "+prefix);
    for (int i = 1; i < strs.length; i++) {
        
        while (strs[i].indexOf(prefix) != 0) {
            System.out.println("string is : "+strs[i]);
            System.out.println("indexof"+strs[i].indexOf(prefix));
            prefix = prefix.substring(0, prefix.length() - 1);
            System.out.println("prefix is :" +prefix);
            if (prefix.isEmpty()) return "";
        } 
    }
    return prefix;
    }
}