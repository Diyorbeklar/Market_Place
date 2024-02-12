package com.example.marketplace.controller;

import com.example.marketplace.dto.requestDTO.DocumentReqDTO;
import com.example.marketplace.dto.responseDTO.DocumentResDTO;
import com.example.marketplace.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/document")
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;
    @GetMapping
    List<DocumentResDTO> getAllCategories(){
        return documentService.getALLDocument();
    }
    @GetMapping("/{id}")
    DocumentResDTO getDocumentById(@PathVariable Long id){
        return documentService.getDocumentById(id);
    }
    @PostMapping()
    DocumentResDTO createDocument(@RequestBody DocumentReqDTO documentReqDTO){
        return documentService.createDocument(documentReqDTO);
    }
    @PutMapping("/{id}")
    DocumentResDTO updateDocument(@PathVariable Long id,@RequestBody DocumentReqDTO documentReqDTO){
        return documentService.updateDocument(id,documentReqDTO);
    }
    @DeleteMapping("/{id}")
    void deleteDocument(@PathVariable Long id){
        documentService.deleteDocumentById(id);
    }

}
