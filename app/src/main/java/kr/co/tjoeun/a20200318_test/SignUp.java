package kr.co.tjoeun.a20200318_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200318_test.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {

    ActivitySignUpBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up);

        binding.signUpOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUp.this,UserInfo.class);
                intent.putExtra("inputUserName",binding.inputNewName.getText().toString());
                intent.putExtra("inputUserPhoneNum",binding.inputNewPhoneNum.getText().toString());
                startActivity(intent);
            }
        });

    }
}
