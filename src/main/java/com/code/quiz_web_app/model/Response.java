package com.code.quiz_web_app.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@RequiredArgsConstructor
public class Response {
    private  Integer id;
    private  String response;

}
