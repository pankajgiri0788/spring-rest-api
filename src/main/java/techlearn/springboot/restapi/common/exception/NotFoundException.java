package techlearn.springboot.restapi.common.exception;

public class NotFoundException extends RestAPIException {

    private static final long serialVersionUID = -3934376623132714786L;

    public NotFoundException(String message, Integer code) {
        super(message, code);
    }
}
