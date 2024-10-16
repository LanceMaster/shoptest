package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

//웹 서버 기능을 만들수있다. 아무 클래스나 Controller를 넣으면 된다.
@Controller
public class BasicController {

    @GetMapping("/")

   //responsebody는 문자 그대로 보내주세요라는 것이 된다.
    // html를 보낼거면 @Responsebody를 빼야한다.
    String hello(){
        return "index.html";
        //이런 html를 길어서 안쓰고 resources/static에다가 넣어서 쓸수도 있다.
    }
    //URL를 맘대로 넣을 수 있음


    @GetMapping("/date")
    @ResponseBody
    String date() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        return ZonedDateTime.now().toString();
        //return "오늘날짜 : " + today + "현재 시간은 : " + now;
    }
}
