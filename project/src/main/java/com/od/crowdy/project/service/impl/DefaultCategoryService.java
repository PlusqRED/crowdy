package com.od.crowdy.project.service.impl;

import com.od.crowdy.project.domain.CategoryRepository;
import com.od.crowdy.project.domain.neo4j.model.Category;
import com.od.crowdy.project.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class DefaultCategoryService implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Flux<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
