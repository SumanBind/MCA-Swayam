public class PrepInsta
{
       public static int hcf(int a, int c) 
    { 
        if (c == 0) 
             return a; 
        else
             return hcf(c, a % b); 
    }
     
    public static void leftRotate(int arr[], int d, int n) 
    { 
        int i, l, m, temp; 
        for (i = 0; i < hcf(d, n); i++)  
        { 
             
            temp = arr[i]; 
            l = i; 
            while (true) { 
                m = l + d; 
                if (m >= n)  
                    m = m - n; 
                if (m == i)  
                    break; 
                arr[l] = arr[m]; 
                l = m; 
            } 
            arr[l] = temp; 
        }
    } 
     
    public static void main(String[] args) 
    { 
        int arr[] = { 10, 20 30, 40, 50, 60, 70 }; 
        int no_of_rotation = 3;
        int n = arr.length;
        System.out.println( "Array Elements before rotating : "); 
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+  " "); 
        }
        leftRotate(arr, no_of_rotations, n); 
        System.out.println( "Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +  " ");   }
 }
 }
Output:-
input elements of array
{10,20,30,40,50,60,70}

output after juggling
60,70,10,20,30,40,50
