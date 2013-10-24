package com.example.wordsearch;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private CrystalBall mCrystalBall = new CrystalBall();
	private TextView mAnswerLabel;
	private Button getNewGameButton;
	private Button getLoadButton;
	private Button getAboutButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Declare our review variables

		mAnswerLabel = (TextView) findViewById(R.id.textView1);
		getNewGameButton = (Button) findViewById(R.id.button1);
		getLoadButton = (Button) findViewById(R.id.button2);
		getAboutButton = (Button) findViewById(R.id.button3);

		getNewGameButton.setOnClickListener(new View.OnClickListener() {

			
			public void onClick(View arg0) {

				Intent myIntent = new Intent();
				myIntent.setClassName(this, )
				startActivity(myIntent);
				
				
				
				String answer = mCrystalBall.getAnAnswer();

				mAnswerLabel.setText(answer);
				animateCrystalBall();

				animateMenu();
			}
		});

	}
	

	private void animateMenu() {
		
		//Set alpha animation for label
		AlphaAnimation fadeinAnimation = new AlphaAnimation(1, 0);

		fadeinAnimation.setDuration(1500);
		
		mAnswerLabel.setAnimation(fadeinAnimation);
		
		//Set alpha animation for new game button
		AlphaAnimation newGameButtonAnimation = new AlphaAnimation(1, 0);

		newGameButtonAnimation.setDuration(1500);

		newGameButtonAnimation.setFillEnabled(true);
		newGameButtonAnimation.setFillAfter(true);
		getNewGameButton.setAnimation(newGameButtonAnimation);
		
		
		//Set Alpha Animation for load button 
		AlphaAnimation loadAnimation = new AlphaAnimation(1, 0);
		
		
		loadAnimation.setDuration(1500);
		loadAnimation.setFillBefore(true);
		loadAnimation.setFillAfter(true);

		getLoadButton.setAnimation(loadAnimation);
		
		//Set alpha animation for about button
		AlphaAnimation aboutAnimation = new AlphaAnimation(1, 0);

		aboutAnimation.setDuration(1500);
		aboutAnimation.setFillBefore(true);
		aboutAnimation.setFillAfter(true);
		
		getAboutButton.setAnimation(aboutAnimation);

	}

	private void animateCrystalBall() {
		
		ImageView BrainAnimationImage = (ImageView) findViewById(R.id.imageView1);
		
		BrainAnimationImage.setImageResource(R.drawable.ball_animation);
		
		AnimationDrawable mindAnimation = (AnimationDrawable) BrainAnimationImage
				.getDrawable();
		mindAnimation.start();
		
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
