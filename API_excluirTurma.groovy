token = parametros.token
ano = parametros.ano

contaTurmas = 0

apiTurma = Dados.educacao.v1."item-avaliacao-turma"

percorrer (apiTurma.lista(campos: "turma.id,itemAvaliavel.anoLetivo.id,itemAvaliavel.estabelecimento.id,itemEducacional.pai.tipo", criterio: "itemAvaliavel.anoLetivo.ano = " + ano)) {

imprimir item.turma.id
imprimir item.itemEducacional.tipo
  
	conteudo = [
    	turma: [
        	id: item.id,
          	tipo: "TURMA",
          	anoLetivo: [
            	id: item.itemAvaliavel.anoLetivo.id
            ],
          	estabelecimento: [
            	id: item.itemAvaliavel.estabelecimento.id
            ]
        ]
    ]
  	
  	servico = Http.servico('https://educacao.cloud.betha.com.br/educacao/conversao/api/turmas/remover')
  		.cabecalho('Authorization', 'Bearer ' + token)
  		.PUT([conteudo], Http.JSON)
	
  	guardaLotes << servico.json().idLote
	contaTurmas = contaTurmas + 1*/
}
