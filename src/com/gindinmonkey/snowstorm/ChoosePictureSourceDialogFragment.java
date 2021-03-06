package com.gindinmonkey.snowstorm;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class ChoosePictureSourceDialogFragment extends DialogFragment {
	
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    	
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder	.setTitle(R.string.pick_picture)
		        .setItems(R.array.picture_sources_array, new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog, int which) {
		            // The 'which' argument contains the index position
		            // of the selected item
		            }
		        });
        // Create the AlertDialog object and return it
        return builder.create();
        
    }
    
}
