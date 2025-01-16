
CREATE DATABASE db_library;

USE db_library;

show tables;
DESCRIBE tbl_livros;
SELECT * FROM tbl_livros;


CREATE TABLE tbl_livros (
	id INT AUTO_INCREMENT PRIMARY KEY,
    isbn VARCHAR(20),
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    genero VARCHAR(100),
    data_lancamento INT,
    sinopse TEXT,
    foto VARCHAR(200) NOT NULL
);


INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-8535913482'
	'O Pequeno Príncipe',
    'Antoine de Saint',
    'Literatura Infantil',
    '1943',
    'O príncipe compartilha com o piloto suas experiências e encontros com diversas personagens, abordando temas como a amizade, o amor, a solidão e a importância de enxergar o mundo com o coração. Esta obra clássica de Antoine de Saint-Exupéry ensina lições atemporais sobre a vida e a infância.',
	'https://1.bp.blogspot.com/-ItTHm0XbZQ0/V3FO-peI0kI/AAAAAAAAET8/4YV9YWLyUZcY4uZAIecLqnReECl0fUsxQCKgB/s640/13501958_1211253632252204_8100328413881954605_n.png'
);


INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-6559172399',
	'A Monarquia Absolutista',
    'Ruan Cláudio da Silva Rosa',
    'História',
    '2021',
    'A Monarquia Absolutista é um sistema de governo onde o monarca detém o poder absoluto sobre o Estado, sem limitações constitucionais ou legais. O livro examina como esse regime se consolidou na Europa durante os séculos XVII e XVIII, destacando os reinados de figuras como Luís XIV da França, que proclamava "O Estado sou eu". ',
    'https://th.bing.com/th/id/OIP.9QjIUkXmwKtZVj2JxQg2oQAAAA?rs=1&pid=ImgDetMain'
);


INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-8567896045',
    'MVMB',
    'Carlos Eduardo de Carvalho',
    'Administração',
    '2019',
    'O livro “Mercado de Valores Mobiliários Brasileiro” aborda de forma didática as principais características do mercado de valores mobiliários brasileiro, sua relação com o Sistema Financeiro Nacional.',
    'https://livrariapublica.com.br/capas-lg/mercado.webp'
);


INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-8592340445',
    'O Prazer de Descobrir',
    'Dr. Marco Stanojev',
    'Didáticos',
    '2020',
    'Este livro foi pensado para o jovem que apresenta, já desde a infância, pendores científicos, ou seja, o desejo de querer saber, conhecer, descobrir. Falar sobre Ciência é falar sobre a humanidade, sobre a busca do conhecimento.',
    'https://livrariapublica.com.br/capas-lg/ciencia-descobrir.webp'
);



INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-8576942801',
    'Diário de uma Saudade',
    'Marcos Lessa',
    'Poesia',
    '2019',
    'O que fazer com os sentimentos quando alguém que amamos morre? Uma coisa sempre parece mais fácil de lidar quando acontece com os outros, mas desta vez foi comigo que aconteceu. Espere.. Vou abrir meu diário pra você entender…',
    'https://livrariapublica.com.br/capas-lg/diario-de-uma-saudade.webp'
);


INSERT INTO tbl_livros(isbn, titulo, autor, genero, data_lancamento, sinopse, foto)
values(
	'978-8556966698',
    'Ira & Reconhecimento',
    'André Gaulke',
    'Filosofia',
    '2012',
    'A partir de A República de Platão, o thymós (irascibilidade) é apresentado como o elemento moral e político da alma humana.  Esta obra tem como objetivo analisar o termo thymós e sua relação com a temática.',
    'https://livrariapublica.com.br/capas-lg/ira-e-reconhecimento.webp'
);