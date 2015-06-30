package com.example.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private final String[] COLORS = new String[] { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> adapter =
				new ArrayAdapter<String>(this, R.layout.listview_item, R.id.color_item, COLORS);
		
		ListView lv = (ListView) findViewById(R.id.list_of_colors);
		lv.setAdapter(adapter);
	}
}
