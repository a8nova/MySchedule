package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUpFragment extends Fragment  {

    private EditText mName;
    private EditText mEmail;
    private EditText mPassword;
    private Button mSubmitButton;
    private ParseUser mUser;
    private CheckBox mSupervisor;
    private final  String SUPER_VISOR = "supervisor";
    private final String TAG = "SignUpFragment";

    @Override
    public void onCreate( Bundle savedInstanceState ){
        super.onCreate( savedInstanceState );
    }

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState )
    {
        View v = inflater.inflate( R.layout.fragment_signup, container, false );

        mName = (EditText) v.findViewById( R.id.name);
        mEmail = (EditText) v.findViewById( R.id.email );
        mPassword = (EditText) v.findViewById( R.id.password );
        mSubmitButton = (Button) v.findViewById( R.id.submit_button );
        mSupervisor = (CheckBox) v.findViewById( R.id.supervisor );

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( mName.getText().toString() != null &&
                        mEmail.getText().toString()!= null &&
                        mPassword.getText().toString()!= null &&
                        !mName.getText().toString().equals("name") &&
                        !mEmail.getText().toString().equals( "email") ) {


                    createUser(mName.getText().toString(),
                            mEmail.getText().toString(),
                            mPassword.getText().toString(),
                            mSupervisor.isChecked());
                }else
                {
                    Toast.makeText(getActivity(), "Invalid data", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }


    private void createUser( String userName, String email, String password, Boolean supervisor )
    {
        mUser = new ParseUser();
        mUser.setUsername( userName );
        mUser.setEmail(email);
        mUser.setPassword(password);
        mUser.put(SUPER_VISOR, supervisor);

        mUser.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if( e == null ){
                    Log.d(TAG, "user successfully logged in.");
                    // start the responsible fragment

                }else
                {
                    e.printStackTrace();
                }
            }
        });


    }
    


}
