class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int oleng=0, pleng=0;
		while(true){
			oleng=s.length();
			s=s.replaceAll("0", "");
			pleng=s.length();
			s=Integer.toBinaryString(pleng);
			answer[0]++; answer[1]+=oleng-pleng;
			if(s.equals("1")) break;
		}
        return answer;
    }
}