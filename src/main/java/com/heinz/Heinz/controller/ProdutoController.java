package com.heinz.Heinz.controller;

import com.heinz.Heinz.model.DadosEconomiaModel;
import com.heinz.Heinz.model.ProdutoModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/produto")
@Api(tags = "API de Informações de Produtos")
public class ProdutoController {

    @GetMapping("/retorno-embalagens")
    @ApiOperation("Quantidade de embalagens retornadas por produto")
    public Map<ProdutoModel, Integer> getReturnedQuantityByProduct()
    {
        return new HashMap<>();
    }

    @GetMapping("/retorno-embalagens-regiao")
    @ApiOperation("Percentual de embalagens retornadas por região")
    public Map<String, Integer> getReturnedQuantityByRegion()
    {
        return new HashMap<>();
    }

    @GetMapping("/economia-energia")
    @ApiOperation("Dados sobre economia de energia")
    public DadosEconomiaModel getEnergyEconomy()
    {
        return new DadosEconomiaModel();
    }

    @GetMapping("/economia-agua")
    @ApiOperation("Dados sobre economia de água")
    public DadosEconomiaModel getWaterEconomy()
    {
        return new DadosEconomiaModel();
    }

    @GetMapping("/economia-financeira")
    @ApiOperation("Dados sobre economia financeira")
    public DadosEconomiaModel getFinacialEconomy()
    {
        return new DadosEconomiaModel();
    }

}
