package techlearn.springboot.restapi.common.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import techlearn.springboot.restapi.common.exception.NotFoundException;
import techlearn.springboot.restapi.dto.ErrorInfo;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<List<ErrorInfo>> notFoundDataExceptionHandler(NotFoundException e) {
        List<ErrorInfo> errorInfos = new ArrayList<>();
        ErrorInfo errorInfo = ErrorInfo.builder()
                .errorCode(e.getCode())
                .errorMessage(e.getMessage())
                .errorLevel("info")
                .errorType("functional")
                .tips("")
                .documentationUrl("")
                .build();
        errorInfos.add(errorInfo);

        return new ResponseEntity<>(errorInfos, HttpStatus.NOT_FOUND);
    }
}
