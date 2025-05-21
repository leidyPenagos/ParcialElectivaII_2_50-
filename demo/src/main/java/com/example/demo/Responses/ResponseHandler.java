package com.example.demo.Responses;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.*;

public class ResponseHandler {
    public static ResponseEntity<Object> response(String message, int status, Object data) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("message", message);
        map.put("status", status);
        map.put("data", data);
        return new ResponseEntity<>(map, HttpStatus.valueOf(status));
    }
}
