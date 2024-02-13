package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.ReturnDocReqDTO;
import com.example.marketplace.dto.responseDTO.ReturnDocResDTO;
import com.example.marketplace.service.ReturnDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/returnDoc")
@RequiredArgsConstructor
public class ReturnDocController {
    private final ReturnDocService returnDocService;
    @GetMapping
    List<ReturnDocResDTO> getAllCategories(){
        return returnDocService.getALLReturnDoc();
    }
    @GetMapping("/{id}")
    ReturnDocResDTO getReturnDocById(@PathVariable Long id){
        return returnDocService.getReturnDocById(id);
    }
    @PostMapping()
    ReturnDocResDTO createReturnDoc(@RequestBody ReturnDocReqDTO returnDocReqDTO){
        return returnDocService.createReturnDoc(returnDocReqDTO);
    }

    @PutMapping("/{id}")
    ReturnDocResDTO updateReturnDoc(@PathVariable Long id,@RequestBody ReturnDocReqDTO returnDocReqDTO){
        return returnDocService.updateReturnDoc(id,returnDocReqDTO);
    }

    @DeleteMapping("/{id}")
    void deleteReturnDoc(@PathVariable Long id){
        returnDocService.deleteReturnDocById(id);
    }

}
