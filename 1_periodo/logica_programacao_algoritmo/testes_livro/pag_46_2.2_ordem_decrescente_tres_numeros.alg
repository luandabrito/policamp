inicio
    inteiro a, b, c
    
    escrever "Informe o primeiro numero: "
    ler a
    escrever "Informe o segundo numero: "
    ler b
    escrever "Informe o terceiro numero: "
    ler c
       
    se a < b e b < c então
        escrever "Ordem decrescente: ", a, ",", b, ",", c
    senão
        se a < b e b > c então
            escrever "Ordem decrescente: ", a,",", c,",", b
        senão 
            se b < a e a < c então
                escrever "Ordem decrescente: ", b,",", a,",", c
            senão 
                se b < c e c < a então
                    escrever "Ordem decrescente: ", b,",", c,",", a
                senão
                    se c < a e a < b então
                        escrever "Ordem decrescente: ", c,",", a,",", b
                    senão
                        escrever "Ordem decrescente: ", c,",", b,",", a
                    fimse
                fimse
           fimse
        fimse
     fimse             
fim
