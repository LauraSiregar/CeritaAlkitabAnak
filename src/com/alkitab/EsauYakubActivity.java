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




public class EsauYakubActivity extends Activity {

	private static final String isPlaying = "Media is Playing";
	
	private MediaPlayer player;
	private TextView Judul;
	private TextView Satu;
	private TextView Dua;
	private TextView Tiga;
	private TextView Empat;
	private TextView Lima;
	private TextView Enam;
	
	
public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.konten);
		
		Judul = (TextView) this.findViewById(R.id.judul);
	    Judul.setText(getString(R.string.EYJudul));
		
		ImageView Gambar = (ImageView) this.findViewById(R.id.gambar);
	    Gambar.setImageResource(R.drawable.esauyakub);
		
		// Get the button from the view
		Satu = (TextView) this.findViewById(R.id.satu);
		Satu.setText(getString(R.string.EYsatu));
		Satu.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(1);
			}
		});
		
		Dua = (TextView) this.findViewById(R.id.dua);
		Dua.setText(getString(R.string.EYdua));
		Dua.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(2);
			}
		});	
		
		Tiga = (TextView) this.findViewById(R.id.tiga);
		Tiga.setText(getString(R.string.EYtiga));
		Tiga.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(3);
			}
		});
		
		Empat = (TextView) this.findViewById(R.id.empat);
		Empat.setText(getString(R.string.EYempat));
		Empat.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(4);
			}
		});
		
		Lima = (TextView) this.findViewById(R.id.lima);
		Lima.setText(getString(R.string.EYlima));
		Lima.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(5);
			}
		});
		
		Enam = (TextView) this.findViewById(R.id.enam);
		Enam.setText(getString(R.string.EYenam));
		Enam.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(6);
			}
		});
		
		Button Video = (Button) this.findViewById(R.id.video);
	      Video.setOnClickListener(new OnClickListener() {

	      public void onClick(View view) {
	       Intent intent = new Intent(EsauYakubActivity.this, VidEsauYakubActivity.class);
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
		player = MediaPlayer.create(this, R.raw.eysatu);
	}else if (arg==2){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.eydua);
	}else if (arg==3){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.eytiga);
	}else if (arg==4){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.eyempat);
	}else if (arg==5){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.eylima);
	}else if (arg==6){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.eyenam);
	}
	player.setLooping(false); // Set looping
	player.start();
}
}