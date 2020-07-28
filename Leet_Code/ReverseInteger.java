class Solution {
    public int reverse(int x) {
        
        String rev = String.valueOf(x);
        String rev2 = "";
        String rev3 = "";
        long check = 0;
        
        for(int y = rev.length(); y > 0; y--)
        {
            rev2 += rev.charAt(y-1);
        }
        
        
        if(rev2.indexOf('-') != -1)
        {
            rev = "-";
            rev += rev2.substring(0,rev2.length()-1);
            rev2 = rev;
         
        }
            
    
        
        check = Long.parseLong(rev2);
        
       if((check > 2147483647) || (check < -2147483647))
            return 0;
        
        return Integer.parseInt(rev2);
        
    }
}