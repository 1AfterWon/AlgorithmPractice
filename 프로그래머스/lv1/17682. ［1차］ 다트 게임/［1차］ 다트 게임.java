class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        //1. for 문으로 숫자 기준으로 3개로 나누고 그걸로 점수 계산
        String[] arr= {"","",""};
        int idx=-1;
        for(int i=0;i<dartResult.length();i++){
            if('0'<=dartResult.charAt(i)&&dartResult.charAt(i)<='9') idx++;
            arr[idx]+=dartResult.charAt(i);
            //이렇게 하면 10이 나오면 idx out of bounds 발생한다! 10이면 하나 빼야된다
            if(dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0') idx--;
        }
        
        //1,2,3번 다트 결과를 저장하기 위한 배열 선언
        int[] res=new int[3];
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length();j++) {
        		//2. 숫자는 추가해주기
        		if('0'<=arr[i].charAt(j)&&arr[i].charAt(j)<='9') {
        			res[i]+=arr[i].charAt(j)-'0';
                    //1이 나오고 다음것이 0이면 10으로 바꿔준다.
        			if(arr[i].charAt(j+1)=='0')res[i]*=10;
        		}
        		
        		//3. S D T * #이면 적용되는 것을 case 문으로 구현
        		switch(arr[i].charAt(j)){ 
        			case 'S':break;
        			case 'D':res[i]*=res[i]; break;
        			case 'T':res[i]=res[i]*res[i]*res[i]; break;
        			//*는 처음 나오면 그 전 요소 2배할 것이 없으니 나눠준다.
        			case '*':
        				if(i==0){
        					res[i]*=2;
        				}else {
        					res[i-1]*=2;
        					res[i]*=2;
        				}
        				break;
        			case '#':res[i]*=-1; break;
        		}
        		
        	}
             
        }
        
        answer=res[0]+res[1]+res[2]; //3개를 다 더한 값이 정답이다
        return answer;
    }
}