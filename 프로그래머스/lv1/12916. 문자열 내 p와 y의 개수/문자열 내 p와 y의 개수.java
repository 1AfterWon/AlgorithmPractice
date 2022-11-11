class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0,y=0;
        for(int i=0;i<s.length();i++){  //문자열의 길이까지 반복
            if(s.charAt(i)=='y'||s.charAt(i)=='Y'){y++;} //i번째 문자가 y 나 Y일 경우 y 증가
            else if(s.charAt(i)=='p'||s.charAt(i)=='P'){p++;} //i번째 문자가 p 나 P일 경우 p 증가
        }
        if(p==y){answer= true;}  //p와 y가 같으면 true
        else if(p!=y){answer=false;} //아니면 false
        return answer;
    }
}