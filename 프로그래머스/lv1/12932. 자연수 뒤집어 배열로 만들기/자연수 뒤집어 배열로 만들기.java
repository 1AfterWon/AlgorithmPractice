class Solution {
    public int[] solution(long n) {
        String s=""+n;  //String으로 변형하여 받아서 String 길이를 구한다.
        int[] answer =new int[s.length()]; //String 길이 이용하여 배열 길이 정의
         for(int i=0;n!=0;i++){
            answer[i]=(int)(n%10); //10으로 나눈 나머지는 1의자리 수다.
            n/=10;
        }
        return answer;
    }
}