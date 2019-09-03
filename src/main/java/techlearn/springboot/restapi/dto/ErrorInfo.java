package techlearn.springboot.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = 7561940919943359248L;
    private Integer errorCode;
    private String errorMessage;
    private String errorLevel;
    private String tips;
    private String documentationUrl;
    private String errorType;
}
