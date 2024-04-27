package kg.booster.newProject.services.impl;

import kg.booster.newProject.repository.ProductRepository;
import kg.booster.newProject.services.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private  final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
