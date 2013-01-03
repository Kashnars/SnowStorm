package com.gindinmonkey.snowstorm;

import android.os.Bundle;
import android.app.Activity;
import android.app.DialogFragment;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
        
    }
    
    public void startTakePicture(View view) {

    	DialogFragment dialog = new ChoosePictureSourceDialogFragment();
        dialog.show(getFragmentManager(), "ChooseTakePictureDialogFragment");
    	
    }
    
    public void startGallery(View view) {
        // Do something in response to button click
    }
    
}
