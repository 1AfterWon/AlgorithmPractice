class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int idx=0; //가장 작은 값이 어디 있을지 판단하는 인덱스
        //arr의 요소가 1개뿐이면 {-1} 
        if(arr.length==1){answer=new int[]{-1};}
        //arr의 요소가 1개가 넘으면
        else if(arr.length>1){
            //answer의 길이는 arr-1 (가장 작은 값 1개 뺼거니)
            answer=new int[arr.length-1]; 
            //idx값을 구하는 반복문. 
            for(int i=1;i<arr.length;i++){
                //idx에 있는 값이 더 크면 idx 유지해서 다시 비교하고
                //idx에 있는 값이 더 작으면 그 값으로 idx 옮기기
               if(arr[idx]>arr[i]){idx=i;} 
            }
            //idx에 있는 값만 빼고 answer에 arr의 요소를 넣는 반복문
            int j=0;
            for(int i=0;i<arr.length-1;i++){
                answer[i]=arr[j];
                j++;
                if(idx==j)j++; //
            }
        }
        return answer;
    }
}