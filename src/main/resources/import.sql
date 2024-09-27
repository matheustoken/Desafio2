INSERT INTO tb_categoria (descricao) VALUES ('CURSO');
INSERT INTO tb_categoria (descricao) VALUES ('OFICINA');


INSERT INTO tb_participante (nome, email) VALUES ('Matheus', 'matheus@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Tiago Campos', 'tiago@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Maria Gracilene', 'maria@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Giuliano', 'giu@gmail.com');



INSERT INTO tb_atividade (nome, descricao, preco, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 100.00, 1);
INSERT INTO tb_atividade (nome, descricao, preco, categoria_id) VALUES ('Python', 'O melhor curso de python do mercado', 100.00, 1);
INSERT INTO tb_atividade (nome, descricao, preco, categoria_id) VALUES ('Oficina de JAVA', 'Aprenda Java como nunca', 300.00, 2);
INSERT INTO tb_atividade (nome, descricao, preco, categoria_id) VALUES ('Oficina de Angular', 'O melhor curso de front end do mercado', 150.00, 2);


INSERT INTO tb_bloco(inicio,fim) VALUES (TIMESTAMP WITH TIME ZONE '2024-09-26T15:00:00Z',TIMESTAMP WITH TIME ZONE '2024-09-26T17:00:00Z')
INSERT INTO tb_bloco(inicio,fim) VALUES (TIMESTAMP WITH TIME ZONE '2024-09-26T12:00:00Z',TIMESTAMP WITH TIME ZONE '2024-09-26T17:00:00Z')
INSERT INTO tb_bloco(inicio,fim) VALUES (TIMESTAMP WITH TIME ZONE '2024-09-26T14:00:00Z',TIMESTAMP WITH TIME ZONE '2024-09-26T18:00:00Z')
INSERT INTO tb_bloco(inicio,fim) VALUES (TIMESTAMP WITH TIME ZONE '2024-09-25T14:00:00Z',TIMESTAMP WITH TIME ZONE '2024-09-26T18:00:00Z')

INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (1,1)
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (2,2)
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (1,2)
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES (2,1)
