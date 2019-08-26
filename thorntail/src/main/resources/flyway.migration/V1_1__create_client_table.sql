create table client
(
	id serial
		constraint client_pk
			primary key,
	name varchar(50),
	last_name varchar(50),
	cpf varchar(50)
);