inicio
    inteiro idade
    
    escrever "Informe a idade: "
    ler idade
    
    se idade >= 5 e idade <= 7 ent�o
        escrever "Infantil A"
    sen�o
        se idade >= 8 e idade <= 10 ent�o
            escrever "Infantil B"
        sen�o
            se idade >= 11 e idade <= 13 ent�o
                escrever "Juvenil A"
            sen�o
                se idade >= 14 e idade <= 17 ent�o
                    escrever "Juvenil B"
                sen�o
                    se idade >= 18 ent�o
                        escrever "Adulto"
                    sen�o
                        escrever "N�o possui categoria para essa idade."
                    fimse
                fimse
            fimse
        fimse
    fimse	
fim
