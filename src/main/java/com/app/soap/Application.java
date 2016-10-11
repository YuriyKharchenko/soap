package com.app.soap;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8081/myWs", new ProcessorImpl()); // поднимает сервер на локальном хосте +
                                            // тот, на кого он будет реагировать - помеченный @WebService

    }
}
