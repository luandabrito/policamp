inicio
    inteiro opcao, idade, con
    caracter sexo
    real peso
    con <- 0
        
    faz
    escrever "\n*******************","\n1-Informar Dados","\n2-Mostrar Dados","\n0-Finalizar","\n*******************\n"
    ler opcao
       se opcao = 0 ou opcao = 1 ou opcao = 2 ent�o
           escolhe opcao 
           caso 1: 
               faz 
                   escrever "Informe o sexo: F/M"
                   ler sexo               
               enquanto sexo =/= "M" e sexo =/= "m" e sexo =/= "F" e sexo =/= "f"
               faz
                   escrever "Informe a idade: "
                   ler idade
               enquanto idade <= 0
               faz
                   escrever "Informe o peso: "
                   ler peso
               enquanto peso <= 0
               con <- 1
               caso 2: 
                   se con = 0 ent�o
                   escrever "Nenhum dado cadastrado."
                   sen�o
                       escrever "Sexo: ", sexo, "\nIdade: ", idade, "\nPeso: ", peso
                   fimse
           fimescolhe        
        sen�o
            escrever "Op��o inv�lida."
        fimse 
    enquanto (opcao =/= 0)
fim
