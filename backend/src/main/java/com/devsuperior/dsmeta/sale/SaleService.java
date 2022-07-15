package com.devsuperior.dsmeta.sale;

import com.devsuperior.dsmeta.sale.entity.Sale;
import com.devsuperior.dsmeta.sale.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
