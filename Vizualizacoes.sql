-- Criar Vizualização com Registro "Domicílios"

create or replace view "POF_2018"."View_Domicilio" as 
	SELECT  
	uf.uf, 
	est.estrato, 
	t.tipo_situacao_dom,
	d.cod_upa,
	d.num_dom, 
	v01.tipo_dom,
	v02.tipo_material_parede, 
	v03.tipo_telhado,
	v04.tipo_material_piso,
	d.v0205,
	d.v0206, 
	v07.tipo_abastecimento,
	v08.freq_agua_30_dias_rede_geral,
	v09.tipo_abastecimento_agua,
	q1.resposta AS  v02101,
	q2.resposta AS  v02102,
	q3.resposta AS  v02103,
	q4.resposta AS  v02104,
	q5.resposta AS  v02105,
	d.v02111,
	d.v02112,
	q6.resposta AS  v02113,
	v12.tipo_escoadouro_dejetos,
	v13.destino_lixo,
	q7.resposta AS v02141,
	q8.resposta AS v02142,
	v15.freq_energia_rede_geral,
	q9.resposta AS v02161,
	q10.resposta AS v02162,
	q11.resposta AS v02163,
	q12.resposta AS v02164,
	v17.tipo_propriedade_dom,
	v19.tipo_contrato_aluguel,
	q13.resposta AS v0220,
	v21.tipo_servico_correios_dom,
	d.peso,
	d.peso_final,
	v99.tipo_segunranca_alimentar 
	FROM "POF_2018".domicilio d
	INNER JOIN "POF_2018".uf uf ON uf."cd_uf" = d."uf"
	INNER JOIN "POF_2018".estrato est ON est."cod_estrato" = d."estrato_pof"
	INNER JOIN "POF_2018".tipo_situacao_reg t ON t."cod_tipo_situacao_dom" = d."tipo_situacao_reg"
	INNER JOIN "POF_2018".v0201 v01 ON v01."cod_tipo_dom" = d."v0201"
	INNER JOIN "POF_2018".v0202 v02 ON v02."cod_material_parede" = d."v0202"
	INNER JOIN "POF_2018".v0203 v03 ON v03."cod_tipo_telhado" = d."v0203"
	INNER JOIN "POF_2018".v0204 v04 ON v04."cod_tipo_material_piso" = d."v0204"
	INNER JOIN "POF_2018".v0207 v07 ON v07."cod_abastecimento" = d."v0207"
	INNER JOIN "POF_2018".v0208 v08 ON v08."cod_freq_agua_30_dias_rede_geral" = d."v0208"
	INNER JOIN "POF_2018".v0209 v09 ON v09."cod_tipo_abastecimento_agua" = d."v0209"
	INNER JOIN "POF_2018".questionario q1 ON q1."cod_resposta" = d."v02101"
	INNER JOIN "POF_2018".questionario q2 ON q2."cod_resposta" = d."v02102"
	INNER JOIN "POF_2018".questionario q3 ON q3."cod_resposta" = d."v02103"
	INNER JOIN "POF_2018".questionario q4 ON q4."cod_resposta" = d."v02104"
	INNER JOIN "POF_2018".questionario q5 ON q5."cod_resposta" = d."v02105"
	INNER JOIN "POF_2018".questionario q6 ON q6."cod_resposta" = d."v02113"
	INNER JOIN "POF_2018".v0212 v12 ON v12."cod_escoadouro" = d."v0212"
	INNER JOIN "POF_2018".v0213 v13 ON v13."cod_destino_lixo" = d."v0213"
	INNER JOIN "POF_2018".questionario q7 ON q7."cod_resposta" = d."v02141"
	INNER JOIN "POF_2018".questionario q8 ON q8."cod_resposta" = d."v02142"
	INNER JOIN "POF_2018".v0215 v15 ON v15."cod_freq_energia_rede_geral" = d."v0215"
	INNER JOIN "POF_2018".questionario q9 ON q9."cod_resposta" = d."v02161"
	INNER JOIN "POF_2018".questionario q10 ON q10."cod_resposta" = d."v02162"
	INNER JOIN "POF_2018".questionario q11 ON q11."cod_resposta" = d."v02163"
	INNER JOIN "POF_2018".questionario q12 ON q12."cod_resposta" = d."v02164"
	INNER JOIN "POF_2018".v0217 v17 ON v17."cod_tipo_propriedade_dom" = d."v0217"
	INNER JOIN "POF_2018".v0219 v19 ON v19."cod_tipo_contrato_aluguel" = d."v0219"
	INNER JOIN "POF_2018".questionario q13 ON q13."cod_resposta" = d."v0220"
	INNER JOIN "POF_2018".v0221 v21 ON v21."cod_tipo_servico_correios_dom" = d."v0221"
	INNER JOIN "POF_2018".v6199 v99 ON v99."cod_tipo_segunranca_alimentar" = d."v6199";	

-- Criar Vizualização com registro "Morador" 
	
	create or replace view "POF_2018"."View_Morador" as 
	SELECT  
	m.cod_upa,
	m.num_dom, 
	m.num_uc,
	m.cod_informante,
	v06.condicao_unidade_consumo,
	v01.condicao_presenca_no_momento_pesquisa,
	m.v04021,
	m.v04022,
	m.v04023,
	m.v0403,
	v04.sexo,
	v05.cor_ou_raca,
	q1.resposta as v0406,
	q2.resposta as v0407,
	q3.resposta as v0408,
	m.v0409,
	m.v0410,
	m.v0411,
	q4.resposta as v0412,
	m.v0413,
	q5.resposta as v0414,
	q6.resposta as v0415,
	m.v0416,
	q7.resposta as v041711,
	q8.resposta as v041712,
	q9.resposta as v041721,
	q10.resposta as v041722,
	q11.resposta as v041731,
	q12.resposta as v041732,
	q13.resposta as v041741,
	q14.resposta as v041742,
	v18.tipo_escola_ou_creche_frequentada,
	v19.tipo_curso_frequentado,
	v20.duracao_curso_frequentado,
	v21.tipo_organizacao_curso_frequentado,
	v22.ano_semestre_serie_frequentada,
	q15.resposta as v0423,
	q16.resposta as v0424,
	v25.curso_mais_elevado_frequentado, 
	v26.duracao_curso_frequentado as v0426,
	v27.periodo,
	v28.concluiu_primeiro_ano_serie_semestre_curso_frequentado,
	m.v0429,
	q17.resposta as v0430,
	m.anos_estudo,
	m.renda_total,
	n.nivel_instrucao,
	m.renda_disp_pc,
	m.renda_monet_pc,
	m.renda_nao_monet_pc,
	m.deducao_pc
	FROM "POF_2018".morador m
	INNER JOIN "POF_2018".v0306 v06 ON v06."cod_condicao_unidade_consumo" = m."v0306"
	INNER JOIN "POF_2018".v0401 v01 ON v01."cod_condicao_presenca_no_momento_pesquisa" = m."v0401"
	INNER JOIN "POF_2018".v0404 v04 ON v04."cod_sexo" = m."v0404"
	INNER JOIN "POF_2018".v0405 v05 ON v05."cod_cor_ou_raca" = m."v0405"
	INNER JOIN "POF_2018".questionario q1 ON q1."cod_resposta" = m."v0406"
	INNER JOIN "POF_2018".questionario q2 ON q2."cod_resposta" = m."v0407"
	INNER JOIN "POF_2018".questionario q3 ON q3."cod_resposta" = m."v0408"
	INNER JOIN "POF_2018".questionario q4 ON q4."cod_resposta" = m."v0412"
	INNER JOIN "POF_2018".questionario q5 ON q5."cod_resposta" = m."v0414"
	INNER JOIN "POF_2018".questionario q6 ON q6."cod_resposta" = m."v0415"
	INNER JOIN "POF_2018".questionario q7 ON q7."cod_resposta" = m."v041711"
	INNER JOIN "POF_2018".questionario q8 ON q8."cod_resposta" = m."v041712"
	INNER JOIN "POF_2018".questionario q9 ON q9."cod_resposta" = m."v041721"
	INNER JOIN "POF_2018".questionario q10 ON q10."cod_resposta" = m."v041722"
	INNER JOIN "POF_2018".questionario q11 ON q11."cod_resposta" = m."v041731"
	INNER JOIN "POF_2018".questionario q12 ON q12."cod_resposta" = m."v041732"
	INNER JOIN "POF_2018".questionario q13 ON q13."cod_resposta" = m."v041741"
	INNER JOIN "POF_2018".questionario q14 ON q14."cod_resposta" = m."v041742"
	INNER JOIN "POF_2018".v0418 v18 ON v18."cod_tipo_escola_ou_creche_frequentada" = m."v0418"
	INNER JOIN "POF_2018".v0419 v19 ON v19."cod_tipo_curso_frequentado" = m."v0419"
	INNER JOIN "POF_2018".v0420 v20 ON v20."cod_duracao_curso_frequentado" = m."v0420"
	INNER JOIN "POF_2018".v0421 v21 ON v21."cod_tipo_organizacao_curso_frequentado" = m."v0421"
	INNER JOIN "POF_2018".v0422 v22 ON v22."cod_ano_semestre_serie_frequentada" = m."v0422"
	INNER JOIN "POF_2018".questionario q15 ON q15."cod_resposta" = m."v0423"
	INNER JOIN "POF_2018".questionario q16 ON q16."cod_resposta" = m."v0424"
	INNER JOIN "POF_2018".v0425 v25 ON v25."cod_curso_mais_elevado_frequentado" = m."v0425"
	INNER JOIN "POF_2018".v0420 v26 ON v26."cod_duracao_curso_frequentado" = m."v0426"
	INNER JOIN "POF_2018".v0427 v27 ON v27."cod_periodo" = m."v0427"
	INNER JOIN "POF_2018".v0428 v28 ON v28."cod_concluiu_primeiro_ano_serie_semestre_curso_frequentado" = m."v0428"
	INNER JOIN "POF_2018".questionario q17 ON q17."cod_resposta" = m."v0430"
	INNER JOIN "POF_2018".nivel_instrucao n ON n."cod_nivel_instrucao" = m."nivel_instrucao";

-- Criar Vizualização com registro "Aluguel Estimado"	
	
	create or replace view "POF_2018"."View_Aluguel_Estimado" as 
	SELECT
	a.cod_upa,
	a.num_dom,
	a.quadro,
	cp.produto,
	v02.forma_aquisicao,
	a.v8000,
	v10.meses,
	a.v9011,
	a.deflator,
	a.v8000_defla,
	c.valor_imputado,
	a.fator_anualizacao
	from "POF_2018".aluguel_estimado a
	INNER JOIN "POF_2018".cadastro_produtos cp ON cp."codigo_produto" = a.v9001
	INNER JOIN "POF_2018".v9002 v02 ON v02."cod_forma_aquisicao" = a.v9002
	INNER JOIN "POF_2018".v9010 v10 ON v10."cod_meses" = a."v9010"
	INNER JOIN "POF_2018".cod_imput_valor c ON c."cod_valor_imputado" = a."cod_imput_valor";

-- Criar Vizualização de Caderneta Coletiva

	create or replace view "POF_2018"."View_Caderneta_Coletiva" as
	select 
	"POF_2018".caderneta_coletiva.cod_upa,
	"POF_2018".caderneta_coletiva.num_dom,
	"POF_2018".caderneta_coletiva.num_uc,
	"POF_2018".caderneta_coletiva.quadro,
	"POF_2018".caderneta_coletiva.seq,
	"POF_2018".cadastro_produtos.produto,
	"POF_2018".v9002.forma_aquisicao,
	"POF_2018".caderneta_coletiva.v8000,
	"POF_2018".caderneta_coletiva.deflator,
	"POF_2018".caderneta_coletiva.v8000_defla,
	"POF_2018".cod_imput_valor.valor_imputado,
	"POF_2018".caderneta_coletiva.fator_anualizacao,
	"POF_2018".caderneta_coletiva.v9005,
	"POF_2018".unidade_medida.unidade_medida,
	"POF_2018".peso_volume.peso_ou_volume, 
	"POF_2018".caderneta_coletiva.qtd_final,
	"POF_2018".cadastro_locais_aquisicao.local_aquisicao  
	from  "POF_2018".caderneta_coletiva
	inner join "POF_2018".cadastro_produtos on "POF_2018".caderneta_coletiva.v9001 = "POF_2018".cadastro_produtos.codigo_produto 
	inner join "POF_2018".v9002 on "POF_2018".caderneta_coletiva.v9002 = "POF_2018".v9002.cod_forma_aquisicao
	inner join "POF_2018".cod_imput_valor on "POF_2018".caderneta_coletiva.cod_imput_valor = "POF_2018".cod_imput_valor.cod_valor_imputado 
	inner join "POF_2018".unidade_medida on "POF_2018".caderneta_coletiva.v9007 = "POF_2018".unidade_medida.cod_unidade_medida 
	inner join "POF_2018".peso_volume on "POF_2018".caderneta_coletiva.v9009 = "POF_2018".peso_volume.cod_peso_ou_volume
	inner join "POF_2018".cadastro_locais_aquisicao on "POF_2018".caderneta_coletiva.v9004 = "POF_2018".cadastro_locais_aquisicao.cod_local_aquisicao; 

-- Criar Vizualização com Registro "Despesa Coletiva"

	create or replace view "POF_2018"."View_Despesa_Coletiva" as 
	select 
	dc.cod_upa, 
	dc.num_dom,
	dc.num_uc,
	dc.quadro,
	dc.seq,
	cp.produto,
	dc.v9005,
	dc.v8000,
	v10.meses,
	dc.v9011,
	v12.estado_produto,
	dc.v1904,
	v19.tipo_servico_domestico_contratado,
	dc.deflator,
	dc.v8000_defla,
	dc.v1904_defla,
	civ.valor_imputado,
	ciq.quantidade_imputada,
	dc.fator_anualizacao,
	cla.local_aquisicao
	from "POF_2018".despesa_coletiva dc
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = dc.v9001
	inner join "POF_2018".v9002 v02 on v02.cod_forma_aquisicao = dc.v9002
	inner join "POF_2018".v9010 v10 on V10.cod_meses = dc.v9010
	inner join "POF_2018".v9012 v12 on v12.cod_estado_produto = dc.v9012
	inner join "POF_2018".v1905 v19 on v19.cod_tipo_servico_domestico_contratado = dc.v1905
	inner join "POF_2018".cod_imput_valor civ on civ.cod_valor_imputado = dc.cod_imput_valor
	inner join "POF_2018".cod_imput_qtd ciq on ciq.cod_quantidade_imputada = dc.cod_imput_quantidade
	inner join "POF_2018".cadastro_locais_aquisicao cla on cla.cod_local_aquisicao = dc.v9004;

-- Criar Vizualização com Registro "Despesas Individuais"

	create view "POF_2018"."View_Despesa_Individual" as
	select 
	di.cod_upa,
	di.num_dom,
	di.num_uc,
	di.cod_informante,
	di.quadro,
	di.seq,
	cp.produto,
	v02.forma_aquisicao,
	di.v8000,
	v10.meses,
	di.v9011,
	v12.estado_produto,
	v4.motivo_viagem_assossiada_a_despesa,
	v5.origem_despesa_aquisicao_relacionada_a_viagem,
	di.deflator,
	di.v8000_defla,
	civ.valor_imputado,
	di.fator_anualizacao, 
	cla.local_aquisicao
	from "POF_2018".despesa_individual di
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = di.v9001
	inner join "POF_2018".v9002 v02 on v02.cod_forma_aquisicao = di.v9002
	inner join "POF_2018".v9010 v10 on V10.cod_meses = DI.v9010
	inner join "POF_2018".v9012 v12 on v12.cod_estado_produto = di.v9012
	inner join "POF_2018".v4104 v4 on v4.cod_motivo_viagem_assossiada_a_despesa = di.v4104
	inner join "POF_2018".v4105 v5 on v5.cod_origem_despesa_aquisicao_relacionada_a_viagem = di.v4105 
	inner join "POF_2018".cod_imput_valor civ on civ.cod_valor_imputado = di.cod_imput_valor 
	inner join "POF_2018".cadastro_locais_aquisicao cla on cla.cod_local_aquisicao = di.v9004;

-- Criar Vizualização com Registro "Inventário"

	create or replace view "POF_2018"."View_Inventario" as
	select 
	i.cod_upa,
	i.num_dom,
	i.num_uc,
	i.quadro,
	i.seq,
	cp.produto,
	i.v9005,
	v02.forma_aquisicao,
	i.v1404,
	v12.estado_produto
	from "POF_2018".inventario i
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = i.v9001 
	inner join "POF_2018".v9002 v02 on V02.cod_forma_aquisicao = i.v9002 
	inner join "POF_2018".v9012 v12 on v12.cod_estado_produto = i.v9012;

-- Criar Vizualização com Registro "Morador Qualidade de Vida"

	create or replace view "POF_2018"."View_Morador_Quali_Vida" as
	select 
	m.cod_upa,
	m.num_dom,
	m.cod_informante,
	m.contagem_ponderada,
	m.funcao_perda,
	q1.resposta as v201,
	q2.resposta as v202,
	q3.resposta as v204,
	q4.resposta as v205,
	q5.resposta as v206,
	q6.resposta as v207,
	q7.resposta as v208,
	q8.resposta as v209,
	q9.resposta as v2010,
	q10.resposta as v2011,
	q11.resposta as v2012,
	q12.resposta as v2014,
	q13.resposta as v2015,
	q14.resposta as v2016,
	q15.resposta as v2017,
	q16.resposta as v301,
	q17.resposta as v302,
	q18.resposta as v303,
	q19.resposta as v304,
	q20.resposta as v305,
	q21.resposta as v306,
	q22.resposta as v307,
	q23.resposta as v308,
	q24.resposta as v401,
	q25.resposta as v402,
	q26.resposta as v403,
	q27.resposta as v501,
	q28.resposta as v502,
	q29.resposta as v503,
	q30.resposta as v504,
	q31.resposta as v505,
	q32.resposta as v506,
	q33.resposta as v601,
	q34.resposta as v602,
	q35.resposta as v603,
	q36.resposta as v604,
	q37.resposta as v605,
	q38.resposta as v606,
	q39.resposta as v607,
	q40.resposta as v608,
	q41.resposta as v609,
	q42.resposta as v610,
	q43.resposta as v611,
	q44.resposta as v701,
	q45.resposta as v702,
	q46.resposta as v703,
	q47.resposta as v704,
	q48.resposta as v801,
	q49.resposta as v802,
	q50.resposta as v901,
	q51.resposta as v902,
	gr.regiao_geografica,
	c1.composicao_demografica,
	c2.cor_ou_raca_pessoa_referencia,
	c3.sexo,
	c4.nivel_instrucao,
	c5.tipo_ocupacao_pessoa_referencia, 
	c6.composicao_familiar,
	m.renda_disp_pc_ss
	from "POF_2018".morador_quali_vida m
	inner join "POF_2018".questionario q1 on q1.cod_resposta = m.v201 
	inner join "POF_2018".questionario q2 on q2.cod_resposta = m.v202
	inner join "POF_2018".questionario q3 on q3.cod_resposta = m.v204
	inner join "POF_2018".questionario q4 on q4.cod_resposta = m.v205
	inner join "POF_2018".questionario q5 on q5.cod_resposta = m.v206
	inner join "POF_2018".questionario q6 on q6.cod_resposta = m.v207
	inner join "POF_2018".questionario q7 on q7.cod_resposta = m.v208
	inner join "POF_2018".questionario q8 on q8.cod_resposta = m.v209
	inner join "POF_2018".questionario q9 on q9.cod_resposta = m.v210
	inner join "POF_2018".questionario q10 on q10.cod_resposta = m.v211
	inner join "POF_2018".questionario q11 on q11.cod_resposta = m.v212
	inner join "POF_2018".questionario q12 on q12.cod_resposta = m.v214
	inner join "POF_2018".questionario q13 on q13.cod_resposta = m.v215
	inner join "POF_2018".questionario q14 on q14.cod_resposta = m.v216
	inner join "POF_2018".questionario q15 on q15.cod_resposta = m.v217
	inner join "POF_2018".questionario q16 on q16.cod_resposta = m.v301
	inner join "POF_2018".questionario q17 on q17.cod_resposta = m.v302
	inner join "POF_2018".questionario q18 on q18.cod_resposta = m.v303
	inner join "POF_2018".questionario q19 on q19.cod_resposta = m.v304
	inner join "POF_2018".questionario q20 on q20.cod_resposta = m.v305
	inner join "POF_2018".questionario q21 on q21.cod_resposta = m.v306
	inner join "POF_2018".questionario q22 on q22.cod_resposta = m.v307
	inner join "POF_2018".questionario q23 on q23.cod_resposta = m.v308
	inner join "POF_2018".questionario q24 on q24.cod_resposta = m.v401
	inner join "POF_2018".questionario q25 on q25.cod_resposta = m.v402
	inner join "POF_2018".questionario q26 on q26.cod_resposta = m.v403
	inner join "POF_2018".questionario q27 on q27.cod_resposta = m.v501
	inner join "POF_2018".questionario q28 on q28.cod_resposta = m.v502
	inner join "POF_2018".questionario q29 on q29.cod_resposta = m.v503
	inner join "POF_2018".questionario q30 on q30.cod_resposta = m.v504
	inner join "POF_2018".questionario q31 on q31.cod_resposta = m.v505
	inner join "POF_2018".questionario q32 on q32.cod_resposta = m.v506
	inner join "POF_2018".questionario q33 on q33.cod_resposta = m.v601
	inner join "POF_2018".questionario q34 on q34.cod_resposta = m.v602
	inner join "POF_2018".questionario q35 on q35.cod_resposta = m.v603
	inner join "POF_2018".questionario q36 on q36.cod_resposta = m.v604
	inner join "POF_2018".questionario q37 on q37.cod_resposta = m.v605
	inner join "POF_2018".questionario q38 on q38.cod_resposta = m.v606
	inner join "POF_2018".questionario q39 on q39.cod_resposta = m.v607
	inner join "POF_2018".questionario q40 on q40.cod_resposta = m.v608
	inner join "POF_2018".questionario q41 on q41.cod_resposta = m.v609
	inner join "POF_2018".questionario q42 on q42.cod_resposta = m.v610
	inner join "POF_2018".questionario q43 on q43.cod_resposta = m.v611
	inner join "POF_2018".questionario q44 on q44.cod_resposta = m.v701
	inner join "POF_2018".questionario q45 on q45.cod_resposta = m.v702
	inner join "POF_2018".questionario q46 on q46.cod_resposta = m.v703
	inner join "POF_2018".questionario q47 on q47.cod_resposta = m.v704
	inner join "POF_2018".questionario q48 on q48.cod_resposta = m.v801
	inner join "POF_2018".questionario q49 on q49.cod_resposta = m.v802
	inner join "POF_2018".questionario q50 on q50.cod_resposta = m.v901
	inner join "POF_2018".questionario q51 on q51.cod_resposta = m.v902
	inner join "POF_2018".grande_regiao gr on gr.cod_regiao_geografica = m.grande_regiao
	inner join "POF_2018".c1 c1 on c1.cod_composicao_demografica = m.c1 
	inner join "POF_2018".c2 c2 on c2.cod_cor_ou_raca_pessoa_referencia = m.c2
	inner join "POF_2018".v0404 c3 on c3.cod_sexo = m.c3 
	inner join "POF_2018".nivel_instrucao c4 on c4.cod_nivel_instrucao = m.c4 
	inner join "POF_2018".c5 c5 on c5.cod_tipo_ocupacao_pessoa_referencia = m.c5
	inner join "POF_2018".c6 c6 on c6.cod_composicao_familiar = m.c6;

-- Criar Vizualização com Registro "Caracteristicas da Dieta"

	create or replace view "POF_2018"."View_Caracteristica_Dieta" as
	select 
	c.cod_upa,
	c.num_dom,
	c.cod_informante,
	v71.tipo_acucar,
	q1.resposta as v7102,
	q2.resposta as v71031,
	q3.resposta as v71032,
	q4.resposta as v71033,
	q5.resposta as v71034,
	q6.resposta as v71035,
	q7.resposta as v71036,
	q8.resposta as v71037,
	q9.resposta as v71038,
	q10.resposta as v7104,
	q11.resposta as v71051,
	q12.resposta as v71052,
	q13.resposta as v71053,
	q14.resposta as v71054,
	q15.resposta as v71055,
	q16.resposta as v71056,
	q17.resposta as v71a01,
	q18.resposta as v71a02,
	c.v72c01,
	c.v72c02 
	from  "POF_2018".caracteristica_dieta c
	inner join "POF_2018".v7101 v71 on v71.cod_tipo_acucar =  c.v7101
	inner join "POF_2018".questionario q1 on q1.cod_resposta  =  c.v7102
	inner join "POF_2018".questionario q2 on q2.cod_resposta  =  c.v71031
	inner join "POF_2018".questionario q3 on q3.cod_resposta  =  c.v71032
	inner join "POF_2018".questionario q4 on q4.cod_resposta  =  c.v71033
	inner join "POF_2018".questionario q5 on q5.cod_resposta  =  c.v71034
	inner join "POF_2018".questionario q6 on q6.cod_resposta  =  c.v71035
	inner join "POF_2018".questionario q7 on q7.cod_resposta  =  c.v71036
	inner join "POF_2018".questionario q8 on q8.cod_resposta  =  c.v71037
	inner join "POF_2018".questionario q9 on q9.cod_resposta  =  c.v71038
	inner join "POF_2018".questionario q10 on q10.cod_resposta  =  c.v7104
	inner join "POF_2018".questionario q11 on q11.cod_resposta  =  c.v71051
	inner join "POF_2018".questionario q12 on q12.cod_resposta  =  c.v71052
	inner join "POF_2018".questionario q13 on q13.cod_resposta  =  c.v71053
	inner join "POF_2018".questionario q14 on q14.cod_resposta  =  c.v71054
	inner join "POF_2018".questionario q15 on q15.cod_resposta  =  c.v71055
	inner join "POF_2018".questionario q16 on q16.cod_resposta  =  c.v71056
	inner join "POF_2018".questionario q17 on q17.cod_resposta  =  c.v71a01
	inner join "POF_2018".questionario q18 on q18.cod_resposta  =  c.v71a02; 

-- Criar Vizualização com Registro "Condições de Vida"

	create or replace view "POF_2018"."View_Condições_Vida" as
	select 
	c.cod_upa,
	c.num_dom,
	c.num_uc,
	c.cod_informante,
	v61.nivel_dificuldade,
	c.v6102,
	c.v6103,
	v41.nivel_satisfacao,
	v1.nivel_satisfacao as v61042,
	v2.nivel_satisfacao as v61043,
	v3.nivel_satisfacao as v61044,
	v4.nivel_satisfacao as v61045,
	v5.nivel_satisfacao as v61046,
	v6.nivel_satisfacao as v61051,
	v7.nivel_satisfacao as v61052,
	v8.nivel_satisfacao as v61053,
	v9.nivel_satisfacao as v61054,
	v10.nivel_satisfacao as v61055,
	v11.nivel_satisfacao as v61056,
	v12.nivel_satisfacao as v61057,
	v13.nivel_satisfacao as v61058,
	q1.resposta as v61061,
	q2.resposta as v61062,
	q3.resposta as v61063,
	q4.resposta as v61064,
	q5.resposta as v61065,
	q6.resposta as v61066,
	q7.resposta as v61067,
	q8.resposta as v61068,
	q9.resposta as v61069,
	q10.resposta as v610610,
	q11.resposta as v610611,
	q12.resposta as v61071,
	q13.resposta as v61072,
	q14.resposta as v61073,
	q15.resposta as v6108,
	q16.resposta as v6109,
	q17.resposta as v6110,
	q18.resposta as v6111,
	q19.resposta as v6112,
	q20.resposta as v6113,
	q21.resposta as v6114,
	q22.resposta as v6115,
	q23.resposta as v6116,
	q24.resposta as v6117,
	q25.resposta as v6118,
	q26.resposta as v6119,
	q27.resposta as v6120,
	q28.resposta as v6121
	from "POF_2018".condicoes_vida c
	inner join "POF_2018".v6101 v61 on v61.cod_nivel_dificuldade = c.v6101
	inner join "POF_2018".v61041 v41 on v41.cod_nivel_satisfacao = c.v61041 
	inner join "POF_2018".v61041 v1 on v1.cod_nivel_satisfacao = c.v61042
	inner join "POF_2018".v61041 v2 on v2.cod_nivel_satisfacao = c.v61043
	inner join "POF_2018".v61041 v3 on v3.cod_nivel_satisfacao = c.v61044
	inner join "POF_2018".v61041 v4 on v4.cod_nivel_satisfacao = c.v61045
	inner join "POF_2018".v61041 v5 on v5.cod_nivel_satisfacao = c.v61046
	inner join "POF_2018".v61041 v6 on v6.cod_nivel_satisfacao = c.v61051
	inner join "POF_2018".v61041 v7 on v7.cod_nivel_satisfacao = c.v61052
	inner join "POF_2018".v61041 v8 on v8.cod_nivel_satisfacao = c.v61053
	inner join "POF_2018".v61041 v9 on v9.cod_nivel_satisfacao = c.v61054
	inner join "POF_2018".v61041 v10 on v10.cod_nivel_satisfacao = c.v61055
	inner join "POF_2018".v61041 v11 on v11.cod_nivel_satisfacao = c.v61056
	inner join "POF_2018".v61041 v12 on v12.cod_nivel_satisfacao = c.v61057
	inner join "POF_2018".v61041 v13 on v13.cod_nivel_satisfacao = c.v61058
	inner join "POF_2018".questionario q1 on q1.cod_resposta  =  c.v61061 
	inner join "POF_2018".questionario q2 on q2.cod_resposta  =  c.v61062
	inner join "POF_2018".questionario q3 on q3.cod_resposta  =  c.v61063
	inner join "POF_2018".questionario q4 on q4.cod_resposta  =  c.v61064
	inner join "POF_2018".questionario q5 on q5.cod_resposta  =  c.v61065
	inner join "POF_2018".questionario q6 on q6.cod_resposta  =  c.v61066
	inner join "POF_2018".questionario q7 on q7.cod_resposta  =  c.v61067
	inner join "POF_2018".questionario q8 on q8.cod_resposta  =  c.v61068
	inner join "POF_2018".questionario q9 on q9.cod_resposta  =  c.v61069
	inner join "POF_2018".questionario q10 on q10.cod_resposta  =  c.v610610
	inner join "POF_2018".questionario q11 on q11.cod_resposta  =  c.v610611
	inner join "POF_2018".questionario q12 on q12.cod_resposta  =  c.v61071
	inner join "POF_2018".questionario q13 on q13.cod_resposta  =  c.v61072
	inner join "POF_2018".questionario q14 on q14.cod_resposta  =  c.v61073
	inner join "POF_2018".questionario q15 on q15.cod_resposta  =  c.v6108
	inner join "POF_2018".questionario q16 on q16.cod_resposta  =  c.v6109
	inner join "POF_2018".questionario q17 on q17.cod_resposta  =  c.v6110
	inner join "POF_2018".questionario q18 on q18.cod_resposta  =  c.v6111
	inner join "POF_2018".questionario q19 on q19.cod_resposta  =  c.v6112
	inner join "POF_2018".questionario q20 on q20.cod_resposta  =  c.v6113
	inner join "POF_2018".questionario q21 on q21.cod_resposta  =  c.v6114
	inner join "POF_2018".questionario q22 on q22.cod_resposta  =  c.v6115
	inner join "POF_2018".questionario q23 on q23.cod_resposta  =  c.v6116
	inner join "POF_2018".questionario q24 on q24.cod_resposta  =  c.v6117
	inner join "POF_2018".questionario q25 on q25.cod_resposta  =  c.v6118
	inner join "POF_2018".questionario q26 on q26.cod_resposta  =  c.v6119
	inner join "POF_2018".questionario q27 on q27.cod_resposta  =  c.v6120
	inner join "POF_2018".questionario q28 on q28.cod_resposta  =  c.v6112;

-- Criar Vizualização com Registro "Consumo ALimentar"

	create or replace view  "POF_2018"."View_Consumo_Alimentar" as
	select 
	c.cod_upa,
	c.num_dom,
	c.cod_informante,
	c.quadro,
	c.seq,
	c.v9005,
	um.unidade_medida,
	cp.alimento,
	c.v9015,
	v16.forma_preparacao_alimentos,
	v17.ocasiao_consumo,
	v18.local_refeicao,
	q1.resposta as v9019,
	q2.resposta as v9020,
	q3.resposta as v9021,
	q4.resposta as v9022,
	q5.resposta as v9023,
	q6.resposta as v9024,
	q7.resposta as v9025,
	q8.resposta as v9026,
	q9.resposta as v9027,
	q10.resposta as v9028,
	q11.resposta as v9029,
	q12.resposta as v9030,
	u1.unidade_medida as cod_unidade_medida_final,
	cpf.preparacao_final,
	c.gramatura1, 
	c.qtd,
	c.cod_tbca,
	c.energia_kcal,
	c.energia_kj,
	c.ptn,
	c.chotot,
	c.fibra,
	c.lip,
	c.colest,
	c.agsat,
	c.agmono,
	c.agpoli,
	c.agtrans,
	c.calcio,
	c.ferro,
	c.sodio,
	c.magnesio,
	c.fosforo,
	c.potassio,
	c.cobre,
	c.zinco,
	c.vita_rae,
	c.thiamine,
	c.riboflavin,
	c.niacin,
	c.pyridoxamine,
	c.cobalamin,
	c.vitd,
	c.vite,
	c.vitc,
	c.folato,
	c.peso,
	c.peso_final,
	c.dia_semana,
	q13.resposta as dia_atipico,
	c.tiamina,
	c.riboflavina,
	c.niacina,
	c.piridoxamina,
	c.cobalamina
	from "POF_2018".consumo_alimentar c
	inner join "POF_2018".unidade_medida_consumo_alimentar  um on um.cod_unidade_medida = c.v9007 
	inner join "POF_2018".cadastro_produtos_consumo_alimentar cp on cp.cod_alimento = c.v9001  
	inner join "POF_2018".v9016 v16 on v16.cod_forma_preparacao_alimentos = c.v9016
	inner join "POF_2018".v9017 v17 on v17.cod_ocasiao_consumo = c.v9017 
	inner join "POF_2018".v9018 v18 on v18.cod_local_refeicao = c.v9018
	inner join "POF_2018".questionario q1 on q1.cod_resposta  =  c.v9019 
	inner join "POF_2018".questionario q2 on q2.cod_resposta  =  c.v9020
	inner join "POF_2018".questionario q3 on q3.cod_resposta  =  c.v9021
	inner join "POF_2018".questionario q4 on q4.cod_resposta  =  c.v9022
	inner join "POF_2018".questionario q5 on q5.cod_resposta  =  c.v9023
	inner join "POF_2018".questionario q6 on q6.cod_resposta  =  c.v9024
	inner join "POF_2018".questionario q7 on q7.cod_resposta  =  c.v9025
	inner join "POF_2018".questionario q8 on q8.cod_resposta  =  c.v9026
	inner join "POF_2018".questionario q9 on q9.cod_resposta  =  c.v9027
	inner join "POF_2018".questionario q10 on q10.cod_resposta  =  c.v9028
	inner join "POF_2018".questionario q11 on q11.cod_resposta  =  c.v9029
	inner join "POF_2018".questionario q12 on q12.cod_resposta  =  c.v9030
	inner join "POF_2018".unidade_medida_consumo_alimentar u1 on u1.cod_unidade_medida = c.cod_unidade_medida_final
	inner join "POF_2018".cod_preparacao_final cpf on cpf.cod_preparacao_final = c.cod_preparacao_final
	inner join "POF_2018".questionario q13 on q13.cod_resposta  =  c.dia_atipico;

-- Criar Vizualização com Registro "Rendimento Trabalho"

	create or replace view "POF_2018"."View_Rendimento_Trabalho" as 
	select 
	r.cod_upa,
	r.num_dom,
	r.cod_informante,
	r.quadro,
	r.sub_quadro,
	r.seq,
	cp.produto,
	v2.trabalho_exercido,
	v21.tipo_trabalhador_nao_remunerado,
	q1.resposta as v5303,
	q2.resposta as v5304,
	q3.resposta as v5305,
	v7.forma_pagamento,
	r.v8500,
	r.v531112,
	r.v531122,
	r.v531132,
	v10.meses,
	r.v9011,
	r.v5314,
	v15.duracao_minutos,
	r.deflator,
	r.v8500_defla,
	r.v531112_defla,
	r.v531122_defla,
	r.v531132_defla,
	civ.valor_imputado,
	r.fator_anualizacao,
	oc.denominacao as denominacao_ocupacao,
	ac.denominacao as denominacao_atividade_cnae
	from "POF_2018".rendimento_trabalho r
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = r.v9001
	inner join "POF_2018".v5302 v2 on v2.cod_trabalho_exercido = r.v5302
	inner join "POF_2018".v53021 v21 on v21.cod_tipo_trabalhador_nao_remunerado = r.v53021 
	inner join "POF_2018".questionario q1 on q1.cod_resposta = r.v5303
	inner join "POF_2018".questionario q2 on q2.cod_resposta = r.v5304
	inner join "POF_2018".v5307 v7 on v7.cod_forma_pagamento = r.v5307 
	inner join "POF_2018".questionario q3 on q3.cod_resposta = r.v5305
	inner join "POF_2018".v9010 v10 on v10.cod_meses = r.v9010 
	inner join "POF_2018".v5315 v15 on v15.cod_duracao_minutos = r.v5315
	inner join "POF_2018".cod_imput_valor civ on civ.cod_valor_imputado = r.cod_imput_valor 
	inner join "POF_2018".ocupacao_cod oc on oc.grupo_base = r.v53011 
	inner join "POF_2018".atividade_cnae ac on ac.classe = r.v53061; 

-- Criar Vizualização com Registro "Restrição Saúde"

	create or replace view "POF_2018".View_restricao_saude as 
	select 
	r.cod_upa,
	r.num_dom,
	r.num_uc,
	r.cod_informante,
	r.quadro,
	r.seq,
	cp.produto,
	v13.motivo_restricao_produtos_saude 
	from "POF_2018".restricao_saude r
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = r.v9001 
	inner join "POF_2018".v9013 v13 on v13.cod_motivo_restricao_produtos_saude = r.v9013; 

-- Criar Vizualização com Registro "View_Servico_N_Monetario_POF2"

	create or replace view "POF_2018".View_servico_nao_monetario_pof2 as 
	select 
	s.cod_upa,
	s.num_dom,
	s.num_uc,
	s.quadro,
	s.seq,
	cp.produto,
	v2.forma_aquisicao,
	s.v8000,
	v10.meses,
	s.v9011,
	s.v1904,
	v5.tipo_servico_domestico_contratado,
	s.deflator,
	s.v8000_defla,
	s.v1904_defla,
	civ.valor_imputado,
	s.fator_anualizacao,
	cla.local_aquisicao
	from "POF_2018".servico_nao_monetario_pof2 s
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = s.v9001 
	inner join "POF_2018".v9002 v2 on v2.cod_forma_aquisicao = s.v9002 
	inner join "POF_2018".v9010 v10 on v10.cod_meses = s.v9010 
	inner join "POF_2018".v1905 v5 on v5.cod_tipo_servico_domestico_contratado = s.v1905 
	inner join "POF_2018".cod_imput_valor civ on civ.cod_valor_imputado = s.cod_imput_valor 
	inner join "POF_2018".cadastro_locais_aquisicao cla on cla.cod_local_aquisicao = s.v9004; 

-- Criar Vizualização com Registro "View_Serviço_N_Monetario_POF4"

	create or replace view "POF_2018".View_servico_nao_monetario_pof4 as
	select 
	s.cod_upa,
	s.num_dom,
	s.num_uc,
	s.cod_informante,
	s.quadro,
	s.seq,
	cp.produto,
	v2.forma_aquisicao,
	s.v8000,
	v10.meses,
	s.v9011, 
	v4.motivo_viagem_assossiada_a_despesa, 
	v5.origem_despesa_aquisicao_relacionada_a_viagem,
	s.deflator,
	s.v8000_defla,
	civ.valor_imputado,
	s.fator_anualizacao,
	cla.local_aquisicao 
	from "POF_2018".servico_nao_monetario_pof4 s
	inner join "POF_2018".cadastro_produtos cp on cp.codigo_produto = s.v9001 
	inner join "POF_2018".v9002 v2 on v2.cod_forma_aquisicao = s.v9002 
	inner join "POF_2018".v9010 v10 on v10.cod_meses = s.v9010 
	inner join "POF_2018".v4104 v4 on V4.cod_motivo_viagem_assossiada_a_despesa = S.v4104 
	inner join "POF_2018".v4105 v5 on v5.cod_origem_despesa_aquisicao_relacionada_a_viagem = s.v4105 
	inner join "POF_2018".cod_imput_valor civ on civ.cod_valor_imputado = s.cod_imput_valor 
	inner join "POF_2018".cadastro_locais_aquisicao cla on cla.cod_local_aquisicao = s.v9004; 

-- Conferir Contagem de Linhas da View Serviço não Monetário POF4

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".servico_nao_monetario_pof4
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018".View_servico_nao_monetario_pof4;

-- Conferir Contagem de linhas da View Serviço não Monetário POF2

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".servico_nao_monetario_pof2
union
select 'View' as Fonte, Count(*) as Linhas from "POF_2018".View_servico_nao_monetario_pof2;

-- Conferir Contagem de Linhas da View Restrição Saúde

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".restricao_saude
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018".View_restricao_saude;

-- Conferir Contagem de Linhas da View Rendimento Trabalho

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".rendimento_trabalho
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Rendimento_Trabalho";

-- Conferir Contagem de Linhas da View "Morador Quali Vida"

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".morador_quali_vida
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Morador_Quali_Vida"; 

-- Conferir Contagem de Linhas da View Inventario

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".inventario
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Inventario";

-- Conferir Contagem de Linhas da View Despesa Individual

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".despesa_individual
union
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Despesa_Individual"; 

-- Conferir Contagem de Linhas da View Despesa Coletiva 

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".despesa_coletiva
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Despesa_Coletiva";	

-- Conferir Contagem de Linhas da View Aluguel Estimado

select 'Tabela' as Fonte, Count(*) as TotalLinhas from "POF_2018".aluguel_estimado
union 
select 'View' as Fonte, Count(*) as TotalLinhas from "POF_2018"."View_Aluguel_Estimado";

-- Conferir Contagem de Linhas da View Domicílios

SELECT 'Tabela' AS Fonte, COUNT(*) AS TotalLinhas FROM "POF_2018".domicilio
UNION
SELECT 'Visualização' AS Fonte, COUNT(*) AS TotalLinhas FROM "POF_2018"."View_Domicilio";

-- Conferir Contagem de Linhas da View Morador

select 'Tabela' as Fonte, Count(*) as TotalLinhas from "POF_2018".morador
UNION
select 'Vizualização' as Fonte, Count(*) as TotalLinhas from "POF_2018"."View_Morador";

-- Conferir Contagem de Linhas da View Condições de Vida

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".condicoes_vida
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Condições_Vida";

-- Conferir Contagem de Linhas da View Consumo Alimentar

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".consumo_alimentar
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Consumo_Alimentar";

-- Conferir Contagem de Linhas da View Caderneta Coletiva 

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".caderneta_coletiva
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Caderneta_Coletiva";

-- Conferir Contagem de Linhas da View Caracteristicas Dieta

select 'Tabela' as Fonte, Count(*) as Linhas from "POF_2018".caracteristica_dieta
union 
select 'View' as Fonte, Count(*) as Linhas from "POF_2018"."View_Caracteristica_Dieta";

	