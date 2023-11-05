## MÉTODOS GROOVY

```
.indexOf()                                          Exibe a posição que se encontra algo
.min()                                              Retorna o valor minimo da lista
.max()                                              Retorna o valor máximo da lista
.concat()                                           Concatena 2 strings
.first()                                            Pega o primeiro
.last()                                             Pega o ultimo
.push()                                             Adiciona item no final da lista
.pop()                                              Remove o primeiro item da lista
.removeLast()                                       Remove o ultimo item da lista
.abs()                                              Transforma um valor positivo ou negativo em valor absoluto, retornando sempre positivo
.trim()                                             Remove espaços em branco a direita.
.isEmpty()                                          Verificar se algo está como vazio ou null
.plus()                                             Pega o valor da variável e soma com o parâmetro passado nos parenteres
.flatten()                                          Tranforma uma coleção que contém outra coleção em uma única coleção, ex: list = [1, [2, 3]], list.flatten(), result: [1, 2, 3]
.capitalize()                                       Colocar a primeira letra da string em Maiusculo
.min()                                              Pega o valor min da lista
.max()                                              Pega o valor max da lista
.size()                                             Informa o tamanho da lista
.length()                                           Informa o tamanho da string
.sort()                                             Ordenar de forma crescente
.sort().reverse                                     Ordena de forma decrescente
[]                                                  Cria lista vazia
[:]                                                 Cria mapa vazio
.each                                               Percorre todos itens da lista
.sum()                                              Realizar a soma dos valores dentro de uma lista
.minus()                                            Remove as propriedades de um mapa incluso na lista
.remove()                                           Remove as propriedades 
.equals()                                           Comparador, equals é para string e == para inteiro, porém nada impede de usar == para string
.matches()                                          Comparador, mesma funcionalidade de equals
.replaceAll                                         Troca um caractere especial por outro
.toUpperCase()                                      Deixa tudo maiusculo
.toLowerCase()                                      Deixa tudo minusculo
.formatar('dd/MM/yyyy')                             Formata para o tipo data
.length()                                           Retorna o tamanho da string
.split("-")                                         Separa uma informação pelo parâmetro informando dentro do parenteses
.trunc()                                            Trunca uma informação a partir do parâmetro informado, ex: 78.689478, caso seja utilizado .trunc(1)
.round()                                            Realiza o trunc, porém de forma arredondada
.collect({[it.dataFeriado, it.descricao]})          Coleta vários arrays
.collect({it.dataFeriado})                          Coleta apenas um array
.padLeft(2, "0")                                    Adiciona uma informação na posição informada, a quantidade é de acordo com o valor informado, também pode ser utilizado o padRight
.toLong()                                           Pega só o inteiro de um valor
.findAll                                            Procure todos
.find                                               Busca o primeiro
.keySet()                                           Acessa chaves de maps ou groupBys
.groupBy                                            Agrupamento normal, informar o parametro das chaves
.get()                                              Capturar uma posição ou valor, etc
.stream()                                           Percorrer um collect e retornar um valor, um iterator
.filter                                             Aplica somente no stream()
.startsWith("cien")                                 Busca algo que comece com a informação passada
.substring(0,3)                                     Exibe os valores de uma string a partir das posições informadas
.take(50)                                           Quando informado um valor maioR do que a quantidade da variável não da erro
.subTexto(0,10)                                     Faz a mesma coisa que o primeiro
```
