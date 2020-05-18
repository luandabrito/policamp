inicio
    real peso, altura, imc
    
    escrever "Informe o peso: "
    ler peso
    escrever "Informe a altura: "
    ler altura
    
    imc <- peso / altura^2
    
    se imc < 18.5 então
        escrever "Abaixo do peso"
    senão
        se imc >= 18.5 e imc < 25 então 
            escrever "Peso normal"
        senão
            se imc <= 25 e imc < 30 então 
                escrever "Acima do peso"
            senão
                escrever "Obeso"
            fimse
        fimse
    fimse
fim
