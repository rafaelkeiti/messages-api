package com.azuma.messagesapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/mensagens")
public class MessagesApiController {

    MessagesHandler messageshandler = new MessagesHandler();

    @GetMapping
    public ArrayList<String> messagesAPI() {
        return messageshandler.getMessages();
    }

    @GetMapping("/{id}")
    public String getMessageID(@PathVariable Integer id) {
        return messageshandler.getMessageById(id);
    }

    @PostMapping
    public String postMessage(@RequestBody String mensagem) {
        messageshandler.createMessages(mensagem);
        return "Mensagem adicionada com sucesso";
    }

    @PutMapping("/{id}")
    public String putMessage(@PathVariable Integer id, @RequestBody String newMessage) {
        messageshandler.putMessages(id, newMessage);
        return "Mensagem atualizada com sucesso";
    }

    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable Integer id) {
        messageshandler.deleteMessages(id);
        return "Mensagem deletada com sucesso";
    }
}
