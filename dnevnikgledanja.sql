drop database if exists dnevnikgledanja;
create database dnevnikgledanja;

use dnevnikgledanja;

create table korisnik (
sifra int not null primary key auto_increment,
username varchar(50) not null,
email varchar(50) not null
);

create table dnevnik (
sifra int not null primary key auto_increment,
korisnik int not null
);

create table serija(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
dnevnik int not null
);

create table sezona(
sifra int not null primary key auto_increment,
serija int not null,
naziv varchar(50) not null,
rednibroj int not null,
);

create table epizoda(
sifra int not null primary key auto_increment,
sezona int not null,
naziv varchar(50) not null,
rednibroj int not null,
trajanje int not null
);

alter table dnevnik add foreign key (korisnik) references korisnik(sifra);

alter table serija add foreign key (dnevnik) references dnevnik(sifra);

alter table sezona add foreign key (serija) references serija(sifra);

alter table epizoda add foreign key (sezona) references sezona(sifra);