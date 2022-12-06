import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        //가장 점수가 높은 것부터 m개씩 담아서 팔고를 반복하면 가능하다 --> m개 밑으로 남았을 때 정지.
        
        // 1.오름차순으로 정리.
        Arrays.sort(score);
        // 2.가장 큰 값(마지막 값)부터 m개씩 반복문
		for(int i=score.length-1;i>m-2;i=i-m) {
            // 3. 상자에서 가장 점수가 낮은 값은 상자의 첫 점수이므로
            // 첫 요소의 점수(score[i-m+1])에 상자 당 갯수 (m) 을 곱하면 된다
			answer+=score[i-m+1]*m;
		}
        return answer;
    }
}