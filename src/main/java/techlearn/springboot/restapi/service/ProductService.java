package techlearn.springboot.restapi.service;

import techlearn.springboot.restapi.dto.ProductResponse;
import techlearn.springboot.restapi.persistance.domain.Product;

import java.util.List;

public interface ProductService {

    List<ProductResponse> findAllProduct();

    ProductResponse findProductById(Integer productId);

    ProductResponse createProduct(Product product);

    ProductResponse updateProduct(Integer productId, Product product);

    void deleteProduct(Integer productId);


}
