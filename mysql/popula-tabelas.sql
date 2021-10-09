use rangoo;

drop database rangoo;

select * from cliente;
select * from restaurante;
select * from categoria;
select * from produto;
select * from item_venda;
select * from venda;

desc venda;



-- popular a tabela cliente
insert into cliente (nome, data_nascimento, cpf, telefone, endereco, numero, complemento, bairro, cep, cidade, uf, email, senha)
values ('Henrico Vidal Dias', '15/10/1986', '99999999999', '47999999999', 'Rua da Gloria', '3312', 'Apto 401', 'Progresso', '89022000', 'Blumenau', 'SC', 'henrico.diass@gmail.com', '12345');


-- popular a tabela restaurante
insert into restaurante (razao_social, nome_fantasia, cnpj, insc_est, telefone, endereco, numero, bairro, cep, cidade, uf)
values ('Arcos Dourados Comércio de Alimentos Ltda', 'Mc Donalds', '11444777000158', '388108598269', '16334053298', 'Rua Sete de Setembro', '1213', 'Centro', '89010203', 'Blumenau', 'SC');


-- popular a tabela categoria
insert into categoria (nome)
values 	('Bebidas'),
		('Pratos Executivos'),
		('Hamburguer'),
		('Porções');
	
-- popular a tabela produto
insert into produto (id_restaurante, id_categoria, nome, descricao, valor)
values 	(1, 3, 'McLanche Feliz', 'O McLanche Feliz acompanha hambúrguer com tomatinho, McFritas, uma refrescante bebida e danoninho', 23.90),
		(1, 3, 'Picanha Ceese Salada', 'Delicioso hambúrguer de picanha, molho de picanha, queijo ementhal, queijo cheddar, cebola empanada', 36.90);

-- popular a tabela item_venda
insert into item_venda (id_cliente, id_restaurante, id_produto, quantidade, subtotal)
values 	(1, 1, 1, 1, 23.90),
		(1, 1, 2, 2, 73.80);
		
-- popular a tabela venda
insert into venda (id_restaurante, id_cliente, id_item_venda, total, data_venda)
values 	(1, 1, 1, 97.70, '03/10/2021'),
		(1, 1, 2, 97.70, '03/10/2021');