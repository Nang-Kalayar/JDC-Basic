create database if not exists bookStoreDb;

use bookStoreDb;

create table if not exists category_tbl(

		id int auto_increment,
		name varchar(45) not null,
		primary key(id)
		);

create table if not exists book_tbl(

		id int primary key auto_increment,
		name varchar(45) not null unique check(char_length(name) >= 5),
		author varchar(45) not null,
		publisher varchar(45) not null,
		cat_id int, 
		foreign key (cat_id) references category_tbl(id)
);

 insert into book_tbl(name,author,publisher,cat_id) values 
	('test1','test1','test1',1),
	('test2','test2','test2',2),
	('test3','test3','test3',3);


create table if not exists rent_tbl(

		book_id int,
		rent_date date default(current_date),
		return_date date,
		primary key(book_id,rent_date,return_date)

);

