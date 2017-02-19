package id.ac.amikom.event.eventamikom.ui.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.ac.amikom.event.eventamikom.R;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<String> fakeEvents = generateFakeEvents();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fakeEvents);

        listView = (ListView) findViewById(R.id.eventListVIew);
        listView.setAdapter(adapter);
    }

    private List<String> generateFakeEvents(){
        List<String> events = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            events.add("event acara "+i);
        }
        return events;
    }
}
