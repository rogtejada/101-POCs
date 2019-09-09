package com.rogtejada.nsq;

import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;

public class Consumer {

    public static void main(String[] args) {
        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("localhost", 4161);
        NSQConsumer consumer = new NSQConsumer(lookup, "TestTopic", "ch", (message) -> {
            System.out.println("received: " + message);
         
            message.finished();
            
            //message.requeue();
        });

        consumer.start();
    }
}
