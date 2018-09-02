package com.arit.demo.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.vtMessage) TextView vtMessage;

//    private TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
//        final this.tvMessage = findViewById(R.id.vtMessage);
//
//    Button btnHello = (Button) findViewById(R.id.btnHello);
//        btnHello.setText("Hello Milan");
//
//        btnHello.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            tvMessage.setText("Show Test Message");
//        }
//    });
////}

//    public void doClickHello(View view) {
//        this.tvMessage.setText("Click Hello");
    }

    @OnClick(R.id.btnHello)
    public void doClickHello() {
        this.vtMessage.setText("Aniwat Message Krub");
    }

}
