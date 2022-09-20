
-- p.141
use market_db;-- 0. DB선택
create table hongong1( -- 0.테이블생성 
	toy_id int ,		-- int형 필드 선언 
    toy_name char(4),	-- char형 필드 선언 [ 최대4글자 ]
    age int 			-- int형 필드 선언 
);
-- 1. insert 
	-- INSERT INTO 테이블명( 필드명1 , 필드명2 , 필드명3 ) VALUES( 값1 , 값2 , 값3 );
	-- INSERT INTO 테이블명 VALUES( 값1 , 값2 , 값3 );	
		-- 필드 개수와 대입할 값의 개수와 순서가 동일할경우 [ 필드명 생략 ]
	-- EX1
insert into hongong1 values( 1 , '우디' , 25 );
	-- EX2	-- age 생략할경우 null값이 자동으로 대입
insert into hongong1( toy_id , toy_name ) values( 2 , '버즈' );
	-- EX3
insert into hongong1( toy_name , age , toy_id ) values( '제시' , 20 , 3 );
	-- 확인 
select * from hongong1; 
 
 -- 2. auto_increment : 자동번호 부여 [ PRIMARY KEY 같이 사용 ]
 create table hongong2(
	toy_id int auto_increment primary key , 
    toy_name char(4) , 
    age int 
 ); -- 0.테이블 생성 
	-- EX1	null -> (중복없는)자동번호 부여 
insert into hongong2 values( null , '보핍' , 25 );
insert into hongong2 values( null , '슬링키' , 22 );
insert into hongong2 values( null , '렉스' , 21 );

	-- EX2 last_insert_id() : 마지막으로 추가된 자동번호 검색 
select last_insert_id();

	-- EX3 ALTER TABLE hongong2 auto_increment = 시작번호;
ALTER TABLE hongong2 auto_increment = 100;
insert into hongong2 values( null , '재남' , 35 );		-- 100

	-- EX4 SET @@auto_increment_increment = 증가단위;
SET @@auto_increment_increment = 3;
insert into hongong2 values( null , '재남' , 35 );		-- 103

SET @@auto_increment_increment = 1;	-- 원상복귀

	-- EX5 여러번의 VALUES
insert into hongong2 values( null , '재남2' , 30 )  , ( null , '재남3' , 40 );

	-- 확인
select * from hongong2;


 
 
 
 
 
 
 
 
 
