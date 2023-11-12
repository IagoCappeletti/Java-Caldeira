//Esta instrução cria um esquema chamado "vendas" no banco de dados, se ele ainda não existir. A cláusula "IF NOT EXISTS" garante que o esquema só será criado se ainda não existir.//
CREATE SCHEMA IF NOT EXISTS vendas;

//Ao definir o caminho de pesquisa para "vendas", garanto que esquema está indicando ao sistema de banco de dados que, ao procurar por tabelas e outros objetos, ele deve primeiro procurar no esquema "vendas". Isso é útil para evitar conflitos de nome e garantir que você esteja trabalhando com os objetos no esquema desejado.//
SET search_path TO vendas;

//Para criar a tabela de Produtos com os atributos
CREATE TABLE Produtos(
	ID_Produto SERIAL PRIMARY KEY,
	Nome VARCHAR(255),
	Preco DECIMAL(6,2),
	Categoria VARCHAR(100)
);


//Para criar a tabela de Clientes com os atributos
CREATE TABLE Clientes (
    ID_Cliente SERIAL PRIMARY KEY,
    Nome VARCHAR(255),
    Email VARCHAR(255),
    Telefone VARCHAR(14)
);

//Para criar a tabela de Pedidos com os atributos e chave estrangeira referenciando a tabela "Clientes"
CREATE TABLE Pedidos (
    ID_Pedido SERIAL PRIMARY KEY,
    ID_Cliente INT,
    Data_Pedido DATE,
    Valor_Total NUMERIC(6,2),
    FOREIGN KEY (ID_Cliente) REFERENCES clientes (id_cliente)
);

//
CREATE TABLE DetalhesDoPedido(
    ID_Detalhe SERIAL PRIMARY KEY,
	Quantidade INT,
	ID_Pedido INT,
	ID_Produto INT,
	FOREIGN KEY (ID_Pedido) REFERENCES pedidos (id_pedido),
	FOREIGN KEY (ID_Produto) REFERENCES produtos(id_produto)
);

//https://jquerydicas.blogspot.com/2013/10/postgre-exportar-arquivo-csv-e-txt.html
//Caso queira geral um arquivo .csv ou txt usar comando a baixo
COPY(SELECT * FROM DetalhesDoPedido) TO 'C:\temp\arq_geral.txt' DELIMITER ';'
CSV HEADER
