package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.parse.ParseUser;

public class SignUpFragment extends Fragment  {

    private EditText mNameButton;
    private EditText mEmailButton;
    private EditText mPassword;
    private Button mSubmitButton;
    private ParseUser mUser;
    private CheckBox mSupervisor;
    @Override
    public void onCreate( Bundle savedInstanceState ){
        super.onCreate( savedInstanceState );
    }

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState )
    {
        View v = inflater.inflate( R.layout.fragment_signup, container, false );

        mNameButton = (EditText) v.findViewById( R.id.name);
        mEmailButton = (EditText) v.findViewById( R.id.email );
        mPassword = (EditText) v.findViewById( R.id.password );
        mSubmitButton = (Button) v.findViewById( R.id.submit_button );

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                createUser( mNameButton.getText().toString(),
                            mEmailButton.getText().toString(),
                            mPassword.getText().toString(),
                            mSupervisor.isChecked() );

            }
        });

        return v;
    }


    private void createUser( String name, String email, String password, Boolean supervisor )
    {

    }
    


}
