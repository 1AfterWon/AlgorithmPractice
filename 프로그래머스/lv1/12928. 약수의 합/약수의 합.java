class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr=new int[100];
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[cnt]=i;
                cnt++;
                answer+=i;
            }
        }
        return answer;
    }
}