inicio
    inteiro maior, menor, n, con
        
    para con de 1 ate 5 passo 1
        ler n
        
        se con = 1 ent�o 
            maior <- n
            menor <- n
        sen�o
            se n > maior ent�o 
                maior <- n
            sen�o
                se n < menor ent�o 
                    menor <- n
                fimse 
            fimse
       fimse
   proximo 	
   escrever "Maior n�mero: ", maior, "\n"
   escrever "Menor n�mero: ", menor
fim
