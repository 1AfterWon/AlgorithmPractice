import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        //n번째 문자를 가장 앞으로 옮기고 오름차순 정렬을 하면 될 것 같다.
        //1. StringBuffer 만들어서 옮기고 맨 앞에 n번째 글자 추가
        //2. 오름차순 정렬
        //3. 맨 앞 글자 제거 후 asnwer에 넣기
        answer=new String[strings.length];
        StringBuffer[] tmp=new StringBuffer[strings.length];
        
        //1번 과정
        for(int i=0;i<tmp.length;i++){
            StringBuffer sb=new StringBuffer();
            sb.append(strings[i]);
            sb.insert(0,strings[i].charAt(n));
            tmp[i]=sb;
        }
        
        //2번 과정
        Arrays.sort(tmp);
        
        //3번 과정
        for(int i=0;i<tmp.length;i++){
            tmp[i].delete(0,1);
            answer[i]=tmp[i].toString();
        }
        return answer;
    }
}