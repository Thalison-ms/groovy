def validaSituacao = { enturmacao ->  
  def info = enturmacao.matricula.situacao
  
  fonteMovimentacao = Dados.educacao.v1.movimentacao;
  dadosMovimentacao = fonteMovimentacao.lista(
    criterio: "matricula.id = ${enturmacao.matricula.id} and data = ${enturmacao.dataFim.formatar("yyyy-MM-dd")}", campos: "id, tipo", ordenacao: "data asc")
  percorrer (dadosMovimentacao) { itemMovimentacao ->
    info = itemMovimentacao.tipo
  }  

  switch(info){
    case "MATRICULADO":
    	return "MATRICULADO"
    case "CURSANDO":
    	return "CURSANDO"
    case {info.equals("TRANSFERIDO") || info.equals("TRANSFERENCIA") || info.equals("READMISSAO")}:
    	return "TRANSFERIDO"
    case {info.equals("DEIXOU_FREQUENTAR") || info.equals("DEIXOU_DE_FREQUENTAR")}:
    	return "DESISTENTE"
    case {info.equals("FALECIDO") || info.equals("FALECIMENTO")}:
    	return "FALECIDO"
    case "CANCELAMENTO":
    	return "CANCELADO"
    case "EM_EXAME":
    	return "EXAME"
    case "APROVADO":
    	return "APROVADO"
    case "APROVADO_DEPENDENCIA":
    	return "APROVADO COM DEPENDÊNCIA"
    case "REPROVADO":
    	return "REPROVADO"
    case "REPROVADO_FREQUENCIA":
    return "REPROVADO POR FREQUÊNCIA"
    case {info.equals("RECLASSIFICADO_AVANCO") || info.equals("RECLASSIFICACAO")}:
    	return "RECLASSIFICADO"
    case "EM_ANDAMENTO":
    	return "EM ANDAMENTO"
    case "DISPENSADO":
    	return "DISPENSADO"
    case {info.equals("RECLASSIFICADO_ACELERACAO") || info.equals("RECLASSIFICACAO")}:
        return "RECLASSIFICADO"
    case "APROVADO_CONSELHO":
    	return "APROVADO PELO CONSELHO"
    case {info.equals("REMANEJADO") || info.equals("REMANEJAMENTO_INTERNO")}:
    	return "REMANEJADO"
    default:
      return "SNE"
  }
}