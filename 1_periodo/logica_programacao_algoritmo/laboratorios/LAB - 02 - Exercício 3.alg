
inicio
    real consumo, v_kw, pct_icms, v_icms, v_consumido, v_fatura
    
    escrever "Informe a quantidade de kw/h consumido: "
    ler consumo
    
    escrever "Informe o valor unitário do kw/h: "
    ler v_kw
    
    escrever "Informe a alíquota do ICMS: "
    ler pct_icms
    
    v_consumido <- consumo * v_kw
    v_icms <- v_consumido * (pct_icms / 100)
    v_fatura <- v_consumido + v_icms
    
    escrever "ICMS cobrado: ", v_icms,"\n"
   
    escrever "Valor da fatura: ", v_fatura

fim
