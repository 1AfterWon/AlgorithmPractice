class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        //answer의 길이는 arr의 길이와 같고 그 안의 배열은 arr[i]의 길이와 같음
        answer=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++)
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        return answer;
    }
}