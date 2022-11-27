class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer =new StringBuilder();
        //시간초과가 나와서 같은 논리로 StringBuilder로 진행함
        //1.숫자 몇 번 나오는지 확인할 배열 선언 + 넣어주기
        int[] arrX=new int[10];
		int[] arrY=new int[10];
        
        for(int i=0;i<X.length();i++) {
			int index=X.charAt(i)-'0';
			arrX[index]++;
		}
		
		for(int i=0;i<Y.length();i++) {
			int index=Y.charAt(i)-'0';
			arrY[index]++;
		}
        
        //둘 다 숫자가 남아있으면 값을 더해준다
        for(int i=9;i>=0;i--){
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;
                answer.append(i);
            }
        }
        
        //아무것도 없으면 -1, 0으로 시작하면 0이 여러개여도 0, 아닐 경우 그냥 반환
        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.toString().startsWith("0")) {
            return "0";
        } else {
            return answer.toString();
        }
        
    
        
        /* 밑의 방법으로 하면 시간초과가 난다... String 말고 StringBuilder 이용하기 
        
        //arr[n]이 n의 갯수를 나타내는 배열 선언 (ex.3이 5개 나오면 arr[3]=5)
        int[] arrX=new int[10];
		int[] arrY=new int[10];
        
        //배열에 각 숫자가 몇번 나오는지 넣어주기
		for(int i=0;i<X.length();i++) {
			for(int j=0;j<=9;j++) {
				if(X.charAt(i)==j+48) { //숫자 0의 아스키코드는 48
					arrX[j]+=1; //n이 나오면 arr의 n번째에 1씩 증가
				}
			}
		}
		
		for(int i=0;i<Y.length();i++) {
			for(int j=0;j<=9;j++) {
				if(Y.charAt(i)==j+48) {
					arrY[j]+=1;
				}
			}
		}
        
        //둘 중 더 적은 수만큼(겹친만큼) 넣어준다.
        for(int i=9;i>=0;i--) {
        	if(arrX[i]>=arrY[i]) {
                //값이 0이면 작동 안한다 (j가 조건충족X)
        		for(int j=0;j<arrY[i];j++) {
        			answer+=i;
                    //0이면 한 번만 추가하고 나가야된다!
                    if(i==0)break;
        		}
        	}else {
        		for(int j=0;j<arrX[i];j++) {
        			answer+=i;
                    if(i==0)break;
        		}
        	}
        	
        }
        
        //이렇게 해도 아무것도 안들어오면 answer=-1
		if(answer.equals(""))answer="-1";
    
        */
    }
}