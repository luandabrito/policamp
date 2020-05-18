inicio
    real preco, pagar
    inteiro codigo

    escrever "Informe o preço do produto na etiqueta: "
    ler preco
    escrever "Informe o código da forma de pagamento: "
    ler codigo
    
    se codigo = 1 então
        pagar <- preco - preco * 0.1
        escrever "Valor a pagar: R$ ", pagar, " à vista em dinheiro ou cheque."
    senão
        se codigo = 2 então
            pagar <- preco - preco * 0.05
            escrever "Valor a pagar: R$ ", pagar, " a vista no cartão de crédito."
        senão
            se codigo = 3 então
                escrever "Valor a pagar: R$ ", preco, " em duas vezes sem juros."
            senão 
                pagar <- preco + preco * 0.1
                escrever "Valor a pagar: R$ ", pagar, " em tres vezes no cartão com juros de 10%."
            fimse
        fimse
    fimse
fim
