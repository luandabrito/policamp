inicio
	inteiro n1, n2, i, j, acm
      
      escrever "Informe o primeiro numero: "
      ler n1
      escrever "Informe o segundo numero: "
      ler n2
      
      para i de n1 at� n2 passo 1
          acm <- 0
          para j de 1 at� i passo 1
              se i%j = 0 ent�o 
              acm <- acm + 1
              fimse
          proximo
          se acm = 2 ent�o 
          escrever "N�mero primo: ", i, "\n"
          fimse 
     proximo
fim
