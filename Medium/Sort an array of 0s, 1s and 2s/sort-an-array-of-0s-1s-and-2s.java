//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int start = 0;
        int mid = 0;
        int end = a.length-1;
        int temp;
        
        while(mid <= end) {
            if(a[mid] == 0) {
                temp = a[start];
                a[start] = a[mid];
                a[mid] = temp;
                start++;
                mid++;
            }
            else if(a[mid] == 2) {
                temp = a[end];
                a[end] = a[mid];
                a[mid] = temp;
                end--;
            }
            else mid++;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends