package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddScheduleFragment extends Fragment {


    private Spinner mEmployeeListSpinner;
    private Button mDateButton;
    private Button mSubmitButton;
    @Override
    public void onCreate( Bundle savedInstanceState ){
        super.onCreate( savedInstanceState );
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState )
    {
        View v = inflater.inflate( R.layout.fragment_add_schedule, container, false );

        mEmployeeListSpinner = (Spinner) v.findViewById( R.id.employees_spinner );
        mDateButton = (Button) v.findViewById( R.id.employee_date );

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return v;
    }

    public void setmEmployeeListSpinner( String name ) {

        ArrayList<String> spinnerArray = new ArrayList<>();
        spinnerArray.add("Epmloyee 1");
        spinnerArray.add("Employee 2");

          }


}
