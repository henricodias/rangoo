create database rangoo;

use rangoo;

create table cliente (
	id				int not null auto_increment,
	nome			varchar(100),
	data_nascimento varchar(10),
	cpf				varchar(11),
	telefone		varchar(11),
	endereco		varchar(100),
	numero			varchar(5),
	complemento		varchar(100),
	bairro			varchar(100),
	cep				varchar(8),
	cidade			varchar(100),
	uf				varchar(2),
	email			varchar(100),
	senha			varchar(10),
	primary key(id)
	);

create table restaurante ( 
	id				int not null auto_increment,
	razao_social	varchar(100),
	nome_fantasia	varchar(100),
	cnpj			varchar(18),
	insc_est		varchar(50),
	telefone		varchar(11),
	endereco		varchar(100),
	numero			varchar(5),
	bairro			varchar(100),
	cep				varchar(8),
	cidade			varchar(100),
	uf				varchar(2),
	primary key(id)
	);

create table categoria (
	id				int not null auto_increment,
	nome			varchar(100),
	primary key(id)
	);

create table produto(
    id 				int not null auto_increment,
    id_restaurante	int not null,
    id_categoria	int not null,
    nome			varchar(100),
    descricao		varchar(4000),
    valor			float(5,2),
    primary key(id),
    constraint fk_produto_restaurante foreign key(id_restaurante) references restaurante(id),
    constraint fk_produto_categoria foreign key(id_categoria) references categoria(id)
	on delete no action
	on update no action
	);

create table venda(
    id				int not null auto_increment,
    id_restaurante	int not null,
    id_cliente		int not null,
    id_item_venda	int not null,
    total			float(5,2),
    data_venda		varchar(100),
    primary key(id),
    constraint fk_venda_restaurante foreign key(id_restaurante) references restaurante(id),
    constraint fk_venda_cliente foreign key(id_cliente) references cliente(id),
    constraint fk_venda_item_venda foreign key(id_item_venda) references item_venda(id)
	on delete no action
	on update no action
	);

create table item_venda(
    id					int not null auto_increment,
    id_cliente			int not null,
    id_restaurante		int not null,
    id_produto			int not null,
    quantidade			int,
    subtotal			float(5,2),
    primary key(id),
    constraint fk_item_venda_cliente foreign key(id_cliente) references cliente(id),
    constraint fk_item_venda_restaurante foreign key(id_restaurante) references restaurante(id),
    constraint fk_item_venda_produto foreign key(id_produto) references produto(id)
	on delete no action
	on update no action
	);

select * from usuario;
select * from cliente;
select * from restaurante;
select * from categoria;
select * from produto;
select * from venda;
select * from item_venda;

desc cliente;
desc restaurante;
desc categoria;
desc produto;
desc venda;
desc item_venda;

drop database rangoo;
