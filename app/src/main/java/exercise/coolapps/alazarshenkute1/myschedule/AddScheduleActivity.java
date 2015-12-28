package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class AddScheduleActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new AddScheduleFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

    }
}

