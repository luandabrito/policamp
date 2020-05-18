inicio
    inteiro numero[10], i
    
    para i de 0 ate 9 passo 1
    escrever "Informe o ", i+1, "º número: "
    ler numero[i]
    proximo
    
    para i de 0 até 9 passo 1
    escrever "\n", i+1, "º número informado: ", numero[i]
    proximo
    
    escrever "\n\n", "Número informado na primeira posição:", numero[0]
    escrever "\n", "Número informado na quarta posição:", numero[3]
    escrever "\n", "Número informado na última posição:", numero[9]
    
    escrever "\n\n", "Posição e valores cuja posição é número par."
    para i de 0 até 9 passo 1
    se i%2 = 0 então
    escrever "\n", "Posição: ", i, " Número informado: ", numero[i]
    fimse 
    proximo
    
    escrever "\n\n", "Posição e valores cujo valor é número impar."
    para i de 0 até 9 passo 1
    se numero[i]%2 =/= 0 então
    escrever "\n", "Posição: ", i, " Número informado: ", numero[i]
    fimse 
    proximo 
    
    escrever "\n\n", "Posição e valores cujo valor é número multiplo de 3."
    para i de 0 até 9 passo 1
    se numero[i]%3 = 0 então
    escrever "\n", "Posição: ", i, " Número informado: ", numero[i]
    fimse 
    proximo 
fim
