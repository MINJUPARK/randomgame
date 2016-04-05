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
        mButton.setOnClickListener(this);

    }
    // 화면이 보여질 때마다 실행된다.
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override // aanotation
    public void onClick(View v) {
        Toast.makeText(this, "hugry", Toast.LENGTH_LONG).show();

        // 안드로이드 기능 호출
        Intent intent = new Intent(this,ResultActivity.class);
        startActivity(intent);
    }
}
