//=====================================================================
def funcao = { a, b, c, d ->
}
Aqui é passado a, b, c, d como parâmetros
então quando formos chamar a função devemos passar:
funcao(5, 8, 9, 10) ou funcao(it.valor, it.valor, it.valor, it.valor)


//=====================================================================
if(0 in lista){
    zeroRem = lista.minus(0)
    lista = zeroRem
 }
- Verifica se algo está dentro da lista

//=====================================================================
def formatarTelefoneComDDD = { telefone ->
  if (!telefone) {
    return null
  }
  if (telefone.tamanho == 11) {
    def telefoneSemDDD = Caracteres.direita(telefone, 9);
    return "(" + Caracteres.esquerda(telefone, 2) + ") " + Caracteres.esquerda(telefoneSemDDD, 5) + "-" + Caracteres.direita(telefoneSemDDD, 4);
  }
  
  def telefoneSemDDD = Caracteres.direita(telefone, 8);
  return "(" + Caracteres.esquerda(telefone, 2) + ") " + Caracteres.esquerda(telefoneSemDDD, 4) + "-" + Caracteres.direita(telefoneSemDDD, 4);
  
}
//=====================================================================
def long segundos = 290400
def long horas = segundos / 3600
def long minutos = ((segundos - (horas * 3600)) / 60)
println "$horas:$minutos"
//=====================================================================IF/ELSE MODO TERNÁRIO
x == 0 ? 1 : 2                                          Se x for igual a 0, retorna 1, se não retorna 2
//=====================================================================REGEX
teste = it.matches(~/[0-9]+/) - valida se a variável possui valores de 0 a 9
teste = it.matches(/^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ'\s]+$/)
.replaceAll("[{]|[}]|[\"]|[\\[]|[\\]]", "")

[]      - O que estiver dentro de chaves é o que será validado
A-Z     - Valida se o caractere está dentro de A a Z maiusculo
a-z     - Valida se o caractere está dentro de a a z minusculo
áàâ     - Verifica se é caractere especial
\s      - Verifica espaço em branco
[\"]    - Considera aspas duplas como string, pois as vezes não reconhece aspas duplas dentro de outra aspas dupla"
[\\]]   - Considera o ]
|       - Seria o separador de cada validação, o famoso OU

//=====================================================================
esquema = [
  teste 			: 	Esquema.caracter,
]

def fonte = Dados.dinamico.v2.novo(esquema)
def teste = ""
fonte.inserirLinha(
  teste				:	teste
  )
retornar fonte
//================================
valDiaSem = { inf ->
  def v_dia = ""
          switch(inf){
            case "Segunda-feira":
            v_dia = "SEGUNDA"
            break
            case "Terça-feira":
            v_dia = "TERCA"
            break
            case "Quarta-feira":
            v_dia = "QUARTA"
            break
            case "Quinta-feira":
            v_dia = "QUINTA"
            break
            case "Sexta-feira":
            v_dia = "SEXTA"
            break
            case "Sábado":
            v_dia = "SABADO"
            break
            default:
              break
          }
  return v_dia
}
//================================
def formatarTelefoneComDDD = { telefone ->
  if (!telefone) {
    return null
  }
  if (telefone.tamanho == 11) {
    def telefoneSemDDD = Caracteres.direita(telefone, 9);
    return "(" + Caracteres.esquerda(telefone, 2) + ") " + Caracteres.esquerda(telefoneSemDDD, 5) + "-" + Caracteres.direita(telefoneSemDDD, 4);
  }
  
  def telefoneSemDDD = Caracteres.direita(telefone, 8);
  return "(" + Caracteres.esquerda(telefone, 2) + ") " + Caracteres.esquerda(telefoneSemDDD, 4) + "-" + Caracteres.direita(telefoneSemDDD, 4);
  
}

