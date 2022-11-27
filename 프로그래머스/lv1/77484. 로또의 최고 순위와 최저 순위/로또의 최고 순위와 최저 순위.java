class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        //win_nums와 lottos를 비교해서 하나는 0이 나오면 증가, 하나는 0이 나오면 증가하지 않게 한다.
        int max=0,min=0;
        
        //두 배열을 for문으로 비교해준다.
        for(int i=0;i<lottos.length;i++){
             //lottos의 요소가 0이면 max 증가.
            if(lottos[i]==0) max++;
            for(int j=0;j<win_nums.length;j++){
                //두 배열의 요소가 같으면 max, min 둘 다 증가.
                if(lottos[i]==win_nums[j]){
                    max++;min++;           
                }            
            }
        }
        //max와 min에서 구한 일치하는 수에 따라 등 수 정해서 asnwer에 넣기
        //6-맞춘 갯수+1 이면 등수가 나온다 (0개 일치만 빼고)
        answer=new int[]{(max>0?7-max:6),(min>0?7-min:6)};
        return answer;
    }
}