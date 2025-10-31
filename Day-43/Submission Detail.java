import java.util.*;

public class Solution
  {
    public String simplifyPath(String path) 
    {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");

        for (String dir : directories) 
        {
            if (dir.equals(".") || dir.isEmpty()) 
            {
                continue;
            } else if (dir.equals("..")) 
            {
                if (!stack.isEmpty()) 
                {
                    stack.pop();
                }
            } 
            else 
            {
                stack.push(dir);
            }
        }

        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a Unix path: ");
        String path = sc.nextLine();

        String result = sol.simplifyPath(path);
        System.out.println("Simplified path: " + result);

        sc.close();
    }
}
