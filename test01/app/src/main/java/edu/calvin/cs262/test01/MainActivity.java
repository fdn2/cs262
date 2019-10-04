package edu.calvin.cs262.test01;

import com.snapchat.kit.sdk.SnapLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup mViewRoot = findViewById(R.id.root_view);
        View mLoginButton = SnapLogin.getButton(this, (ViewGroup)mViewRoot);
    }


}
