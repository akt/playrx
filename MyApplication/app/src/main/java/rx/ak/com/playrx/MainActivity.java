package rx.ak.com.playrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.ak.com.playrx.simple.RxSimpleActivity;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =  "playrx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.simple)
    void navigate2Simple(){
        startActivity(new Intent(this, RxSimpleActivity.class));
    }

}