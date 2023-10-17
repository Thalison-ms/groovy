//=====================================================================
INSERINDO INFORMAÇÃO NO MAPA
        li_entAluno.each{
          if(cont < v_tam-1){
            li_enturmacoes[cont].put("situacao", "REMANEJADO")
          } else {
            li_enturmacoes[cont].put("situacao", itemEnturmacao.matricula.situacao)
          }
          cont++
            }
USANDO SORT NO MAPA MODELO 1
	historicos.sort{ a, b ->
		a.anoLetivo <=> b.anoLetivo
	}
USANDO SORT NO MAPA MODELO 2
	historicos.sort({it.anoLetivo})
//=====================================================================
      def v_situacao
      def li_enturmacoes
      def li_situacoes = ["CURSANDO", "APROVADO", "REPROVADO", "TRANSFERIDO"]
      li_entAluno = fonteEnturmacao.lista(criterio: "anoLetivo.id = ${p_ano} and estabelecimento.id = ${p_escola} and matricula.id = ${itemEnturmacao.matricula.id} and matricula.tipo = 'EDUCACAO_BASICA'", campos: camposEnturmacao, ordenacao: "dataInicio asc").collect({[matId: it.matricula.id, id: it.id, nome: it.matricula.aluno.pessoa.nome, dataIni: it.dataInicio, dataFim: it.dataFim]})
      v_tam = li_entAluno.size()
      if(v_tam > 1 && li_situacoes.contains(itemEnturmacao.matricula.situacao)){
        li_enturmacoes = li_entAluno
        cont = 0
        li_entAluno.each{
          if(cont < v_tam-1){
            li_enturmacoes[cont].put("situacao", "REMANEJADO")
          } else {
            li_enturmacoes[cont].put("situacao", itemEnturmacao.matricula.situacao)
          }
          cont++
            }
        li_enturmacoes.each{
          if(itemEnturmacao.id == it.id){
            v_situacao = it.situacao
          }
        }     
      } else {
        v_situacao = itemEnturmacao.matricula.situacao
      }
    
      imprimir v_situacao
//=====================================================================