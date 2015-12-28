package exercise.coolapps.alazarshenkute1.myschedule;

// controller class that interacts with model and view objects
// job is to present the details of a schedule

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScheduleFragment extends Fragment {

    private Schedule schedule;

    // configure the fragment instance in onCreate
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        schedule = new Schedule();
    }

    // inflate and return the fragment
    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState )
    {

        View v = inflater.inflate(R.layout.fragment_schedule, container
                , false); // false means don't add the inflated view to the views parent
        return v;
    }



}
