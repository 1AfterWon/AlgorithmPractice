class Solution {
    public String solution(String s) {
        String answer = "";
        
        //1. s를 모두 소문자로 만든다.
        s=s.toLowerCase();
        
        //2. idx를 이용해서 공백을 만나면 idx를 0으로 초기화 하면서 첫 문자를 판독한다.
		int idx=0;
		for(int i=0;i<s.length();i++) {
            // 알파벳이면 대문자로 넣어주고 idx를 1로 설정, 숫자면 그냥 넣어주기
			if(idx==0) {
				if('a'<=s.charAt(i)&&s.charAt(i)<='z') {
					answer+=(char)(s.charAt(i)-32);
					idx++;
				}else {
					answer+=s.charAt(i);
					idx++;
				}
            //idx가 0이 아니면 그냥 answer에 더해준다.
			}else {
				answer+=s.charAt(i);	
			}
            //만약 i번째 문자가 공백이면 idx를 0으로 바꿔 맨 처음 if 문을 활성화 시킨다
			if(s.charAt(i)==' ') {idx=0;}
		}
        
        return answer;
    }
}