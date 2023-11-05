meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
def contador = 1
meses.each{ mesnome->
 	imprimir ""
    if(contador == 1 || contador == 2){
      	if(mesnome == 'Janeiro' && contador == 1){
          		imprimir "Mês: ${contador} = ${mesnome} - Verão"
    	}
		if(mesnome == 'Fevereiro' && contador == 2)
    			imprimir "Mês: ${contador} = ${mesnome} - Verão"
  }
  if(contador == 3 || contador == 4 || contador == 5 || contador == 6){
        	if(mesnome == 'Março' && contador == 3){
            	imprimir "Mês: ${contador} = ${mesnome} - Estação: Outono"
        	}
            if(mesnome == 'Abril' && contador == 4){
            	imprimir "Mês: ${contador} = ${mesnome} - Estação: Outono"
        	}
            if(mesnome == 'Maio' && contador == 5){
            	imprimir "Mês: ${contador} = ${mesnome} - Estação: Outono"
        	}    
            if(mesnome == 'Junho' && contador == 6){
            	imprimir "Mês: ${contador} = ${mesnome} - Estação: Outono"
        	}       
  } 
  if(contador == 7 || contador == 8 || contador == 9){    
    		if(mesnome == 'Julho' && contador == 7){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
           }
    		if(mesnome == 'Agosto' && contador == 8){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
            }
    		if(mesnome == 'Setembro' && contador == 9){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
            }
  }
  if(contador == 10 || contador == 11 || contador == 12){    
    		if(mesnome == 'Outubro' && contador == 10){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
            }
    		if(mesnome == 'Novembro' && contador == 11){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
            }
    		if(mesnome == 'Dezembro' && contador == 12){
    			imprimir "Mês: ${contador} = ${mesnome} - Estação: Inverno"
            }
  }
contador = contador + 1
}
 
