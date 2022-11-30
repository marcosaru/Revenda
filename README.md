# Revenda
Programa desenvolvido para uma revenda de carro

Marcos Gonçalves Teixeira, UFSC, marcosaru89@gmail.com
Professor Alexandre Leopoldo Gonçalves, Banco de Dados I
Araranguá, SC, 01/12/2022

1.Visão geral do sistema
A construção desse sistema visa modelar e implementar um software para atender todas as 
necessidades de uma rede de revendas de carro, será possível fazer as operações básicas e 
avançadas do banco de dados para facilitar a organização da empresa e otimizar as receitas.

1.2.VISÃO DETALHADA DO SISTEMA.
Neste sistema vamos ter 13 entidades: 1-Cliente, 2-Colaborador, 3-Negócio,
4-Veiculo(5-Carro,6-Moto),7-Revisão,8-Revisão_Peça,9-Peça,10-Departamento,11-
Agencia,12-Meta,13-Publicidade.
 Colaborador irá pertencer somente a um departamento(vendas,mecanicos ou marketing) aos
que pertencem ao departamento de vendas será possível associar os negócios feito com o 
vendedor ele poderá fazer n negócios mas o negócio pode ter somente um vendedor, será feito 
também uma soma das vendas mensais se caso atingir 300.000 será distribuído um bônus para 
todos os colaboradores conforme seu multiplicador padrão do departamento. Os funcionários do 
departamento de marketing poderão utilizar recursos da empresa para investir em publicidade estes
registros serão inseridos na tabela publicidade. E os Mecânicos serão os responsáveis pode fazer 
as revisões.
Para cada veículo poderá ser solicitado uma revisão e será opcional a emissão de um 
laudo(somente se encontrar a necessidade), da mesma forma caso precise substituir alguma peça 
assim será feito e descontado da tabela de peça, se isso acontecer será registrado a quantidade de 
peças e o valor gasto na revisão na tabela revisao_peca.
Para a compra do veiculo será inserido um novo registro no banco. Na venda será subtraído o carro 
do banco. Se caso o veiculo for Carro será inserido na tabela carro e da mesma forma para Moto.
Para o cliente será possível armazenar seus dados e eventualmente se caso for preciso 
analisar um possível desconto poderá ser investigado seu relacionamento com a empresa através 
do seu histórico de compras ou venda.


Modelo Conceitual: 
<img src="https://i.postimg.cc/TPf6wL0y/Conceitual.jpg" />

Modelo Lógico do Banco de Dados:
<img src="https://uploaddeimagens.com.br/imagens/kdkS3CA"/>

