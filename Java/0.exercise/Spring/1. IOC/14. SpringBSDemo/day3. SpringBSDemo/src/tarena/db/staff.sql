drop 	table	staff;
create 	table 	staff(
	id		int(3)		primary key		 auto_increment,
	name	char(20),
	gender	char(1)		
);

insert into	staff(name,gender)
values('tom','m');

insert into	staff(name,gender)
values('marry','f');

select * from staff;


