package kr.co.tjoeun.a20200318_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200318_test.databinding.ActivityUserInfoBinding;

public class UserInfo extends AppCompatActivity {

    ActivityUserInfoBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_user_info);

        binding.userNameTxt.setText(getIntent().getStringExtra("inputUserName"));
        binding.userPhoneNumTxt.setText(getIntent().getStringExtra("inputUserPhoneNum"));
        binding.edtUserInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserInfo.this,UserInfoEdit.class);
                startActivity(intent); //새로운창은 열어
                finish(); //지금창은닫아
            }
        });

        binding.dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("tel:"+binding.userPhoneNumTxt.getText().toString());
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });


    }
}
