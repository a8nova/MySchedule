package exercise.coolapps.alazarshenkute1.myschedule;

import android.support.v4.app.Fragment;

public class ScheduleActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new ScheduleFragment();
    }

}
