package com.example.marketplace.controller;


import com.example.marketplace.dto.requestDTO.DocItemsReqDTO;
import com.example.marketplace.dto.responseDTO.DocItemsResDTO;
import com.example.marketplace.service.DocItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docItems")
@RequiredArgsConstructor
public class DocItemsController {
    private final DocItemsService docItemsService;
    @GetMapping
    List<DocItemsResDTO> getAllCategories(){
        return docItemsService.getALLDocItems();
    }
    @GetMapping("/{id}")
    DocItemsResDTO getDocItemsById(@PathVariable Long id){
        return docItemsService.getDocItemsById(id);
    }
    @PostMapping()
    DocItemsResDTO createDocItems(@RequestBody DocItemsReqDTO docItemsReqDTO){
        return docItemsService.createDocItems(docItemsReqDTO);
    }
    @PutMapping("/{id}")
    DocItemsResDTO updateDocItems(@PathVariable Long id,@RequestBody DocItemsReqDTO docItemsReqDTO){
        return docItemsService.updateDocItems(id,docItemsReqDTO);
    }
    @DeleteMapping("/{id}")
    void deleteDocItems(@PathVariable Long id){

        docItemsService.deleteDocItemsById(id);
    }

}
