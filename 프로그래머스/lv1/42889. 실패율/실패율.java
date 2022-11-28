class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer =new int[N];
        //실패율은 배열에서 그 수의 갯수/배열의길이
        //그 후 배열의 길이에서 수의 갯수 빼면 될 것
        //반복횟수는 N(스테이지 개수)
        //{스테이지,실패율} 방식의 2차원 배열 만들어서 나중에 answer에 스테이지만 넣어준다
        
        //1. 2차원 배열에 {스테이지,실패율} 방식으로 데이터 넣기
        int num=stages.length; //stages의 수를 알아야 실패율 구할 수 있다.
        double[][] tmp=new double[N][2];
        for(int i=1;i<=N;i++){
            int cnt=0;

            for(int j=0;j<stages.length;j++){
                if(stages[j]==i){
                    cnt++;
                }
            }
            tmp[i-1][0]=i;
            tmp[i-1][1]=(double)cnt/num;
            num-=cnt;
        }
        
        //2. 실패율 기준으로 내림차순 정렬
        for(int i=0;i<tmp.length;i++){
            for(int j=0;j<tmp.length-i-1;j++){
                if(tmp[j][1]<tmp[j+1][1]){
                    double[] min=tmp[j+1];
                    tmp[j+1]=tmp[j];
                    tmp[j]=min;
                }
            }
        }
        
        //3. answer 배열에 {스테이지,실패율} 에서 스테이지 만 넣기
        
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)tmp[i][0];
        }
        return answer;
    }
}