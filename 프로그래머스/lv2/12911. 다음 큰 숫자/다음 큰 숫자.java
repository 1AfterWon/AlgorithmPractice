class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //1. answer를 2진수로 바꾼 후 0을 제거한 length를 구한다(=1의 개수)
        //int tt=Integer.toBinaryString(n).replaceAll("0", "").length();
        int tt=Integer.bitCount(n);
		//2. n+1부터 반복문을 돌려 tt와 길이가 같은 수를 구한다
        for(int i=n+1;;i++) {
			//if(Integer.toBinaryString(i).replaceAll("0", "").length()==tt) 
            if(Integer.bitCount(i)==tt){
				answer=i; break;
			}
            
		}
        
        //2진법으로 변경하고 0없애고 길이구하면 너무 비효율적이다! --> bitCount로 수정!
        return answer;
    }
}