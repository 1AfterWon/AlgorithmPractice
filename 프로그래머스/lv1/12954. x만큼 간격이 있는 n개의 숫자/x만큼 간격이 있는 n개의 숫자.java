class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer=new long[n]; //n개의 데이터 받는 배열 생성
        for(int i=0;i<n;i++){
            answer[i]=(long)x*(i+1);
        }
        return answer;
    }
}