package techlearn.springboot.restapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class CreateProductRequest {

    @NotEmpty
    @Size(max = 20, message = "name in not valid. Max allowed characters is 20")
    private String name;

    @Size(max = 60, message = "description in not valid. Max allowed characters is 60")
    private String description;

    @CreatedDate
    private Date createdOn;

    private Date updatedOn;
}
