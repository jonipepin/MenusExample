package edu.usna.cs.menus;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button contextButton = (Button) findViewById(R.id.button1);
		registerForContextMenu(contextButton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.options_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.menu_show:
			// do stuff here
			Toast.makeText(this, "Show Selected", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_forward:
			// do stuff here
			Toast.makeText(this, "Forward Selected", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_back:
			// do stuff here
			Toast.makeText(this, "Back Selected", Toast.LENGTH_SHORT).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item){
	    switch(item.getItemId()){
	        case R.id.add_url:
	        	Toast.makeText(this, "Add Selected", Toast.LENGTH_SHORT).show();
	            return true;
	        case R.id.delete_url:
	        	Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
	            return true;
	        default:
	            return super.onContextItemSelected(item);
	    }
	}

}
