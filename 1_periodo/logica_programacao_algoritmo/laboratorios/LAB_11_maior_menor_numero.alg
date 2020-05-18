inicio
    real numero[10], acm, menor, maior, media
    inteiro i
    acm <- 0
   
    para i de 0 até 9 passo 1
        escrever "Informe o ", i+1, "° número: "
        ler numero[i]
        acm <- acm + numero[i]
    proximo
    
    para i de 0 até 9 passo 1
        se i = 0 então 
            maior <- numero[i]
            menor <- numero[i]
        fimse 
        se numero[i] > maior então
            maior <- numero[i]
        fimse
        se numero[i] < menor então
            menor <- numero[i]
        fimse
    proximo
    
    media <- acm / 10
   
    escrever "Media dos valores informados: ", media, "\n"
    escrever "Menor valor: ", menor, "\n"
    escrever "Maior valor: ", maior, "\n"
    
    para i de 0 até 9 passo 1
        se numero[i] > media então 
        escrever "Valor maior que a media: ", numero[i], "\n"
        fimse
    proximo
    
fim