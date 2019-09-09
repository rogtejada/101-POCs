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
            //now mark the message as finished.
            message.finished();

            //or you could requeue it,http://ba4214f85f00:4161/ which indicates a failure and puts it back on the queue.
            //message.requeue();
        });

        consumer.start();
    }
}
