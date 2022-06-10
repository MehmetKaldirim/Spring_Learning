package com.cydeo.entity;


import com.cydeo.dto.CourseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    public ResponseWrapper(String message, Object data) {
        this.success = true;
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.data = data;
    }

    public ResponseWrapper(boolean b, String message, List<CourseDTO> courses, boolean b1) {
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }
}
