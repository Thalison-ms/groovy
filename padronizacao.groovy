//==============================================================DATA DE EMISSÃO
p_dataEmissao	= 	parametros.dataEmissao?.valor?:Datas.hoje()
def v_dataEmi 		= Datas.dia(p_dataEmissao) + " de " + Datas.nomeMes(p_dataEmissao) + " de " + Datas.ano(p_dataEmissao)
//==============================================================IDADE DO ALUNO
  diferenca 	= Datas.diferencaMeses(o.matricula.aluno.pessoa.fisica.dataNascimento, p_dataC)
  anoIdade 		= Datas.diferencaAnos(o.matricula.aluno.pessoa.fisica.dataNascimento, p_dataC)
  mesIdade		= diferenca - (12 * anoIdade)
  alunoIdade	= "$anoIdade Anos e $mesIdade meses" 
  