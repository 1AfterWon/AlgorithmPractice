class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum=0;
        //number의 모든 값 더하기
        for(int a:numbers)sum+=a;
        //1~9의 모든 합은 45니까 45-sum으로 없는 수의 합 구하기 가능
        answer=45-sum;
        return answer;
    }
}