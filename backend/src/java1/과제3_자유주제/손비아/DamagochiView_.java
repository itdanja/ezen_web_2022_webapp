package java1.과제3_자유주제.손비아;

import java.util.Scanner;

public class DamagochiView_ {
	public static void main(String[] args) {
		//입력 객체
		Scanner sc = new Scanner(System.in);
		
		System.out.println("디지몬의 세계에 오신걸 환영합니다!\n");
		System.out.print("입력) 디지몬 이름 : ");	String name = sc.next();	//키울 디지몬의 이름을 입력
		DigimonModel_ digimon = new DigimonModel_(name);		//DigimonModel 클래스의 객체 생성
		
		while(true) {
			if(digimon.experience>=digimon.max_exp) {	//디지몬의 경험치가 15이상이면
				System.out.println("\n ★디지몬 "+digimon.name+" 레벨업!★");	//디지몬의 레벨이 +1 누적
				digimon.level++;			//디지몬 레벨 +1
				digimon.experience = 0;		//경험치는 다시 0
				if(digimon.level%10==0) {	//디지몬의 레벨이 10단위로 증가하면
					System.out.println("\n ★★★디지몬 "+digimon.name+" 진화!★★★");	//디지몬 진화
					digimon.max_fatigue+=5;	//디지몬의 피로도 상한치가 +5 증가
					digimon.max_exp+=5;		//디지몬의 레벨 증가 경험치 상한이 +5 증가
				}
				System.out.println(" ☆Level: "+digimon.level+"☆");
			}
			printDigimon(digimon);
			System.out.println(" 메뉴 : 1.밥주기 | 2.잠자기 | 3.놀아주기 | 4.운동하기");
			System.out.print(" 입력) ");		int ch = sc.nextInt();
			if(ch==1) {			//밥주기
				System.out.println(" "+digimon.name+": 냠냠~\t\t\t에너지+2");
				digimon.energy+=2;			//디지몬의 에너지 +2
			}else if(ch==2) {	//잠자기
				System.out.println(" "+digimon.name+": 쿨쿨Zz..\t\t\t에너지+3, 피로도-5");
				digimon.energy-=2;			//디지몬의 에너지 -2
				if((digimon.fatigue-5)>0)	
					digimon.fatigue-=5;		//피로도 -5
				else
					digimon.fatigue=0;		//피로도가 음수가 되지 않도록
			}else if(ch==3) {	//놀아주기
				if(digimon.energy<=0 || digimon.fatigue>digimon.max_fatigue) {	//디지몬의 에너지가 0이하거나 피로도가 max_fatigue을 초과하면
					System.out.println(" "+digimon.name+": 너무 힘들어..!!ㅠㅁㅠ");
					System.out.println("\n 안내) 에너지가 너무 낮거나 피로도가 높으면 해당 행동을 할 수 없습니다.\n");
				}else {			//디지몬의 에너지가 0이하거나 피로도가 max_fatigue을 초과하지 않으면
					System.out.println(" "+digimon.name+": 신나 >ㅅ<\t\t경험치+3, 에너지-1, 피로도+2");
					digimon.experience+=3;	//디지몬의 경험치 +3
					digimon.fatigue+=2;		//디지몬의 피로도 +2
					digimon.energy-=2;		//디지몬의 에너지 -2
				}
			}else if(ch==4) {	//운동하기
				if(digimon.energy<=0 || digimon.fatigue>digimon.max_fatigue) {	//디지몬의 에너지가 0이하거나 피로도가 max_fatigue을 초과하면
					System.out.println(" "+digimon.name+": 너무 힘들어..!!ㅠㅁㅠ");
					System.out.println("\n 안내) 에너지가 너무 낮거나 피로도가 높으면 해당 행동을 할 수 없습니다.\n");
				}else {			//디지몬의 에너지가 0이하거나 피로도가 max_fatigue을 초과하지 않으면
					System.out.println(" "+digimon.name+": 재밌다! 0ㅁ0\t경험치+2, 에너지-1, 피로도+2");
					digimon.experience+=2;	//디지몬의 경험치 +2
					digimon.energy-=1;		//디지몬의 에너지 -1
					digimon.fatigue+=2;		//디지몬의 피로도 +2
				}
			}else {				//그 외 입력
				System.err.println("안내) 알 수 없는 입력입니다.");
			}
		}
	}
	
	//상태창 보여주는 메소드
	public static void printDigimon(DigimonModel_ digimon) {
		System.out.println("\n===================== "+digimon.name+" =====================");
		System.out.printf(" 에너지 : %d | 피로도 : %d | 경험치 : %d | 레벨 : %d\n",digimon.energy,digimon.fatigue,digimon.experience,digimon.level);
		System.out.println("\n\t\t     ▒▒▒▒▒▒▒▒");
		System.out.println("\t\t     ▒         ▒");
		System.out.println("\t\t ▒▒▒▒     ▒▒▒   ▒");
		System.out.println("\t\t▒          ▒▒   ▒");
		System.out.println("\t\t▒    ▒▒       ▒");
		System.out.println("\t\t ▒▒▒▒         ▒");
		System.out.println("\t\t ▒     ▒▒   ▒");
		System.out.println("\t\t  ▒▒▒▒▒  ▒▒  ▒");
		System.out.println("\t\t ▒  ▒   ▒     ▒");
		System.out.println("\t\t ▒▒▒▒   ▒▒▒▒   ▒");
		System.out.println("\t\t    ▒▒     ▒    ▒");
		System.out.println("\t\t  ▒▒  ▒▒▒▒      ▒");
		System.out.println("\t\t ▒ ▒  ▒   ▒ ▒ ▒ ▒");
		System.out.println("\t\t ▒▒▒▒▒▒   ▒▒▒▒▒▒▒\n");
	}
}
