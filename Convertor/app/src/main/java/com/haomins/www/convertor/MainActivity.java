package com.haomins.www.convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.type_of_converstion_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_length:
				Toast.makeText(this, "Length", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_area:
				Toast.makeText(this, "Area", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_EE:
				Toast.makeText(this, "EE", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_weight:
				Toast.makeText(this,"Weight", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_temp:
				Toast.makeText(this,"Temp", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_quick:
				Toast.makeText(this,"Quick launch", Toast.LENGTH_SHORT).show();
				return true;
			default:
				return true;
		}
	}
}
