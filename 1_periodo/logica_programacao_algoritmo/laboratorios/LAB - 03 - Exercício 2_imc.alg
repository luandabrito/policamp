inicio
    real peso, altura, imc
    
    escrever "Informe seu peso em kg: "
    ler peso
    escrever "Informe sua altura em metros: "
    ler altura
    
    imc <- peso/(altura * altura)
    
    escrever "IMC = ", imc, "\n"
    
    se imc < 18.5 ent�o
        escrever "Magro"
    sen�o 
        se imc >= 18.5 e imc <= 24.9 ent�o
            escrever "Saud�vel"
        sen�o
            escrever "Obeso"
        fimse
        fimse
             
fim 