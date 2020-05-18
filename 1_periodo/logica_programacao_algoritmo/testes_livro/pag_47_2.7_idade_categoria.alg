inicio
    inteiro idade
    
    escrever "Informe a idade: "
    ler idade
    
    se idade >= 5 e idade <= 7 então
        escrever "Infantil A"
    senão
        se idade >= 8 e idade <= 10 então
            escrever "Infantil B"
        senão
            se idade >= 11 e idade <= 13 então
                escrever "Juvenil A"
            senão
                se idade >= 14 e idade <= 17 então
                    escrever "Juvenil B"
                senão
                    se idade >= 18 então
                        escrever "Adulto"
                    senão
                        escrever "Não possui categoria para essa idade."
                    fimse
                fimse
            fimse
        fimse
    fimse	
fim
