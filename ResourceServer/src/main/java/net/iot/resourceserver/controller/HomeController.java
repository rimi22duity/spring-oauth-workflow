package net.iot.resourceserver.controller;

import net.iot.resourceserver.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author duity
 * @since 9/24/23
 */

@Controller
@ResponseBody
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/hello")
    Map<String, String> home() {
      return homeService.home();
    }

    @GetMapping("/user")
    Map<String, String> user() {
        return homeService.user();
    }

    @GetMapping("/admin")
    Map<String, String> admin() {
        return homeService.admin();
    }
}