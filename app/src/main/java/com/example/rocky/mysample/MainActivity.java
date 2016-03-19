package com.example.rocky.mysample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ButterKnife.bind(MainActivity.this);

    }
    public void btn_gson(View view){
       // testGson();
        gsonToObj();
    }

    private void testGson(){

        Person person = new Person();
        person.setName("XXX");
        person.setAge(20);
        Gson gson = new Gson();
        String str = gson.toJson(person);
        Log.d("MySample","person json:"+str);
    }
    private void gsonToObj(){
        Gson gson = new Gson();
        String str ="{\"age\":20,\"name\":\"XXX\"}";
        Person person = gson.fromJson(str,Person.class);
        Log.d("MySample","name:"+person.getName()+"-age:"+person.getAge());
    }
    /*
    public void btn_butter(View view){
        
    }*/
    @OnClick(R.id.btn_butter)
    public void btn_butter(View view){
        Intent intent = new Intent(MainActivity.this,ButterActivity.class);
        startActivity(intent);
        //Toast.makeText(Ma)
    }
    @OnClick(R.id.btn_sugar)
    public void btn_suger(View view){
        Intent intent = new Intent(MainActivity.this,SugarActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_swipe)
    public  void btn_swipe(View view){
        Intent intent = new Intent(MainActivity.this,SwipeActivity.class);
        startActivity(intent);
    }
}
