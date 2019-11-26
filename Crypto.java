
public class Crypto {
	/**  * Returns a String object that is a copy of cipher with all characters  
	 * that are not letters removed.  
	 * (These include spaces and special  * characters.)  
	 * All letters should be converted to uppercase letters  
	 * null inputs should return an empty String.  *  
	 * @param  plain  the original message  
	 * @return the copy of plain with all of the spaces removed  
	 */
	public static void main ( String [] args )
	{
		backwards("heg");
		caesarShift("GHGSIYD");
		rot13("ght4g");
	}
	public static String lettersOnly(String plain) 
	{
		String str = "";
		//converts it to uppercase
		plain = plain.toUpperCase();
		if (plain.equals(""))
		{
			//returns nothing if the string is empty
			return null;
		}
		for ( int i = 0; i < plain.length(); i++ )
		{
			if ( plain.charAt(i) >= 65 && plain.charAt(i) <= 90 )
			{
				str+=plain.charAt(i);
			}
		}
		return str;
	}
	/**  * Returns a String object that is a copy of plain with a space  
	 * placed after every n characters.  
	 * All original spaces are removed.  
	 * *
	 * null inputs should return an empty String.  
	 * An example of a call to this method is spaceEveryNChars("CAT", 2)
	 * this would result in "CA T"  *  
	 * @param  plain  the original message  * 
	 * @param  n the number of characters before a spaceappears  
	 * @return the copy of plain with a space every n characters  
	 * */
	public static String spaceEveryNChars(String plain, int n) 
	{  
		//add a space every n characters
		String str = "";
		for ( int i  = 0; i < plain.length(); i++ )
		{
			str+=plain.charAt(i);
			if ( (i + 1) % n == 0 ) 
			{
				str+=" ";
				//adds the character you're at by the n digit
			}
		}
		System.out.println(str);
		return str;
	}
	/**  * Returns a String object that has written plain backwards.  *   
	 * * @param  plain  the original message  *
	 *  @return \the message written backwards  */ 
	 public static String backwards(String plain) 
	 { 
		 String str = "";
		 for ( int i = plain.length() - 1; i >= 0; i-- )
		 {
			 str+=plain.charAt(i);
		 }
		 System.out.println(str);
		 return str;
	 } 
	 /**  * Returns a String with each character shifted by 3.  *   * 
	  * @param  plain  the original message  * 
	  * @return the message with each character shifted by 3  */
	 public static String caesarShift(String plain) {  
		 //TODO Come back and finish caesarShift and fix the returnreturn null; 
		 String str = "";
		  for(int i = 0; i < plain.length(); i++) 
		  {
		    char c = (char) (plain.charAt(i));
		    if (c >= 'A' && c <= 'Z') 
		    {     
		      str += (char)((c - 'A' + 3) % 26 + 'A');
		    } 
		    else if (c >= 'a' && c <= 'z') 
		    {
		      str += (char)((c - 'a' + 3) % 26 + 'a');
		    } 
		    else {
		      str += c;
		    }
		  }
		  System.out.println(str);
		  return str;
	 }
	 /**  
	  * * 
	  * Returns a String with each character shifted by n.  *   
	  * * @param  plain  the original message  * 
	  * @param  n      the number of characters to shift each char in plain  * 
	  * @return        the message with each character shifted by n 
	  */ 
	 	public static String caesarShift(String plain, int shift) {
		  String str = "";
		  for(int i = 0; i < plain.length(); i++) 
		  {
		    char c = (plain.charAt(i));
		    if (c >= 'A' && c <= 'Z') 
		    {     
		      str += (char)((c - 'A' + shift) % 26 + 'A');
		    } 
		    else if (c >= 'a' && c <= 'z') 
		    {
		      str += (char)((c - 'a' + shift) % 26 + 'a');
		    } 
		    else {
		      str += c;
		    }
		  }
		  System.out.println(str);
		  return str;
	 	}
	 	/**  * Returns a String with each character shifted by 13.   
	 	 * * @param  plain  the original message  * @return        
	 	 * the message with each character shifted by 13  
	 	 * */ 
	 	public static String rot13(String plain) { 
	 		return caesarShift( plain , 13 );
	 	}
}
