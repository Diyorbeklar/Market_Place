package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.ReturnWarwDocReqDTO;
import com.example.marketplace.dto.responseDTO.ReturnWarwDocResDTO;
import com.example.marketplace.service.ReturnWarwDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/returnWarwDoc")
@RequiredArgsConstructor
public class ReturnWarwDocController {
    private final ReturnWarwDocService returnWarwDocService;
    @GetMapping
    List<ReturnWarwDocResDTO> getAllCategories(){
        return returnWarwDocService.getALLReturnWarwDoc();
    }
    @GetMapping("/{id}")
    ReturnWarwDocResDTO getReturnWarwDocById(@PathVariable Long id){
        return returnWarwDocService.getReturnWarwDocById(id);
    }
    @PostMapping()
    ReturnWarwDocResDTO createReturnWarwDoc(@RequestBody ReturnWarwDocReqDTO returnWarwDocReqDTO){
        return returnWarwDocService.createReturnWarwDoc(returnWarwDocReqDTO);
    }

    @PutMapping("/{id}")
    ReturnWarwDocResDTO updateReturnWarwDoc(@PathVariable Long id,@RequestBody ReturnWarwDocReqDTO returnWarwDocReqDTO){
        return returnWarwDocService.updateReturnWarwDoc(id,returnWarwDocReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteReturnWarwDoc(@PathVariable Long id){
        returnWarwDocService.deleteReturnWarwDocById(id);
    }
}
