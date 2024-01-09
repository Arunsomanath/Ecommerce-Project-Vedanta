package org.ecommerce.library.service;

import org.ecommerce.library.dto.CategoryDto;
import org.ecommerce.library.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService
{
    Category save(CategoryDto categoryDto);

    List<Category> findAll();

    Category update(Category category);

    Optional<Category> findById(Long id);

    void deleteById(Long id);

    void enableById(Long id);

    List<Category> findAllByActivatedTrue();

    Long countAllCategories();

    Category findById(long id);
}