drop database if exists testDb;

create database testDb;
	use testDb;

create table tableA(
		column0 varchar(20),
		column1 varchar(20),
		column2 varchar(20),
		column3 int
		
);

insert into tableA values('aaa','aaa','aaa',60);
insert into tableA values('bbb','bbb','bbb',70);
insert into tableA values('ccc','ccc','ccc',80);

create table tableB(
		column4 varchar(20),
		column5 varchar(20),
		column6 varchar(20),
		column7 int
		
);

insert into tableB values('aaa','aaa','aaa',80);
insert into tableB values('eee','eee','eee',90);
insert into tableB values('fff','fff','fff',100);
