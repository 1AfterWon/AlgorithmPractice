import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        //HashSet에 합을 모두 넣어 중복값 제거하고 HashSet의 요소에 대해서 소수판별?
        
        int answer = 0;
        //HashSet 선언 후 3개의 수 더하는 반복문 작성 (중복값은 HashSet에서 사라짐)
        //중복값 처리가 문제다.. 중복을 안없애야할듯 - arraylist로 작성!
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                for(int k=j+1;k<nums.length;k++)
                    al.add(nums[i]+nums[j]+nums[k]);
        //HashSet을 Array로 바꾸고 arr를 이용하여 반복문 돌려서 소수판별
        Integer[] arr = al.toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++){
            int j=0;
            for(j=2;j<arr[i];j++){
                //나누어떨어지는 수가 있으면 소수가 아니니 break
                if(arr[i]%j==0)break;
            }
            //arr[i]의 값이 j까지 왔다는건 break 없이 다 왔다는 것이니 소수!
            if(arr[i]==j)answer++;
        }
        

        return answer;
    }
}