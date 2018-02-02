Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT03 Ingressos: Comprar ingresso Thermas dos Laranjais
  Given estou na pagina inicial do site "<url>"
  When preencho 'campoBusca' "<campo_busca>"
  And seleciono 'campoCepDe' "<campo_Cep_De>"
  And clico no botão 'BtnBuscar'
  And Pega Cep 'tabelaCep'
  And clico no botão 'BtnNovaconsulta'
  And preencho 'campoBusca' "<campo_buscadestino>"
  And seleciono 'campoCepDe' "<campo_Cep_Dedestino>"
  And clico no botão 'BtnBuscar'
  And Pega Cep 'tabelaCep'
  And Navego para 'url' "<url_cep_end>"
  And preencho 'campoDataPostagem'
  And preencho 'campoOrigem'
  And preencho 'campoDestino'
  And seleciono 'campoTipoServico' "<campo_tiposervico>"
  And clico no botão 'formatoCaixa'
  And seleciono 'campoEmbalagem' "<campo_embalagem>"
  And preencho 'dimensaoAltura' "<campo_altura>"
  And preencho 'dimensaoLargura' "<campo_largura>"
  And preencho 'dimensaoComprimento' "<campo_comprimento>"
  And seleciono peso 'campoPeso' "<campo_peso>"
  And seleciono checkbox 'ckboxAvisoRecebimento'
  And clico no botão 'btnEnviar'
  Then sistema apresenta os preços e prazos da consulta 'Resultado'

	
Examples:
   | url                                                  | campo_busca                         | campo_Cep_De          | campo_buscadestino            | campo_Cep_Dedestino   | url_cep_end                                        | campo_tiposervico | campo_embalagem | campo_altura | campo_largura | campo_comprimento | campo_peso |
   |http://www.buscacep.correios.com.br/sistemas/buscacep/| Avenida dos Autonomistas, Vila Yara | Localidade/Logradouro | Alameda Tocantins, Alphaville | Localidade/Logradouro | http://www2.correios.com.br/sistemas/precosPrazos/ | PAC               | Outra Embalagem | 2            | 11            | 16                | 1          |        


