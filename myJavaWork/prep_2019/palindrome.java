package prep_2019;

public class palindrome {
	
	public static void main(String args[]) {
		
		System.out.println(ispalindrome("abhishek"));
		System.out.println(ispalindrome("abcdcba"));
		System.out.println(ispalindrome("11abcdcba11"));
		System.out.println(ispalindrome("3311abcdcba1135"));
	}
	
	public static boolean ispalindrome(String st) {
		
		System.out.println(st.length());
		int strLength= st.length();		
		for(int i=0; i<(st.length()/2); i++) {
					if(st.charAt(i) != st.charAt(st.length()-i-1))
				return false;
		}
		return true;		
	}
}
