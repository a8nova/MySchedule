package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

public class ScheduleActivity extends SingleFragmentActivity
                              implements LogInFragment.Listener {

    private final String SUPER_VISOR = "super_visor";
    private LogInFragment mLogInFragment;

    /**    implementation for interface defined in SignUpFragment  **/
    @Override
    public void onSignUpPageRequested(){
        switchToFragment( new SignUpFragment() );
    }

    /** implementation for abstract class **/
    @Override
    protected Fragment createFragment(){
        Log.d("ScheudleActivity", "I am in createFragment()");
        return new ScheduleFragment();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ScheduleActivity", "I am in onCreate()");

      //   ParseUser currentUser = ParseUser.getCurrentUser();
       // if( currentUser == null )
            // send them to Login page
            mLogInFragment = new LogInFragment();
            mLogInFragment.setListener( this );
            switchToFragment( mLogInFragment );

        /*else
        {
            // if user is a supervisor
            if(  ( (Boolean) currentUser.get( SUPER_VISOR) ) == true ){
                switchToFragment( new AddScheduleFragment() );
            }else{
                switchToFragment( new ScheduleFragment() );
            }
        }*/



    }

    // Switch UI to the given fragment
    public void switchToFragment(Fragment newFrag) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, newFrag)  // switch the fragment
                .addToBackStack( null ) // so user can navigate back
                .commit();  // make the changes
    }


}
