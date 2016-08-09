package com.discoget.test.discogettest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MiniToolBar  m  = new MiniToolBar();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getMyPassword(View view) {
    }

    public void doLogin(View view) {

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
