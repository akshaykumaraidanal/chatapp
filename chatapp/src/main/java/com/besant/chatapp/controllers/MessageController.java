package com.besant.chatapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.besant.chatapp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MessageController {
	
	 @MessageMapping("/message")
	    @SendTo("/topic/return-to")
	    public Message getContent(@RequestBody Message message) {
     
	        return message;
	    }

}
