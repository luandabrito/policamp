inicio
    inteiro codigo
    real quantidade, valor
    ler quantidade
    
    se quantidade = 0 ent�o
        escrever "quantidade inv�lida."
        sen�o
        ler codigo
            escolhe codigo
            caso 1: valor <- quantidade * 100.00
                 escrever "Valor total: ", valor
            caso 2: valor <- quantidade * 150.00
                 escrever "Valor total: ", valor
            caso 3: valor <- quantidade * 200.00
                 escrever "Valor total: ", valor
             defeito:
                 escrever "Produto inv�lido."
           fimescolhe
     fimse
fim