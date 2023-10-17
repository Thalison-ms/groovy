//======================================VALIDA ETAPA
validaDesc = { desc ->
  def list = ["aee", "AEE", "Especial", "ESPECIAL", "especial", "ATENDIMENTO EDUCACIONAL ESPECIALIZADO", "EDUCACIONAL ESPECIALIZADO", "Educacional Especializado", "educacional especializado"]
  def a = null
  list.each{ p ->
    if(p in desc){
      a = true
    } else {
      if(a == true){
      }	else {
        a = false
      }
    }
  }
  return a
}
validaEtapa = { curso ->
  v_nivel 	= curso.turma.etapaMatriz.matriz.curso.nivelEscolar
  v_modal 	= curso.turma.etapaMatriz.matriz.curso.nivelModalidade
  v_modalT 	= curso.turma.modalidadeTurma
  v_orgP 	= curso.turma.etapaMatriz.matriz.curso.organizacaoNivel
  v_orgE 	= curso.turma.etapaMatriz.matriz.curso.organizacaoEspecifica
  v_ident 	= curso.turma.etapaMatriz.identificacao
  v_tipoAt 	= curso.turma.tipoAtendimento
  aee 		= curso.turma.descricao

  def etapaT = null
  desc = validaDesc(aee)
    
  if(v_tipoAt == "ATENDIMENTO_EDUCACIONAL_ESPECIALIZADO" || desc == true){
    etapaT = "AEE"
  } else {
    if(v_modal == "EDUCACAO_BASICA"){
      if(v_nivel == "EDUCACAO_INFANTIL"){
        if(v_orgP != "OUTRA"){
          etapaT = v_orgP + " " + v_ident
        } else {
          etapaT = v_orgE + " " + v_ident
        }
      }
      if(v_nivel == "ENSINO_FUNDAMENTAL"){
        if(v_orgP != "OUTRA"){
          etapaT = v_ident + " " + v_orgP
        } else {
          etapaT = v_ident + "  " + v_orgE
        }
      }
      if(v_nivel == "ENSINO_MEDIO"){
        if(v_orgP != "OUTRA"){
          etapaT = v_ident + " " + v_orgP
        } else {
          etapaT = v_ident + " " + v_orgE
        }
      }
    }    
    
    if(v_modal == "COMPLEMENTAR" && etapaT != null){
      etapaT = "Atividade Complementar"
    } else {
      if(v_tipoAt == "ATIVIDADE_COMPLEMENTAR" || desc == "AC"){
        etapaT = "AC"
      }
    
    }
    
    if(v_modal == "EJA" && etapaT != null){
      if(v_nivel == "ENSINO_FUNDAMENTAL"){
        if(v_orgP != "OUTRA"){
          etapaT = "EJA - " + v_ident + " " + v_orgP
        } else {
          etapaT = "EJA - " + v_ident + " " + v_orgE
        }
      }
    }
    if(v_tipoAt == "ATIVIDADE_COMPLEMENTAR"){
      etapaT = "AC"
    }
  }

  if(v_tipoAt == "ESCOLARIZACAO" && v_modalT == "ENSINO_REGULAR"){
      if(v_nivel == "EDUCACAO_INFANTIL"){
        if(v_orgP != "OUTRA"){
          etapaT = v_orgP + " " + v_ident
        } else {
          etapaT = v_orgE + " " + v_ident
        }
      }
      if(v_nivel == "ENSINO_FUNDAMENTAL"){
        if(v_orgP != "OUTRA"){
          etapaT = v_ident + " " + v_orgP
        } else {
          etapaT = v_ident + " " + v_orgE
        }
      }
      if(v_nivel == "ENSINO_MEDIO"){
        if(v_orgP != "OUTRA"){
          etapaT = v_ident + " " + v_orgP
        } else {
          etapaT = v_ident + " " + v_orgE
        }
      }
  }
  return etapaT
}