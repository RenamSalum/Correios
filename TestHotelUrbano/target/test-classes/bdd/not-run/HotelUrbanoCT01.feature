Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT01 Hotéis: Selecionar hotel 5 estrelas Rio de Janeiro
  Given estou na pagina inicial do site "<url>"
  When clico em 'btnHoteis'
  And preencho 'campoBusca' "<campo_busca>"
  And clico no botão 'btnBuscar'
  And seleciono 'chkboxcategoria'
  And seleciono 'hotel'
  Then verifico se é hotel 5 estrelas 'Resultado'

	
Examples:
   | url                         | campo_busca    |
   |https://www.hotelurbano.com/ | Rio de Janeiro |


