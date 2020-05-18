package org.apache.flink;

import org.apache.flink.statefun.sdk.io.Router;

public class greetRouter implements Router<greetRequest> {
    @Override
    public void route(greetRequest message, Downstream<greetRequest> downstream) {
        downstream.forward(StringStatefulFunction.TYPE, message.getWho(), message);
    }
}
