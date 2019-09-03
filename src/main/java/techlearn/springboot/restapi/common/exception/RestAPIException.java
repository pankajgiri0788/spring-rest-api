package techlearn.springboot.restapi.common.exception;

public class RestAPIException extends RuntimeException {

    private static final long serialVersionUID = -5194547540466449455L;
    private Integer code;

    public RestAPIException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
