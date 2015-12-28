package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class ScheduleActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new ScheduleFragment();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
