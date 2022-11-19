class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //s의 길이만큼 반복한다
        for(int i=0;i<s.length();i++){
	        	char tmp=s.charAt(i); //tmp에 i 자리의 문자를 넣기
                int a=n; //n으로 판단하고 n에서 26을 빼면 다음 반복문에서 논리적 오류!
	            if(tmp==' '){answer+=tmp;continue;} //공백이면 그냥 answer에 추가하고 반복문으로 돌아감
	            else{
	            	if('A'<=tmp && tmp<='Z') { //대문자인데 tmp+n이 90 (Z) 넘어가면 - 26해서 a 부터
	            		if(tmp+a>'Z') {
	            			a-=26;
	            		}
	            	}
                    if('a'<=tmp && tmp<='z') { //이건 소문자일 때
	            		if(tmp+a>'z') {
	            			a-=26;
	            		}
	            	}
	            	//tmp=(char)(tmp+n); //tmp에 n 더해서 push 후 알파벳
	            	answer+=(char)(tmp+a); //answer에 더해주기
                }
        }
        return answer;
    }
}