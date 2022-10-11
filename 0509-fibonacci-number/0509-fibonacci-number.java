// Method 2 - Recursion
class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        
        return fib(n-1) + fib(n-2);
    }
}



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