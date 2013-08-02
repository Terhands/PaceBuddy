package com.terhands.pacebuddy.ui;

import com.example.pacebuddy.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class HomeActivity extends Activity implements OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        initListeners();
    }

    private void initListeners()
    {
    	findViewById(R.id.mPlaylistBtn).setOnClickListener(this);
    	findViewById(R.id.mPaceBtn).setOnClickListener(this);
    	findViewById(R.id.mStartBtn).setOnClickListener(this);
    	findViewById(R.id.mExitBtn).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

	@Override
	public void onClick(View v) 
	{
		if(v.getId() == R.id.mPlaylistBtn)
		{
			startActivityForResult(new Intent(this, PlaylistsActivity.class), 1);
		}
		else if(v.getId() == R.id.mPaceBtn)
		{
			
		}
		else if(v.getId() == R.id.mStartBtn)
		{
			
		}
		else if(v.getId() == R.id.mExitBtn)
		{
			finish();
		}
	}
    
}
