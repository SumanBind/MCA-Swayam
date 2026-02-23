class Solution 
{
    public String decodeString(String s) 
    {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNum = 0;

        for (int i = 0; i < s.length(); i++) 
        {

            char ch = s.charAt(i);

            if (Character.isDigit(ch))
            {
                currentNum = currentNum * 10 + (ch - '0');
            }

            else if (ch == '[') 
            {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentNum = 0;
                currentString = "";
            }

            else if (ch == ']') 
            {
                int repeatTimes = countStack.pop();
                String prevString = stringStack.pop();
                
                String temp = "";
                for (int j = 0; j < repeatTimes; j++) 
                {
                    temp = temp + currentString;
                }

                currentString = prevString + temp;
            }

            else 
            {
                currentString = currentString + ch;
            }
        }
        return currentString;
    }
}
