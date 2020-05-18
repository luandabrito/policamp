inicio
    inteiro horas, minutos, segundos, milesimos
    caracter conversao
    ler horas
    
    se horas <= 0 então
        escrever "horas inválidas."
    senão
        ler conversao        
        escolhe conversao
            caso "M", "m": minutos <- horas * 60
                escrever minutos," minutos."
            caso "S", "s": segundos <- horas * 1200
                escrever segundos, " segundos."
            caso "D", "d": milesimos <- horas * 3600000
                escrever milesimos, " milésimos."
            defeito:
                escrever "Tipo de conversão inválida."
       fimescolhe
   fimse
fim