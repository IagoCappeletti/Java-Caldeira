//Pega todos os Clientes do Banco de Dados
SELECT * FROM Clientes

//Pega todos os nomes dos CLiente do Banco de Dados
SELECT nome FROM Clientes

//Pega todos o valor total que seja maior que 100 da tabela Pedidos
SELECT * FROM Pedidos WHERE valor_total > 100;

//Pega todos os preços que seja menor que 50 da tabela Produtos
SELECT * FROM Produtos WHERE preco < 50;

//Atualizando o nome de um Cliente
UPDATE Clientes SET nome = 'Iago Cappeletti'WHERE id_cliente = 1;
SELECT id_cliente, nome FROM clientes WHERE id_cliente = 1;

//Deletando um produto
DELETE FROM produtos WHERE id_produto = 39;

SELECT id_produto, nome FROM produtos WHERE id_produto = 39;

//Selecionando todos pedidos do cliente com o id 29
SELECT * FROM Pedidos WHERE id_cliente = 29;

//Calculando a média dos preços da tabela produtos
SELECT AVG(preco) AS media_valores_produtos FROM Produtos 

//Criando nova tabela de funcionarios e inserindo dados nela.
CREATE TABLE funcionarios(
	nome varchar(255),
	cargo varchar(100),
	data_de_contratacao DATE
);

INSERT INTO funcionarios(nome, cargo, data_de_contratacao) VALUES
('Ana Lima', 'Analista Financeiro', '2023-11-16'),
  ('Fernando Oliveira', 'Engenheiro de Software', '2023-11-17'),
  ('Laura Costa', 'Designer Gráfico', '2023-11-18'),
  ('Ricardo Pereira', 'Coordenador de Marketing', '2023-11-19'),
  ('Isabel Souza', 'Analista de Recursos Humanos', '2023-11-20'),
  ('Márcio Alves', 'Analista de Qualidade', '2023-11-21'),
  ('Clara Santos', 'Gerente de Projetos', '2023-11-22'),
  ('Roberto Lima', 'Desenvolvedor Front-end', '2023-11-23'),
  ('Camila Oliveira', 'Analista de Vendas', '2023-11-24'),
  ('Diego Costa', 'Analista de Suporte Técnico', '2023-11-25');

SELECT * FROM funcionarios;