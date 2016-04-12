package kr.hs.emirim.minju0227.monchicken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override
    // 한번만 기술 해준다.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this); // onclick 메서드 자동 호출, 버튼 클릭 유무 검사 (이벤트 핸들러 클래스)

    }
    // 화면이 보여질 때마다 실행된다.
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override // aanotation
    public void onClick(View v) {

        // 클릭시 값 가져오기
        String name = mName.getText().toString();

//        if(name==null) {
//            // 클릭시 메세지 출력
//            Toast.makeText(this, "이름을 입력해주세요.", Toast.LENGTH_LONG).show();
//        }
//        else {
//            Toast.makeText(this, name + "씨, 배고파요ㅠㅠ", Toast.LENGTH_LONG).show();
//            // 안드로이드 기능 호출
//            Intent intent = new Intent(this,ResultActivity.class);
//            startActivity(intent);
//        }

        try {
            Toast.makeText(this, name + "씨, 배고파요ㅠㅠ", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ResultActivity.class);

            // name, age 를 넘어가게 함
            intent.putExtra("name",name);
            intent.putExtra("age",18);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left); // 들어올 때, 나갈 때
        } catch (NullPointerException e) {
            // name에 이름이 없을 경우(예외) '널 포인트 인셉션'이 발생하게 된다.
            Toast.makeText(this, "씨, 배고파요ㅠㅠ", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "뭔지 모르지만 잘 안되네요..", Toast.LENGTH_LONG).show();
        }
    }
}