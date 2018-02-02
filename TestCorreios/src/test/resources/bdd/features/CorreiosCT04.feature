Feature: Simular Novo Financiamento

@usrum
Scenario Outline: CT04 Buscar Agencia e exibir detalhe
  Given estou na pagina inicial do site "<url>"
  When clico em 'btnRedeAtendimento'
  And seleciono 'chkboxTipoBusca' "<chkbox_tipo>"
  And preencho 'campoEstado' "<campo_estado>"
  And preencho 'campoMunicipio' "<campo_municipio>"
  And preencho 'campoBairro' "<campo_bairro>"
  And seleciono 'btnDetalheAgencia' "<campo_detalhes>"
  Then sistema apresenta os detalhes da agencia 'Resultado'

	
Examples:
   | url                                | chkbox_tipo | campo_estado | campo_municipio | campo_bairro | campo_detalhes   |
   |http://www.correios.com.br/para-voce| Localidade  | SÃO PAULO    | BARUERI         | CENTRO       | ACC CAMPOS SALES |        
 

