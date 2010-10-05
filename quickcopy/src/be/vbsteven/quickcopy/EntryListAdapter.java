package be.vbsteven.quickcopy;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EntryListAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<Entry> entries;

	private LayoutInflater inflater;

	private TextView titleView;
	private TextView valueView;

	public EntryListAdapter(Context context, ArrayList<Entry> entries) {
		this.context = context;
		this.entries = entries;
		inflater = (LayoutInflater) context
				.getSystemService(context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return entries.size();
	}

	@Override
	public Object getItem(int index) {
		if (index < entries.size()) {
			return entries.get(index);
		}
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int index, View convertView, ViewGroup parent) {
		// error check
		if (index >= entries.size()) {
			return null;
		}

		Entry entry = entries.get(index);
		View result;

		// init or convert view
		if (convertView != null) {
			result = convertView;
		} else {
			result = inflater.inflate(R.layout.entrylistitem, parent, false);
		}

		// fill up values
		titleView = (TextView) result.findViewById(R.id.entrylistitem_title);
		valueView = (TextView) result.findViewById(R.id.entrylistitem_value);

		titleView.setText(entry.key);
		if (entry.hidden) {
			valueView.setText(Global.PASSWORD_HASH);
		} else {
			valueView.setText(entry.value);
		}

		if (Global.userSelectedShowTitles(context)) {
			valueView.setVisibility(View.GONE);
		} else {
			valueView.setVisibility(View.VISIBLE);
		}

		return result;
	}

	public void updateEntries(ArrayList<Entry> entries) {
		this.entries = entries;
		notifyDataSetChanged();
	}

}