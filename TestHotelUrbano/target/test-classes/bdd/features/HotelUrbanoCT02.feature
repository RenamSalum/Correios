Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT02 Aéreos: Consultar vôo economico de São Paulo para Bahia 
  Given estou na pagina inicial do site "<url>"
  When clico em 'btnAerio'
  And preencho 'campoOrigem' "<campo_origem>"
  And preencho 'campoDestino' "<campo_destino>"
  And seleciono 'selecionoDataIda' "<data_ida>"
  And seleciono 'selecionoDataVolta' "<data_volta>"
  And preeencho 'campoTipoPassgem' "<campoTipoPassgem>"
  And clico no botão 'BtnBusca'
  Then sistema apresenta o cep ou endereço pesquisado 'Resultado'

	
Examples:
   | url                         | campo_origem | campo_destino | data_ida   | data_volta | campoTipoPassgem |
   |https://www.hotelurbano.com/ | SÃO PAULO    | BAHIA         | 11/02/2018 | 14/02/2018 | Econômica        |


