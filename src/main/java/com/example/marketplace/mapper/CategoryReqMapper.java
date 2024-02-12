package com.example.marketplace.mapper;

import com.example.marketplace.dto.requestDTO.CategoryReqDTO;
import com.example.marketplace.dto.responseDTO.CategoryResDTO;
import com.example.marketplace.entity.Category;
import com.example.marketplace.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryReqMapper extends CommonMapper<CategoryReqDTO, Category> {



}
