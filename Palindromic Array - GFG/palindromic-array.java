//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
// Method 1
class GfG
{
    
	public static int palinArray(int[] a, int n)
       {
              //add code here.
              for(int i=0;i<n;i++)
              {
                  int num = a[i];
                  int original_num = num;
                  int reverse = 0;
                  while(num!=0){
                      reverse = (reverse*10) + num%10;
                      num = num/10;
                  }
                  
                  if(original_num!=reverse)
                    return 0;
              }
              return 1;
       }
}

// Method 2

// class GfG
// {
    
//     public static boolean isPalindrome(int a){
//         int num = 0;
//         int value = a;
//         if(a==0){
//             return true;
//         }
        
//         while(a>0){
//             num = (num*10) + a%10;
//             a = a/10;
//         }
        
//         if(num == value){
//             return true;
//         }
//         return false;
//     }
    
// 	public static int palinArray(int[] a, int n)
//           {
//                   //add code here.
//                   for(int i=0;i<n;i++)
//                   {
//                       if(!isPalindrome(a[i])){
//                           return 0;
//                       }
//                   }
//                   return 1;
//           }
// }






