inicio
    inteiro n3, n1, n2, con
    n1 <- 1
    n2 <- 1
    
    escrever n1 ,"\n", n2
    para con de 1 ate 18 passo 1
        n3 <- n1 + n2
        escrever "\n", n3
        n1 <- n2
        n2 <- n3
    proximo 
fim
