package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("headers")
public class HeaderController{
    @GetMapping
    public Map<String, String> getHeaders(HttpServletRequest request){
        Map<String, String> headers = new HashMap<>();
        headers.put("host",request.getHeader("host"));
        headers.put("port",request.getLocalPort()+"");
        return headers;
    }

}