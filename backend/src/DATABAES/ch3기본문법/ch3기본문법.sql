/*
DDL : 정의어[만들기]
	1. CREATE	: D,T,V 생성
	2. ALTER		: D,T,V 수정
	3. DROP		: D,T,V 삭제
DML : 조작어[가공]
	1. SELECT		: 레코드 검색
	2. INSERT		: 레코드 삽입
	3. UPDATE	: 레코드 수정
	4. DELETE		: 레코드 삭제
    
*/
-- 1. DB 삭제 
drop database market_db;			-- market_db 데이터베이스 삭제 [ 오류 : 해당 db 존재하지 않기 때문에 ]
drop database if exists market_db; 	-- 만일 해당 db명이 존재하면 해당 db 삭제 
-- 2. DB 생성 
create database market_db;			-- market_db 데이터베이스 생성 [ 왼쪽 메뉴 확인 :  새로고침 ]
-- 3. 108. 회원테이블 생성 
use market_db;						-- use db명 	: 해당 db 사용[선택]
drop table if exists member;		-- 만일 테이블이 존재할경우 해당 테이블 삭제
create table member(
	mem_id char(8) not null primary key ,  -- 1. 최대 8글자 저장하는 회원아이디 [ 중복불가능 - 식별키 , 공백 불가능  ]
		-- char(길이) : 길이만큼 문자 저장  char(8) : 최대 8글자 저장[ 만일 8글자 초과이면 저장 실패 ]
		-- not null : 공백 저장 불가능 [ 만일 공백이 있으면 저장 실패 ] 
		-- primary key : *(기본키) 식별키[필드] , 필드내 데이터 중복불가능 ( 주민등록번호,학번,회원번호,사번 등 )
    mem_name varchar(10) not null ,			-- 2. 최대 10글자 저장하는 회원이름 [ 공백 불가능 ] 
		-- varchar(길이) : 가변길이 : 저장할 데이터의 길이가 일정하지 않을떄 
		--         vs 
		-- char(길이) : 고정길이 : 저장할 데이터의 길이가 일정할때
		-- 가변길이 : 저장된 데이터 만큼 메모리할당 , varchar(8) 에서 'ABC' 저장시 5칸 메모리 자동 제거 
		-- 고정길이 : 선언된 길이 만큼 고정 메모리 할당 , char(8) 에서 'ABC' 저장시 8칸 메모리 고정[ 3칸:ABC 5칸:빈공간]
    mem_number int not null ,				-- 3. 정수(+-20억)를 저장하는 인원수 [ 공백 불가능 ]
		-- int : 정수 +-20억 정도 저장가능	
    addr char(2) not null ,					-- 4. 최대 2글자 저장하는 주소 [ 공백 불가능 ]
    phone1 char(3) ,						-- 5. 최대 3글자 저장하는 국번 [ 공백 가능 ]
    phone2 char(8) ,						-- 6. 최대 8글자 저장하는 전화번호 [ 공백 가능 ] 
    height	smallint , 						-- 7. 정수(+-3만)를 저장하는 평균 키
		-- smallint : 정수 +-3만 정도 저장가능 		
	debut_date date 						-- 8. 날짜형식을 저장하는 데뷔날짜 
		-- date : 날짜 
);		-- create table 테이블명( 필드명1 자료형 속성 , 필드명2 자료형 속성 , 필드명3 자료형 속성 );
select * from member;  -- 생성된 테이블 검색  
-- 3. 109. 구매테이블 만들기
drop table if exists buy;				-- 만일 테이블이 존재할경우 해당 테이블 삭제
create table buy(
	num int auto_increment not null primary key , 	-- 1. 순번[ pk , 자동번호:auto_increment ]
    -- auto_increment : 레코드 추가시 자동번호 부여 	
    mem_id char(8) not null ,						-- 2. 회원아이디 [ member 테이블의 필드와 이름이 같다 ] 
    prod_name char(6) not null ,					-- 3. 제품 이름 
    group_name char(4) ,							-- 4. 분류 
    price int not null ,							-- 5. 가격 
    amount smallint not null ,						-- 6. 수량 
    foreign key( mem_id ) references member(mem_id) 	-- 7. member테이블의 mem_id(pk) 필드와 연결  ( 관계 )
    -- references 참조 : 다른 것과 참조[본다/연결/가져오기 등 ] 한다.
    -- foreign key( 외래키 ) references 테이블명(기본키)
);
select * from buy;
/*
	관계 : 서로 다른 테이블끼리 연결 
    
    member테이블					buy 테이블 
		mem_id [ PK 필드 ] 			mem_id [ FK 필드 ]
	
	만일 '트와이스' 가 제품 구매할경우
		-- 1. member테이블의 mem_id가 '트와이스' 존재한다는 가정하에
		-- 2. 트와이스가 제품 구매시 buy테이블의 mem_id에 '트와이스' 추가 
        -- 트와이스가 제품 구매 
	만일 '트와이스' 가 제품 3개 구매할경우
    
				PK		<------------------>   FK 
		member테이블 [ primary key]		buy 테이블 [ foreign key ]
			mem_id : '트와이스'				mem_id : '트와이스'	지갑
											mem_id : '트와이스'	냉방고
											mem_id : '트와이스'	가방    
*/
/* ---------------------------- 예제파일 -----------------------------*/
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);









