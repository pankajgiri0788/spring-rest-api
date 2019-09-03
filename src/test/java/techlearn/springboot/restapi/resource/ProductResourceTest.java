package techlearn.springboot.restapi.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import techlearn.springboot.restapi.service.ProductService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductResource.class)
class ProductResourceTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    ProductService productService;

    @Nested
    @DisplayName("Negative Test cases for Product Services")
    class ErrorCases {

        @DisplayName("should throw error if product not found for given product id")
        @Test
        void should_throw_error_if_product_not_found_for_given_id() {
            Integer productId = 1;


        }
    }

    @Nested
    @DisplayName("Positive Test cases for Product Services")
    class NominalCases {

        @DisplayName("should fetch product if product found for given product id")
        @Test
        void should_fetch_product_if_product_found_for_given_id() {
            Integer productId = 1;


        }
    }
}