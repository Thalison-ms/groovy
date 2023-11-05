# OPERADORES

> No groovy além de podermos utilizar os operadores normais, podemos também utilizar métodos para a execução dos mesmos veja alguns deles:
```
Operador normalmente                Método                Resultado
X + Y                               X.plus(Y)             Soma
X – Y                               X.minus(Y)            Subtração
X * Y                               X.multiply(Y)         Multiplicação
X ** Y                              X.power(Y)            Potenciação
X / Y                               X.div(Y)              Divisão
X %  Y                              X.mod(Y)              Resto de uma divisão
X | Y                               X.or(Y)               Ou binário
X & Y                               X.and(Y)              E binario
X ^ Y                               X.xor(Y)              Ou exclusivo binário
X++ ou ++X                          X.next()              Incremento
X-- ou --X                          X.previous()          Decremento
X[Y]                                X.getAt(Y)            Obter um valor em uma lista
X[Y] = Z                            X.putAt(Y,Z)          Inserir um elemento em uma determinada posição
X << Y                              X.leftShift(Y)        Deslocamento de bits à esquerda
X >> Y                              X.rightShift(Y)       Deslocamento de bits à direita
~X                                  X.bitwiseNegate()     Inversão binária
-X                                  X.negative()          Transforma em seu equivalente negativo
+X                                  X.positive()          Transforma em seu equivalente positivo
```
