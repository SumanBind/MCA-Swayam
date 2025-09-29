class Solution 
{
    public int[][] imageSmoother(int[][] img) 
    {
        int s=0,m=img.length,n=img[0].length;
        int[][] a=new int[m][n];
        if(m==1&&n==1)
        return img;
        if(m==1)
        {
            for(int i=0;i<n;i++)
            {
                s=0;
                if(i==0)
                {
                    s+=img[0][i]+img[0][i+1];
                    a[0][i]=s/2;
                }
                else if(i==n-1)
                {
                    s+=img[0][i]+img[0][i-1];
                    a[0][i]=s/2;
                }
                else{
                    s+=img[0][i-1]+img[0][i]+img[0][i+1];
                    a[0][i]=s/3;
                }
            }
            return a;
        }
        if(n==1)
        {
            for(int i=0;i<m;i++)
            {
                s=0;
                if(i==0)
                {
                    s+=img[i][0]+img[i+1][0];
                    a[i][0]=s/2;
                }
                else if(i==m-1)
                {
                    s+=img[i][0]+img[i-1][0];
                    a[i][0]=s/2;
                }
                else{
                    s+=img[i-1][0]+img[i][0]+img[i+1][0];
                    a[i][0]=s/3;
                }
            }
            return a;
        }
        for(int i=0;i<n;i++)
        {
            s=0;
            if(i==0)
            {
                s+=img[0][i]+img[0][i+1]+img[1][0]+img[1][i+1];
                a[0][i]=s/4;
            }
            else if(i==n-1)
            {
                s+=img[0][i]+img[0][i-1]+img[1][i]+img[1][i-1];
                a[0][i]=s/4;
            }
            else{
                s+=img[0][i]+img[0][i-1]+img[0][i+1]+img[1][i]+img[1][i-1]+img[1][i+1];
                a[0][i]=s/6;
            }
        }
        for(int i=1;i<m-1;i++)
        {
            for(int j=0;j<n;j++)
            {
            s=0;
            if(j==0)
            {
                s+=img[i][j]+img[i][j+1]+img[i-1][j]+img[i-1][j+1]+img[i+1][j]+img[i+1][j+1];
                a[i][j]=s/6;
            }
            else if(j==n-1)
            {
                s+=img[i][j]+img[i][j-1]+img[i-1][j]+img[i-1][j-1]+img[i+1][j]+img[i+1][j-1];
                a[i][j]=s/6;
            }
            else{
                 s+=img[i][j]+img[i][j-1]+img[i][j+1]+img[i-1][j]+img[i-1][j-1]+img[i-1][j+1]+img[i+1][j]+img[i+1][j-1]+img[i+1][j+1];
                a[i][j]=s/9;
            }
            }
        }
        for(int i=0;i<n;i++)
        {
            s=0;
            if(i==0)
            {
                s+=img[m-1][i]+img[m-1][i+1]+img[m-2][i]+img[m-2][i+1];
                a[m-1][i]=s/4;
            }
            else if(i==n-1)
            {
                s+=img[m-1][i]+img[m-1][i-1]+img[m-2][i]+img[m-2][i-1];
                a[m-1][i]=s/4;
            }
            else{
                s+=img[m-1][i]+img[m-1][i-1]+img[m-1][i+1]+img[m-2][i]+img[m-2][i-1]+img[m-2][i+1];
                a[m-1][i]=s/6;
            }
        }
        return a;
    }
}
