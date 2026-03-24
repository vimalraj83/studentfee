create database student_fees_db;

use student_fees_db;

create table student(
    student_id int primary key,
    name varchar(50),
    department varchar(50)
);

create table fee(
    fee_id int primary key,
    student_id int,
    amount double,
    status varchar(20)
);

select * from student;