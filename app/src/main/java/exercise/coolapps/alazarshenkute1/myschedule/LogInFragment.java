package exercise.coolapps.alazarshenkute1.myschedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

public class LogInFragment extends Fragment implements View.OnClickListener {


    private Button mSignUpButton;
    private EditText mEmail;
    private EditText mPassword;
    private TextView signupLink;

    public interface Listener{
        public void onSignUpPageRequested();
    }
    Listener mListener = null;

    public void setListener( Listener l ){
        mListener = l;
    }

    @Override
    public void onCreate( Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                                    Bundle savedInstanceState )
    {
        View v = inflater.inflate( R.layout.fragment_login, container, false );

        mSignUpButton = (Button) v.findViewById( R.id.loginSubmitButton );
        mEmail = (EditText) v.findViewById( R.id.email );
        mPassword = (EditText) v.findViewById( R.id.password );
        signupLink = (TextView) v.findViewById( R.id.signupLink );
        signupLink.setOnClickListener( this );
        mSignUpButton.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick( View view )
    {
        if( view.getId() == R.id.loginSubmitButton ){

            if(
                    !mEmail.getText().toString().equals( R.id.email) &&
                    !mPassword.getText().toString().equals( R.id.password))
            {
                helpLogIn( mEmail.getText().toString(),
                           mPassword.getText().toString() );
            }

            Toast.makeText( getActivity(), "", Toast.LENGTH_LONG ).show();
        }else{
                mListener.onSignUpPageRequested();
        }
    }

    private void helpLogIn( final String email, final String password ) {
        ParseQuery<ParseUser> query = ParseUser.getQuery();
        query.findInBackground(new FindCallback<ParseUser>() {
            @Override
            public void done(List<ParseUser> objects, ParseException e) {
                if( e == null ){
                    // something went wrong
                }else
                {
                    if( objects == null ){
                        for( ParseUser user: objects ){
                            if( user.getEmail().equals( email ) &&
                                    user.get("password").equals( password ) ){
                                    Toast.makeText(getActivity(), "User found", Toast.LENGTH_LONG)
                                            .show();

                            }
                        }

                    }
                }
            }
        });


    }


}
