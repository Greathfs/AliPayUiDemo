package com.example.hfs.alipayuidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PayActivity extends AppCompatActivity {

    private Button mButton;
    private ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pay);

        initView();
    }

    private void initView() {
        mButton= (Button) this.findViewById(R.id.btn_pay);
        mImageButton= (ImageButton) this.findViewById(R.id.ib_return);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PayDetailFragment payDetailFragment=new PayDetailFragment();
                payDetailFragment.show(getSupportFragmentManager(),"payDetailFragment");
            }
        });
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PayActivity.this,MainActivity.class));
                PayActivity.this.finish();
            }
        });
    }
}
