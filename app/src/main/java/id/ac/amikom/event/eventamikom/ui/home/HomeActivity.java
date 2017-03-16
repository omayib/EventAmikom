package id.ac.amikom.event.eventamikom.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
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
        List<String> fakeEvents = generateSimpleFakeEvents();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fakeEvents);


        List<EventItem> fakeCustomEvents = generateCustomFakeEvents();
        ListViewAdapter customAdapter = new ListViewAdapter(this,R.layout.row_event, fakeCustomEvents);

        listView = (ListView) findViewById(R.id.eventListVIew);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(HomeActivity.this, DetailActivity.class));
            }
        });
    }

    private List<String> generateSimpleFakeEvents(){
        List<String> events = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            events.add("event acara "+i);
        }
        return events;
    }

    private List<EventItem> generateCustomFakeEvents(){
        List<EventItem> events = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            events.add(new EventItem("judul event "+i,new Date(),"123","123"));
        }
        return events;
    }
}
