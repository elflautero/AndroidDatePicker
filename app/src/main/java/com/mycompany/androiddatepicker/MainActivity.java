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

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import android.app.FragmentTransaction;

public class MainActivity 
	extends Activity 
	implements DatePickerDialog.OnDateSetListener {
	
	/* 	somente para testes, criei o button como variavel global e chamei ele
			dentro do metodo on create 
	*/
	Button button;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		button = (Button) findViewById(R.id.mainButtonDatePublication);

		button.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {

					DialogFragment datePicker = new DatePickerFragment();
					datePicker.show(getFragmentManager(),"datePicker");
					// mudei o getSupporFragmentManager para getFragmentManager
				}		
			});
		
		
	}// fim mainActivity

	@Override
	public void onDateSet (DatePicker view, int year, int month, int dayOfMonth) {
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

		String currentDateString = DateFormat.getInstance().format(c.getTime());
									//colocar DateFormat.FULL
		TextView textView = (TextView) findViewById(R.id.mainTextViewDatePublication);

		textView.setText(currentDateString);
		
	}
	
	
}// fim classe
