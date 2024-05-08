//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node){
    	ArrayList<Integer> arr = new ArrayList<>();	
    	if(node == null)
    	    return arr;
    	    
    	if(isLeaf(node) == false){
    		arr.add(node.data);
    	}
    	leftTraverse(node, arr);
    	leafTraverse(node, arr);
    	rightTraverse(node, arr);
    	return arr;
    }

    boolean isLeaf(Node node){
    	if(node.left == null && node.right==null)
    		return true;
    	return false;
    }
    
    void leftTraverse(Node node, ArrayList<Integer> arr){
    	Node current = node.left;
    	while(current!=null){
    		if(isLeaf(current) == false){
    			arr.add(current.data);
    		}
    		if(current.left!=null){
    			current = current.left;
    		}
    		else{
    			current = current.right;
    		}
    	}
    }
    
    void leafTraverse(Node node, ArrayList<Integer> arr){
        if(node == null)
            return;
            
    	if(isLeaf(node)){
    		arr.add(node.data);
    		return;
    	}
    	if(node.left !=null){
    		leafTraverse(node.left, arr);
    	}
    	if(node.right !=null){
    		leafTraverse(node.right, arr);
    	}
    }
    
    void rightTraverse(Node node, ArrayList<Integer> arr){
    	Node current = node.right;
    	Stack<Integer> stack = new Stack();
    	while(current!=null){
    		if(isLeaf(current) == false){
    			stack.push(current.data);
            }
            if(current.right!=null){
            	current = current.right;
            }
            else{
            	current = current.left;
            }
        }
        
    // 	for(int i=0;i<stack.size();i++){
    // 		arr.add(stack.pop());
    // 	}
        while(!stack.isEmpty()){
            arr.add(stack.peek());
            stack.pop();
        }
        	
    }

}
