
inicio
    real v_tv, pct_desc, v_final
    
    escrever "Informe o valor da TV: "
    ler v_tv
    
    escrever "Informe o percentual de desconto: "
    ler pct_desc
    
    v_final <- v_tv - v_tv * (pct_desc) / 100
    
    escrever "Valor da tv com desconto = ", v_final

fim
