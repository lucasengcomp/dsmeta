package com.devsuperior.dsmeta.sale.repository;

import com.devsuperior.dsmeta.sale.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
