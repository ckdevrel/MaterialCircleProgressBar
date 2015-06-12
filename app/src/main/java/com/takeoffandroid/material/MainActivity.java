package com.takeoffandroid.material;


import android.app.Activity;
import android.os.Bundle;



public class MainActivity extends Activity {
    

    private CustomProgressDialog mCustomProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            mCustomProgressDialog = new CustomProgressDialog(this);
            mCustomProgressDialog.show("");

        //Note:To stop progressdialog use mCustomProgressDialog.dismiss("");


    }


}
