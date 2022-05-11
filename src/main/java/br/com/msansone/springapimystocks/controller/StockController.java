package br.com.msansone.springapimystocks.controller;

import br.com.msansone.springapimystocks.exception.StockException;
import br.com.msansone.springapimystocks.model.Stock;
import br.com.msansone.springapimystocks.model.rest.AbstractResponse;
import br.com.msansone.springapimystocks.model.rest.BadRequest;
import br.com.msansone.springapimystocks.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {


    @Autowired
    StockService stockService;

    @GetMapping("")
    public ResponseEntity<List<Stock>> getStock(){
        return ResponseEntity.ok(stockService.getAllStocks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbstractResponse> getStockById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(stockService.getStockById(id).orElseThrow());
        } catch (Exception se){
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<AbstractResponse> addStock(@RequestBody Stock stock){

        try{
            Stock newStock=stockService.addStock(stock);
            return ResponseEntity.ok(newStock);
        } catch (StockException se){
            return ResponseEntity.badRequest().body(new BadRequest(se.getMessage()));
        }

    }


}
