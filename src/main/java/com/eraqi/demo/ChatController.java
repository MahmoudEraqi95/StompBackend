package com.eraqi.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void greeting(String message, @Header("id") String id)  {
        System.out.println(message);
        String des = "/topic/chat/"+id;
        simpMessagingTemplate.convertAndSend(des, message);
    }

}
