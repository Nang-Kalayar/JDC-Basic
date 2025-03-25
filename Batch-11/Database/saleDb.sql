drop database if exists saleDb;

create database saleDb;

use saleDb;

	create table account_tbl(
		id int primary key auto_increment,
		loginId varchar(45) not null unique,
		password varchar(45) not null,
		role enum('ADMIN','MEMBER','CUSTOMER') not null default 'CUSTOMER'
	);
	insert into account_tbl(loginId,password,role)values('admin','admin',1);
	insert into account_tbl(loginId,password,role)values('member','member',2);
	insert into account_tbl(loginId,password)values('andrew','ad123');

	create table address_tbl(
		id int primary key auto_increment,
		city varchar(45) ,
		township varchar(45),
		address varchar(255)
	);
	insert into address_tbl(address,township,city) values('No.D-36,Between 27×28th Sts,Between 84×85th Sts','Chan Aye Thar Zan','Mandalay');
	insert into address_tbl(address,township,city) values('No.3, 56th Street Quarter (7)','Hlaing','Yangon');
	insert into address_tbl(address,township,city) values('19st,Between 80x81 sts','Aungmyaytharzan','Mandalay');
	insert into address_tbl(address,township,city) values('Between 35x36 sts,Between 84x85 sts','Maharaungmyay','Mandalay');
	insert into address_tbl(address,township,city) values('41st,Between 75x76 sts ','Maharaungmyay','Mandalay');

	create table customer_tbl(
				id int primary key auto_increment,
				name varchar(25) not null ,
				address_id int,
				phone varchar(15) not null unique,
				email varchar(40) not null check(email like '%@%'),
				foreign key(address_id)references address_tbl(id)
	);
	insert into customer_tbl (name,address_id,phone,email) values ('mahar swe',1,'02-57494','maharswe@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('Andrew',2,'02-522494','andrewnyar@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('Sophia',2,'02-7694','sophia@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('William',2,'01-234343','William@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('John',2,'01-993423333','John@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('Arnel',2,'02-3453453','Arnel@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('Upul Sampah',3,'02-645323','UpuSampahanlin@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('banyar',4,'02-828342','banyar@gmail.com');
	insert into customer_tbl (name,address_id,phone,email) values ('san lin',5,'02-22333345','sanlinanlin@gmail.com');

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
	insert into product_tbl(name,price,category_id)values('Arrows',45000.00,1);
	insert into product_tbl(name,price,category_id)values('Adidas',40000.00,1);
	insert into product_tbl(name,price,category_id)values('Adidas',40000.00,2);
	insert into product_tbl(name,price,category_id)values('Tommy',65000.00,2);
	insert into product_tbl(name,price,category_id)values('Wanglar',85000.00,2);
	insert into product_tbl(name,price,category_id)values('Arrows',20000.00,3);

	create table size_tbl(
		id int primary key auto_increment,
		size varchar(30) not null unique
	);
	insert into size_tbl(size)values('small'),('medium'),('large');

	create table voucher_tbl(
		id int primary key auto_increment,
		sale_date date not null default(current_date),
		sale_time time not null default(current_time),
		account_id int,
		customer_id int,
		sub_total double,
		tax double(6,2) default 0.00,
		discount double default 0.00,
		total double,
		foreign key(account_id) references account_tbl(id),
		foreign key(customer_id) references customer_tbl(id)
	);
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,1,105000,105000,'240910','10:30:20');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,2,115000,115000,'240910','11:20:11');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,3,40000,40000,'240919','09:11:11');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,1,40000,40000,'241001','03:10:20');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,4,65000,65000,'241002','12:23:00');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,5,85000,85000,'241003','02:11:22');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(1,3,100000,100000,'241004','09:20:20');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,6,80000,80000,'241010','10:24:22');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,7,115000,115000,'241017','09:03:00');
	insert into voucher_tbl(account_id,customer_id,sub_total,total,sale_date,sale_time)values(2,8,55000,55000,'241017','11:30:20');
	insert into voucher_tbl(account_id,customer_id,sub_total,total)values(2,9,45000,45000);


	create table voucher_detail_tbl(
		product_id int,
		voucher_id int,
		size_id int,
		qty int default 1,
		discount double default 0.00,
		foreign key (product_id) references product_tbl(id),
		foreign key (voucher_id) references voucher_tbl(id),
		foreign key (size_id) references size_tbl(id)
	);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(9,1,1);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(10,1,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(5,2,3);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(7,2,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(4,2,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(7,3,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(6,4,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(8,5,1);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(9,6,3);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(2,7,1);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(3,7,3);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(6,8,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(6,8,3);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(4,9,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(9,9,1);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(1,10,2);
	insert into voucher_detail_tbl(product_id,voucher_id,size_id)values(2,11,2);

	-- -- select product name , price and qty for the date of '240910' ?
	-- select p.name,p.price,vd.qty from product_tbl p
	-- join voucher_detail_tbl vd on vd.product_id = p.id
	-- join voucher_tbl v on vd.voucher_id = v.id
	-- where v.sale_date = '240910';

	-- -- using aggregate function
	-- -- select sum of total price in the day of '240910'
	-- select v.sale_date,sum(v.total) from voucher_tbl v group by v.sale_date;
	-- select avg(v.total) from voucher_tbl v;
	-- select v.sale_date,count(v.id) from voucher_tbl v group by v.sale_date;

	-- -- using  operators
	-- select v.sale_date,sum(v.total) from voucher_tbl v 
	-- where v.sale_date between '241001' and '241010' group by v.sale_date;

	-- select v.sale_date,sum(v.total) from voucher_tbl v 
	-- where v.sale_date in ('241001', '241010','241017') group by v.sale_date;

	-- select p.name,p.price,vd.qty from product_tbl p
	-- join voucher_detail_tbl vd on vd.product_id = p.id
	-- where lower(p.name) like lower(concat('A','%'));

-- using string function
-- select char_length('   dd  '),char_length(trim('   dd  '));

-- select c.name,p.name,p.price from category_tbl c
-- join product_tbl p on c.id = p.category_id;

-- select p.name from product_tbl p
-- join voucher_detail_tbl vd on p.id = vd.product_id
-- join voucher_tbl v on v.id = vd.voucher_id
-- join user_tbl u on u.id = v.user_id
-- where u.name = 'Andrew';

-- select c.name,p.name from product_tbl p
-- join category_tbl c on c.id = p.category_id
-- join voucher_detail_tbl pd on p.id=pd.product_id 
-- join voucher_tbl v on v.id = pd.voucher_id 
-- where v.sale_date = '241017';
