public class Main {
    public int strStr(String haystack, String needle) {
        int a1=haystack.length();
        int a2=needle.length();
        int res2=0;
        int res=-1;
        if(haystack.length() < needle.length())
            return res;
        else{
            for(int j=0;j<=a1-a2 ;j++)
            {
                if(haystack.substring(j,j+a2).equals(needle))
                {
                    res2=j;
                    break;
                }
                else res2=-1;
            }
        }
        return res2;
    }
}