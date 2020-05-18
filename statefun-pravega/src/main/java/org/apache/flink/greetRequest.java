package org.apache.flink;

public class greetRequest {
    private String who = "1";

    public void setWho(String who) {
        this.who = who;
    }

    public String getWho() {
        return who;
    }

    public greetRequest() {
        this.who = who;
    }

    public greetRequest(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return "greetRequest{" +
                "who='" + who + '\'' +
                '}';
    }
}
