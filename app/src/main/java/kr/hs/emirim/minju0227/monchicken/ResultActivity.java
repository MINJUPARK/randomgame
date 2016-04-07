package kr.hs.emirim.minju0227.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by appcreate11 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    // 정적 변수, 액티비티마다 만들어 주어야 하며 구분을 하기 위해 앱이름을 적는다.
    static String TAG = "먼치킨 : ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView) findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView); // xml 에 있는 이미지를 연결하고자 하는 경우
        Log.d(TAG,"텍스트뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(3);
        Log.d(TAG,"랜덤값 생성 : "+result);
        String name ="박민주";

        /* if
        if(result==0) {
            mImageView.setImageResource(R.drawable.s02);
        } else if (result==1) {
            mImageView.setImageResource(R.drawable.s03);
        } else if (result==2) {
            mImageView.setImageResource(R.drawable.s04);
        }*/

        mImageView.setImageResource(R.drawable.s02+result);

        // MainActivity 의 name, age 를 불러옴
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기 <name> : "+result);

        int age = intent.getIntExtra("age",-1);
        Log.d(TAG,"인텐트값 읽기 <age> : "+result);

        mResult.setText(name + "님, 안녕하세요!");
    }
}