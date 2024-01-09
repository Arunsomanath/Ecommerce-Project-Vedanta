package org.ecommerce.library.service.impl;


import org.ecommerce.library.model.Image;
import org.ecommerce.library.repository.ImageRepository;
import org.ecommerce.library.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService
{
    @Autowired
    private ImageRepository imageRepository;
    @Override
    public List<Image> findProductImages(long id) {
        return imageRepository.findImageBy(id);
    }

    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }
}
