package com.example.marketplace.mapper;

import com.example.marketplace.dto.responseDTO.CategoryResDTO;
import com.example.marketplace.entity.Category;
import com.example.marketplace.mapper.CommonMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryResMapper extends CommonMapper<CategoryResDTO, Category> {
    @Mapping(source = "id",target = "id")
    CategoryResDTO toDTO(Category category);
}
