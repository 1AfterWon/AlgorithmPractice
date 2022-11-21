import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        //배열에 문자열 s의 값을 모두 넣고 내림차순 정렬 후 answer에 다시 넣어주기
        //원래 아스키코드 상 대문자가 더 작아서 그냥 진행해도 상관 없다.
        
        //길이가 문자열 s의 길이와 같은 char 배열 선언 후 넣어주기
        char[] tmp=new char[s.length()];
        for(int i=0;i<s.length();i++){
            tmp[i]=s.charAt(i);
        }
        //오름차순 정렬
        Arrays.sort(tmp);
        //반대로 answer에 넣어주기
        for(int i=tmp.length-1;i>=0;i--)
            answer+=tmp[i];
        return answer;
    }
}