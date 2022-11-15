class Solution {
    public String solution(String s) {
        String answer = "";
        //글자 수가 짝수면 길이/2-1의 값과 길이/2의 값 문자열에 추가
        if(s.length()%2==0){answer+=s.charAt((int)(s.length()/2-1));
                           answer+=s.charAt((int)(s.length()/2));}
        //글자 수가 홀수면 길이/2의 값을 문자열에 추가
        else if(s.length()%2==1){answer+=s.charAt((int)(s.length()/2));}
        return answer;
    }
}