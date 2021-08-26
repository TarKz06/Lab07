package se331.lab.rest.service;

import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface EventService {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize , Integer page);
    Event getEvent(Long id);

    Integer getOranizerSize();
    List<Organizer> getOranizers(Integer pageSize , Integer page);
    Organizer getOranizer(Long id);
}
