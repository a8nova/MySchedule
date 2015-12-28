package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

//
//
public abstract class SingleFragmentActivity extends AppCompatActivity {

    // subclasses will implement this abstract method and return a fragment
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        // using the support library so call getSupport..()
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById( R.id.fragment_container );

        /******

         A container view ID serves:
         -  used as a unique identifier for a fragment
         in the Fragment's list
         - tells FragmentManager where in the activity's view
         the fragment's view should appear

         ******/
        if( fragment == null )
        {
            fragment = new ScheduleFragment();
            // create a fragment transaction, include one add operation
            // and then commit it
            fm.beginTransaction().add( R.id.fragment_container, fragment )
                    .commit();
        }


    }

}
