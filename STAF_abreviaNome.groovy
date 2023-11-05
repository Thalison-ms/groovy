def nome = "Yuri Vasconsellos Oliveira de Almeida Pinto Santos"
arrayName = nome.split(" ")
tam = arrayName.size()-1
nomeFinal = ""
(0..tam).each{ p ->
    if(p == 0){
        nomeFinal = "${arrayName[p]} "
    } else {
        if(p == 1){
            nomeFinal += "${arrayName[p]} "
        } else {
            if(p == tam){
                nomeFinal += arrayName[p]
            } else {
                if(arrayName[p].length() == 2){
                    nomeFinal += "${arrayName[p]} "
                } else {
                    nomeFinal += "${arrayName[p][0]}. "
                }
            }        
        }
    }
}
println(nomeFinal)
