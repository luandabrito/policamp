inicio
    inteiro codigo
    
    escrever "Informe o c�digo do produto: "
    ler codigo
    
    escolhe codigo
    caso 1: escrever "Alimento n�o-perec�vel."
    caso 2, 3, 4: escrever "Alimento perec�vel."
    caso 5, 6: escrever "Vestu�rio."
    caso 7: escrever "Higiene pessoal."
    caso 8, 9, 10, 11, 12, 13, 14, 15: escrever "Limpeza e utens�lios dom�sticos."
    fimescolhe 
        
    se codigo <= 0 ou codigo > 16 ent�o
        escrever "C�digo inv�lido."
    fimse 
fim
