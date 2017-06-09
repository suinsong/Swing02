


create table member_table(
	id int auto_increment not null,
	userId varchar(10) not null,
	userName varchar(20) not null,
	userPw varchar(125) not null,
	userGender varchar(10),
	userTel varchar(20), 

primary key(id)


)
;