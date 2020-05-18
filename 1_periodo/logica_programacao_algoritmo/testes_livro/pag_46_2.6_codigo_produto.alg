inicio
    inteiro codigo
    
    escrever "Informe o código do produto: "
    ler codigo
    
    escolhe codigo
    caso 1: escrever "Alimento não-perecível."
    caso 2, 3, 4: escrever "Alimento perecível."
    caso 5, 6: escrever "Vestuário."
    caso 7: escrever "Higiene pessoal."
    caso 8, 9, 10, 11, 12, 13, 14, 15: escrever "Limpeza e utensílios domésticos."
    fimescolhe 
        
    se codigo <= 0 ou codigo > 16 então
        escrever "Código inválido."
    fimse 
fim
