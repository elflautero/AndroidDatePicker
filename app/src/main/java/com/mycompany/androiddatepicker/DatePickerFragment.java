package com.mycompany.androiddatepicker;
import android.app.*;
import android.app.DialogFragment;
import android.os.*;
import java.util.*;

public class DatePickerFragment extends DialogFragment {
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		Calendar c  = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
				int day = c.get(Calendar.DAY_OF_MONTH);
		
		return new DatePickerDialog (
			getActivity(),
			(DatePickerDialog.OnDateSetListener) getActivity(),
				year,
					month,
						day
		);
	}
}
