public class Main
{
	public static void main(String[] args) {
		
        int Roman = 0; 
        
        String s = "III";
        
        for(int x = 0; x < s.length(); x++)
        {
            if(x != (s.length() - 1))
            {
                if(numconverter(s.charAt(x)) >= numconverter(s.charAt(x + 1)))
                {
                    Roman = Roman + numconverter(s.charAt(x));
                }
                else
                    Roman = Roman - numconverter(s.charAt(x));
            }
            else
                Roman = Roman + numconverter(s.charAt(x));
        }
        
        System.out.println(Roman);
	}
	
	public static int numconverter(char letter)
    {
        if(letter == 'I')
            return 1;
        if(letter == 'V')
            return 5;
        if(letter == 'X')
            return 10;
        if(letter == 'L')
            return 50;
        if(letter == 'C')
            return 100;
        if(letter == 'D')
            return 500;
        if(letter == 'M')
            return 1000;
        else
            return 0;
        
    }

	
}
