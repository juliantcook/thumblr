package uk.julianc.thumblr

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping('/')
    String index() {
        'index'
    }
}
