package id.ac.amikom.event.eventamikom.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.amikom.event.eventamikom.R;

public class DetailActivity extends AppCompatActivity {
    private ImageView eventImageView;
    private TextView titleTextView;
    private TextView descriptionTextView;
    private TextView dateTextView;
    private TextView speakerTextView;
    private TextView placeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        eventImageView = (ImageView) findViewById(R.id.eventImageView);
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        placeTextView = (TextView) findViewById(R.id.locationLabel);
        speakerTextView = (TextView) findViewById(R.id.speakerTextView);

        Intent currentIntent = getIntent();
        String title  = currentIntent.getStringExtra("title");
        String date  = currentIntent.getStringExtra("date");
        String place = currentIntent.getStringExtra("place");
        String speaker = currentIntent.getStringExtra("place");
        String description= currentIntent.getStringExtra("description");

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        dateTextView.setText(date);
        placeTextView.setText(place);
        speakerTextView.setText(speaker);
    }
}
