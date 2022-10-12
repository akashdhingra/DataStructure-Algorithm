// Method 4 - Dyanamic Programming
// Known as Tabulation
// It is also called bottom-up approach
// It will calculate f(0), f(1), f(2)..... and so on
class Solution {
    public int fib(int n) {
        int f[] = new int[n+1];
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}


// Method 3 - Dynamic Programming method 
// knows as Memoization
// It is also called top-down approach
// It will calculate f(n), f(n-1), f(n-2)..... and so on
// Where we save the calculate value
// so that there is no need to calculate the same value again and again.
// class Solution {
//     public int fib(int n) {
//         int memo[] = new int[n+1];
//         Arrays.fill(memo,-1);
//         if(memo[n]==-1)
//         {  
//             int res;
//             if(n==0 || n==1)
//                 return n;
//             else
//                 res = fib(n-1) + fib(n-2);
//             memo[n] = res;
            
//         }
//         return memo[n];
//     }
// }


// Method 2 - Recursion
// class Solution {
//     public int fib(int n) {
//         if(n==0)
//             return 0;
//         if(n==1 || n==2)
//             return 1;
        
//         return fib(n-1) + fib(n-2);
//     }
// }



// Method 1 - Naive Method
// class Solution {
//     public int fib(int n) {
//         int a=0;
//         int b=1;
//         if(n==0)
//             return 0;
//         if(n==1 || n==2)
//             return 1;
//         else
//         {
            
//             for(int i=1;i<n;i++)
//             {
//                 int temp = b;
//                 b = a+b;
//                 a = temp;
//             }
//         }
//         return b;
        
//     }
// }