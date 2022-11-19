class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt=0;
        //i j k 3가지 수가 있을 때, 서로 중복되는 경우가 없게 i, j=i+1, k=j+1로 설정하여 합이 0 인지 확인
        for(int i=0;i<number.length;i++)
            for(int j=i+1;j<number.length;j++)
                for(int k=j+1;k<number.length;k++)
                    if(number[i]+number[j]+number[k]==0)cnt++; //합이 0이면 cnt 증가
        
        //다른사람 풀이를 보니 cnt를 굳이 선언하지 않고 바로 answer++로 해도 되는거였다!
                
        answer=cnt;    //answer에 cnt 넣기!
        return answer;
    }
}
