class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        //1, 4, 7 은 왼손 고정. 3, 6, 9는 오른손 고정 하고 시작.
		//2 5 8 0 은 둘의 거리 비교
		//*:10,0:11, #:12로 두고 생각해보기
		int left=10, right=12;
		for(int i:numbers) {
			switch(i) {
			//1. 1, 4, 7은 무조건 왼손 이므로 answer에 L 더하고 
			//왼손의 위치를 나타내는 left를 그 값으로 바꿔줌
			case 1:answer+="L"; left=1; break; 
			case 4:answer+="L"; left=4; break;
			case 7:answer+="L"; left=7; break;
			
			//2. 3,6,7도 마찬가지! 오른손일 뿐	
			case 3:answer+="R"; right=3; break;
			case 6:answer+="R"; right=6; break;
			case 9:answer+="R"; right=9; break;
			
			//3. 손의 위치와 목적 번호의 차이가 3이상이면 3씩 빼면서 차이 보기
			//-> 두 수의 차이를 3으로 나눈 몫과 나머지를 더한 값이면 거리를 알 수 있을 것
			//차이가 음수 일 수도 있으니 절대값 하고 계산
			case 2:
				if((Math.abs(left-2)/3+Math.abs(left-2)%3)>(Math.abs(right-2)/3+Math.abs(right-2)%3)) { //왼손이 더 멀 때
					answer+="R";right=2;
				}else if((Math.abs(left-2)/3+Math.abs(left-2)%3)<(Math.abs(right-2)/3+Math.abs(right-2)%3)) { //오른손이 더 멀 때
					answer+="L";left=2;
				}else { //둘의 거리가 같을 때
					if(hand.equals("right")) {
						answer+="R";right=2;
					}else if(hand.equals("left")) {
						answer+="L";left=2;
					}
				}
				break;
			case 5:
				if((Math.abs(left-5)/3+Math.abs(left-5)%3)>(Math.abs(right-5)/3+Math.abs(right-5)%3)) { //왼손이 더 멀 때
					answer+="R";right=5;
				}else if((Math.abs(left-5)/3+Math.abs(left-5)%3)<(Math.abs(right-5)/3+Math.abs(right-5)%3)) { //오른손이 더 멀 때
					answer+="L";left=5;
				}else { //둘의 거리가 같을 때
					if(hand.equals("right")) {
						answer+="R";right=5;
					}else if(hand.equals("left")) {
						answer+="L";left=5;
					}
				}
				break;
			case 8:
				if((Math.abs(left-8)/3+Math.abs(left-8)%3)>(Math.abs(right-8)/3+Math.abs(right-8)%3)) { //왼손이 더 멀 때
					answer+="R";right=8;
				}else if((Math.abs(left-8)/3+Math.abs(left-8)%3)<(Math.abs(right-8)/3+Math.abs(right-8)%3)) { //오른손이 더 멀 때
					answer+="L";left=8;
				}else { //둘의 거리가 같을 때
					if(hand.equals("right")) {
						answer+="R";right=8;
					}else if(hand.equals("left")) {
						answer+="L";left=8;
					}
				}
				break;
			case 0: //0은 위치 상 11로 판단하고 실행
				if((Math.abs(left-11)/3+Math.abs(left-11)%3)>(Math.abs(right-11)/3+Math.abs(right-11)%3)) { //왼손이 더 멀 때
					answer+="R";right=11;
				}else if((Math.abs(left-11)/3+Math.abs(left-11)%3)<(Math.abs(right-11)/3+Math.abs(right-11)%3)) { //오른손이 더 멀 때
					answer+="L";left=11;
				}else { //둘의 거리가 같을 때
					if(hand.equals("right")) {
						answer+="R";right=11;
					}else if(hand.equals("left")) {
						answer+="L";left=11;
					}
				}
				break;
			}
		}
        return answer;
    }
}