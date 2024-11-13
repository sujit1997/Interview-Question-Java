class Solution {
    public void reverseString(char[] s) {
        int start=0, end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;

        }
        
    }
}
	public class Reverse {
	public static void main(String[] args){
	Solution solution = new Solution();
	String s = "My name is sujit manmode";
	
	char[] charArray = s.toCharArray();
	
	solution.reverseString(charArray);

	System.out.println(new String(charArray));
}

}