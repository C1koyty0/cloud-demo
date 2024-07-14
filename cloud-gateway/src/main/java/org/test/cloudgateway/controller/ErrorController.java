package org.test.cloudgateway.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
    @RequestMapping("fallback")
    public JSONObject fallback() {
        return new JSONObject() {{
            put("code", 0);
            put("msg", "服务器繁忙");
            put("state", false);
        }};
    }
}
