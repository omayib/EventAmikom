package id.ac.amikom.event.eventamikom.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.amikom.event.eventamikom.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    //1. lets declare all view component that created on activity_login.xml
    private EditText emailEditText, pwdEditText;
    private Button loginButton;

    //creating fake user credential
    private String emailFake = "user@amikom.ac.id";
    private String pwdFake = "qqqqqqqq";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //2. by using setContentView, its tell us that this activity has paired with activity_login.xml
        setContentView(R.layout.activity_login);

        //3. pairing the view component
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        pwdEditText = (EditText) findViewById(R.id.pwdEditText);
        loginButton = (Button) findViewById(R.id.loginButton);

        //4. in order the button work when we click it, we must activate it by using setOnClickListener.
        //'this' parameter that we passed is enabling this activity to receive button response.
        //this class have to implement an interface : View.OnClickListener
        loginButton.setOnClickListener(this);
    }

    //the method below is come from View.OnClickListener implementation
    @Override
    public void onClick(View view) {
        //put any logic here to handle what happen if user is click the login button

        //5. getting email and password text
        String email = emailEditText.getText().toString();
        String pwd = pwdEditText.getText().toString();

        //what happen if user click login button but he didn't type an email?
        if(email.isEmpty()){
            Toast.makeText(this,"email is required",Toast.LENGTH_SHORT).show();
            return;
        }

        //what happen if user click login button but he didn't type a password?
        if(pwd.isEmpty()){
            Toast.makeText(this,"password is required",Toast.LENGTH_SHORT).show();
            return;
        }

        //now lets begin to validate the user.
        if(email.equalsIgnoreCase(emailFake) && pwd.equalsIgnoreCase(pwdFake)){
            //both credential are accepted. the apps should move to the next page
            Toast.makeText(this,"login succeed",Toast.LENGTH_SHORT).show();



        }else{
            Toast.makeText(this,"email or password is not match",Toast.LENGTH_SHORT).show();
            return;
        }

    }
}
