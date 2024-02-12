package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.ProductPriceReqDTO;
import com.example.marketplace.dto.responseDTO.ProductPriceResDTO;
import com.example.marketplace.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productPrice")
@RequiredArgsConstructor
public class ProductPriceController {
    private final ProductPriceService productPriceService;
    @GetMapping
    List<ProductPriceResDTO> getAllCategories(){
        return productPriceService.getALLProductPrice();
    }
    @GetMapping("/{id}")
    ProductPriceResDTO getProductPriceById(@PathVariable Long id){
        return productPriceService.getProductPriceById(id);
    }
    @PostMapping()
    ProductPriceResDTO createProductPrice(@RequestBody ProductPriceReqDTO productPriceReqDTO){
        return productPriceService.createProductPrice(productPriceReqDTO);
    }

    @PutMapping("/{id}")
    ProductPriceResDTO updateProductPrice(@PathVariable Long id,@RequestBody ProductPriceReqDTO productPriceReqDTO){
        return productPriceService.updateProductPrice(id,productPriceReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteProductPrice(@PathVariable Long id){
        productPriceService.deleteProductPriceById(id);
    }

}


