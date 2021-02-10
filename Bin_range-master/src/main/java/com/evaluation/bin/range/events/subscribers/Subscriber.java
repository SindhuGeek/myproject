package com.evaluation.bin.range.events.subscribers;

import com.evaluation.bin.range.events.models.Event;

public interface Subscriber<T extends Event> {

    void handleEvent(T event);
}
