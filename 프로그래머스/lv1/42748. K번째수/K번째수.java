import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //commands[i]의 {a,b,c}에서 a~b까지 자른 수를 임시로 배열에 넣어두고, 오름차순 정렬 후 answer에 넣을 예정
        int[] answer = {};
        
        //1. answer의 배열길이는 commands의 길이와 같으므로 commands.length로 초기화
        answer= new int[commands.length];
        
        //2. 임시저장할 배열 tmp 생성 
        int[] tmp= {};
        //3. commands의 길이까지 반복해서 확인
	    for(int i=0;i<commands.length;i++){
             //4. tmp의 길이는 밑(b-a+1)과 같다 (2~5까지면 2,3,4,5 -> 4개 --> 5-2+1)
	    	 tmp=new int[commands[i][1]-commands[i][0]+1];
             //5. tmp의 몇 번째 요소에 넣을 지 파악알 t 생성 (여기에 둬야 매 commands 요소마다 0으로 초기화)
	    	 int t=0;
             //6. a~b까지의 요소를 tmp[k]에 하나씩 넣음 
 	     //-> 내가 생각한 방법으로 풀어서 썻는데, 메소드가 있었다!
	     //5,6번을 그리고 tmp 선언하고 다시 바꾸고 이런게 
	     //int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);    이거 한 줄로 가능했었다 copyOfRange 알고 있기!
	         for(int k=0;k<array.length;k++)
	        	 if(commands[i][0]-1<=k&&k<=commands[i][1]-1) tmp[t++]=array[k];
             //7. 오름차순으로 정렬 후 commands[i][2]-1의 값을 answer[i]에 추가 
	         Arrays.sort(tmp);
	         answer[i]=tmp[commands[i][2]-1];
	         }
        return answer;
	
	
    }
}
