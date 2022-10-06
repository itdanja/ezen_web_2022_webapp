drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key ,		-- 회원번호[pk , autokey ] 
	mid			varchar(50) , 							-- 회원아이디 
    mpassword	varchar(50) , 							-- 회원패스워드 
    mname		varchar(50) , 							-- 회원명
    mphone		varchar(15) , 							-- 회원 전화번호 
    memail		varchar(100) , 							-- 회원 이메일 
    maddress	varchar(100) ,							-- 회원 주소 
    mdate		datetime default now() ,				-- 회원 가입일 
	mpoint		int	default 0							-- 회원 포인트 
);
-- default 레코드 추가시 기본으로 들어가는 값 설정 
-- datetime default now() : 현재 시스템(DB)의 자동날짜

-- insert 문법
	-- 특정필드만 삽입 :  insert into 테이블명( 필드명 , 필드명 , 필드명 ) values( 값1, 값2 , 값3 );
	-- 모든필드 삽입 :   insert into 테이블명 values( 값1, 값2, 값3 );
    









