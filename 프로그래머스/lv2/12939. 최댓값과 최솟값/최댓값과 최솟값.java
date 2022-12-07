import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //1. s를 split을 이용하여 배열에 담는다.
		String[] starr=s.split(" ");
        
		//2. 이를 int형 문자로 바꿔 int 배열에 넣고 sort
		int[] arr=new int[starr.length];
		for(int i=0;i<starr.length;i++) {
			arr[i]=Integer.parseInt(starr[i]);
		}
		Arrays.sort(arr);
        
		//3 첫 요소와 마지막 요소를 answer에 더해준다.
		answer=answer+arr[0]+" "+arr[arr.length-1];
        return answer;
    }
}