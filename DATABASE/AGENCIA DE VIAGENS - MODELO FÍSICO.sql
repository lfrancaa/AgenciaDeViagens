create database AgenciaDeViagens;
use agenciadeviagens;


CREATE TABLE Checkout (
IdCheckout int primary key auto_increment,
IdDestino int not null,
IdPromocao int not null,
IdHotel int not null,
IdVoo int not null,
Nome VARCHAR(45) not null,
Sobrenome VARCHAR(45) not null,
Email VARCHAR(45) unique not null,
Endereco VARCHAR(45) not null,
Complemento VARCHAR(200) not null,
Pais VARCHAR(20) not null,
Estado VARCHAR(2) not null,
Cep VARCHAR(20) not null,
PrecoPassagem double(10,2) not null,
FormasPagamento BOOLEAN not null
);

CREATE TABLE Destinos (
IdDestino int primary key auto_increment,
LocalViagem VARCHAR(35) not null,
ValorViagem double(7,2) not null
);

CREATE TABLE Passageiros (
IdPassageiro int primary key auto_increment,
Nome VARCHAR(45) not null,
Rg VARCHAR(25) unique not null,
Cpf VARCHAR(25) unique not null,
DataNascimento DATE not null,
Endereco VARCHAR(45) not null,
Complemento VARCHAR(200) not null,
Cep VARCHAR(20) not null,
Estado VARCHAR(2) not null,
Email VARCHAR(45) unique not null,
Telefone VARCHAR(45) not null
);

CREATE TABLE Passagens (
IdPassagem int primary key auto_increment,
IdCheckout int not null,
IdPassageiro int not null,
HoraViagem TIME not null,
NomeLocalOrigem VARCHAR(40) not null,
NomeLocalDestino VARCHAR(40) not null,
DataViagemIda DATE not null,
DataViagemVolta DATE not null,
FOREIGN KEY(IdCheckout) REFERENCES Checkout (IdCheckout),
FOREIGN KEY(IdPassageiro) REFERENCES Passageiros (IdPassageiro)
);

CREATE TABLE Promocoes (
IdPromocao int primary key auto_increment,
LocalViagem VARCHAR(35) not null,
ValorViagem double(7,2) not null
);

CREATE TABLE Hoteis (
IdHotel int primary key auto_increment,
LocalHotel VARCHAR(35) not null,
ValorHospedagem double(7,2) not null
);

CREATE TABLE Voos (
IdVoo int primary key auto_increment,
LinhaAerea VARCHAR(35) not null,
Origem VARCHAR(40) not null,
Destino VARCHAR(40) not null,
Partida DATETIME not null,
Chegada DATETIME not null,
Paradas int not null,
ValorVoo double(7,2) not null
);

ALTER TABLE Checkout ADD FOREIGN KEY(IdDestino) REFERENCES Destinos (IdDestino);
ALTER TABLE Checkout ADD FOREIGN KEY(IdPromocao) REFERENCES Promocoes (IdPromocao);
ALTER TABLE Checkout ADD FOREIGN KEY(IdHotel) REFERENCES Hoteis (IdHotel);
ALTER TABLE Checkout ADD FOREIGN KEY(IdVoo) REFERENCES Voos (IdVoo);

