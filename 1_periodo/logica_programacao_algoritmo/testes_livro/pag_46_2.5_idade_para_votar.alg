inicio
    inteiro nasc, ano, idade
    ano <- 2019
    
    escrever "Informe o ano de nascimento: "
    ler nasc
    
    idade <- ano - nasc
    
    escrever "Idade: ", idade, "\n"
    
    se idade < 16 então 
        escrever "Não possui idade para votar, nem para Carteira de Habilitação."
    senão
        se idade >= 16 e idade < 18 então
            escrever "Possui idade para votar, mas não possui idade para Carteira de Habilitação."
        senão
            escrever "Possui idade para votar e para Carteira de Habilitação."
        fimse
    fimse
fim 
