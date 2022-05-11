package br.com.msansone.springapimystocks.repository;

import br.com.msansone.springapimystocks.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findBySigla(String sigla);
}
