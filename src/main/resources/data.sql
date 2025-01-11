drop table masini;

create table masini (
    Nr_inmatriculare varchar(10) primary key ,
    Marca varchar(45),
    An_fabricatie integer,
    Culoare varchar(45),
    Nr_kilometri integer
);

insert into masini values ('TM14MAD', 'BMW', 2020, 'negru', 3500);
insert into masini values ('GJ99WMH', 'Audi', 2019, 'alb', 5000);
insert into masini values ('B109RPE', 'Renault', 2010, 'rosu', 10000);
insert into masini values ('TM34FLV', 'Passat', 2007, 'negru', 6000);
insert into masini values ('AR89CXG', 'Porsche', 2024, 'auriu', 1500);