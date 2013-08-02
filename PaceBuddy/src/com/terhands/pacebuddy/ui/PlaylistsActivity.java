package com.terhands.pacebuddy.ui;

import com.example.pacebuddy.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class PlaylistsActivity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceBundle)
	{
		super.onCreate(savedInstanceBundle);
		setContentView(R.layout.activity_playlist);
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.playlists, menu);
        return true;
    }
	
}
