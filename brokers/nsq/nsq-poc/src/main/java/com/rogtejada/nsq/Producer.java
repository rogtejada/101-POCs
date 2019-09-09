package com.rogtejada.nsq;

import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.exceptions.NSQException;

import java.util.concurrent.TimeoutException;

public class Producer {
    public static void main(String[] args) throws NSQException, TimeoutException {
        NSQProducer producer = new NSQProducer().addAddress("localhost", 4150).start();
        producer.produce("TestTopic", ("this is a message").getBytes());
    }
}
