início
   inteiro con, soma_al, soma_f, soma_m
   caracter sexo
   real altura
   con <- 0
   soma_al <- 0
   soma_f <- 0
   soma_m <- 0
     
   enquanto (con < 10) faz
       enquanto (sexo =/= "F" e sexo =/= "M") faz
           escrever "Informe o sexo: F ou M "
           ler sexo
           se ( sexo = "F" ) então 
               soma_f <- soma_f + 1
           senão 
               soma_m <- soma_m + 1
           fimse
       fimenquanto
       escrever "Informe a altura: "
       ler altura
       se (sexo = "M" e altura > 1.70 e altura < 1.95) então 
           soma_al <- soma_al + 1
       fimse   
       con <- con + 1
       sexo <- "p"     
   fimenquanto
   
   escrever "Quantidade de homens: ", soma_m, "\n"
   escrever "Quantidade de mulheres: ", soma_f, "\n"
   escrever "Quantidade de homens com altura entra 1.70 e 1.95: ", soma_al   

fim