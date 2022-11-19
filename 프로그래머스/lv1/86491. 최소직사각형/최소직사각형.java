class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmpA=0, tmpB=0,maxA=0,maxB=0;
        //2차원 배열의 각 요소[a,b]에서 a>b로 다 통일하여 길이 비교할 것
        //큰 값중 가장 큰 값, 작은 값 중 가장 큰 값을 비교해서 구할 것
        for(int i=0;i<sizes.length;i++){
            //1. 큰 값을 tmpA에 넣고 작은 값을 tmpB에 넣기
            if(sizes[i][0]>sizes[i][1]){
                tmpA=sizes[i][0];
                tmpB=sizes[i][1];
            }else{
                tmpB=sizes[i][0];
                tmpA=sizes[i][1];
            }
            //2.maxA와 tmpA, maxB와 tmpB를 비교해서 max값에 가장 큰 길이를 넣어줌
            if(tmpA>maxA)maxA=tmpA;
            if(tmpB>maxB)maxB=tmpB;
        }
        //3. maxA와 maxB 곱해서 최소 직사각형 넓이 구하기
        answer=maxA*maxB;
      
        
        
        return answer;
  
    }
}