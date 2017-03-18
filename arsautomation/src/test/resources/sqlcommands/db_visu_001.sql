create table legal_entity (entity_number varchar2(255 char) not null, capital_amount number(10,0), name varchar2(255 char), share_count number(10,0), primary key (entity_number))
drop legal_entity;

Select RowID,entity_number,capital_amount,name,Share_count from legal_entity order by Entity_number
delete legal_entity
commit;

insert into legal_entity (entity_number) values ('EN11003');
insert into legal_entity (entity_number,capital_amount,name,Share_count) values ('EN11002',1002,'N-1002',102);
insert into legal_entity (capital_amount,name,Share_count) values (1002,'N-1002',102);


Select RowID,entity_number,capital_amount,name,Share_count from legal_entity where Entity_number='Entity01';
Select count(*) from legal_entity;