create database if not exists hotelDb;

use hotelDb;

create table if not exists room_tbl(

		id int ,
		name varchar(45) ,
		room_type_id int
		);
create table if not exists room_type_tbl(
		id int,
		room_type varchar(45)

);
create table if not exists guest_tbl(
		id int,
		name varchar(45),
		address_id int


);
create table if not exists address_tbl(
		id int,
		township varchar(45),
		city varchar(45),
		street varchar (45)


);