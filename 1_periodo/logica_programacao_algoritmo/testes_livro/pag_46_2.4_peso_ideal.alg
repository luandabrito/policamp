inicio
    caracter sexo
    real h, peso
    
    escrever "Informe o sexo: F ou M "
    ler sexo
    escrever "Informe a altura: "
    ler h
    
    se sexo = "M" então
        peso <- (72.7 * h) - 58
    senão
        peso <- (62.1 * h ) - 44.7
    fimse
    
    escrever "Peso ideal: ", peso     
fim
