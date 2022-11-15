class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //n의 자릿수만큼 배열 생성 
        int[] arr=new int[(int)(Math.log10(n)+1)];
        
        //n의 자릿수 하나하나씩 배열에 넣기
        for(int i=0;i<arr.length;i++){ 
            arr[i]=(int)(n%10);
            n/=10;
        }
        
        //버블정렬 이용해서 내림차순으로 정렬
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){ 
                if(arr[j]<arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
         String s=""; //배열의 값을 받을 문자열 생성
         for(int a:arr){s+=a; } //문자열에 배열의 데이터 하나씩 넣어서 문자열로 변경
         answer=Long.parseLong(s); //문자열을 long 값으로 변경
        
        return answer;
    }
}
