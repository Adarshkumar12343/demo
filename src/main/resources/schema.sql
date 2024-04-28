create table project (id integer not null,
                      name varchar(50),
                      description varchar(256),
                      start_date date,
                      end_date date)   ;


insert into project (id,name,description,start_date,end_date) values (1,'Test name','Test Description',now(),now());