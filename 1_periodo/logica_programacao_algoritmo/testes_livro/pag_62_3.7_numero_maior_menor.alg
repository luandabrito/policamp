inicio
    inteiro maior, menor, n, con
        
    para con de 1 ate 5 passo 1
        ler n
        
        se con = 1 então 
            maior <- n
            menor <- n
        senão
            se n > maior então 
                maior <- n
            senão
                se n < menor então 
                    menor <- n
                fimse 
            fimse
       fimse
   proximo 	
   escrever "Maior número: ", maior, "\n"
   escrever "Menor número: ", menor
fim
