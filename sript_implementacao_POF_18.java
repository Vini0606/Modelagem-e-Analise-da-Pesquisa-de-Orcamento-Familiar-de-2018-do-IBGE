CREATE SCHEMA "POF_2018" AUTHORIZATION "2222120010_Vinicius";

-- Criar Registros UF e ESTRATO_POF
	
	CREATE TABLE "POF_2018".UF(	
		UF varchar(100),
		Cd_UF varchar(2),
		CONSTRAINT PK_UF PRIMARY KEY (Cd_UF)
	);

	CREATE TABLE "POF_2018".ESTRATO(
		UF varchar(100),
		ESTRATO varchar(100),
		COD_ESTRATO varchar(4),
		CONSTRAINT PK_ESTRATO_POF PRIMARY KEY (COD_ESTRATO)
	);

-- Criar e Preencher Registro TIPO_SITUACAO_REG

	CREATE TABLE "POF_2018".TIPO_SITUACAO_REG(
		TIPO_SITUACAO_DOM varchar(50),
		COD_TIPO_SITUACAO_DOM varchar(1),
		CONSTRAINT PK_TIPO_SITUACAO_REG PRIMARY KEY (COD_TIPO_SITUACAO_DOM)
	);

	INSERT INTO "POF_2018".TIPO_SITUACAO_REG 
	VALUES('Urbano', '1'),
		  ('Rural', '2');
  
-- Criar e Preencher Registro QUESTIONARIO

	CREATE TABLE "POF_2018".QUESTIONARIO(
		RESPOSTA varchar(30),
		COD_RESPOSTA varchar(1),
		CONSTRAINT PK_QUESTIONARIO PRIMARY KEY (COD_RESPOSTA)
	);

	INSERT INTO "POF_2018".QUESTIONARIO 
	VALUES('Sim', '1'),
		  ('Não', '2'),
		  ('Não', '0');

-- Criar Registro OCUPACAO_COD

	CREATE TABLE "POF_2018".OCUPACAO_COD(
		GRANDE_GRUPO varchar(1),
		SUBGRUPO_PRINCIPAL varchar(2),
		SUBGRUPO varchar(3),
		GRUPO_BASE varchar(4),
		DENOMINACAO varchar(300),
		CONSTRAINT PK_OCUPACAO_COD PRIMARY KEY (GRUPO_BASE)
	);

-- Criar Registro ATIVIDADE_CNAE

	CREATE TABLE "POF_2018".ATIVIDADE_CNAE(
		SECAO varchar(1),
		DIVISAO varchar(2),
		CLASSE varchar(5),
		DENOMINACAO varchar(300),
		CONSTRAINT PK_ATIVIDADE_CNAE PRIMARY KEY (CLASSE)
	);

-- Criar e Preencher Registro V0201

	CREATE TABLE "POF_2018".V0201(
		TIPO_DOM varchar(300),
		COD_TIPO_DOM varchar(1),
		CONSTRAINT PK_V0201 PRIMARY KEY (COD_TIPO_DOM)
	);

	INSERT INTO "POF_2018".V0201 
	VALUES('Casa', '1'),
		  ('Apartamento', '2'),
		  ('Habitação em casa de cômodos, cortiço ou cabeça de porco', '3');


-- Criar e Preencher Registro V0202

	CREATE TABLE "POF_2018".V0202(
		TIPO_MATERIAL_PAREDE varchar(600),
		COD_MATERIAL_PAREDE varchar(1),
		CONSTRAINT PK_V0202 PRIMARY KEY (COD_MATERIAL_PAREDE)
	);

	INSERT INTO "POF_2018".V0202 
	VALUES('Alvenaria com revestimento / Taipa com revestimento', '1'),
		  ('Alvenaria sem revestimento', '2'),
		  ('Taipa sem revestimento', '3'),
		  ('Madeira apropriada para construção (aparelhada)', '4'),
		  ('Madeira aproveitada', '5'),
		  ('Outro material', '6');

-- Criar e Preencher Registro V0203

	CREATE TABLE "POF_2018".V0203(
		TIPO_TELHADO varchar(600),
		COD_TIPO_TELHADO varchar(1),
		CONSTRAINT PK_V0203 PRIMARY KEY (COD_TIPO_TELHADO)
	);

	INSERT INTO "POF_2018".V0203 
	VALUES('Telha sem laje de concreto', '1'),
		  ('Telha com laje de concreto', '2'),
		  ('Somente laje de concreto', '3'),
		  ('Madeira apropriada para construção (aparelhada)', '4'),
		  ('Zinco, alumínio ou chapa metálica', '5'),
		  ('Outro material', '6');

-- Criar e Preencher Registro V0204

	CREATE TABLE "POF_2018".V0204(
		TIPO_MATERIAL_PISO varchar(600),
		COD_TIPO_MATERIAL_PISO varchar(1),
		CONSTRAINT PK_V0204 PRIMARY KEY (COD_TIPO_MATERIAL_PISO)
	);

	INSERT INTO "POF_2018".V0204 
	VALUES('Cerâmica, lajota ou pedra', '1'),
		  ('Madeira apropriada para construção (aparelhada)', '2'),
		  ('Cimento', '3'),
		  ('Terra', '4'),
		  ('Outro Material', '5');

-- Criar e Preencher Registro V0207

	CREATE TABLE "POF_2018".V0207(
		TIPO_ABASTECIMENTO varchar(500),
		COD_ABASTECIMENTO varchar(1),
		CONSTRAINT PK_V0207 PRIMARY KEY (COD_ABASTECIMENTO)
	);

	INSERT INTO "POF_2018".V0207 
	VALUES('Rede geral de distribuição', '1'),
		  ('Poço profundo ou artesiano', '2'),
		  ('Poço raso, freático ou cacimba', '3'),
		  ('Fonte ou nascente', '4'),
		  ('Água da chuva armazenada', '5'),
		  ('Outra forma', '6');

-- Criar e Preencher Registro V0208

	CREATE TABLE "POF_2018".V0208(
		FREQ_AGUA_30_DIAS_REDE_GERAL varchar(800),
		COD_FREQ_AGUA_30_DIAS_REDE_GERAL varchar(1),
		CONSTRAINT PK_V0208 PRIMARY KEY (COD_FREQ_AGUA_30_DIAS_REDE_GERAL)
	);

	INSERT INTO "POF_2018".V0208 
	VALUES('Diariamente', '1'),
		  ('De 4 a 6 dias na semana', '2'),
		  ('De 1 a 3 dias na semana ', '3'),
		  ('Outra frequência', '4');

-- Criar e Preencher Registro V0209

	CREATE TABLE "POF_2018".V0209(
		TIPO_ABASTECIMENTO_AGUA varchar(1000),
		COD_TIPO_ABASTECIMENTO_AGUA varchar(1),
		CONSTRAINT PK_V0209 PRIMARY KEY (COD_TIPO_ABASTECIMENTO_AGUA)
	);

	INSERT INTO "POF_2018".V0209 
	VALUES('Canalizada em pelo menos um cômodo', '1'),
		  ('Canalizada só na propriedade ou terreno', '2'),
		  ('Não canalizada ', '3');

-- Criar e Preencher Registro V0212

	CREATE TABLE "POF_2018".V0212(
		TIPO_ESCOADOURO_DEJETOS varchar(1000),
		COD_ESCOADOURO varchar(1),
		CONSTRAINT PK_V0212 PRIMARY KEY (COD_ESCOADOURO)
	);

	INSERT INTO "POF_2018".V0212
	VALUES('Rede geral, rede pluvial ou fossa ligada à rede', '1'),
		  ('Fossa não ligada à rede', '2'),
		  ('Vala', '3'),
		  ('Rio, lago ou mar', '4'),
		  ('Outra forma', '5');

-- Criar e Preencher Registro V0213

	CREATE TABLE "POF_2018".V0213(
		DESTINO_LIXO varchar(1000),
		COD_DESTINO_LIXO varchar(1),
		CONSTRAINT PK_V0213 PRIMARY KEY (COD_DESTINO_LIXO)
	);

	INSERT INTO "POF_2018".V0213 
	VALUES('Coletado diretamente por serviço de limpeza', '1'),
		  ('Coletado em caçamba de serviço de limpeza', '2'),
		  ('Queimado (na propriedade)', '3'),
		  ('Enterrado (na propriedade)', '4'),
		  ('Jogado em terreno baldio ou logradouro', '5'),
		  ('Outro destino', '6');

-- Criar e Preencher Registro V0215

	CREATE TABLE "POF_2018".V0215(
		FREQ_ENERGIA_REDE_GERAL varchar(1000),
		COD_FREQ_ENERGIA_REDE_GERAL varchar(1),
		CONSTRAINT PK_V0215 PRIMARY KEY (COD_FREQ_ENERGIA_REDE_GERAL)
	);

	INSERT INTO "POF_2018".V0215 
	VALUES('Diária, em tempo integral', '1'),
		  ('Diária, por algumas horas', '2'),
		  ('Outra frequência', '3');

-- Criar e Preencher Registro V0217

	CREATE TABLE "POF_2018".V0217(
		TIPO_PROPRIEDADE_DOM varchar(1000),
		COD_TIPO_PROPRIEDADE_DOM varchar(1),
		CONSTRAINT PK_V0217 PRIMARY KEY (COD_TIPO_PROPRIEDADE_DOM)
	);

	INSERT INTO "POF_2018".V0217
	VALUES('Próprio de algum morador – já pago', '1'),
		  ('Próprio de algum morador – ainda pagando', '2'),
		  ('Alugado', '3'),
		  ('Cedido por empregador', '4'),
		  ('Cedido por familiar', '5'),
		  ('Cedido de outra forma', '6'),
		  ('Outra condição', '7');

-- Criar e Preencher Registro V0219

	CREATE TABLE "POF_2018".V0219(
		TIPO_CONTRATO_ALUGUEL varchar(1000),
		COD_TIPO_CONTRATO_ALUGUEL varchar(1),
		CONSTRAINT PK_V0219 PRIMARY KEY (COD_TIPO_CONTRATO_ALUGUEL)
	);

	INSERT INTO "POF_2018".V0219 
	VALUES('Verbal (“só de boca”)', '1'),
		  ('Documentado através de imobiliária', '2'),
		  ('Documentado através de outra fonte', '3');

-- Criar e Preencher Registro V0221

	CREATE TABLE "POF_2018".V0221(
		TIPO_SERVICO_CORREIOS_DOM varchar(150),
		COD_TIPO_SERVICO_CORREIOS_DOM varchar(1),
		CONSTRAINT PK_V0221 PRIMARY KEY (COD_TIPO_SERVICO_CORREIOS_DOM)
	);

	INSERT INTO "POF_2018".V0221
	VALUES('Por entrega domiciliária (pelo carteiro)', '1'),
		  ('Em caixa postal comunitária – CPC', '2'),
		  ('Em agência de correiros mais próxima', '3'),
		  ('Por entrega em outro endereço', '4'),
		  ('Por outra forma', '5');

-- Criar e Preencher Registro V6199

	CREATE TABLE "POF_2018".V6199(
		TIPO_SEGUNRANCA_ALIMENTAR varchar(150),
		COD_TIPO_SEGUNRANCA_ALIMENTAR varchar(1),
		CONSTRAINT PK_V6199 PRIMARY KEY (COD_TIPO_SEGUNRANCA_ALIMENTAR)
	);

	INSERT INTO "POF_2018".V6199 
	VALUES('Segurança', '1'),
		  ('Insegurança leve', '2'),
		  ('Insegurança moderada', '3'),
		  ('Insegurança grave', '4');

-- Criar e Preencher Registro NIVEL_INSTRUCAO

	CREATE TABLE "POF_2018".NIVEL_INSTRUCAO(
		NIVEL_INSTRUCAO varchar(150),
		COD_NIVEL_INSTRUCAO varchar(1),
		CONSTRAINT PK_NIVEL_INSTRUCAO PRIMARY KEY (COD_NIVEL_INSTRUCAO)
	);

	INSERT INTO "POF_2018".NIVEL_INSTRUCAO
	VALUES('Sem instrução', '1'),
		  ('Ensino Fundamental Incompleto', '2'),
		  ('Ensino Fundamental Completo', '3'),
		  ('Ensino Médio Incompleto', '4'),
		  ('Ensino Médio Completo', '5'),
		  ('Ensino Superior Incompleto', '6'),
		  ('Ensino Superior Completo', '7');

-- Criar e Preencher Registro V0306

	CREATE TABLE "POF_2018".V0306(
		CONDICAO_UNIDADE_CONSUMO varchar(800),
		COD_CONDICAO_UNIDADE_CONSUMO varchar(2),
		CONSTRAINT PK_V0306 PRIMARY KEY (COD_CONDICAO_UNIDADE_CONSUMO)
	);

	INSERT INTO "POF_2018".V0306
	VALUES('Pessoa de referência da UC', '1'),
		  ('Cônjuge ou companheiro(a) de sexo diferente', '2'),
		  ('Cônjuge ou companheiro(a) do mesmo sexo', '3'),
		  ('Filho(a) da pessoa de referência e do cônjuge', '4'),
		  ('Filho(a) somente da pessoa de referência ', '5'),
		  ('Filho(a) somente do cônjuge', '6'),
		  ('Genro ou nora', '7'),
		  ('Pai, mãe, padrasto ou madrasta', '8'),
		  ('Sogro(a)', '9'),
		  ('Neto(a)', '10'),
		  ('Bisneto(a)', '11'),
		  ('Irmão ou irmã', '12'),
		  ('Avô ou avó', '13'),
		  ('Outro parente', '14'),
		  ('Agregado(a) – não parente que não compartilha despesas', '15'),
		  ('Convivente – não parente que compartilha despesas', '16'),
		  ('Pensionista', '17'),
		  ('Empregado(a) doméstico(a)', '18'),
		  ('Parente do(a) empregado(a) doméstico(a)', '19');

-- Criar e Preencher Registro V0401

	CREATE TABLE "POF_2018".V0401(
		CONDICAO_PRESENCA_NO_MOMENTO_PESQUISA varchar(600),
		COD_CONDICAO_PRESENCA_NO_MOMENTO_PESQUISA varchar(1),
		CONSTRAINT PK_V0401 PRIMARY KEY (COD_CONDICAO_PRESENCA_NO_MOMENTO_PESQUISA)
	);

	INSERT INTO "POF_2018".V0401 
	VALUES('Morador Presente', '1'),
		  ('Morador Ausente', '2');
		  

-- Criar e Preencher Registro V0404

	CREATE TABLE "POF_2018".V0404(
		SEXO varchar(120),
		COD_SEXO varchar(1),
		CONSTRAINT PK_V0404 PRIMARY KEY (COD_SEXO)
	);

	INSERT INTO "POF_2018".V0404 
	VALUES('Homem', '1'),
		  ('Mulher', '2');

-- Criar e Preencher Registro V0405

	CREATE TABLE "POF_2018".V0405(
		COR_OU_RACA varchar(120),
		COD_COR_OU_RACA varchar(1),
		CONSTRAINT PK_V0405 PRIMARY KEY (COD_COR_OU_RACA)
	);

	INSERT INTO "POF_2018".V0405 
	VALUES('Branca', '1'),
		  ('Preta', '2'),
		  ('Amarela', '3'),
		  ('Parda', '4'),
		  ('Indígena', '5'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V0418

	CREATE TABLE "POF_2018".V0418(
		TIPO_ESCOLA_OU_CRECHE_FREQUENTADA varchar(120),
		COD_TIPO_ESCOLA_OU_CRECHE_FREQUENTADA varchar(1),
		CONSTRAINT PK_V0418 PRIMARY KEY (COD_TIPO_ESCOLA_OU_CRECHE_FREQUENTADA)
	);

	INSERT INTO "POF_2018".V0418 
	VALUES('Rede privada', '1'),
		  ('Rede pública', '2');

-- Criar e Preencher Registro V0419

	CREATE TABLE "POF_2018".V0419(
		TIPO_CURSO_FREQUENTADO varchar(600),
		COD_TIPO_CURSO_FREQUENTADO varchar(2),
		CONSTRAINT PK_V0419 PRIMARY KEY (COD_TIPO_CURSO_FREQUENTADO)
	);

	INSERT INTO "POF_2018".V0419
	VALUES('Creche', '1'),
		  ('Pré-escola', '2'),
		  ('Alfabetização de jovens e adultos', '3'),
		  ('Regular do ensino fundamental', '4'),
		  ('Educação de jovens e adultos – EJA do ensino fundamental', '5'),
		  ('Regular do ensino médio', '6'),
		  ('Educação de jovens e adultos – EJA do ensino médio', '7'),
		  ('Superior – graduação', '8'),
		  ('Especialização de nível superior (duração mínima de 360 horas)', '9'),
		  ('Mestrado', '10'),
		  ('Doutorado', '11');

-- Criar e Preencher Registro V0420

	CREATE TABLE "POF_2018".V0420(
		DURACAO_CURSO_FREQUENTADO varchar(120),
		COD_DURACAO_CURSO_FREQUENTADO varchar(1),
		CONSTRAINT PK_V0420 PRIMARY KEY (COD_DURACAO_CURSO_FREQUENTADO)
	);

	INSERT INTO "POF_2018".V0420 
	VALUES('8 anos', '1'),
		  ('9 anos', '2');

-- Criar e Preencher Registro V0421

	CREATE TABLE "POF_2018".V0421(
		TIPO_ORGANIZACAO_CURSO_FREQUENTADO varchar(120),
		COD_TIPO_ORGANIZACAO_CURSO_FREQUENTADO varchar(1),
		CONSTRAINT PK_V0421 PRIMARY KEY (COD_TIPO_ORGANIZACAO_CURSO_FREQUENTADO)
	);

	INSERT INTO "POF_2018".V0421 
	VALUES('Períodos semestrais', '1'),
		  ('Anos', '2'),
		  ('Outra forma', '3');

-- Criar e Preencher Registro V0422

	CREATE TABLE "POF_2018".V0422(
		ANO_SEMESTRE_SERIE_FREQUENTADA varchar(1200),
		COD_ANO_SEMESTRE_SERIE_FREQUENTADA varchar(2),
		CONSTRAINT PK_V0422 PRIMARY KEY (COD_ANO_SEMESTRE_SERIE_FREQUENTADA)
	);

	INSERT INTO "POF_2018".V0422
	VALUES('Primeira(o)', '1'),
		  ('Segunda(o)', '2'),
		  ('Terceira(o)', '3'),
		  ('Quarta(o)', '4'),
		  ('Quinta(o)', '5'),
		  ('Sexta(o)', '6'),
		  ('Sétima(o)', '7'),
		  ('Oitava(o)', '8'),
		  ('Nona(o)', '9'),
		  ('Décimo', '10'),
		  ('Décimo primeiro', '11'),
		  ('Décimo segundo', '12'),
		  ('Curso  não classificado em séries ou anos', '13');

-- Criar e Preencher Registro V0425

	CREATE TABLE "POF_2018".V0425(
		CURSO_MAIS_ELEVADO_FREQUENTADO varchar(1500),
		COD_CURSO_MAIS_ELEVADO_FREQUENTADO varchar(2),
		CONSTRAINT PK_V0425 PRIMARY KEY (COD_CURSO_MAIS_ELEVADO_FREQUENTADO)
	);

	INSERT INTO "POF_2018".V0425
	VALUES('Creche', '1'),
		  ('Pré-escola', '2'),
		  ('Classe de alfabetização – CA', '3'),
		  ('Alfabetização de jovens e adultos', '4'),
		  ('Antigo primário (elementar)', '5'),
		  ('Antigo ginasial (médio 1º ciclo)', '6'),
		  ('Regular do ensino fundamental ou do 1º grau', '7'),
		  ('Educação de jovens e adultos – EJA do ensino fundamental ou supletivo do 1º grau', '8'),
		  ('Antigo científico, clássico, etc. (médio 2º ciclo)', '9'),
		  ('Regular do ensino médio ou do 2º grau', '10'),
		  ('Educação de jovens e adultos – EJA do ensino médio ou supletivo do 2º grau', '11'),
		  ('Superior – graduação', '12'),
		  ('Especialização de nível superior (duração mínima de 360 horas)', '13'),
		  ('Mestrado', '14'),
		  ('Doutorado', '15');

-- Criar e Preencher Registro V0428

	CREATE TABLE "POF_2018".V0428(
		CONCLUIU_PRIMEIRO_ANO_SERIE_SEMESTRE_CURSO_FREQUENTADO varchar(1500),
		COD_CONCLUIU_PRIMEIRO_ANO_SERIE_SEMESTRE_CURSO_FREQUENTADO varchar(1),
		CONSTRAINT PK_V0428 PRIMARY KEY (COD_CONCLUIU_PRIMEIRO_ANO_SERIE_SEMESTRE_CURSO_FREQUENTADO)
	);

	INSERT INTO "POF_2018".V0428
	VALUES('Sim', '1'),
		  ('Não', '2'),
		  ('Curso não classificado em séries ou anos', '3');

-- Criar e Preencher Registro C1

	CREATE TABLE "POF_2018".C1(
		COMPOSICAO_DEMOGRAFICA varchar(100),
		COD_COMPOSICAO_DEMOGRAFICA varchar(1),
		CONSTRAINT PK_C1 PRIMARY KEY (COD_COMPOSICAO_DEMOGRAFICA)
	);

	INSERT INTO "POF_2018".C1
	VALUES('Até 24 anos', '1'),
		  ('25 a 49 anos', '2'),
		  ('50 a 64 anos', '3'),
		  ('65 anos ou mais', '4');

-- Criar e Preencher Registro C2

	CREATE TABLE "POF_2018".C2(
		COR_OU_RACA_PESSOA_REFERENCIA varchar(100),
		COD_COR_OU_RACA_PESSOA_REFERENCIA varchar(1),
		CONSTRAINT PK_C2 PRIMARY KEY (COD_COR_OU_RACA_PESSOA_REFERENCIA)
	);

	INSERT INTO "POF_2018".C2
	VALUES('Brancos', '1'),
		  ('Pretos e Pardos', '2'),
		  ('Outros', '3');

-- Criar e Preencher Registro C5

	CREATE TABLE "POF_2018".C5(
		TIPO_OCUPACAO_PESSOA_REFERENCIA varchar(100),
		COD_TIPO_OCUPACAO_PESSOA_REFERENCIA varchar(1),
		CONSTRAINT PK_C5 PRIMARY KEY (COD_TIPO_OCUPACAO_PESSOA_REFERENCIA)
	);

	INSERT INTO "POF_2018".C5
	VALUES('Empregado Doméstico', '1'),
		  ('Empregado privado', '2'),
		  ('Militar e empregado do setor público', '3'),
		  ('Conta própria', '4'),
		  ('Empregador', '5'),
		  ('Fora da força de trabalho e outros casos', '6');

-- Criar e Preencher Registro C6

	CREATE TABLE "POF_2018".C6(
		COMPOSICAO_FAMILIAR varchar(120),
		COD_COMPOSICAO_FAMILIAR varchar(1),
		CONSTRAINT PK_C6 PRIMARY KEY (COD_COMPOSICAO_FAMILIAR)
	);

	INSERT INTO "POF_2018".C6
	VALUES('Um adulto sem criança', '1'),
		  ('Um adulto com ao menos uma criança', '2'),
		  ('Mais de um adulto sem criança', '3'),
		  ('Mais de um adulto com ao menos uma criança', '4'),
		  ('Um ou mais idosos com ou sem crianças', '5'),
		  ('Um ou mais idosos, com ao menos um adulto, com ou sem crianças', '6');

-- Criar e Preencher Registro GRANDE_REGIAO

	CREATE TABLE "POF_2018".GRANDE_REGIAO(
		REGIAO_GEOGRAFICA varchar(120),
		COD_REGIAO_GEOGRAFICA varchar(1),
		CONSTRAINT PK_GRANDE_REGIAO PRIMARY KEY (COD_REGIAO_GEOGRAFICA)
	);

	INSERT INTO "POF_2018".GRANDE_REGIAO
	VALUES('Norte', '1'),
		  ('Nordeste', '2'),
		  ('Sudeste', '3'),
		  ('Sul', '4'),
		  ('Centro Oeste', '5');

-- Criar e Preencher Registro V9010

	CREATE TABLE "POF_2018".V9010(
		MESES varchar(120),
		COD_MESES varchar(2),
		CONSTRAINT PK_MESES PRIMARY KEY (COD_MESES)
	);

	INSERT INTO "POF_2018".V9010
	VALUES('Janeiro', '1'),
		  ('Fevereiro', '2'),
		  ('Março', '3'),
		  ('Abril', '4'),
		  ('Maio', '5'),
		  ('Junho', '6'),
		  ('Julho', '7'),
		  ('Agosto', '8'),
		  ('Setembro', '9'),
		  ('Outubro', '10'),
		  ('Novembro', '11'),
		  ('Dezembro', '12');

-- Criar e Preencher Registro COD_IMPUT_QTD

	CREATE TABLE "POF_2018".COD_IMPUT_QTD(
		QUANTIDADE_IMPUTADA varchar(120),
		COD_QUANTIDADE_IMPUTADA varchar(1),
		CONSTRAINT PK_COD_IMPUT_QTD PRIMARY KEY (COD_QUANTIDADE_IMPUTADA)
	);
	
	INSERT INTO "POF_2018".COD_IMPUT_QTD
	VALUES('Quantidade em Kwh não foi imputada', '0'),
		  ('Quantidade em Kwh foi imputada', '1');		  


-- Criar e Preencher Registro COD_IMPUT_VALOR

	CREATE TABLE "POF_2018".COD_IMPUT_VALOR(
		VALOR_IMPUTADO varchar(120),
		COD_VALOR_IMPUTADO varchar(1),
		CONSTRAINT PK_COD_IMPUT_VALOR PRIMARY KEY (COD_VALOR_IMPUTADO)
	);

	INSERT INTO "POF_2018".COD_IMPUT_VALOR
	VALUES('Valor não foi imputado', '0'),
		  ('Valor foi imputado', '1');

-- Criar e Preencher Registro V1905

	CREATE TABLE "POF_2018".V1905(
		TIPO_SERVICO_DOMESTICO_CONTRATADO varchar(120),
		COD_TIPO_SERVICO_DOMESTICO_CONTRATADO varchar(1),
		CONSTRAINT PK_V1905 PRIMARY KEY (COD_TIPO_SERVICO_DOMESTICO_CONTRATADO)
	);

	INSERT INTO "POF_2018".V1905
	VALUES('Mensalista', '1'),
		  ('Diarista', '3'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V9002

	CREATE TABLE "POF_2018".V9002(
		FORMA_AQUISICAO varchar(120),
		COD_FORMA_AQUISICAO varchar(2),
		CONSTRAINT PK_V9002 PRIMARY KEY (COD_FORMA_AQUISICAO)
	);

	INSERT INTO "POF_2018".V9002
	VALUES('Monetária à vista para a Unidade de Consumo', '1'),
		  ('Monetária à vista para outra Unidade de Consumo', '2'),
		  ('Monetária a prazo para a Unidade de Consumo', '3'),
		  ('Monetária a prazo para outra Unidade de Consumo', '4'),
		  ('Cartão de crédito à vista para a Unidade de Consumo', '5'),
		  ('Cartão de crédito à vista para outra Unidade de Consumo', '6'),
		  ('Doação', '7'),
		  ('Retirada do Negócio', '8'),
		  ('Troca', '9'),
		  ('Produção Própria', '10'),
		  ('Outra', '11');

-- Criar e Preencher Registro V9012

	CREATE TABLE "POF_2018".V9012(
		ESTADO_PRODUTO varchar(120),
		COD_ESTADO_PRODUTO varchar(1),
		CONSTRAINT PK_V9012 PRIMARY KEY (COD_ESTADO_PRODUTO)
	);
	
	INSERT INTO "POF_2018".v9012 
	VALUES ('Novo', '1'),
		   ('Usado', '3'),
	       ('Sem declaração', '9');

-- Criar Registro CADASTRO_LOCAIS_AQUISICAO

	CREATE TABLE "POF_2018".CADASTRO_LOCAIS_AQUISICAO(
		COD_LOCAL_AQUISICAO varchar(5),
		LOCAL_AQUISICAO varchar(120),
		CONSTRAINT PK_CADASTRO_LOCAIS_AQUISICAO PRIMARY KEY (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro CADASTRO_PRODUTOS

	CREATE TABLE "POF_2018".CADASTRO_PRODUTOS(
		QUADRO numeric(8),
		CODIGO_PRODUTO varchar(7),
		PRODUTO varchar(350),
		CONSTRAINT PK_CADASTRO_PRODUTOS PRIMARY KEY (CODIGO_PRODUTO)
	);

-- Criar Registro CADASTRO_PRODUTOS_CONSUMO_ALIMENTAR

	CREATE TABLE "POF_2018".CADASTRO_PRODUTOS_CONSUMO_ALIMENTAR(
		COD_ALIMENTO varchar(7),
		ALIMENTO varchar(350),
		CONSTRAINT PK_CADASTRO_PRODUTOS_CONSUMO_ALIMENTAR PRIMARY KEY (COD_ALIMENTO)
	);

-- Criar Registro UNIDADE_MEDIDA

	CREATE TABLE "POF_2018".UNIDADE_MEDIDA(
		COD_UNIDADE_MEDIDA varchar(5),
		UNIDADE_MEDIDA varchar(350),
		CONSTRAINT PK_UNIDADE_MEDIDA PRIMARY KEY (COD_UNIDADE_MEDIDA)
	);

-- Criar Registro UNIDADE_MEDIDA_CONSUMO_ALIMENTAR

	CREATE TABLE "POF_2018".UNIDADE_MEDIDA_CONSUMO_ALIMENTAR(
		COD_UNIDADE_MEDIDA varchar(5),
		UNIDADE_MEDIDA varchar(350),
		CONSTRAINT PK_UNIDADE_MEDIDA_CONSUMO_ALIMENTAR PRIMARY KEY (COD_UNIDADE_MEDIDA)
	);

-- Criar e Preencher Registro PESO_VOLUME

	CREATE TABLE "POF_2018".PESO_VOLUME(
		COD_PESO_OU_VOLUME varchar(5),
		PESO_OU_VOLUME varchar(350),
		CONSTRAINT PK_PESO_VOLUME PRIMARY KEY (COD_PESO_OU_VOLUME)
	);

-- Criar e Preencher Registro V4104

	CREATE TABLE "POF_2018".V4104(
		MOTIVO_VIAGEM_ASSOSSIADA_A_DESPESA varchar(120),
		COD_MOTIVO_VIAGEM_ASSOSSIADA_A_DESPESA varchar(1),
		CONSTRAINT PK_V4104 PRIMARY KEY (COD_MOTIVO_VIAGEM_ASSOSSIADA_A_DESPESA)
	);

	INSERT INTO "POF_2018".V4104
	VALUES('Lazer, recreio e férias', '1'),
		  ('Visita a parentes e amigos', '2'),
		  ('Negócios e motivos profissionais', '3'),
		  ('Educação', '4'),
		  ('Tratamentos médicos', '5'),
		  ('Religião, peregrinações', '6'),
		  ('Outros motivos', '7'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V4105

	CREATE TABLE "POF_2018".V4105(
		ORIGEM_DESPESA_AQUISICAO_RELACIONADA_A_VIAGEM varchar(120),
		COD_ORIGEM_DESPESA_AQUISICAO_RELACIONADA_A_VIAGEM varchar(1),
		CONSTRAINT PK_V4105 PRIMARY KEY (COD_ORIGEM_DESPESA_AQUISICAO_RELACIONADA_A_VIAGEM)
	);

	INSERT INTO "POF_2018".V4105
	VALUES('Nacional', '1'),
		  ('Internacional', '2'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V9013

	CREATE TABLE "POF_2018".V9013(
		MOTIVO_RESTRICAO_PRODUTOS_SAUDE varchar(120),
		COD_MOTIVO_RESTRICAO_PRODUTOS_SAUDE varchar(1),
		CONSTRAINT PK_V9013 PRIMARY KEY (COD_MOTIVO_RESTRICAO_PRODUTOS_SAUDE)
	);

	INSERT INTO "POF_2018".V9013
	VALUES('Não adquiriu por falta de dinheiro', '1'),
		  ('Não adquiriu por indisponibilidade do produto ou serviço', '2'),
		  ('Não adquiriu por dificuldade de chegar a algum local de aquisição', '3'),
		  ('Não adquiriu por outros motivos', '4');

-- Criar e Preencher Registro SUB_QUADRO

	CREATE TABLE "POF_2018".SUB_QUADRO(
		TIPO_TRABALHO_PERIODO_PESQUISA varchar(120),
		COD_TIPO_TRABALHO_PERIODO_PESQUISA varchar(1),
		CONSTRAINT PK_SUB_QUADRO PRIMARY KEY (COD_TIPO_TRABALHO_PERIODO_PESQUISA)
	);

	INSERT INTO "POF_2018".SUB_QUADRO
	VALUES('Trabalho Principal', '1'),
		  ('Outro Trabalho', '2');

-- Criar e Preencher Registro V5302

	CREATE TABLE "POF_2018".V5302(
		TRABALHO_EXERCIDO varchar(120),
		COD_TRABALHO_EXERCIDO varchar(1),
		CONSTRAINT PK_V5302 PRIMARY KEY (COD_TRABALHO_EXERCIDO)
	);

	INSERT INTO "POF_2018".V5302
	VALUES('Trabalhador Doméstico', '1'),
		  ('Militar do exército, da marinha, da aeronáutica, da polícia militar ou do corpo de bombeiros militar', '2'),
		  ('Empregado do setor privado', '3'),
		  ('Empregado do setor público (inclusive empresas de economia mista)', '4'),
		  ('Empregador', '5'),
		  ('Conta própria', '6'),
		  ('Trabalhador não remunerado em ajuda a membro do domicílio ou parente', '7');

-- Criar e Preencher Registro V5307

	CREATE TABLE "POF_2018".V5307(
		FORMA_PAGAMENTO varchar(120),
		COD_FORMA_PAGAMENTO varchar(1),
		CONSTRAINT PK_V5307 PRIMARY KEY (COD_FORMA_PAGAMENTO)
	);

	INSERT INTO "POF_2018".V5307
	VALUES('Em dinheiro', '1'),
		  ('Em dinheiro e benefícios', '2'),
		  ('Somente em benefícios', '3'),
		  ('Não teve rendimento', '4');

-- Criar e Preencher Registro V5315

	CREATE TABLE "POF_2018".V5315(
		DURACAO_MINUTOS varchar(120),
		COD_DURACAO_MINUTOS varchar(1),
		CONSTRAINT PK_V5315 PRIMARY KEY (COD_DURACAO_MINUTOS)
	);

	INSERT INTO "POF_2018".V5315
	VALUES('até 05 minutos', '1'),
		  ('de 06 minutos até 30 minutos', '2'),
		  ('mais de 30 minutos até 1 hora', '3'),
		  ('mais de 1 hora até 2 horas', '4'),
		  ('mais de 2 horas', '5'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V53021

	CREATE TABLE "POF_2018".V53021(
		TIPO_TRABALHADOR_NAO_REMUNERADO varchar(120),
		COD_TIPO_TRABALHADOR_NAO_REMUNERADO varchar(1),
		CONSTRAINT PK_V53021 PRIMARY KEY (COD_TIPO_TRABALHADOR_NAO_REMUNERADO)
	);

	INSERT INTO "POF_2018".V53021
	VALUES('Conta própria ou empregador', '1'),
		  ('Empregado', '2'),
		  ('Trabalhador doméstico', '3'),
		  ('Sem declaração', '9');

-- Criar e Preencher Registro V6101

	CREATE TABLE "POF_2018".V6101(
		NIVEL_DIFICULDADE varchar(120),
		COD_NIVEL_DIFICULDADE varchar(1),
		CONSTRAINT PK_V6101 PRIMARY KEY (COD_NIVEL_DIFICULDADE)
	);

	INSERT INTO "POF_2018".V6101
	VALUES('Muita dificuldade', '1'),
		  ('Dificuldade', '2'),
		  ('Alguma dificuldade', '3'),
		  ('Alguma facilidade', '4'),
		  ('Facilidade', '5'),
		  ('Muita facilidade', '6');

-- Criar e Preencher Registro V61041

	CREATE TABLE "POF_2018".V61041(
		NIVEL_SATISFACAO varchar(120),
		COD_NIVEL_SATISFACAO varchar(1),
		CONSTRAINT PK_V61041 PRIMARY KEY (COD_NIVEL_SATISFACAO)
	);

	INSERT INTO "POF_2018".V61041
	VALUES('Bom', '1'),
		  ('Satisfatório', '2'),
		  ('Ruim', '3'),
		  ('Não tem', '4');


-- Criar e Preencher Registro V7101

	CREATE TABLE "POF_2018".V7101(
		TIPO_ACUCAR varchar(120),
		COD_TIPO_ACUCAR varchar(1),
		CONSTRAINT PK_V7101 PRIMARY KEY (COD_TIPO_ACUCAR)
	);

	INSERT INTO "POF_2018".V7101
	VALUES('Açúcar', '1'),
		  ('Adoçante', '2'),
		  ('Açúcar e adoçante', '3'),
		  ('Não utiliza', '4');


-- Criar e Preencher Registro COD_PREPARACAO_FINAL

	CREATE TABLE "POF_2018".COD_PREPARACAO_FINAL(
		PREPARACAO_FINAL varchar(120),
		COD_PREPARACAO_FINAL varchar(2),
		CONSTRAINT PK_COD_PREPARACAO_FINAL PRIMARY KEY (COD_PREPARACAO_FINAL)
	);

-- Criar e Preencher Registro V9016

	CREATE TABLE "POF_2018".V9016(
		FORMA_PREPARACAO_ALIMENTOS varchar(120),
		COD_FORMA_PREPARACAO_ALIMENTOS varchar(2),
		CONSTRAINT PK_V9016 PRIMARY KEY (COD_FORMA_PREPARACAO_ALIMENTOS)
	);

	INSERT INTO "POF_2018".V9016
	VALUES('Assado(a)', '1'),
		  ('Cozido(a) com gordura', '2'),
		  ('Cozido(a) sem gordura', '3'),
		  ('Cru(a)', '4'),
		  ('Empanado(a) / à milanesa', '5'),
		  ('Ensopado(a)', '6'),
		  ('Frito(a)', '7'),
		  ('Grelhado(a) / brasa / churrasco', '8'),
		  ('Refogado(a)', '9'),
		  ('Não determinado ', '99');

-- Criar e Preencher Registro V9017

	CREATE TABLE "POF_2018".V9017(
		OCASIAO_CONSUMO varchar(120),
		COD_OCASIAO_CONSUMO varchar(1),
		CONSTRAINT PK_V9017 PRIMARY KEY (COD_OCASIAO_CONSUMO)
	);

	INSERT INTO "POF_2018".V9017
	VALUES('Café da manhã', '1'),
		  ('Almoço', '2'),
		  ('Lanche', '3'),
		  ('Jantar', '4'),
		  ('Ceia', '5'),
		  ('Outra ocasião', '6'),
		  ('Não determinado', '9');

-- Criar e Preencher Registro V9018

	CREATE TABLE "POF_2018".V9018(
		LOCAL_REFEICAO varchar(120),
		COD_LOCAL_REFEICAO varchar(1),
		CONSTRAINT PK_V9018 PRIMARY KEY (COD_LOCAL_REFEICAO)
	);

	INSERT INTO "POF_2018".V9018
	VALUES('Em casa ou levado de casa', '1'),
		  ('Merenda escolar', '2'),
		  ('Restaurante à quilo', '3'),
		  ('Cantina, bar, lanchonete, fast food', '4'),
		  ('Restaurante – outros', '5'),
		  ('Vendedores ambulantes ou de rua', '6'),
		  ('Fora de casa – outros', '7'),
		  ('Não determinado', '9');

-- Criar e Preencher Registro V0427

	CREATE TABLE "POF_2018".V0427(
		PERIODO varchar(120),
		COD_PERIODO varchar(1),
		CONSTRAINT PK_V0427 PRIMARY KEY (COD_PERIODO)
	);

	INSERT INTO "POF_2018".V0427
	VALUES('Períodos semestrais', '1'),
		  ('Anos', '2'),
		  ('Outra forma', '3');

-- Criar Registro DOMICILIO

	CREATE TABLE "POF_2018".DOMICILIO (
		UF varchar(2),
		ESTRATO_POF varchar(4),
		TIPO_SITUACAO_REG varchar(1),
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		V0201 varchar(1),
		V0202 varchar(1),
		V0203 varchar(1),
		V0204 varchar(1),
		V0205 numeric(2),
		V0206 numeric(1),
		V0207 varchar(1),
		V0208 varchar(1),
		V0209 varchar(1),
		V02101 varchar(1), -- QUEST
		V02102 varchar(1), -- QUEST
		V02103 varchar(1), -- QUEST
		V02104 varchar(1), -- QUEST
		V02105 varchar(1), -- QUEST
		V02111 NUMERIC(2,0), 
		V02112 numeric(1), 
		V02113 varchar(1), -- QUEST
		V0212 varchar(1),
		V0213 varchar(1),
		V02141 varchar(1), -- QUEST
		V02142 varchar(1), -- QUEST
		V0215 varchar(1),
		V02161 varchar(1), -- QUEST
		V02162 varchar(1), -- QUEST
		V02163 varchar(1), -- QUEST
		V02164 varchar(1), -- QUEST
		V0217 varchar(1),
		V0219 varchar(1),
		V0220 varchar(1), -- QUEST
		V0221 varchar(1),
		PESO numeric(14,8),
		PESO_FINAL numeric(14,8),
		V6199 varchar(1),
		CONSTRAINT PK_DOMICILIO PRIMARY KEY (COD_UPA,NUM_DOM),
		CONSTRAINT FK_DOMICILIO_ESTRATO_POF FOREIGN KEY (ESTRATO_POF) REFERENCES "POF_2018".ESTRATO (COD_ESTRATO),
		CONSTRAINT FK_DOMICILIO_V0201 FOREIGN KEY (V0201) REFERENCES "POF_2018".V0201 (COD_TIPO_DOM),
		CONSTRAINT FK_DOMICILIO_V0202 FOREIGN KEY (V0202) REFERENCES "POF_2018".V0202 (COD_MATERIAL_PAREDE),
		CONSTRAINT FK_DOMICILIO_V0203 FOREIGN KEY (V0203) REFERENCES "POF_2018".V0203 (COD_TIPO_TELHADO),
		CONSTRAINT FK_DOMICILIO_V0204 FOREIGN KEY (V0204) REFERENCES "POF_2018".V0204 (COD_TIPO_MATERIAL_PISO),
		CONSTRAINT FK_DOMICILIO_V0207 FOREIGN KEY (V0207) REFERENCES "POF_2018".V0207 (COD_ABASTECIMENTO),
		CONSTRAINT FK_DOMICILIO_V0208 FOREIGN KEY (V0208) REFERENCES "POF_2018".V0208 (COD_FREQ_AGUA_30_DIAS_REDE_GERAL),
		CONSTRAINT FK_DOMICILIO_V0209 FOREIGN KEY (V0209) REFERENCES "POF_2018".V0209 (COD_TIPO_ABASTECIMENTO_AGUA),
		CONSTRAINT FK_DOMICILIO_V0212 FOREIGN KEY (V0212) REFERENCES "POF_2018".V0212 (COD_ESCOADOURO),
		CONSTRAINT FK_DOMICILIO_V0213 FOREIGN KEY (V0213) REFERENCES "POF_2018".V0213 (COD_DESTINO_LIXO),
		CONSTRAINT FK_DOMICILIO_V0215 FOREIGN KEY (V0215) REFERENCES "POF_2018".V0215 (COD_FREQ_ENERGIA_REDE_GERAL),
		CONSTRAINT FK_DOMICILIO_V0217 FOREIGN KEY (V0217) REFERENCES "POF_2018".V0217 (COD_TIPO_PROPRIEDADE_DOM),
		CONSTRAINT FK_DOMICILIO_V0219 FOREIGN KEY (V0219) REFERENCES "POF_2018".V0219 (COD_TIPO_CONTRATO_ALUGUEL),
		CONSTRAINT FK_DOMICILIO_V0221 FOREIGN KEY (V0221) REFERENCES "POF_2018".V0221 (COD_TIPO_SERVICO_CORREIOS_DOM),
		CONSTRAINT FK_DOMICILIO_V6199 FOREIGN KEY (V6199) REFERENCES "POF_2018".V6199 (COD_TIPO_SEGUNRANCA_ALIMENTAR),
		CONSTRAINT FK_DOMICILIO_V0220 FOREIGN KEY (V0220) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02101 FOREIGN KEY (V02101) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02102 FOREIGN KEY (V02102) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02103 FOREIGN KEY (V02103) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02104 FOREIGN KEY (V02104) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02105 FOREIGN KEY (V02105) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02113 FOREIGN KEY (V02113) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02141 FOREIGN KEY (V02141) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02142 FOREIGN KEY (V02142) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02161 FOREIGN KEY (V02161) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02162 FOREIGN KEY (V02162) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02163 FOREIGN KEY (V02163) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_DOMICILIO_V02164 FOREIGN KEY (V02164) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);

-- Criar Registro MORADOR

	CREATE TABLE "POF_2018".MORADOR (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		COD_INFORMANTE varchar(2),
		V0306 varchar(2),
		V0401 varchar(1),
		V04021 numeric(2),
		V04022 numeric(2),
		V04023 numeric(4),
		V0403 numeric(3),
		V0404 varchar(1),
		V0405 varchar(1),
		V0406 varchar(1), -- QUEST
		V0407 varchar(1), -- QUEST
		V0408 varchar(1), -- QUEST
		V0409 numeric(2),
		V0410 numeric(1),
		V0411 numeric(2),
		V0412 varchar(1), -- QUEST
		V0413 numeric(1),
		V0414 varchar(1), -- QUEST
		V0415 varchar(1), -- QUEST
		V0416 numeric(1),
		V041711 varchar(1), -- QUEST
		V041712 varchar(2), -- QUEST
		V041721 varchar(1), -- QUEST
		V041722 varchar(1), -- QUEST
		V041731 varchar(1), -- QUEST
		V041732 varchar(1), -- QUEST
		V041741 varchar(1), -- QUEST
		V041742 varchar(1), -- QUEST
		V0418 varchar(1),
		V0419 varchar(2),
		V0420 varchar(1),
		V0421 varchar(1),
		V0422 varchar(2),
		V0423 varchar(1), -- QUEST
		V0424 varchar(1), -- QUEST
		V0425 varchar(2),
		V0426 varchar(1),
		V0427 varchar(1),
		V0428 varchar(1),
		V0429 numeric(2),
		V0430 varchar(1), -- QUEST
		ANOS_ESTUDO numeric(2),
		RENDA_TOTAL numeric(10, 2),
		NIVEL_INSTRUCAO varchar(1),
		RENDA_DISP_PC numeric(20, 10),
		RENDA_MONET_PC numeric(20, 10),
		RENDA_NAO_MONET_PC numeric(20, 10),
		DEDUCAO_PC numeric(20, 10),
		CONSTRAINT PK_MORADOR PRIMARY KEY (COD_UPA,NUM_DOM,COD_INFORMANTE),
		CONSTRAINT FK_MORADOR_V0306 FOREIGN KEY (V0306) REFERENCES "POF_2018".V0306 (COD_CONDICAO_UNIDADE_CONSUMO),
		CONSTRAINT FK_MORADOR_V0401 FOREIGN KEY (V0401) REFERENCES "POF_2018".V0401 (COD_CONDICAO_PRESENCA_NO_MOMENTO_PESQUISA),
		CONSTRAINT FK_MORADOR_V0404 FOREIGN KEY (V0404) REFERENCES "POF_2018".V0404 (COD_SEXO),
		CONSTRAINT FK_MORADOR_V0405 FOREIGN KEY (V0405) REFERENCES "POF_2018".V0405 (COD_COR_OU_RACA),
		CONSTRAINT FK_MORADOR_V0418 FOREIGN KEY (V0418) REFERENCES "POF_2018".V0418 (COD_TIPO_ESCOLA_OU_CRECHE_FREQUENTADA),
		CONSTRAINT FK_MORADOR_V0419 FOREIGN KEY (V0419) REFERENCES "POF_2018".V0419 (COD_TIPO_CURSO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_V0420 FOREIGN KEY (V0420) REFERENCES "POF_2018".V0420 (COD_DURACAO_CURSO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_V0421 FOREIGN KEY (V0421) REFERENCES "POF_2018".V0421 (COD_TIPO_ORGANIZACAO_CURSO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_V0422 FOREIGN KEY (V0422) REFERENCES "POF_2018".V0422 (COD_ANO_SEMESTRE_SERIE_FREQUENTADA),
		CONSTRAINT FK_MORADOR_V0425 FOREIGN KEY (V0425) REFERENCES "POF_2018".V0425 (COD_CURSO_MAIS_ELEVADO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_V0426 FOREIGN KEY (V0426) REFERENCES "POF_2018".V0420 (COD_DURACAO_CURSO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_V0427 FOREIGN KEY (V0427) REFERENCES "POF_2018".V0427 (COD_PERIODO),
		CONSTRAINT FK_MORADOR_V0428 FOREIGN KEY (V0428) REFERENCES "POF_2018".V0428 (COD_CONCLUIU_PRIMEIRO_ANO_SERIE_SEMESTRE_CURSO_FREQUENTADO),
		CONSTRAINT FK_MORADOR_NIVEL_INSTRUCAO FOREIGN KEY (NIVEL_INSTRUCAO) REFERENCES "POF_2018".NIVEL_INSTRUCAO (COD_NIVEL_INSTRUCAO),
		CONSTRAINT FK_MORADOR_V0220 FOREIGN KEY (V0406) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0407 FOREIGN KEY (V0407) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0408 FOREIGN KEY (V0408) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0412 FOREIGN KEY (V0412) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0414 FOREIGN KEY (V0414) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0415 FOREIGN KEY (V0415) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041711 FOREIGN KEY (V041711) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041721 FOREIGN KEY (V041721) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V04172 FOREIGN KEY (V041722) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041731 FOREIGN KEY (V041731) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041732 FOREIGN KEY (V041732) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041741 FOREIGN KEY (V041741) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V041742 FOREIGN KEY (V041742) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0423 FOREIGN KEY (V0423) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0424 FOREIGN KEY (V0424) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_V0430 FOREIGN KEY (V0430) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);

-- Criar Registro MORADOR_QUALI_VIDA

	CREATE TABLE "POF_2018".MORADOR_QUALI_VIDA (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		COD_INFORMANTE varchar(2),
		CONTAGEM_PONDERADA numeric(20, 10),
		FUNCAO_PERDA numeric(20, 10),
		V201 varchar(1), -- QUEST
		V202 varchar(1), -- QUEST
		V204 varchar(1), -- QUEST
		V205 varchar(1), -- QUEST
		V206 varchar(1), -- QUEST
		V207 varchar(1), -- QUEST
		V208 varchar(1), -- QUEST
		V209 varchar(1), -- QUEST
		V210 varchar(1), -- QUEST
		V211 varchar(1), -- QUEST
		V212 varchar(1), -- QUEST
		V214 varchar(1), -- QUEST
		V215 varchar(1), -- QUEST
		V216 varchar(1), -- QUEST
		V217 varchar(1), -- QUEST
		V301 varchar(1), -- QUEST
		V302 varchar(1), -- QUEST
		V303 varchar(1), -- QUEST
		V304 varchar(1), -- QUEST
		V305 varchar(1), -- QUEST
		V306 varchar(1), -- QUEST
		V307 varchar(1), -- QUEST
		V308 varchar(1), -- QUEST
		V401 varchar(1), -- QUEST
		V402 varchar(1), -- QUEST
		V403 varchar(1), -- QUEST
		V501 varchar(1), -- QUEST
		V502 varchar(1), -- QUEST
		V503 varchar(1), -- QUEST
		V504 varchar(1), -- QUEST
		V505 varchar(1), -- QUEST
		V506 varchar(1), -- QUEST
		V601 varchar(1), -- QUEST
		V602 varchar(1), -- QUEST
		V603 varchar(1), -- QUEST
		V604 varchar(1), -- QUEST
		V605 varchar(1), -- QUEST
		V606 varchar(1), -- QUEST
		V607 varchar(1), -- QUEST
		V608 varchar(1), -- QUEST
		V609 varchar(1), -- QUEST
		V610 varchar(1), -- QUEST
		V611 varchar(1), -- QUEST
		V701 varchar(1), -- QUEST
		V702 varchar(1), -- QUEST
		V703 varchar(1), -- QUEST
		V704 varchar(1), -- QUEST
		V801 varchar(1), -- QUEST
		V802 varchar(1), -- QUEST
		V901 varchar(1), -- QUEST
		V902 varchar(1), -- QUEST
		GRANDE_REGIAO varchar(1),
		C1 varchar(1),
		C2 varchar(1),
		C3 varchar(1),
		C4 varchar(1),
		C5 varchar(1),
		C6 varchar(1),
		C7 varchar(2),
		RENDA_DISP_PC_SS NUMERIC(20, 10),
		CONSTRAINT PK_MORADOR_QUALI PRIMARY KEY (COD_UPA,NUM_DOM,COD_INFORMANTE),
		CONSTRAINT FK_MORADOR_QUALI_GRANDE_REGIAO FOREIGN KEY (GRANDE_REGIAO) REFERENCES "POF_2018".GRANDE_REGIAO (COD_REGIAO_GEOGRAFICA),
		CONSTRAINT FK_MORADOR_QUALI_C1 FOREIGN KEY (C1) REFERENCES "POF_2018".C1 (COD_COMPOSICAO_DEMOGRAFICA),
		CONSTRAINT FK_MORADOR_QUALI_C2 FOREIGN KEY (C2) REFERENCES "POF_2018".C2 (COD_COR_OU_RACA_PESSOA_REFERENCIA),
		CONSTRAINT FK_MORADOR_QUALI_C3 FOREIGN KEY (C3) REFERENCES "POF_2018".V0404 (COD_SEXO),
		CONSTRAINT FK_MORADOR_QUALI_C4 FOREIGN KEY (C4) REFERENCES "POF_2018".NIVEL_INSTRUCAO (COD_NIVEL_INSTRUCAO),
		CONSTRAINT FK_MORADOR_QUALI_C5 FOREIGN KEY (C5) REFERENCES "POF_2018".C5 (COD_TIPO_OCUPACAO_PESSOA_REFERENCIA),
		CONSTRAINT FK_MORADOR_QUALI_C6 FOREIGN KEY (C6) REFERENCES "POF_2018".C6 (COD_COMPOSICAO_FAMILIAR),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V201 FOREIGN KEY (V201) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V202 FOREIGN KEY (V202) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V204 FOREIGN KEY (V204) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V205 FOREIGN KEY (V205) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V206 FOREIGN KEY (V206) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V207 FOREIGN KEY (V207) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V208 FOREIGN KEY (V208) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V209 FOREIGN KEY (V209) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V210 FOREIGN KEY (V210) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V211 FOREIGN KEY (V211) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V212 FOREIGN KEY (V212) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V214 FOREIGN KEY (V214) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V215 FOREIGN KEY (V215) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V216 FOREIGN KEY (V216) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V217 FOREIGN KEY (V217) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V301 FOREIGN KEY (V301) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V302 FOREIGN KEY (V302) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V303 FOREIGN KEY (V303) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V304 FOREIGN KEY (V304) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V305 FOREIGN KEY (V305) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V306 FOREIGN KEY (V306) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V307 FOREIGN KEY (V307) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V308 FOREIGN KEY (V308) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V401 FOREIGN KEY (V401) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V402 FOREIGN KEY (V402) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V403 FOREIGN KEY (V403) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V501 FOREIGN KEY (V501) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V502 FOREIGN KEY (V502) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V503 FOREIGN KEY (V503) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V504 FOREIGN KEY (V504) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V505 FOREIGN KEY (V505) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V506 FOREIGN KEY (V506) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V601 FOREIGN KEY (V601) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V602 FOREIGN KEY (V602) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V603 FOREIGN KEY (V603) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V604 FOREIGN KEY (V604) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V605 FOREIGN KEY (V605) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V606 FOREIGN KEY (V606) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V607 FOREIGN KEY (V607) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V608 FOREIGN KEY (V608) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V609 FOREIGN KEY (V609) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V610 FOREIGN KEY (V610) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V611 FOREIGN KEY (V611) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V701 FOREIGN KEY (V701) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V702 FOREIGN KEY (V702) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V703 FOREIGN KEY (V703) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V704 FOREIGN KEY (V704) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V801 FOREIGN KEY (V801) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V802 FOREIGN KEY (V802) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V901 FOREIGN KEY (V901) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_MORADOR_QUALI_QUEST_V902 FOREIGN KEY (V902) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);

-- Criar Registro ALUGUEL_ESTIMADO

	CREATE TABLE "POF_2018".ALUGUEL_ESTIMADO (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		QUADRO varchar(2),
		V9001 varchar(7),
		V9002 varchar(2),
		V8000 numeric(10,2),
		V9010 varchar(2),
		V9011 numeric(2),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		CONSTRAINT PK_ALUGUEL_ESTIMADO PRIMARY KEY (COD_UPA,NUM_DOM),
		CONSTRAINT FK_ALUGUEL_ESTIMADO_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT fk_aluguel_estimado_cadastro_produtos FOREIGN KEY (v9001) REFERENCES "POF_2018".cadastro_produtos (codigo_produto),
		CONSTRAINT fk_aluguel_estimado_v9002 FOREIGN KEY (v9002) REFERENCES "POF_2018".v9002 (cod_forma_aquisicao)
	);

-- Criar Registro DESPESA_COLETIVA

	CREATE TABLE "POF_2018".DESPESA_COLETIVA (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9002 varchar(2),
		V9005 numeric(4),
		V8000 numeric(10,2),
		V9010 varchar(2),
		V9011 numeric(2),
		V9012 varchar(1),
		V1904 numeric(10,2),
		V1905 varchar(1),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		V1904_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		COD_IMPUT_QUANTIDADE varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		V9004 varchar(5),
		CONSTRAINT PK_DESPESA_COLETIVA PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,SEQ,V9001,V9004),
		CONSTRAINT FK_DESPESA_COLETIVA_CADASTRO_PRODUTOS FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_DESPESA_COLETIVA_V9002 FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_DESPESA_COLETIVA_V9012 FOREIGN KEY (V9012) REFERENCES "POF_2018".V9012 (COD_ESTADO_PRODUTO),
		CONSTRAINT FK_DESPESA_COLETIVA_V1905 FOREIGN KEY (V1905) REFERENCES "POF_2018".V1905 (COD_TIPO_SERVICO_DOMESTICO_CONTRATADO),
		CONSTRAINT FK_DESPESA_COLETIVA_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_DESPESA_COLETIVA_COD_IMPUT_QTD FOREIGN KEY (COD_IMPUT_QUANTIDADE) REFERENCES "POF_2018".COD_IMPUT_QTD (COD_QUANTIDADE_IMPUTADA),
		CONSTRAINT FK_DESPESA_COLETIVA_V9004 FOREIGN KEY (V9004) REFERENCES "POF_2018".CADASTRO_LOCAIS_AQUISICAO (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro SERVICO_NAO_MONETARIO_POF2

	CREATE TABLE "POF_2018".SERVICO_NAO_MONETARIO_POF2 (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9002 varchar(2),
		V8000 numeric(10,2),
		V9010 varchar(2),
		V9011 numeric(2),
		V1904 numeric(10,2),
		V1905 varchar(1),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		V1904_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		V9004 varchar(5),
		CONSTRAINT PK_SERVICO_NAO_MONETARIO_POF2 PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,SEQ,V9001,V9004),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_COD_PRODUTO FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_V9002_NAO_MONETARIO FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_V1905 FOREIGN KEY (V1905) REFERENCES "POF_2018".V1905 (COD_TIPO_SERVICO_DOMESTICO_CONTRATADO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_V9004 FOREIGN KEY (V9004) REFERENCES "POF_2018".CADASTRO_LOCAIS_AQUISICAO (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro INVENTARIO

	CREATE TABLE "POF_2018".INVENTARIO(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9005 numeric(2),
		V9002 varchar(2),
		V1404 numeric(4),
		V9012 varchar(1),
		CONSTRAINT PK_INVENTARIO PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,SEQ,V9001),
		CONSTRAINT FK_INVENTARIO_CADASTRO_PRODUTOS FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_INVENTARIO_V9002 FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_INVENTARIO_V9012 FOREIGN KEY (V9012) REFERENCES "POF_2018".V9012 (COD_ESTADO_PRODUTO)
	);

-- Criar Registro CADERNETA_COLETIVA

	CREATE TABLE "POF_2018".CADERNETA_COLETIVA(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		QUADRO varchar(2),
		SEQ varchar(3),
		V9001 varchar(7),
		V9002 varchar(2),
		V8000 numeric(10,2),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		V9005 numeric(9,3),
		V9007 varchar(5),
		V9009 varchar(5),
		QTD_FINAL numeric(9,3),
		V9004 varchar(5),
		CONSTRAINT PK_CADERNETA_COLETIVA PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,QUADRO,SEQ),
		CONSTRAINT FK_CADERNETA_COLETIVA_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_CADERNETA_COLETIVA_V9002 FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_CADERNETA_COLETIVA_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_CADERNETA_COLETIVA_UNIDADE_MEDIDA FOREIGN KEY (V9007) REFERENCES "POF_2018".UNIDADE_MEDIDA (COD_UNIDADE_MEDIDA),
		CONSTRAINT FK_CADERNETA_COLETIVA_PESO_VOLUME FOREIGN KEY (V9009) REFERENCES "POF_2018".PESO_VOLUME (COD_PESO_OU_VOLUME),
		CONSTRAINT FK_CADERNETA_COLETIVA_CADASTRO_LOCAIS FOREIGN KEY (V9004) REFERENCES "POF_2018".CADASTRO_LOCAIS_AQUISICAO (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro DESPESA_INDIVIDUAL

	CREATE TABLE "POF_2018".DESPESA_INDIVIDUAL(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		COD_INFORMANTE varchar(2),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9002 varchar(2),
		V8000 numeric(10,2),
		V9010 varchar(2),
		V9011 numeric(2),
		V9012 varchar(1),
		V4104 varchar(1),
		V4105 varchar(1),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		V9004 varchar(5),
		CONSTRAINT PK_DESPESA_INDIVIDUAL PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,COD_INFORMANTE,QUADRO,SEQ),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_V9002 FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_V9012 FOREIGN KEY (V9012) REFERENCES "POF_2018".V9012 (COD_ESTADO_PRODUTO),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_V4104 FOREIGN KEY (V4104) REFERENCES "POF_2018".V4104 (COD_MOTIVO_VIAGEM_ASSOSSIADA_A_DESPESA),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_DESPESA_INDIVIDUAL_CADASTRO_LOCAIS FOREIGN KEY (V9004) REFERENCES "POF_2018".CADASTRO_LOCAIS_AQUISICAO (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro SERVICO_NAO_MONETARIO_POF4

	CREATE TABLE "POF_2018".SERVICO_NAO_MONETARIO_POF4(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		COD_INFORMANTE varchar(2),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9002 varchar(2),
		V8000 numeric(10,2),
		V9010 varchar(2),
		V9011 numeric(2),
		V4104 varchar(1),
		V4105 varchar(1),
		DEFLATOR numeric(12,10),
		V8000_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(2),
		V9004 varchar(5),
		CONSTRAINT PK_SERVICO_NAO_MONETARIO_POF4 PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,COD_INFORMANTE,QUADRO,SEQ),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF4_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF4_V9002_NAO_MONETARIO FOREIGN KEY (V9002) REFERENCES "POF_2018".V9002 (COD_FORMA_AQUISICAO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF4_V4104 FOREIGN KEY (V4104) REFERENCES "POF_2018".V4104 (COD_MOTIVO_VIAGEM_ASSOSSIADA_A_DESPESA),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF4_V4105 FOREIGN KEY (V4105) REFERENCES "POF_2018".V4105 (COD_ORIGEM_DESPESA_AQUISICAO_RELACIONADA_A_VIAGEM),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF4_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_SERVICO_NAO_MONETARIO_POF2_V9004 FOREIGN KEY (V9004) REFERENCES "POF_2018".CADASTRO_LOCAIS_AQUISICAO (COD_LOCAL_AQUISICAO)
	);

-- Criar Registro RESTRICAO_SAUDE

	CREATE TABLE "POF_2018".RESTRICAO_SAUDE(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		COD_INFORMANTE varchar(2),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9001 varchar(7),
		V9013 varchar(1),
		CONSTRAINT PK_RESTRICAO_SAUDE PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,COD_INFORMANTE,QUADRO,SEQ),
		CONSTRAINT FK_RESTRICAO_SAUDE_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT FK_RESTRICAO_SAUDE_V9013 FOREIGN KEY (V9013) REFERENCES "POF_2018".V9013 (COD_MOTIVO_RESTRICAO_PRODUTOS_SAUDE)
	);

-- Criar Registro RENDIMENTO_TRABALHO

	CREATE TABLE "POF_2018".RENDIMENTO_TRABALHO (
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		COD_INFORMANTE varchar(2),
		QUADRO varchar(2),
		SUB_QUADRO varchar(1),
		SEQ varchar(1),
		V9001 varchar(7),
		V5302 varchar(1),
		V53021 varchar(1),
		V5303 varchar(1), -- QUEST
		V5304 varchar(1), -- QUEST
		V5305 varchar(1), -- QUEST
		V5307 varchar(1),
		V8500 numeric(7),
		V531112 numeric(7),
		V531122 numeric(7),
		V531132 numeric(7),
		V9010 varchar(2),
		V9011 numeric(2),
		V5314 numeric(3),
		V5315 varchar(1),
		DEFLATOR numeric(12,10),
		V8500_DEFLA numeric(10,2),
		V531112_DEFLA numeric(10,2),
		V531122_DEFLA numeric(10,2),
		V531132_DEFLA numeric(10,2),
		COD_IMPUT_VALOR varchar(1),
		FATOR_ANUALIZACAO numeric(1),
		V53011 varchar(4),
		V53061 varchar(5),
		CONSTRAINT PK_RENDIMENTO_TRABALHO PRIMARY KEY (COD_UPA,NUM_DOM,SUB_QUADRO,COD_INFORMANTE,QUADRO,SEQ),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS (CODIGO_PRODUTO),
		CONSTRAINT fk_rendimento_trabalho_v9010 FOREIGN KEY (v9010) REFERENCES "POF_2018".v9010 (cod_meses),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5302 FOREIGN KEY (V5302) REFERENCES "POF_2018".V5302 (COD_TRABALHO_EXERCIDO),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V53021 FOREIGN KEY (V53021) REFERENCES "POF_2018".V53021 (COD_TIPO_TRABALHADOR_NAO_REMUNERADO),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5307 FOREIGN KEY (V5307) REFERENCES "POF_2018".V5307 (COD_FORMA_PAGAMENTO),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5315 FOREIGN KEY (V5315) REFERENCES "POF_2018".V5315 (COD_DURACAO_MINUTOS),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_COD_IMPUT_VALOR FOREIGN KEY (COD_IMPUT_VALOR) REFERENCES "POF_2018".COD_IMPUT_VALOR (COD_VALOR_IMPUTADO),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V53011 FOREIGN KEY (V53011) REFERENCES "POF_2018".OCUPACAO_COD (GRUPO_BASE),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V53061 FOREIGN KEY (V53061) REFERENCES "POF_2018".ATIVIDADE_CNAE (CLASSE),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5303 FOREIGN KEY (V5303) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5304 FOREIGN KEY (V5304) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_RENDIMENTO_TRABALHO_V5305 FOREIGN KEY (V5305) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);

-- Criar Registro CONDICOES_VIDA

	CREATE TABLE "POF_2018".CONDICOES_VIDA(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		NUM_UC varchar(1),
		COD_INFORMANTE varchar(2),
		V6101 varchar(1),
		V6102 numeric(6),
		V6103 numeric(5),
		V61041 varchar(1), -- Nivel Satisfação
		V61042 varchar(1), -- Nivel Satisfação
		V61043 varchar(1), -- Nivel Satisfação
		V61044 varchar(1), -- Nivel Satisfação
		V61045 varchar(1), -- Nivel Satisfação
		V61046 varchar(1), -- Nivel Satisfação
		V61051 varchar(1), -- Nivel Satisfação
		V61052 varchar(1), -- Nivel Satisfação
		V61053 varchar(1), -- Nivel Satisfação
		V61054 varchar(1), -- Nivel Satisfação
		V61055 varchar(1), -- Nivel Satisfação
		V61056 varchar(1), -- Nivel Satisfação
		V61057 varchar(1), -- Nivel Satisfação
		V61058 varchar(1), -- Nivel Satisfação
		V61061 varchar(1), -- Quest
		V61062 varchar(1), -- Quest
		V61063 varchar(1), -- Quest
		V61064 varchar(1), -- Quest
		V61065 varchar(1), -- Quest
		V61066 varchar(1), -- Quest
		V61067 varchar(1), -- Quest
		V61068 varchar(1), -- Quest
		V61069 varchar(1), -- Quest
		V610610 varchar(1), -- Quest
		V610611 varchar(1), -- Quest
		V61071 varchar(1), -- Quest
		V61072 varchar(1), -- Quest
		V61073 varchar(1), -- Quest
		V6108 varchar(1), -- Quest
		V6109 varchar(1), -- Quest
		V6110 varchar(1), -- Quest
		V6111 varchar(1), -- Quest
		V6112 varchar(1), -- Quest
		V6113 varchar(1), -- Quest
		V6114 varchar(1), -- Quest
		V6115 varchar(1), -- Quest
		V6116 varchar(1), -- Quest
		V6117 varchar(1), -- Quest
		V6118 varchar(1), -- Quest
		V6119 varchar(1), -- Quest
		V6120 varchar(1), -- Quest
		V6121 varchar(1), -- Quest
		CONSTRAINT PK_CONDICOES_VIDA PRIMARY KEY (COD_UPA,NUM_DOM,NUM_UC,COD_INFORMANTE),
		CONSTRAINT FK_CONDICOES_VIDA_V6101 FOREIGN KEY (V6101) REFERENCES "POF_2018".V6101 (COD_NIVEL_DIFICULDADE),
		CONSTRAINT FK_CONDICOES_VIDA_V61041 FOREIGN KEY (V61041) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61042 FOREIGN KEY (V61042) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61043 FOREIGN KEY (V61043) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61044 FOREIGN KEY (V61044) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61045 FOREIGN KEY (V61045) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61046 FOREIGN KEY (V61046) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61051 FOREIGN KEY (V61051) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61052 FOREIGN KEY (V61052) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61053 FOREIGN KEY (V61053) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61054 FOREIGN KEY (V61054) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61055 FOREIGN KEY (V61055) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61056 FOREIGN KEY (V61056) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61057 FOREIGN KEY (V61057) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61058 FOREIGN KEY (V61058) REFERENCES "POF_2018".V61041 (COD_NIVEL_SATISFACAO),
		CONSTRAINT FK_CONDICOES_VIDA_V61061 FOREIGN KEY (V61061) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61062 FOREIGN KEY (V61062) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61063 FOREIGN KEY (V61063) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61064 FOREIGN KEY (V61064) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61065 FOREIGN KEY (V61065) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61066 FOREIGN KEY (V61066) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61067 FOREIGN KEY (V61067) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61068 FOREIGN KEY (V61068) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61069 FOREIGN KEY (V61069) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V610610 FOREIGN KEY (V610610) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V610611 FOREIGN KEY (V610611) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61072 FOREIGN KEY (V61072) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V61073 FOREIGN KEY (V61073) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6108 FOREIGN KEY (V6108) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6109 FOREIGN KEY (V6109) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6110 FOREIGN KEY (V6110) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6111 FOREIGN KEY (V6111) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6112 FOREIGN KEY (V6112) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6113 FOREIGN KEY (V6113) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6114 FOREIGN KEY (V6114) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6115 FOREIGN KEY (V6115) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6116 FOREIGN KEY (V6116) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6117 FOREIGN KEY (V6117) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6118 FOREIGN KEY (V6118) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6119 FOREIGN KEY (V6119) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6120 FOREIGN KEY (V6120) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONDICOES_VIDA_V6121 FOREIGN KEY (V6121) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
		);

-- Criar Registro CARACTERISTICA_DIETA

	CREATE TABLE "POF_2018".CARACTERISTICA_DIETA(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		COD_INFORMANTE varchar(2),
		V7101 varchar(1),
		V7102 varchar(1), -- Quest
		V71031 varchar(1), -- Quest
		V71032 varchar(1), -- Quest
		V71033 varchar(1), -- Quest
		V71034 varchar(1), -- Quest
		V71035 varchar(1), -- Quest
		V71036 varchar(1), -- Quest
		V71037 varchar(1), -- Quest
		V71038 varchar(1), -- Quest
		V7104 varchar(1), -- Quest
		V71051 varchar(1), -- Quest
		V71052 varchar(1), -- Quest
		V71053 varchar(1), -- Quest
		V71054 varchar(1), -- Quest
		V71055 varchar(1), -- Quest
		V71056 varchar(1), -- Quest
		V71A01 varchar(1), -- Quest
		V71A02 varchar(1), -- Quest
		V72C01 numeric(3), 
		V72C02 numeric(3),
		CONSTRAINT PK_CARACTERISTICA_DIETA PRIMARY KEY (COD_UPA,NUM_DOM,COD_INFORMANTE),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V7101 FOREIGN KEY (V7101) REFERENCES "POF_2018".V7101 (COD_TIPO_ACUCAR),
		CONSTRAINT FK_CARACTERISTICA_DIETA_ FOREIGN KEY (V7102) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71031 FOREIGN KEY (V71031) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71032 FOREIGN KEY (V71032) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71033 FOREIGN KEY (V71033) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71034 FOREIGN KEY (V71034) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71035 FOREIGN KEY (V71035) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71036 FOREIGN KEY (V71036) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71037 FOREIGN KEY (V71037) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71038 FOREIGN KEY (V71038) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V7104 FOREIGN KEY (V7104) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71051 FOREIGN KEY (V71051) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71052 FOREIGN KEY (V71052) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71053 FOREIGN KEY (V71053) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71054 FOREIGN KEY (V71054) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71055 FOREIGN KEY (V71055) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71056 FOREIGN KEY (V71056) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71A01 FOREIGN KEY (V71A01) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CARACTERISTICA_DIETA_V71A02 FOREIGN KEY (V71A02) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);

-- Criar Registro CONSUMO_ALIMENTAR

	CREATE TABLE "POF_2018".CONSUMO_ALIMENTAR(
		COD_UPA varchar(9),
		NUM_DOM varchar(2),
		COD_INFORMANTE varchar(2),
		QUADRO varchar(2),
		SEQ varchar(2),
		V9005 numeric(4,1),
		V9007 varchar(2),
		V9001 varchar(7),
		V9015 varchar(3),
		V9016 varchar(2),
		V9017 varchar(1),
		V9018 varchar(1),
		V9019 varchar(1), -- Quest
		V9020 varchar(1), -- Quest
		V9021 varchar(1), -- Quest
		V9022 varchar(1), -- Quest
		V9023 varchar(1), -- Quest
		V9024 varchar(1), -- Quest
		V9025 varchar(1), -- Quest
		V9026 varchar(1), -- Quest
		V9027 varchar(1), -- Quest
		V9028 varchar(1), -- Quest
		V9029 varchar(1), -- Quest
		V9030 varchar(1), -- Quest
		COD_UNIDADE_MEDIDA_FINAL varchar(2),
		COD_PREPARACAO_FINAL varchar(2),
		GRAMATURA1 numeric(7,2),
		QTD numeric(9,3),
		COD_TBCA numeric(6),
		ENERGIA_KCAL numeric(14,8),
		ENERGIA_KJ numeric(14,8),
		PTN numeric(14,8),
		CHOTOT numeric(14,8),
		FIBRA numeric(14,8),
		LIP numeric(14,8),
		COLEST numeric(14,8),
		AGSAT numeric(14,8),
		AGMONO numeric(14,8),
		AGPOLI numeric(14,8),
		AGTRANS numeric(14,8),
		CALCIO numeric(14,8),
		FERRO numeric(14,8),
		SODIO numeric(14,8),
		MAGNESIO numeric(14,8),
		FOSFORO numeric(14,8),
		POTASSIO numeric(14,8),
		COBRE numeric(14,8),
		ZINCO numeric(14,8),
		VITA_RAE numeric(14,8),
		THIAMINE numeric(14,8),
		RIBOFLAVIN numeric(14,8),
		NIACIN numeric(14,8),
		PYRIDOXAMINE numeric(14,8),
		COBALAMIN numeric(14,8),
		VITD numeric(14,8),
		VITE numeric(14,8),
		VITC numeric(14,8),
		FOLATO numeric(14,8),
		PESO numeric(1,0),
		PESO_FINAL numeric(1,0),
		RENDA_TOTAL numeric(1,0),
		DIA_SEMANA VARCHAR(50),
		DIA_ATIPICO varchar(1), -- QUEST
		CONSTRAINT PK_CONSUMO_ALIMENTAR PRIMARY KEY (COD_UPA,NUM_DOM,COD_INFORMANTE),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9007 FOREIGN KEY (V9007) REFERENCES "POF_2018".UNIDADE_MEDIDA_CONSUMO_ALIMENTAR (COD_UNIDADE_MEDIDA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9001 FOREIGN KEY (V9001) REFERENCES "POF_2018".CADASTRO_PRODUTOS_CONSUMO_ALIMENTAR (COD_ALIMENTO),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9016 FOREIGN KEY (V9016) REFERENCES "POF_2018".V9016 (COD_FORMA_PREPARACAO_ALIMENTOS),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9017 FOREIGN KEY (V9017) REFERENCES "POF_2018".V9017 (COD_OCASIAO_CONSUMO),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9018 FOREIGN KEY (V9018) REFERENCES "POF_2018".V9018 (COD_LOCAL_REFEICAO),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_UNIDADE_MEDIDA_FINAL FOREIGN KEY (COD_UNIDADE_MEDIDA_FINAL) REFERENCES "POF_2018".UNIDADE_MEDIDA_CONSUMO_ALIMENTAR (COD_UNIDADE_MEDIDA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_COD_PREPARACAO_FINAL FOREIGN KEY (V9018) REFERENCES "POF_2018".COD_PREPARACAO_FINAL (COD_PREPARACAO_FINAL),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9019 FOREIGN KEY (V9019) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9020 FOREIGN KEY (V9020) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9021 FOREIGN KEY (V9021) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9022 FOREIGN KEY (V9022) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9023 FOREIGN KEY (V9023) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9024 FOREIGN KEY (V9024) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9025 FOREIGN KEY (V9025) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9026 FOREIGN KEY (V9026) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9027 FOREIGN KEY (V9027) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9028 FOREIGN KEY (V9028) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9029 FOREIGN KEY (V9029) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_V9030 FOREIGN KEY (V9030) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA),
		CONSTRAINT FK_CONSUMO_ALIMENTAR_DIA_ATIPICO FOREIGN KEY (DIA_ATIPICO) REFERENCES "POF_2018".QUESTIONARIO (COD_RESPOSTA)
	);









