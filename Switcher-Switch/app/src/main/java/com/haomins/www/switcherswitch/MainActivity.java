package com.haomins.www.switcherswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{
	private RecyclerView gameLevels;
	private RecyclerView.Adapter gameRecyclerViewAdapter;
	private RecyclerView.LayoutManager gameRecyclerViewLayoutManager;
	private List<Levels> levelsList = new ArrayList<>();
	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//reyclerview
		gameLevels = (RecyclerView) findViewById(R.id.game_levels);
		gameRecyclerViewAdapter = new LevelsAdapter(levelsList,this);
		gameLevels.setAdapter(gameRecyclerViewAdapter);

		gameRecyclerViewLayoutManager = new LinearLayoutManager(this);
		gameLevels.setLayoutManager(gameRecyclerViewLayoutManager);


		//test - add value
		levelsList.add(new Levels(1,"This level has ONE switch, which means 1C1, there is only ONE combination."));
		levelsList.add(new Levels(2,"This level has ONE switch, which means 2C1, there is only ONE combination."));
		levelsList.add(new Levels(3,"This level has ONE switch, which means 3C1, there is only ONE combination."));
		levelsList.add(new Levels(4,"This level has ONE switch, which means 4C1, there is only ONE combination."));
		levelsList.add(new Levels(5,"This level has ONE switch, which means 5C1, there is only ONE combination."));
		levelsList.add(new Levels(6,"This level has ONE switch, which means 6C1, there is only ONE combination."));
		levelsList.add(new Levels(7,"This level has ONE switch, which means 7C1, there is only ONE combination."));
		levelsList.add(new Levels(8,"This level has ONE switch, which means 8C1, there is only ONE combination."));
		levelsList.add(new Levels(9,"This level has ONE switch, which means 9C1, there is only ONE combination."));
		levelsList.add(new Levels(10,"This level has ONE switch, which means 10C1, there is only ONE combination."));
		levelsList.add(new Levels(11,"This level has ONE switch, which means 11C1, there is only ONE combination."));
		levelsList.add(new Levels(12,"This level has ONE switch, which means 12C1, there is only ONE combination."));

	}


	@Override
	public void onClick(View v) {  // click listener called by ViewHolder clicks
		Toast.makeText(v.getContext(), "SHORT clicked", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onLongClick(View v) {
		Toast.makeText(v.getContext(), "LONG clicked", Toast.LENGTH_LONG).show();
		return false;
	}
}
