package com.discoget.test.discogettest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by JoMar on 8/7/2016.
 */
public class AddAccount extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set layout
        setContentView(R.layout.add_an_account);

        // get calling intent and data
        Intent callingActivity = getIntent();

        // get data that was passed
        String userNamePassed = callingActivity.getExtras().getString("userName");
        String userPasswordPassed = callingActivity.getExtras().getString("userPassword");

        TextView userNameField = (TextView) findViewById(R.id.etxt_account_username);
        TextView userPasswordField = (TextView) findViewById(R.id.etxt_account_password);

        TextView firstField = (TextView) findViewById(R.id.etxt_account_full_name);
        firstField.requestFocus();


        userNameField.setText(userNamePassed);
        userPasswordField.setText(userPasswordPassed);

    }

    public void cancelThisScreen(View view) {

        //Claso this screen
        finish();

    }

    public void goProfile(View view) {

        final int result = 1;

        // need to get text values...
        //TextView txtUserName = (TextView) findViewById(R.id.etxt_username);
        //TextView txtPassword = (TextView) findViewById(R.id.etxt_password);

        // We have to state that are intention is to open another Activity. We do so
        // by passing a Context and the Activity that we want to open

        Intent getProfileScreenIntent = new Intent(this, UserProfile.class);

        //Bundle extras = new Bundle();
        //extras.putString("userName",txtUserName.getText().toString());
        //extras.putString("userPassword",txtPassword.getText().toString());

        //getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        //getAddAccountScreenIntent.putExtra("callingActivity", "MainActivity");

        //getAddAccountScreenIntent.putExtras(extras);
        // startActivity(getAddAccountScreenIntent);

        // To send data use putExtra with a String name followed by its value

        startActivity(getProfileScreenIntent);
        // startActivityForResult(getNameScreenIntent, result);

    }

    public void goAddAccount(View view) {

        final int result = 1;

        // need to get text values...
        TextView txtUserName = (TextView) findViewById(R.id.etxt_username);
        TextView txtPassword = (TextView) findViewById(R.id.etxt_password);

        // We have to state that are intention is to open another Activity. We do so
        // by passing a Context and the Activity that we want to open

        Intent getAddAccountScreenIntent = new Intent(this, AddAccount.class);

        Bundle extras = new Bundle();
        extras.putString("userName",txtUserName.getText().toString());
        extras.putString("userPassword",txtPassword.getText().toString());

        //getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        //getAddAccountScreenIntent.putExtra("callingActivity", "MainActivity");

        getAddAccountScreenIntent.putExtras(extras);
        // startActivity(getAddAccountScreenIntent);

        // To send data use putExtra with a String name followed by its value

        startActivity(getAddAccountScreenIntent);
        // startActivityForResult(getNameScreenIntent, result);

    }
}
