
public class ParseInt {
    public static int parseDigit (char d) {
        return (int)(d - '0');
    }
    
    public static int parseDigit (String s, int i) {
    	return parseDigit(s.charAt(i));
    }
    
    public static int parseInt(String s){
    	int i = 0;
        int num = 0;
        boolean isNeg = false;
        
        if (s.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }
       
        while( i < s.length()) {
            num *= 10;
            num += s.charAt(i++) - '0';
        }
        
        if (isNeg)
            num = -num;
        return num;
    }
}
