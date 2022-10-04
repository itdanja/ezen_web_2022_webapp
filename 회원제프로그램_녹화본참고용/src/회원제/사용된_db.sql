drop database if exists testdb;
create database testdb;
use testdb;

drop table if exists member;
create table member(
	no			int auto_increment primary key ,
    id			varchar(20) ,
    password	varchar(20) ,
    name 		varchar(20) , 
    phone		varchar(20) 
);
select * from member;