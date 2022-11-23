import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        //큰 흐름: HashSet을 써서 중복 제거?
        //중복 없는 최대 갯수는 N/2개니까 전체를 스캔해서 HashSet에 넣고 갯수가 N/2 이상되면 나오면 될 듯
        int answer = 0;
        HashSet hs=new HashSet();
        
        for(int i=0;i<nums.length;i++){
            //nums[i]의 값을 hs에 추가 (중복되면 자동 삭제)
            hs.add(nums[i]);               
            //갯수가 n/2 이상되면 빠져나오기
            if(hs.size()>=nums.length/2) break;
        }
        //answer에 hs의 크기를 반환
        answer=hs.size();
        return answer;
    }
}