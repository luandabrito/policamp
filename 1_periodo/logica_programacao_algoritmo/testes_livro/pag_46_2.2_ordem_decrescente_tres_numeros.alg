inicio
    inteiro a, b, c
    
    escrever "Informe o primeiro numero: "
    ler a
    escrever "Informe o segundo numero: "
    ler b
    escrever "Informe o terceiro numero: "
    ler c
       
    se a < b e b < c ent�o
        escrever "Ordem decrescente: ", a, ",", b, ",", c
    sen�o
        se a < b e b > c ent�o
            escrever "Ordem decrescente: ", a,",", c,",", b
        sen�o 
            se b < a e a < c ent�o
                escrever "Ordem decrescente: ", b,",", a,",", c
            sen�o 
                se b < c e c < a ent�o
                    escrever "Ordem decrescente: ", b,",", c,",", a
                sen�o
                    se c < a e a < b ent�o
                        escrever "Ordem decrescente: ", c,",", a,",", b
                    sen�o
                        escrever "Ordem decrescente: ", c,",", b,",", a
                    fimse
                fimse
           fimse
        fimse
     fimse             
fim
