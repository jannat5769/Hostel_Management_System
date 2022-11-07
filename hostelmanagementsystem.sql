create table hostel0(
hostel_id int  not null primary key,
number_of_students int not null,
hostel_phone_number varchar(50) not null,
location varchar(50) not null,
)
create table log_in000(
firstname varchar(50) not null,
lastname varchar(50) not null,
gender varchar(50) not null,
date_of_birth varchar(50) not null,
email varchar(50) not null primary key,
city varchar(50) not null,
phone_number varchar(50) not null,
password varchar(50) not null,
)
create table student0(
student_id int  not null primary key,
hostel_id int not null foreign key references hostel0(hostel_id),
student_name varchar(50) not null,
student_city varchar(50) not null,
institute varchar(50) not null,
student_phone_number varchar(50) not null,
admit_date date not null,
)
create table staff0(
staff_id int  not null primary key,
hostel_id int not null foreign key references hostel0(hostel_id),
staff_name varchar (50) not null,
staff_phone_number varchar(80) not null,
staff_city varchar(50) ,
staff_nid varchar(80) not null,
staff_role varchar (50),
)
create table room00(
room_id int not null primary key,
hostel_id int not null foreign key references hostel0(hostel_id),
student_id int not null foreign key references student0(student_id),
room_capacity int not null,
room_name varchar(50) not null,
)
create table furniture0(
room_id int not null foreign key references room00(room_id),
furniture_id int  not null primary key,
furniture_type varchar(50) not null,
)
create table bill0(
bill_id int  not null primary key,
student_id int not null foreign key references student0(student_id),
amount int not null,
payment_method varchar(50) not null,
billing_date date not null,
bill_type varchar(50) not null,
)

insert into log_in000
values('jannatul','ferdous','female','10.07.1999','jannat@gmail.com','dhaka','019278883742','12345')