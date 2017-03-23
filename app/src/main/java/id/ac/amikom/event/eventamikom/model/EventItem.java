package id.ac.amikom.event.eventamikom.model;

/**
 * Created by omayib on 19/02/17.
 */

public class EventItem {
    private final String title;
    private final String date;
    private final String time;
    private final String place;
    private final String speaker;
    private final String description;

    public EventItem(String title, String date, String time, String place, String speaker, String description) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.place = place;
        this.speaker = speaker;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public String getDate(){
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getDescription() {
        return description;
    }
}
