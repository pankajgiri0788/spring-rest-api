package techlearn.springboot.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import techlearn.springboot.restapi.common.exception.NotFoundException;
import techlearn.springboot.restapi.dto.ProductResponse;
import techlearn.springboot.restapi.dto.mapper.ProductMapper;
import techlearn.springboot.restapi.persistance.domain.Product;
import techlearn.springboot.restapi.persistance.repository.ProductRepository;
import techlearn.springboot.restapi.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductResponse> findAllProduct() {
        return productMapper.mapEntitiesToProductResponseList(productRepository.findAll());
    }

    @Override
    public ProductResponse findProductById(Integer productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(!optionalProduct.isPresent()) {
            throw new NotFoundException("Product not found for given id", 400);
        }
        return productMapper.mapEntityToProductResponse(optionalProduct.get());
    }

    @Override
    public ProductResponse createProduct(Product product) {
        Product newProduct =  productRepository.save(product);
        return productMapper.mapEntityToProductResponse(newProduct);
    }

    @Override
    public ProductResponse updateProduct(Integer productId, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(!optionalProduct.isPresent()) {
            throw new NotFoundException("Product not found for given id", 400);
        }
        Product updatedProduct =  productRepository.save(product);
        return productMapper.mapEntityToProductResponse(updatedProduct);
    }

    @Override
    public void deleteProduct(Integer productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(!optionalProduct.isPresent()) {
            throw new NotFoundException("Product not found for given id", 400);
        }
        productRepository.delete(optionalProduct.get());
    }
}
