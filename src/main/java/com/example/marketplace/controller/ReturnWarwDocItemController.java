package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.ReturnWarwDocItemReqDTO;
import com.example.marketplace.dto.responseDTO.ReturnWarwDocItemResDTO;
import com.example.marketplace.service.ReturnWarwDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/returnWarwDocItem")
@RequiredArgsConstructor
public class ReturnWarwDocItemController {
    private final ReturnWarwDocItemService returnWarwDocItemService;
    @GetMapping
    List<ReturnWarwDocItemResDTO> getAllCategories(){
        return returnWarwDocItemService.getALLReturnWarwDocItem();
    }
    @GetMapping("/{id}")
    ReturnWarwDocItemResDTO getReturnWarwDocItemById(@PathVariable Long id){
        return returnWarwDocItemService.getReturnWarwDocItemById(id);
    }
    @PostMapping()
    ReturnWarwDocItemResDTO createReturnWarwDocItem(@RequestBody ReturnWarwDocItemReqDTO returnWarwDocItemReqDTO){
        return returnWarwDocItemService.createReturnWarwDocItem(returnWarwDocItemReqDTO);
    }

    @PutMapping("/{id}")
    ReturnWarwDocItemResDTO updateReturnWarwDocItem(@PathVariable Long id,@RequestBody ReturnWarwDocItemReqDTO returnWarwDocItemReqDTO){
        return returnWarwDocItemService.updateReturnWarwDocItem(id,returnWarwDocItemReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteReturnWarwDocItem(@PathVariable Long id){
        returnWarwDocItemService.deleteReturnWarwDocItemById(id);
    }
}
