drop database if exists transactionDb;

create database transactionDb;

	use transactionDb;

	create table account_tbl(
		id int primary key auto_increment,
		name varchar(45) not null,
		amount double
		);
	insert into account_tbl(name,amount)values('AA',20000),('BB',20000);

-- show isolation level
select @@global.transaction_isolation,@@transaction_isolation;

-- change isolation level
set global transaction isolation level SERIALIZABLE
delimiter//
