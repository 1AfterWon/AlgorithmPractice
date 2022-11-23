import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        //7로 나눈 나머지를 구해서 나머지값에 따라 하면 될 듯.. 0:금, 6:목 5:수...
        String answer = "";
        //calendar 생성해서 2016년 a월 b일로 맞춤 (월은 0부터 시작해서 -1)
        Calendar cal=Calendar.getInstance();
		cal.set(2016,a-1,b);
        //그 해의 며칠 째인지 구해서 7로 나눠서 나머지 구함 (1일부터 시작이니 -1)
        switch((cal.get(Calendar.DAY_OF_YEAR)-1)%7){
            case 0: answer+="FRI"; break;
            case 1: answer+="SAT"; break;
            case 2: answer+="SUN";break;
            case 3: answer+="MON";break;
            case 4: answer+="TUE";break;
            case 5: answer+="WED";break;
            case 6: answer+="THU";break;
        }
        return answer;
    }
}