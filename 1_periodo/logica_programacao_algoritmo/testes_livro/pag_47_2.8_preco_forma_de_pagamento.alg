inicio
    real preco, pagar
    inteiro codigo

    escrever "Informe o pre�o do produto na etiqueta: "
    ler preco
    escrever "Informe o c�digo da forma de pagamento: "
    ler codigo
    
    se codigo = 1 ent�o
        pagar <- preco - preco * 0.1
        escrever "Valor a pagar: R$ ", pagar, " � vista em dinheiro ou cheque."
    sen�o
        se codigo = 2 ent�o
            pagar <- preco - preco * 0.05
            escrever "Valor a pagar: R$ ", pagar, " a vista no cart�o de cr�dito."
        sen�o
            se codigo = 3 ent�o
                escrever "Valor a pagar: R$ ", preco, " em duas vezes sem juros."
            sen�o 
                pagar <- preco + preco * 0.1
                escrever "Valor a pagar: R$ ", pagar, " em tres vezes no cart�o com juros de 10%."
            fimse
        fimse
    fimse
fim
