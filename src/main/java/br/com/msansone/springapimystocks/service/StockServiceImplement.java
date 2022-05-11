package br.com.msansone.springapimystocks.service;

import br.com.msansone.springapimystocks.exception.StockException;
import br.com.msansone.springapimystocks.model.Stock;
import br.com.msansone.springapimystocks.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImplement implements StockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock stock) {
        Stock atualStock = stockRepository.findBySigla(stock.getSigla());
        if (atualStock==null){
            return stockRepository.save(stock);
        } else {
            throw new StockException("Stock Existente");
        }

    }

    @Override
    public Optional<Stock> getStockById(Long id) {
        return stockRepository.findById(id);
    }
}
