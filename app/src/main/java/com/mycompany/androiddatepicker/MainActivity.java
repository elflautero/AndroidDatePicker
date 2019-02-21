package com.mycompany.androiddatepicker;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import java.util.*;

import java.text.*;
import android.widget.CalendarView.*;
import org.apache.http.impl.cookie.*;

import android.app.FragmentTransaction;

public class MainActivity 
	extends Activity 
	implements DatePickerDialog.OnDateSetListener {
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Button button = (Button) findViewById(R.id.mainButtonDatePublication);

		button.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
				DialogFragment datePicker = new DatePickerFragment();
				
				datePicker.show(
					getSupportFragmentManager (),
					"datePicker");
				
				//.show(getSupportFragmentManager(), "date picker");
				
			}		
		});
		
	}

	@Override
	public void onDateSet 
		(DatePicker view, int year, int month, int dayOfMonth) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

		String currentDateString = DateFormat.getInstance().format(c.getTime());
									//colocar DateFormat.FULL
		TextView textView = (TextView) findViewById(R.id.mainTextViewDatePublication);

		textView.setText(currentDateString);
		
	}
	// fim mainActivity
	
	
	
}// fim classe
