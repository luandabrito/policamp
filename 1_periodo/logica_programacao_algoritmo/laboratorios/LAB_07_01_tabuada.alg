inicio

    inteiro n_tabuada, n, resultado
    n <- 1
    
    escrever "Informe o n�mero da tabuada desejada: "
    ler n_tabuada
    
    enquanto (n <= 10) faz
        resultado <- n_tabuada * n
        escrever n_tabuada, " x ", n, " = ", resultado, "\n"
    n <- n + 1
    fimenquanto
    
fim
