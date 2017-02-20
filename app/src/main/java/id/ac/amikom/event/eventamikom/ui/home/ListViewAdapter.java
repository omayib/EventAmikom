package id.ac.amikom.event.eventamikom.ui.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import id.ac.amikom.event.eventamikom.R;
import id.ac.amikom.event.eventamikom.model.EventItem;

/**
 * Created by omayib on 19/02/17.
 */

public class ListViewAdapter extends ArrayAdapter<EventItem> {
    private int resLayout;

    public ListViewAdapter(Context context, int resource, List<EventItem> objects) {
        super(context, resource, objects);
        this.resLayout = resource;
    }

    @Nullable
    @Override
    public EventItem getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EventItem item = getItem(position);

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(resLayout,parent,false);
            ViewHolder holder = new ViewHolder();
            holder.titleTextView = (TextView) convertView.findViewById(R.id.rowTitleTextView);

            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.titleTextView.setText(item.getTitle());
        return convertView;
    }

    private static class ViewHolder{
        TextView titleTextView;
    }
}
