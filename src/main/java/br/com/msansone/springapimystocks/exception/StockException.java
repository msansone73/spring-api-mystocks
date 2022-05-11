package br.com.msansone.springapimystocks.exception;

public class StockException extends RuntimeException {
    public StockException(String stock_existente) {
        super(stock_existente);
    }
}
