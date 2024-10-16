//파일의 경로
//안쓰면 다른곳에서 못씀
package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Cotroller 어노테이션작성시 API를 만들수있음
//비슷한 API는 한곳에 몰아넣는게 편함
@Controller
//Public 다른폴더에서도 ItemController 사용 가능
public class ItemController {
    @GetMapping("/list")
    String list() {
        return "list.html";
    }
    //여러 탬플릿엔진이 많은데 Thymeleaf 템플릿엔진을 한번 써볼것임
}
