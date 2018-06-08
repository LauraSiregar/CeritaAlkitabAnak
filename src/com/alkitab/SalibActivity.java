package com.alkitab;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




public class SalibActivity extends Activity {

	private static final String isPlaying = "Media is Playing";
	
	private MediaPlayer player;
	private TextView Judul;
	private TextView Satu;
	private TextView Dua;
	private TextView Tiga;
	private TextView Empat;
	private TextView Lima;
	
	
public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.konten);
		
		Judul = (TextView) this.findViewById(R.id.judul);
	    Judul.setText(getString(R.string.Sjudul));
		
		ImageView Gambar = (ImageView) this.findViewById(R.id.gambar);
	    Gambar.setImageResource(R.drawable.yesusdisalib);
		
		// Get the button from the view
		Satu = (TextView) this.findViewById(R.id.satu);
		Satu.setText(getString(R.string.Ssatu));
		Satu.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(1);
			}
		});
		
		Dua = (TextView) this.findViewById(R.id.dua);
		Dua.setText(getString(R.string.Sdua));
		Dua.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(2);
			}
		});	
		
		Tiga = (TextView) this.findViewById(R.id.tiga);
		Tiga.setText(getString(R.string.Stiga));
		Tiga.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(3);
			}
		});
		
		Empat = (TextView) this.findViewById(R.id.empat);
		Empat.setText(getString(R.string.Sempat));
		Empat.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(4);
			}
		});
		
		Lima = (TextView) this.findViewById(R.id.lima);
		Lima.setText(getString(R.string.Slima));
		Lima.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(5);
			}
		});
		
		Button Video = (Button) this.findViewById(R.id.video);
	      Video.setOnClickListener(new OnClickListener() {

	      public void onClick(View view) {
	       Intent intent = new Intent(SalibActivity.this, VidSalibActivity.class);
	        startActivity(intent);
	      }

	      });
}

public void onPause() {
	try{
		super.onPause();
		player.pause();
	}catch (Exception e){
	}
}

private void playSound(int arg){
	try{
		if (player.isPlaying()) {
			player.stop();
			player.release();
		}
	}catch(Exception e){
		Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
	}
	if (arg == 1){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.ssatu);
	}else if (arg==2){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.sdua);
	}else if (arg==3){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.stiga);
	}else if (arg==4){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.sempat);
	}else if (arg==5){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.slima);
	}
	player.setLooping(false); // Set looping
	player.start();
}
}