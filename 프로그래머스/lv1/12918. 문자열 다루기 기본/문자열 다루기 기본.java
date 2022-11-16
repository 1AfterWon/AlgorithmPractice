class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4||s.length()==6) //길이가 4나 6일때 실행
            for(int i=0;i<s.length();i++){ //문자열의 모든 요소 확인
                //숫자: 48~57 알파벳:65~
                if(s.charAt(i)>57) {answer=false;break;} //숫자 9의 아스키코드:57 보다 크면 false후 나가서 false 유지
                answer=true; //다 돌았을 때도 빠져나가지 않았으면 true
            }   
        return answer;
    }
}