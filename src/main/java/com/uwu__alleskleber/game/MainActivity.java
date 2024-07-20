package com.uwu__alleskleber.game;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		TextView label = new TextView(this);
		label.setText("Hellow");
		setContentView(label);
	}
}