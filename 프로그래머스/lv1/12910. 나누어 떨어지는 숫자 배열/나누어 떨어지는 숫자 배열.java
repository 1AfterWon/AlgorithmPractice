import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        //값을 담을 배열의 길이를 구하기 위해 나눠지는 수가 몇개인지 파악
        int cnt=0; 
        
        //arr의 값을 하나씩 받아서 나눠지면 cnt를 하나씩 늘림
        for(int a:arr){if(a%divisor==0)cnt++;} 
        //나눠지는 수가 하나도 없으면 길이 1로 선언해서 -1을 넣음
        if(cnt==0){answer=new int[1];answer[0]=-1;}
        //나눠지는 수가 있으면 그 길이만큼 배열 선언 후
        else if(cnt>0){
            answer=new int[cnt];
            int i=0;
            //배열에 나눠지는 값들 추가
            for(int a:arr){
                if(a%divisor==0){answer[i]=a;i++;}
            }
        }
        //오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}