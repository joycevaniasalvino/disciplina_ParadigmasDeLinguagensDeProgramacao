/* modeloLogico: */

CREATE TABLE Tarefa (
    idTarefa int PRIMARY KEY,
    nm_tarefa varchar(100),
    observacao varchar(100),
    por_tarefa varchar(100)
);

CREATE TABLE Item_tarefa (
    idItem int PRIMARY KEY,
    num_ItemTarefa int,
    fk_Tarefa_idTarefa int
);
 
ALTER TABLE Item_tarefa ADD CONSTRAINT FK_Item_tarefa_2
    FOREIGN KEY (fk_Tarefa_idTarefa)
    REFERENCES Tarefa (idTarefa)
    ON DELETE RESTRICT;