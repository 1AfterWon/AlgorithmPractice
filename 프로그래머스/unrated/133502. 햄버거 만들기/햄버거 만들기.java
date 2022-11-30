import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        //해법의 큰 틀
        //1. String builder에 ingredient를 하나씩 넣어줌
		//2. String builder에 1231 있으면 제거
		//3. indexOf가 0이상이면 어딘가 생겼다는 것
        //1~2단계를 하나의 for문에 동작시키면 1231 생기는 순간이 맨 끝이다. --> 끝에서 4개 제거
        
        
        StringBuilder sb=new StringBuilder();
   
        for(int a:ingredient) {
			sb.append(a);
			if(sb.length()>3 && 
                //indexOf를 쓰면 시간초과가 뜬다! 
                //subSequence로 확인해야 하는듯.. index 구하고 반환하고 하는게 오래걸리는거같다
               sb.subSequence(sb.length()-4, sb.length()).equals("1231")){
				sb.delete(sb.length()-4, sb.length());
				answer++;
			}
		}
        
        
        return answer;
    }
}
