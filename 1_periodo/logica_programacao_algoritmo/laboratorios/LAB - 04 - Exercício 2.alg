inicio
    inteiro horas, minutos, segundos, milesimos
    caracter conversao
    ler horas
    
    se horas <= 0 ent�o
        escrever "horas inv�lidas."
    sen�o
        ler conversao        
        escolhe conversao
            caso "M", "m": minutos <- horas * 60
                escrever minutos," minutos."
            caso "S", "s": segundos <- horas * 1200
                escrever segundos, " segundos."
            caso "D", "d": milesimos <- horas * 3600000
                escrever milesimos, " mil�simos."
            defeito:
                escrever "Tipo de convers�o inv�lida."
       fimescolhe
   fimse
fim