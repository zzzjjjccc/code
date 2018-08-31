package com.zing.thinking_in_java.inner;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event e) {
        eventList.add(e);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e : eventList) {
                if (e.ready()) {
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
