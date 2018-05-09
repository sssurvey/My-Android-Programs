package com.haomins.www.switcherswitch;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class LevelsAdapter extends RecyclerView.Adapter<LevelsViewHolder> {

	private List<Levels> levelsList;
	private MainActivity mainAct;

	public LevelsAdapter(List<Levels> levelsList, MainActivity ma) {
		this.levelsList = levelsList;
		mainAct = ma;
	}

	@NonNull
	@Override
	public LevelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.recycler_view_elements, parent, false);
		itemView.setOnClickListener(mainAct);
		itemView.setOnLongClickListener(mainAct);
		return new LevelsViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(@NonNull LevelsViewHolder holder, int position) {
		Levels levels = levelsList.get(position);
		holder.level_number.setText(Integer.toString(levels.getLevel_number()));
		holder.level_introduction.setText(levels.getLevel_introduction());
	}

	@Override
	public int getItemCount() {
		return levelsList.size();
	}
}
