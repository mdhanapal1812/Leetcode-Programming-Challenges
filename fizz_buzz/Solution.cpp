class Solution {
    public List<String> fizzBuzz(int n) {
        int add = 0;
        int div3 = 0;
        int div5 = 0;
        int temp;
        List<String> numbers = new ArrayList<String>();
        for(int i=1;i<=n;i++){
           if((i%3 == 0) && (i%5 ==0)){
               numbers.add("FizzBuzz");
           }else if(i%3 == 0){
               numbers.add("Fizz");
           }else if(i%5 ==0){
               numbers.add("Buzz");
           }else{
               numbers.add(Integer.toString(i));
           }
            
         
        }
    return numbers;
}
}