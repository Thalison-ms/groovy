def calculadora(valor1, valor2, tipo){
    soma = {a, b ->
        return a + b
    }
    divisao = {a, b ->
        return a / b
    }
    multi = {a, b ->
        aux = calculadora(a, b, soma)
        println(aux)
        return a * aux
    }
    subtracao = {a, b ->
        return a - b
    }
    return tipo(valor1, valor2)
}

println(calculadora(10, 5, multi))

/*valor1 = 833.33333
println(valor1)
println(valor1.getClass())

fmt = new BigDecimal(String.format("%.2f", valor1).replaceAll(",","."))
println(fmt)
println(fmt.getClass())*/
//3000000
//2880000
result = 2880000 / 3600
println(result)
println(result.getClass())

if(result.toString().contains(".")){
    println("NÚMERO É DECIMAL!")
} else {
    println("NÚMERO É INTEIRO!")
}
println("-"*20)
//--------------------------------
println(result.getClass().toString())
if(result.getClass().toString() == "class java.math.BigDecimal"){
    println("NÚMERO É DECIMAL!")
} else {
    println("NÚMERO É INTEIRO!")
}
