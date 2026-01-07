class Solution 
{
    public String dayOfTheWeek(int day, int month, int year) 
    {
        String[] days = {
            "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday", "Thursday"
        };

        int[] monthDays = {
            31,28,31,30,31,30,
            31,31,30,31,30,31
        };

        int total = 0;

        for(int y = 1971; y < year; y++) 
        {
            if(isLeap(y)) total += 366;
            else total += 365;
        }
        for(int m = 1; m < month; m++) 
        {
            total += monthDays[m - 1];
            if(m == 2 && isLeap(year)) total++; 
        }
        total += day - 1;

        return days[total % 7];
    }

    boolean isLeap(int y) 
    {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400== 0);
    }
}
 
    
