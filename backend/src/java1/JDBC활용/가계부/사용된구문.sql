drop database if exists test;
create database test;
use test;
create table expense(
	eno int auto_increment primary key ,
    edate date not null ,
    emoney int not null ,
    ecomment varchar(100) not null
);
select * from expense;