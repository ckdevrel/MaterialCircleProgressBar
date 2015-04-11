package com.takeoffandroid.material;


import android.app.Activity;
import android.os.Bundle;



public class MainActivity extends Activity {
    
	MaterialProgressBar progress1,progress2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress1 = (MaterialProgressBar) findViewById(R.id.progress1);
//        progress2 = (MaterialProgressBar) findViewById(R.id.progress2);


        progress1.setColorSchemeResources(R.color.orange,R.color.blue,R.color.green,R.color.red);

    }


}
