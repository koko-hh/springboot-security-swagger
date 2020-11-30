package comhlk.controller;

import comhlk.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwaggerController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }

    @ApiOperation("hlk的接口")
    @PostMapping("/hlk")
    @ResponseBody
    public String hlkname(@ApiParam("这个名字会被返回")String username){
        return username;
    }
}
