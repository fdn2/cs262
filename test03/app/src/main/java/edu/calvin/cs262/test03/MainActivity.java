package edu.calvin.cs262.test03;

import com.snapchat.kit.sdk.SnapLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    View yourView = findViewById(R.id.snapchat_button);
    yourView.setOnClickListener(newOnClickListener() {
        @Override
        public void onClick (View v){
            SnapLogin.getAuthTokenManager(v.getContext()).startTokenGrant();
        }
    });


}
