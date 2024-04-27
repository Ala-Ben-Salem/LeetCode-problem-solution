import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public int romanToInt(String s) {

        Map<Character, Integer> res = new LinkedHashMap<>();
        res.put('I',1);
        res.put('V',5);
        res.put('X',10);
        res.put('L',50);
        res.put('C',100);
        res.put('D',500);
        res.put('M',1000);
        System.out.println(res);

        int ans=0;
        ans=res.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            if(res.get(s.charAt(i))>=res.get(s.charAt(i+1)))
            {
                ans=ans+res.get(s.charAt(i));
            }
            else
            {
                ans=ans-res.get(s.charAt(i));
            }
        }

        return ans;
    }
}