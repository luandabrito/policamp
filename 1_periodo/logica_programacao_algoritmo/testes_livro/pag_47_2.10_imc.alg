inicio
    real peso, altura, imc
    
    escrever "Informe o peso: "
    ler peso
    escrever "Informe a altura: "
    ler altura
    
    imc <- peso / altura^2
    
    se imc < 18.5 ent�o
        escrever "Abaixo do peso"
    sen�o
        se imc >= 18.5 e imc < 25 ent�o 
            escrever "Peso normal"
        sen�o
            se imc <= 25 e imc < 30 ent�o 
                escrever "Acima do peso"
            sen�o
                escrever "Obeso"
            fimse
        fimse
    fimse
fim
