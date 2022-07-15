package com.devsuperior.dsmeta.sale.controller;

import com.devsuperior.dsmeta.sale.SaleService;
import com.devsuperior.dsmeta.sale.entity.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public List<Sale> findSales(Pageable pageable) {
        return service.findSales();
    }
}