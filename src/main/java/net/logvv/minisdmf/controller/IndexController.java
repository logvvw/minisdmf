package net.logvv.minisdmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: wangwei
 * on    : 2020-06-06 上午1:34.
 */

@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String index() {
        return "hello world";
    }
}
