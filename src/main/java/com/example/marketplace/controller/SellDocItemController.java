package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.SellDocItemReqDTO;
import com.example.marketplace.dto.responseDTO.SellDocItemResDTO;
import com.example.marketplace.service.SellDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sellDocItem")
@RequiredArgsConstructor
public class SellDocItemController {
    private final SellDocItemService sellDocItemService;
    @GetMapping
    List<SellDocItemResDTO> getAllCategories(){
        return sellDocItemService.getALLSellDocItem();
    }
    @GetMapping("/{id}")
    SellDocItemResDTO getSellDocItemById(@PathVariable Long id){
        return sellDocItemService.getSellDocItemById(id);
    }
    @PostMapping()
    SellDocItemResDTO createSellDocItem(@RequestBody SellDocItemReqDTO sellDocItemReqDTO){
        return sellDocItemService.createSellDocItem(sellDocItemReqDTO);
    }

    @PutMapping("/{id}")
    SellDocItemResDTO updateSellDocItem(@PathVariable Long id,@RequestBody SellDocItemReqDTO sellDocItemReqDTO){
        return sellDocItemService.updateSellDocItem(id,sellDocItemReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteSellDocItem(@PathVariable Long id){
        sellDocItemService.deleteSellDocItemById(id);
    }
}
