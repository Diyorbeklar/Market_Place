package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.ReturnDocItemReqDTO;
import com.example.marketplace.dto.responseDTO.ReturnDocItemResDTO;
import com.example.marketplace.service.ReturnDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/returnDocItem")
@RequiredArgsConstructor
public class ReturnDocItemController {
    private final ReturnDocItemService returnDocItemService;
    @GetMapping
    List<ReturnDocItemResDTO> getAllCategories(){
        return returnDocItemService.getALLReturnDocItem();
    }
    @GetMapping("/{id}")
    ReturnDocItemResDTO getReturnDocItemById(@PathVariable Long id){
        return returnDocItemService.getReturnDocItemById(id);
    }
    @PostMapping()
    ReturnDocItemResDTO createReturnDocItem(@RequestBody ReturnDocItemReqDTO returnDocItemReqDTO){
        return returnDocItemService.createReturnDocItem(returnDocItemReqDTO);
    }

    @PutMapping("/{id}")
    ReturnDocItemResDTO updateReturnDocItem(@PathVariable Long id,@RequestBody ReturnDocItemReqDTO returnDocItemReqDTO){
        return returnDocItemService.updateReturnDocItem(id,returnDocItemReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteReturnDocItem(@PathVariable Long id){
        returnDocItemService.deleteReturnDocItemById(id);
    }

}

