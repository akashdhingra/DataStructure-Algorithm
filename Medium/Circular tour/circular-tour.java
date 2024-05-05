//{ Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}
// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	int totalPetrol = 0; // Total surplus petrol
        int currentPetrol = 0; // Current surplus petrol
        int start = 0; // Potential starting point

        // First loop: from the beginning to the end
        for (int i = 0; i < petrol.length; i++) {
            int surplus = petrol[i] - distance[i]; // Petrol available at current petrol pump
            totalPetrol += surplus; // Add to total surplus petrol
            currentPetrol += surplus; // Add to current surplus petrol

            // If the current surplus petrol is negative, reset and move the potential starting point
            if (currentPetrol < 0) {
                currentPetrol = 0;
                start = i + 1;
            }
        }

        // If the total surplus petrol is negative or zero, return -1
        if (totalPetrol < 0 || start == petrol.length) return -1;

        // Otherwise, return the potential starting point
        return start;
    }
}