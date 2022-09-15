package java1.과제3_자유주제.손비아;

public class DigimonModel_ {
	//필드
	String name;
	int level;			//레벨
	int energy;			//에너지
	int fatigue;		//피로도
	int experience;		//경험치
	int max_fatigue;	//피로도 상한
	int max_exp;		//레벨 증가 경험치 상한
	
	//생성자
	public DigimonModel_() {}
	
	public DigimonModel_(String name) {
		this.name = name;
		this.level = 1;
		this.energy = 3;
		this.fatigue = 0;
		this.experience = 0;
		this.max_fatigue = 10;
		this.max_exp = 15;
	}

	public DigimonModel_(String name, int level, int energy, int fatigue, int experience, int max_fatigue, int max_exp) {
		this.name = name;
		this.level = level;
		this.energy = energy;
		this.fatigue = fatigue;
		this.experience = experience;
		this.max_fatigue = max_fatigue;
		this.max_exp = max_exp;
	}
	
	//메소드
}
