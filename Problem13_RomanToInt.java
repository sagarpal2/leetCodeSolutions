class Solution {
    public int romanToInt(String s) {
        int sum = 0;
		int[] num = {1, 5, 10, 50, 100, 500, 1000};
        String st = "IVXLCDM";
        for(int i = 0; i < s.length(); i++){
        	if((i+1)==s.length()) {
        		sum += num[st.indexOf(s.charAt(i))];
        		break;
        	}
        	else if(st.indexOf(s.charAt(i+1))>st.indexOf(s.charAt(i))) {
            	sum -= num[st.indexOf(s.charAt(i))];
            }
            else {
            	sum += num[st.indexOf(s.charAt(i))];
            }
        }
        return sum;
    }
}