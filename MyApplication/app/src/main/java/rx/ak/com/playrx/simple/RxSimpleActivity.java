package rx.ak.com.playrx.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.ak.com.playrx.R;
import rx.functions.Action1;

public class RxSimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_simple);
        String[] names = new String[]{"one", "two", "three"};
        Observable.just("one","two","three").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.e(TAG,s);
            }
        });
    }
}
