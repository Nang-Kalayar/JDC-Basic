drop database if exists relationshipDb;

create database relationshipDb;

use relationshipDb;

create table user_tbl(
	id int primary key auto_increment,
	name varchar(45) not null unique,
	role int,
	foreign key(role) references user_tbl(id)
);
insert into user_tbl(name,role)
	values('Admin',null),
	('Cashier',null),
	('Andrew',1),
	('William',2);

create table category_tbl(
	id int primary key auto_increment,
	name varchar(45) not null unique,
	active tinyint(1) default 1
);

insert into category_tbl(name)values('T-Shirt'),('Trouser'),('Wallet');

create table product_tbl(
	id int primary key auto_increment,
	name varchar(45) not null,
	price double(8,2) not null default 1.00,
	active tinyint(1) default 1,
	category_id int,
	foreign key(category_id) references category_tbl(id)
);

insert into product_tbl(name,price,category_id)values('Hugo',55000.00,1);
insert into product_tbl(name,price,category_id)values('Boss',45000.00,1);
insert into product_tbl(name,price,category_id)values('Polo',80000.00,1);
insert into product_tbl(name,price,category_id)values('Boss',30000.00,3);
insert into product_tbl(name,price,category_id)values('Polo',40000.00,3);





create table size_tbl(
	id int primary key auto_increment,
	size varchar(30) not null unique
);
insert into size_tbl(size)values('small'),('medium'),('large');

create table voucher_tbl(
	id int primary key auto_increment,
	sale_date not null date default(current_date),
	sale_time  not null time default(current_time),
	user_id int,
	sub_total double,
	tax double(6,2) default 0.00,
	discount double default 0.00,
	total double,
	foreign key(user_id) references user_tbl(id)
);
insert into voucher_tbl(user_id,sub_total,total,sale_date,sale_time)values(3,95000,950000,'241017','09:03:00');
insert into voucher_tbl(user_id,sub_total,total,sale_date,sale_time)values(4,95000,950000,'241017','09:03:00');
insert into voucher_tbl(user_id,sub_total,total,sale_date,sale_time)values(4,95000,950000,'241017','09:03:00');

create table voucher_detail_tbl(
	product_id int,
	voucher_id int,
	size_id int,
	qty int default 1,
	discount double,
	foreign key (product_id) references product_tbl(id),
	foreign key (voucher_id) references voucher_tbl(id),
	foreign key (size_id) references size_tbl(id)
);

insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(1,1,1);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(5,1,2);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(2,2,2);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(3,1,2);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(1,1,2);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(1,1,2);
insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(1,1,2);



