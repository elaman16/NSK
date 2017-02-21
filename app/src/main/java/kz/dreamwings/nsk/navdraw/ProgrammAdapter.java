package kz.dreamwings.nsk.navdraw;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dreamwings.azamat.navdraw.R;

import java.util.List;


public class ProgrammAdapter extends BaseAdapter {

    private Activity activity;
    private List<String> data;
    private static LayoutInflater inflater=null;

    public ProgrammAdapter(Activity a, List<String> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_item_programm, null);

        TextView title = (TextView)vi.findViewById(R.id.title); // title

        // Setting all values in listview
        title.setText(data.get(position));
        return vi;
    }
}
