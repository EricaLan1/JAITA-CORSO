use libro;

show create table libro;

select 
	table_name, 
    column_name, 
    constraint_name,
    referenced_table_name,
    referenced_column_name
from information_schema.key_column_usage
where table_schema= 'libro'   -- se voglio conoscere tutte le chiavi esterne di un database
and referenced_column_name is not null;