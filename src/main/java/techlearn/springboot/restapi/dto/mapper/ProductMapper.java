package techlearn.springboot.restapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import techlearn.springboot.restapi.dto.ProductResponse;
import techlearn.springboot.restapi.persistance.domain.Product;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductResponse mapEntityToProductResponse(Product product);

    List<ProductResponse> mapEntitiesToProductResponseList(List<Product> products);
}
