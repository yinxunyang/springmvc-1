package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller      //@Controller注解：采用注解的方式定义该类为处理请求的Controller类
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg"," Hello Spring MVC");
        //处理完该请求后返回的页面，此请求返回 hello.jsp页面。
        return "long";
    }
}