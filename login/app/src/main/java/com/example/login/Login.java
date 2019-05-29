package com.example.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button zc = (Button) findViewById(R.id.login_1);
        zc.setOnClickListener(this);

    }
    public void thisButtonLogin(View view) {

        EditText editText = (EditText) findViewById(R.id.userEdit);
        String user = editText.getText().toString();
        editText = (EditText)findViewById(R.id.passwordEdit);
        String pw = editText.getText().toString();

        if (user == null || user.length() == 0) {
            AlertDialog.Builder usermessage= new AlertDialog.Builder(this);
            usermessage.setMessage("用户名不能为空！");
            usermessage.setPositiveButton("确定",click1);
            AlertDialog usermessage1=usermessage.create();
            usermessage1.show();
        }else if(pw == null || pw.length() == 0) {
            AlertDialog.Builder pwmessage = new AlertDialog.Builder(this);
            pwmessage.setMessage("密码不能为空！");
            pwmessage.setPositiveButton("确定", click1);
            AlertDialog pwmessage1 = pwmessage.create();
            pwmessage1.show();
        }else{
            AlertDialog.Builder winmessage = new AlertDialog.Builder(this);
            winmessage.setMessage("账号:"+user+"\n"+"密码:"+pw);
            winmessage.setPositiveButton("确定",click2);
            AlertDialog winmessage2 = winmessage.create();
            winmessage2.show();
        }
    }
    private DialogInterface.OnClickListener click1 = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
        }

    };
    private DialogInterface.OnClickListener click2 = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_1:
                Intent i = new Intent(Login.this, ZC.class);
                startActivity(i);
                break;

        }
    }


}
