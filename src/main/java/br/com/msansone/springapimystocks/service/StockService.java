package br.com.msansone.springapimystocks.service;

import br.com.msansone.springapimystocks.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {
    List<Stock> getAllStocks();

    Stock addStock(Stock stock);

    Optional<Stock> getStockById(Long id);
}
