package id.ac.amikom.event.eventamikom.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.ac.amikom.event.eventamikom.R;
import id.ac.amikom.event.eventamikom.model.EventItem;
import id.ac.amikom.event.eventamikom.ui.detail.DetailActivity;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<EventItem> events = generateFakeEvents();
        ArrayAdapter<EventItem> adapter = new ListViewAdapter(this,R.layout.row_event,events);

        listView = (ListView) findViewById(R.id.eventListVIew);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                EventItem selectedEvent = (EventItem) adapterView.getItemAtPosition(i);
                Intent nextPage = new Intent(HomeActivity.this, DetailActivity.class);
                nextPage.putExtra("title",selectedEvent.getTitle());
                nextPage.putExtra("date",selectedEvent.getDate());
                nextPage.putExtra("place",selectedEvent.getPlace());
                nextPage.putExtra("speaker",selectedEvent.getSpeaker());
                nextPage.putExtra("description",selectedEvent.getDescription());
                startActivity(nextPage);
            }
        });
    }


    private List<EventItem> generateFakeEvents(){
        List<EventItem> events = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            events.add(new EventItem("StartupTalk #"+i,
                    i+"/02/2017","09:00",
                    "Ruang Ciname Univ.Amikom",
                    "Arif Akbarul H.",
                    "acara ini terselenggara dalam rangka untuk" +
                    "mempereingati blablalba ini itu dibuat saja yang agak panjang"));
        }
        return  events;
    }
}
