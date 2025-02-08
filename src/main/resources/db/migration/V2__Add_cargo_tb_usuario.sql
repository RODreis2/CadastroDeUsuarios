--Migrations para adicionar cargo na tabela de cadastros

ALTER TABLE tb_usuario
ADD COLUMN cargo VARCHAR(50);