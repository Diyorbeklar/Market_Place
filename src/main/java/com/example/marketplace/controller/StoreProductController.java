package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.StoreProductReqDTO;
import com.example.marketplace.dto.responseDTO.StoreProductResDTO;
import com.example.marketplace.service.StoreProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/storeProduct")
@RequiredArgsConstructor
public class StoreProductController {
    private final StoreProductService StoreProductService;
    @GetMapping
    List<StoreProductResDTO> getAllCategories(){
        return StoreProductService.getALLStoreProduct();
    }
    @GetMapping("/{id}")
    StoreProductResDTO getStoreProductById(@PathVariable Long id){
        return StoreProductService.getStoreProductById(id);
    }
    @PostMapping()
    StoreProductResDTO createStoreProduct(@RequestBody StoreProductReqDTO StoreProductReqDTO){
        return StoreProductService.createStoreProduct(StoreProductReqDTO);
    }

    @PutMapping("/{id}")
    StoreProductResDTO updateStoreProduct(@PathVariable Long id,@RequestBody StoreProductReqDTO StoreProductReqDTO){
        return StoreProductService.updateStoreProduct(id,StoreProductReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteStoreProduct(@PathVariable Long id){
        StoreProductService.deleteStoreProductById(id);
    }

}
