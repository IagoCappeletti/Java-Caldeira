//Selecione todos os clientes que fizeram mais de 3 pedidos na tabela "Clientes" e "Pedidos".

SELECT cli.id_cliente, cli.nome, COUNT(ped.id_pedido) AS total_pedidos
FROM Clientes cli
JOIN Pedidos ped ON cli.id_cliente = ped.id_cliente
GROUP BY cli.id_cliente, cli.nome
HAVING COUNT(ped.id_pedido) > 3;

//Crie uma consulta que retorne o nome do cliente e o valor total de todos os pedidos feitos por ele.
SELECT cli.nome AS nome_do_cliente, SUM(ped.valor_total) AS valor_total_pedidos
FROM Clientes cli
JOIN Pedidos ped ON cli.id_cliente = ped.id_cliente
GROUP BY cli.nome

//Aumentando os preços dos produtos com um percentual de 20%
UPDATE Produtos SET preco = preco * 1.20;

SELECT preco FROM Produtos;

//Consulta que retorne a lista de produtos mais vendidos com base na contagem de pedidos na tabela
SELECT p.nome AS nome_do_produto, SUM(d.quantidade) AS total_vendido
FROM Produtos p
JOIN DetalhesDoPedido d ON p.id_produto = d.id_produto
GROUP BY p.nome
ORDER BY total_vendido DESC;

//Crie uma consulta que calcule a média, a mediana e o desvio padrão dos preços dos produtos na tabela "Produtos".

SELECT 
  AVG(preco) AS media_precos,
  PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY preco) AS mediana_precos,
  STDDEV_SAMP(preco) AS desvio_padrao_precos
FROM Produtos;

//Selecione todos os pedidos feitos em um período de tempo específico, usando a tabela "Pedidos" e um intervalo de datas.

SELECT * FROM Pedidos
WHERE data_pedido BETWEEN '2023-01-01' AND '2023-12-31';

//Crie uma consulta que identifique os clientes que não fizeram nenhum pedido nos últimos 6 meses na tabela "Clientes" e "Pedidos".
SELECT c.* FROM Clientes c
LEFT JOIN Pedidos p ON c.id_cliente = p.id_cliente
WHERE p.id_pedido IS NULL OR p.data_pedido < CURRENT_DATE - INTERVAL '6 months';

//Crie uma consulta que classifique os produtos na tabela "Produtos" com base em seu preço, em ordem decrescente.
SELECT * FROM Produtos
ORDER BY preco DESC;


//Crie uma consulta que retorne o total de vendas por categoria de produto na tabela "Produtos" e "DetalhesDoPedido".
SELECT p.categoria, SUM(d.quantidade) AS total_vendido
FROM Produtos p
JOIN DetalhesDoPedido d ON p.id_produto = d.id_produto
GROUP BY p.categoria;

