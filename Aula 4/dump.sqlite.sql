-- TABLE
CREATE TABLE demo (ID integer primary key, Name varchar(20), Hint text );
CREATE TABLE Item_tarefa (
    idItem int PRIMARY KEY,
    num_ItemTarefa int,
    fk_Tarefa_idTarefa int
);
CREATE TABLE Tarefa (
    idTarefa int PRIMARY KEY,
    nm_tarefa varchar(100),
    observacao varchar(100),
    por_tarefa varchar(100)
);
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
