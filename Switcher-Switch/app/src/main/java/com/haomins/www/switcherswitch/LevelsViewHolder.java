package com.haomins.www.switcherswitch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class LevelsViewHolder extends RecyclerView.ViewHolder {

	public TextView level_number;
	public TextView level_introduction;

	public LevelsViewHolder(View itemView) {
		super(itemView);
		level_number = itemView.findViewById(R.id.level_number_tv);
		level_introduction = itemView.findViewById(R.id.level_intro_tv);
	}
}
