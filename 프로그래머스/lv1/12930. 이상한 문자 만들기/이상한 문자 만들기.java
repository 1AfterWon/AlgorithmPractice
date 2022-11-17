class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt=0; //띄어쓰기 기준으로 cnt를 초기화 할 것
        for(int i=0;i<s.length();i++){
            //띄어쓰기가 나오면 cnt 초기화하고, ansewr에 띄어쓰기 넣고, 반복문 위로 올라감
            if(s.charAt(i)==' '){cnt=0;answer+=s.charAt(i);continue;}
            //짝수자리수면 대문자 넣기
            if(cnt%2==0){
                answer+=Character.toUpperCase(s.charAt(i));
            //홀수자리수면 소문자 넣기
            }else{
                answer+=Character.toLowerCase(s.charAt(i));
            }
            cnt++;
        }
        return answer;
    }
}