package sw.search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 게임수를 입력받아 게임수마늠 로또 번호를 생성하여 아래와 같이 출력하라.
 * 1게임=[64,55,10,34,38,39], bonus=41
 * 2게임=[25,11,20,3,38,39], bonus=21
 * 3게임=[21,1,20,34,38,39], bonus=13
 * 4게임=[2,15,60,34,38,39], bonus=54
 * 계속하시겠습니까? (1:예, 2:아니오) 1
 * 
 * 
 * 
 * 1게임=[64,55,10,34,38,39], bonus=41
 * 2게임=[25,11,20,3,38,39], bonus=21
 * 3게임=[21,1,20,34,38,39], bonus=13
 * 계속하시겠습니까? (1:예, 2:아니오) 2
 * 
 * 
 * 
 * 
 * 
 * 
 * 중복번호 제거
 * 컬랙션 사용x
 * 배열 이용해야함.
 * Array의 정렬 배열 사용 x
 * 보너스 번호 생성
 * 로또 번호는 오름차순으로 정렬.
 */


public class Lotto {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int[] arr=new int[6];
		
		while(true) {
		//게임수 입력
		System.out.print("게임수 = ");
		int cnt=sc.nextInt();
		
		//게임수 만큼 전체 반복
		for(int main=0;main<cnt;main++) {
			
		//난수생성
		for(int i=0;i<arr.length;i++) {
		arr[i]=r.nextInt(45)+1;
		}
		//System.out.println("난수"+Arrays.toString(arr));
		
		
		//중복제거
		int x=0,y=0, dupCnt=0;
		while(true) {
			if(arr[x]==arr[y]) {
				dupCnt++;
			}
			if(y<arr.length-1) {
				y++;
				continue;
				}
			if(dupCnt>1) {
				arr[x]=r.nextInt(45)+1;
				dupCnt=y=0;
				continue;
			}else {
				x++;
				if(x==arr.length-1) {
					break;
				}else {
					dupCnt=y=0;
					continue;
				}
			}
		}
		
		
		
		//System.out.println("중복제거:"+Arrays.toString(arr));
		
		//보너스 번호 생성
		int bonus=r.nextInt(45)+1;
		int bonusCnt=0;
		for(int i=0;i<arr.length;) {
			if(bonus==arr[i]) {
				bonusCnt++;
			}
			if(i<arr.length-1) {
				i++;
				continue;
			}
			if(bonusCnt>0) {
				bonus=r.nextInt(45)+1;
				bonusCnt=i=0;
				continue;
			}else{
				break;
			}
		}
		
		//System.out.println("보너스:"+bonus);
		
		//오름차순
		int tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j-1]>arr[j]) {
					tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		
		
		//System.out.println("오름차순:"+Arrays.toString(arr));
		System.out.println((main+1)+"게임="+Arrays.toString(arr)+", bonus="+bonus);
		}
		
		//다시 출력하는지 묻기
		System.out.print("계속하시겠습니까(1:예,2:아니오)?");
		int cont=sc.nextInt();
		if(cont==1) {
			continue;
		}else if(cont==2) {
			break;
		}
		}
	}

}
