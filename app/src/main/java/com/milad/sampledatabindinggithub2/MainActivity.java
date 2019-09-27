package com.milad.sampledatabindinggithub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.milad.sampledatabindinggithub2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_main); <---Deleted this line

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        user.setUserId("1");
        user.setUserName("Milad");
        user.setUserLname("Targholi");
        user.setUserPhonee("09131958405");

        binding.setUser(user);
    }
}
