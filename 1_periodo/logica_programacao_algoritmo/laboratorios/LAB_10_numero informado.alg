inicio
    inteiro numero[10], i
    
    para i de 0 ate 9 passo 1
    escrever "Informe o ", i+1, "� n�mero: "
    ler numero[i]
    proximo
    
    para i de 0 at� 9 passo 1
    escrever "\n", i+1, "� n�mero informado: ", numero[i]
    proximo
    
    escrever "\n\n", "N�mero informado na primeira posi��o:", numero[0]
    escrever "\n", "N�mero informado na quarta posi��o:", numero[3]
    escrever "\n", "N�mero informado na �ltima posi��o:", numero[9]
    
    escrever "\n\n", "Posi��o e valores cuja posi��o � n�mero par."
    para i de 0 at� 9 passo 1
    se i%2 = 0 ent�o
    escrever "\n", "Posi��o: ", i, " N�mero informado: ", numero[i]
    fimse 
    proximo
    
    escrever "\n\n", "Posi��o e valores cujo valor � n�mero impar."
    para i de 0 at� 9 passo 1
    se numero[i]%2 =/= 0 ent�o
    escrever "\n", "Posi��o: ", i, " N�mero informado: ", numero[i]
    fimse 
    proximo 
    
    escrever "\n\n", "Posi��o e valores cujo valor � n�mero multiplo de 3."
    para i de 0 at� 9 passo 1
    se numero[i]%3 = 0 ent�o
    escrever "\n", "Posi��o: ", i, " N�mero informado: ", numero[i]
    fimse 
    proximo 
fim
