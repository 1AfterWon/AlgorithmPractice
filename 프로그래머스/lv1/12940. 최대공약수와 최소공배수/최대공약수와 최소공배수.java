class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int minG=0, maxG=0;
        //최대공약수: 두 수를 나누어떨어지게 하는 최대 수
        //--> n, m 중 큰 값부터 밑으로 내려오면서 확인
        for(int i=n>m?n:m;i>0;i--){  
            if(n%i==0&&m%i==0){
                minG=i;
                break;
            }
        }
        //최소공배수: 최소공배수는 두 수에 대해 모두 나누어떨어진다.
        //두 수의 곱이 가장 큰 최소 공배수이고, 그 밑으로 j를 증가시키며 실행
        for(int j=n>m?n:m;j<=n*m;j++){
            if(j%n==0&&j%m==0){
                maxG=j;
                break;
            }
        }
        answer=new int[]{minG,maxG};
        return answer;
    }
}