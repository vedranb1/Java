drop database if exists dnevnikgledanja;
create database dnevnikgledanja;

use dnevnikgledanja;

create table korisnik (
sifra int not null primary key auto_increment,
username varchar(50) not null,
lozinka varchar(50) not null,
email varchar(50) not null,
uloga varchar(50) not null
);

create table serija(
sifra int not null primary key auto_increment,
korisnik int not null,
naziv varchar(50) not null,
obrisano bit(1)
);

create table sezona(
sifra int not null primary key auto_increment,
serija int not null,
naziv varchar(50) not null,
rednibroj int not null,
brojepizoda int not null,
pogledano int,
ocjena int,
obrisano bit(1)
);

create table hibernate_sequence(
next_val bigint(20) default 1
);

alter table serija add foreign key (korisnik) references korisnik(sifra);

alter table sezona add foreign key (serija) references serija(sifra);

insert into korisnik values (null, 'admin', 'admin', 'admin@edunova.hr', 'admin');

insert into korisnik values (null, 'user', 'user', 'user@edunova.hr', 'user');

insert into hibernate_sequence values (1);

