def calculaImc = { p, a ->
  return (p / a * a)
}
def peso = 103.8
def altura = 1.81
def imc = calculaImc(peso, altura)

switch (imc){
  case {it < 18.5}:
		imprimir "Abaixo do peso ideal"
		break
  case {it >= 18.5 || it <= 25}:
		imprimir "Peso normal"
		break
  case {it >= 25.1 || it <= 30}:
		imprimir "Excesso de peso"
		break
  case {it >= 30.1 || it <= 35}:
		imprimir "Obesidade (grau I)"
		break
  case {it >= 35.1 || it <= 40}:
		imprimir "Obesidade (grau II)"
		break
  case {it > 40}:
		imprimir "Obesidade (grau III)"
		break
}
//A função e a forma de passar os parâmetros também poderiam ser utilizadas da seguinte forma:
def calculaImc = { p, a ->
  return (p / (a * a))
}
def imc = calculaImc(80, 1.80)
//Na função acima p de peso e a de altura foram passados como parâmetros dentro da função calculaImc, 
//na linha 7 então foi criado a variável imc para receber o return na chamada da função calculaImc na qual contém os parâmetros (80, 1.80) entre parênteses.
