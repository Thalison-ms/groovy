# groovy
//====================USING GREP
lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
listaResult = lista.grep(7)
listaSemanas = lista.step(7)
totalSize = listaResult.size()
println(totalSize)
println(listaResult)
println(listaSemanas)
//====================USING STEP
1.step(4, 0.5) { print "$it "}
println "\n-----------------------"
1.step(10, 1) { 
    
    println it
}

dataHoje = new Date()
dataNiver = new Date(1995-1900,6-1,27)
lista = dataNiver..dataHoje
semanas = lista.step(7).count{it}
println(semanas)

def vals2 = (1..7).step(2)
println vals2
//====================USING SLEEP
sleep(5000)
