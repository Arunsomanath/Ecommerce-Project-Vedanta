package org.ecommerce.library.dto;
import  lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ecommerce.library.model.Category;
import org.ecommerce.library.model.Image;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto
{
    private Long id;
    private String name;
    private String brand;
    private String longDescription;
    private String shortDescription;
    private int currentQuantity;
    private double costPrice;
    private double salePrice;


    private List<Image> image;
    private Category category;
    private boolean activated;
}
