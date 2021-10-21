package kr.sharenshare.mvpexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contract.View{
    EditText num1, num2;
    Button submit;
    private Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this); //presenter와 통신하기 위해서 객체 생성
        init();

    }

    private void init(){
        submit = (Button) findViewById(R.id.button_submit);
        num1 = (EditText) findViewById(R.id.num1_input);
        num2 = (EditText) findViewById(R.id.num2_input);

        submit.setOnClickListener(v -> presenter.addNum(Integer.parseInt(num1.getText().toString()),
                Integer.parseInt(num2.getText().toString())));
    }

    @Override
    public void showResult(int answer) {
        ((TextView)findViewById(R.id.result_output)).setText(Integer.toString(answer));
    }
}