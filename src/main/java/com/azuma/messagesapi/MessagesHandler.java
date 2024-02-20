package com.azuma.messagesapi;

import java.util.ArrayList;

public class MessagesHandler {
    ArrayList<String> messages = new ArrayList<>();

    public MessagesHandler() {
        messages.add("Olá, mundo!");
        messages.add("Bem-vindo à nossa aplicação!");
        messages.add("Tenha um ótimo dia!");
    }

    public ArrayList<String> getMessages() {
        return new ArrayList<>(messages);
    }

    public String getMessageById(int id) {
        return messages.get(id);
    }

    public void createMessages(String message) {
        messages.add(message);
    }

    public void putMessages(int id, String newMessage) {
        messages.set(id, newMessage);
    }

    public void deleteMessages(int id) {
        messages.remove(id);
    }
}
