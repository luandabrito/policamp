inicio
    inteiro con, n, maior, menor
    con <- 0
             
    enquanto (con < 20 ) faz         
        escrever "Informe um numero: "
        ler n
        se (con = 0) ent�o
            maior <- n
            menor <- n
        senao
            se (n > maior) ent�o
            maior <- n
            fimse
            se (n < menor) ent�o
                menor <- n
            fimse
        fimse
    con <- con + 1
    fimenquanto
    escrever "Maior numero informado: ", maior, "\n"
    escrever "Menor numero informado: ", menor

fim
