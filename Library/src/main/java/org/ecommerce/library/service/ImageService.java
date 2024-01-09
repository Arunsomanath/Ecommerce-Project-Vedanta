package org.ecommerce.library.service;
import org.ecommerce.library.model.Image;

import java.util.List;

public interface ImageService
{
    List<Image> findProductImages(long id);

    List<Image> findAll();
}
