inicio
    inteiro nasc, ano, idade
    ano <- 2019
    
    escrever "Informe o ano de nascimento: "
    ler nasc
    
    idade <- ano - nasc
    
    escrever "Idade: ", idade, "\n"
    
    se idade < 16 ent�o 
        escrever "N�o possui idade para votar, nem para Carteira de Habilita��o."
    sen�o
        se idade >= 16 e idade < 18 ent�o
            escrever "Possui idade para votar, mas n�o possui idade para Carteira de Habilita��o."
        sen�o
            escrever "Possui idade para votar e para Carteira de Habilita��o."
        fimse
    fimse
fim 
