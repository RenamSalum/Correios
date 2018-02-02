Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT01 e CT02 Buscar CEP/Endereço e Endereço/Cep
  Given estou na pagina inicial do site "<url>"
  When clico em 'btnBuscaCepEnd'
  And preencho 'campoBusca' "<campo_busca>"
  And seleciono 'campoCepDe' "<campo_Cep_De>"
  And clico no botão 'BtnBuscar'
  Then sistema apresenta o cep ou endereço pesquisado 'Resultado'

	
Examples:
   | url                                | campo_busca                         | campo_Cep_De          |
   |http://www.correios.com.br/para-voce| Avenida dos Autonomistas, Vila Yara | Localidade/Logradouro |
   |http://www.correios.com.br/para-voce| 06604-320                           | Localidade/Logradouro |

