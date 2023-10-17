        def alunoNumCha = ""
        def numAux = ""
        if(itemAluno.numeroChamada > 0 && itemAluno.numeroChamada < 10){
          numAux = itemAluno.numeroChamada.toString()
          alunoNumCha = numAux.padLeft(2, "0")
        } else {
          alunoNumCha = itemAluno.numeroChamada.toString()
        }