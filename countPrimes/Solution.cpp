class Solution {
public:
     
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 
  
    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (int i = 5; i * i <= n; i = i + 6) 
        if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
  
    return true; 
    }
    
    int countPrimes(int n) {
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        
        return count;
    }
};