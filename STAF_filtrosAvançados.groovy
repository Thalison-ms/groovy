fa_turma = []
percorrer(parametros.turma.selecionados){
fa_turma << Numeros.numero(item.valor)
}
Criterio.onde('turma.id').contidoEm(fa_turma)
//----------------------------------------------------
if (contextoAplicacao?.estabelecimento?.value) {
  retornar Criterio.onde('id').igual(Long.valueOf(contextoAplicacao.estabelecimento.value)).e('situacaoFuncionamento').igual('EM_ATIVIDADE')
} else {
Criterio.onde('situacaoFuncionamento').igual('EM_ATIVIDADE')
}
//----------------------------------------------------
fonteContexto.inserirLinha([
  anoLetivo  		: contextoExecucao.contextoAplicacao.anoletivo?.value,
  estabelecimento  	: contextoExecucao.contextoAplicacao.estabelecimento?.value ? contextoExecucao.contextoAplicacao.estabelecimento?.value : 0
]);
//----------------------------------------------------
