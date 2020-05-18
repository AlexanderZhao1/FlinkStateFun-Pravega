package org.apache.flink;

public class greetResponse {

    private String who = "1";
    private String Greeting = "2";

    public String getWho() {
        return who;
    }

    public greetResponse() {
        this.who = who;
        this.Greeting = Greeting;
    }

    public greetResponse(String who, String Greeting) {
        this.who = who;
        this.Greeting = Greeting;
    }

    public String getGreeting() {
        return Greeting;
    }

    public void setGreeting(String greeting) {
        Greeting = greeting;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return "greetResponse{" +
                "who='" + who + '\'' +
                ", Greeting='" + Greeting + '\'' +
                '}';
    }
}
