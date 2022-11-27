import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //sort로 정렬하고 반복문을 돌려서 두 배열의 요소가 같지 않으면 반환하기
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<participant.length;i++){
            //마지막까지 가면 결국 그 사람이 통과자 명단에 없다
            if(i==participant.length-1){answer+=participant[i];break;}
            
            if(!participant[i].equals(completion[i])){answer+=participant[i];break;}
        }
        
        return answer;
    }
}