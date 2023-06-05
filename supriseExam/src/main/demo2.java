package main;
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



public class demo2 {
	static int uniqueChar(String s) {
		for(char i:s.toCharArray()) {
			if(s.indexOf(i)==s.lastIndexOf(i)) {
				return s.indexOf(i);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbc";
		System.out.println(uniqueChar(s));
		

	}

}
