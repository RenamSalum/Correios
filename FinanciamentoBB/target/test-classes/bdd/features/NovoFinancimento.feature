Feature: Simular Novo Financiamento

@usrum
Scenario Outline: Simular financiamento um
  Given estou na pagina inicial do site "<url>"
  When preencho tipo "<tipoFinanciamento>"
  And preencho 'categoria' "<categoria_imovel>"
  And seleciono 'empreendimentoBB' "<empreendimentoBB>"
  And preencho 'uf' "<uf>"
  And preencho 'cidade' "<cidade>"
  And seleciono 'possuiImovel' "<possuiImovel>"
  And preencho 'valorImovel' "<valorImovel>"
  And clico no botão 'btnContinuar'
  And preencho 'cpf' "<cpf>"
  And seleciono  'fgtsMaiorTres' "<fgtsMaiorTres>"
  And seleciono  'fgtsMaiorDez>' "<fgtsMaiorDez>"  
  And seleciono  'beneficiarioFgts' "<beneficiarioFgts>"
  And seleciono  'segundoComprador' "<segundoComprador>"
  And seleciono  'pmcmv' "<pmcmv>"
  And preencho 'renda' "<renda>"
  And clico no botão 'BtnSeusDados'
  And preencho 'data_nascimento' "<data>"
  And preencho 'valorFinanciamento' "<valorFinancioamento>"
  And preencho 'prazoFinanciamento' "<prazoFinanciamento>"
  And clico no botão 'BtnValorFinanciamento'
  And seleciono 'taxaBalcao'
  Then clico no botão 'BtnSeleciona'
	
Examples:
   | url                                | tipoFinanciamento | categoria_imovel | empreendimentoBB | uf |cidade  | possuiImovel | valorImovel  | data       | cpf            | fgtsMaiorTres | fgtsMaiorDez | beneficiarioFgts | segundoComprador | pmcmv | renda    | valorFinancioamento | prazoFinanciamento | 
   |https://www42.bb.com.br/portalbb/cim| Residencial       | Novo             | Não              | SP |Osasco  | Não          | 315.000,00   | 01/03/1989 | 216.785.249-56 | Não           | Não          | Não              | Não              | Não   | 6.000,00 | 200.000,00          | 360                |
   |https://www42.bb.com.br/portalbb/cim| Residencial       | Novo             | Não              | SP |Jandira | Sim          | 315.000,00   | 01/03/1989 | 216.785.249-56 | Sim           | Sim          | Não              | Sim              | Não   | 10.000,00 | 189.000,00          | 360                |