inicio
    inteiro n, con, acm
    acm <- 0
    
    faz 
    ler n
    enquanto n < 0
    
    se n = 0 ou n = 1 ent�o 
        escrever "Fatorial = 1"
    sen�o
        acm <- n
        para con de 1 ate n - 1 passo 1
            acm <- acm * con
        proximo
        
        escrever "Fatorial de ", n, " = ", acm        
    fimse    
fim
