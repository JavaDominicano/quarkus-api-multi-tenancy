create sequence persons_SEQ start with 1 increment by 50;
create table persons (id bigint not null, address varchar(255), dob date, email varchar(255), firstName varchar(255), lastName varchar(255), tenantId varchar(255) not null, primary key (id));