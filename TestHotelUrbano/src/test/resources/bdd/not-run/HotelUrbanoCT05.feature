Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT05 Hotéis: Reservar diária hotel 5 estrelas São Paulo 
  Given estou na pagina inicial do site "<url>"
  When clico em 'btnBuscaPrescoPrazos'
  And preencho 'campoDataPostagem'
  And preencho 'campoOrigem' "<campo_origem>"
  And preencho 'campoDestino' "<campo_destino>"
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
   | url                                 | campo_origem | campo_destino | campo_tiposervico | campo_embalagem | campo_altura | campo_largura | campo_comprimento | campo_peso |
   |http://www.correios.com.br/para-voce | 06604-320    | 06020-000     | PAC               | Outra Embalagem | 2            | 11            | 16                | 1          |        


