select *from contact;
select *from admiin;
select *from signup;


drop table contact;
drop table signup;
drop table admiin;
drop table thirdtable;

create table contact(
name varchar (55) not null,
phoneno varchar (15) not null,
email varchar(25) not null,
street varchar(50) not null,
city varchar(15) not null,
zipcode varchar (15) not null,
username varchar(55) not null foreign key references signup,
photo image  null,
u_id int IDENTITY(1,1) NOT NULL PRIMARY KEY,
a_name varchar(25) null foreign key references admiin);

create table signup(
username varchar(55) not null primary key,
name varchar(55) not null,
pasword varchar(55) not null,
seq varchar(55) not null,
answer varchar(55) not null,
a_name varchar(25) null);

create table admiin(
a_name varchar(25) not null primary key ,
a_password varchar(25) not null,
a_age int not null,
a_address varchar(25) not null);

insert into admiin (a_name, a_password,a_age,a_address) values ('sa','123','45','dhaka');



