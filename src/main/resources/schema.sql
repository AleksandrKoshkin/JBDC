create schema test;
create table customers(
id   int auto_increment primary key,
name varchar(255),
surname varchar(255),
age int,
phone_number int
);
create table orders(
id   int auto_increment primary key,
date  int,
customer_id int references customers (id),
product_name varchar(255),
amount int
);