class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer =new int[2];
        
        //answer[1] (작은 수)를 두 수의 곱으로 나타내고 그 두 수에 +2한 값을 곱하면 전체 카페트 크기가 된다.
        for(int i=1;i<=yellow;i++) {
		//yellow가 i로 나누어떨어지지 않으면 소용 없다.
		if(yellow%i!=0) continue;
		for(int j=i;j<=yellow;j++) {
			if(i*j==yellow&&(i+2)*(j+2)==yellow+brown) {
                //j는 i부터 하나씩 증가하기 때문에, 항상 j가 i 이상이니 j+2를 answer[0]에 넣는다. 
				answer[0]=j+2;answer[1]=i+2; break;
			    }
		    }	
	    }
        return answer;
    }
}