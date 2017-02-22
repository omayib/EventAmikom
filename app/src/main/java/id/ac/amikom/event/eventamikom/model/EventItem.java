package id.ac.amikom.event.eventamikom.model;

import java.util.Date;

/**
 * Created by omayib on 19/02/17.
 */

public class EventItem {
    private final String title;
    private final Date date;
    private final String time;
    private final String place;

    public EventItem(String title, Date date, String time, String place) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public String getDate(){
        return "";
    }

    public String getTime() {
        return time;
    }
}