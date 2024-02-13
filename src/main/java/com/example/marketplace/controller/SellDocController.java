package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.SellDocReqDTO;
import com.example.marketplace.dto.responseDTO.SellDocResDTO;
import com.example.marketplace.service.SellDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sellDoc")
@RequiredArgsConstructor
public class SellDocController {
    private final SellDocService sellDocService;
    @GetMapping
    List<SellDocResDTO> getAllCategories(){
        return sellDocService.getALLSellDoc();
    }
    @GetMapping("/{id}")
    SellDocResDTO getSellDocById(@PathVariable Long id){
        return sellDocService.getSellDocById(id);
    }
    @PostMapping()
    SellDocResDTO createSellDoc(@RequestBody SellDocReqDTO sellDocReqDTO){
        return sellDocService.createSellDoc(sellDocReqDTO);
    }

    @PutMapping("/{id}")
    SellDocResDTO updateSellDoc(@PathVariable Long id,@RequestBody SellDocReqDTO sellDocReqDTO){
        return sellDocService.updateSellDoc(id,sellDocReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteSellDoc(@PathVariable Long id){
        sellDocService.deleteSellDocById(id);
    }
}
