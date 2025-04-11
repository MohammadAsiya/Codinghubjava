class Question
{
	//for input     a bc def   ghijk    lm nop qrs tuvw
	//s2		     wvut srq pon ml kjihg fed cb a

	//the output  w vu tsr  qponm  lk   jih   gfe dcba
	public static void main(String args[])
	{
		String s1="a bc def ghijk lm nop qrs tuvw";
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s2= sb.toString();
		//System.out.println(s2);//wvut srq pon ml kjihg fed cb a
		int x=0,y=0;
		String s3="";
		while(x<s1.length())
		{
			if(s1.charAt(x)!=' ')
			{
				if(s2.charAt(y)==' ')
				{
					y++;
				}
				s3+=s2.charAt(y);
				y++;
				x++;
			}
			
			else if(s1.charAt(x)==' ')
			{
				s3+=" ";
				x++;
			}
		}
		System.out.println(s3);

		
		
	}
}