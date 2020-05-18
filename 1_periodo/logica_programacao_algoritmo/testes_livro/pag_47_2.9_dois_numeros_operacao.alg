inicio
    caracter simbolo
    real n1, n2, resultado
    
    escrever "Informe o primeiro numero: "
    ler n1
    escrever "Informe o segundo numero: "
    ler n2
    escrever "Informe a operação desejada: +, -, * ou / "
    ler simbolo
    
    se simbolo = "+" então
        resultado <- n1 + n2
    senão
        se simbolo = "-" então
            resultado <- n1 - n2
        senão
            se simbolo = "*" então
                resultado <- n1 * n2
            senão
                resultado <- n1 / n2
            fimse
        fimse
   fimse
   
   escrever "Resultado da operação: ", n1, simbolo, n2, " = ", resultado            
   
fim
