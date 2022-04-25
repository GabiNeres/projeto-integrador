CREATE TABLE Administrador(
	MatAdm varchar(20) not null,
	Senha varchar(50) not null,
	Email varchar(100) not null,
	NomeAdm varchar(50) not null,
	CONSTRAINT pk_Adm PRIMARY KEY (MatAdm)
);

CREATE TABLE Aluno(
	MatAl varchar (20),
	NomeAl varchar(50) not null,
	Idade integer,
	Turma varchar(50) not null,
	CONSTRAINT pk_Al PRIMARY KEY (MatAl)
);

CREATE TABLE Autorizacao(
	CodAut integer,
	Motivo varchar(200),
	Hora_Pego time,
	Data_Pego date,
	MatAdm varchar(20), 
	MatAl varchar(20),
	CONSTRAINT pk_Aut PRIMARY KEY (CodAut),
	CONSTRAINT fk_Aut1 FOREIGN KEY(MatAdm) references Administrador (MatAdm),
	CONSTRAINT fk_Aut2 FOREIGN KEY(MatAl) references Aluno (MatAl)
);


