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
}
