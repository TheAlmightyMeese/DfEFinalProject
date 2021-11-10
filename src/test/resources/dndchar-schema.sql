drop table if exists `dndchar` CASCADE;
create table
 `dndchar` 
 (
 id integer AUTO_INCREMENT,
  age integer not null,
   alignment varchar(255),
    height integer not null,
     job varchar(255),
      name varchar(255),
       race varchar(255),
        weight double,
         primary key (id)
         );