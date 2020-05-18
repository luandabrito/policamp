inicio
    inteiro con, n, maior, menor
    con <- 0
             
    enquanto (con < 20 ) faz         
        escrever "Informe um numero: "
        ler n
        se (con = 0) então
            maior <- n
            menor <- n
        senao
            se (n > maior) então
            maior <- n
            fimse
            se (n < menor) então
                menor <- n
            fimse
        fimse
    con <- con + 1
    fimenquanto
    escrever "Maior numero informado: ", maior, "\n"
    escrever "Menor numero informado: ", menor

fim
