import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //moves로 선택된 값을 al에 넣음.
		//al의 마지막 값과 뽑을 값이 같으면 둘 다 삭제(board에서는 0으로 변경)
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int a:moves) {
			for(int i=0;i<board.length;i++) { //인형뽑기의 깊이만큼 반복
				
				//moves에 선택된 배열로 갔을 때 0이 있으면 한 칸 밑으로 내려가기
				
				if(board[i][a-1]==0) {continue;}
				else {
					 //값이 있으면 al에 추가해주기 + 0으로 바꾸기
					al.add(board[i][a-1]);     
					board[i][a-1]=0;
					//System.out.println(al.toString());
					break;
					}		
			}
			//만약 최근 들어온 두 개가 같으면 삭제 후 answer 2 증가
			if(al.size()>=2&&
					(al.get(al.size()-1).equals(al.get(al.size()-2)))) {
				al.remove(al.size()-1); al.remove(al.size()-1);
				answer+=2;}
			//System.out.println(al.toString());
			//System.out.println("***********************");
		}
        return answer;
    }
}