package kr.co.tjoeun.a20200318_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200318_test.databinding.ActivityUserInfoEditBinding;

public class UserInfoEdit extends AppCompatActivity {

    ActivityUserInfoEditBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info_edit);

        binding.finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserInfoEdit.this,UserInfo.class);
                intent.putExtra("inputUserName",binding.inputUserName.getText().toString());
                intent.putExtra("inputUserPhoneNum",binding.inputUserPhoneNum.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}
