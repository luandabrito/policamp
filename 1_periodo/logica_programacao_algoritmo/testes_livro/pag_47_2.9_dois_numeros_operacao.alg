inicio
    caracter simbolo
    real n1, n2, resultado
    
    escrever "Informe o primeiro numero: "
    ler n1
    escrever "Informe o segundo numero: "
    ler n2
    escrever "Informe a opera��o desejada: +, -, * ou / "
    ler simbolo
    
    se simbolo = "+" ent�o
        resultado <- n1 + n2
    sen�o
        se simbolo = "-" ent�o
            resultado <- n1 - n2
        sen�o
            se simbolo = "*" ent�o
                resultado <- n1 * n2
            sen�o
                resultado <- n1 / n2
            fimse
        fimse
   fimse
   
   escrever "Resultado da opera��o: ", n1, simbolo, n2, " = ", resultado            
   
fim
