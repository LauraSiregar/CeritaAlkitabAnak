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




public class MusaActivity extends Activity {

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
	    Judul.setText(getString(R.string.MJudul));
		
		ImageView Gambar = (ImageView) this.findViewById(R.id.gambar);
	    Gambar.setImageResource(R.drawable.musa);
		
		// Get the button from the view
		Satu = (TextView) this.findViewById(R.id.satu);
		Satu.setText(getString(R.string.Msatu));
		Satu.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(1);
			}
		});
		
		Dua = (TextView) this.findViewById(R.id.dua);
		Dua.setText(getString(R.string.Mdua));
		Dua.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(2);
			}
		});	
		
		Tiga = (TextView) this.findViewById(R.id.tiga);
		Tiga.setText(getString(R.string.Mtiga));
		Tiga.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(3);
			}
		});
		
		Empat = (TextView) this.findViewById(R.id.empat);
		Empat.setText(getString(R.string.Mempat));
		Empat.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(4);
			}
		});
		
		Lima = (TextView) this.findViewById(R.id.lima);
		Lima.setText(getString(R.string.Mlima));
		Lima.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(5);
			}
		});
		
		Enam = (TextView) this.findViewById(R.id.enam);
		Enam.setText(getString(R.string.Menam));
		Enam.setOnClickListener(new OnClickListener() {
			//override
			public void onClick(View arg0) {
				playSound(6);
			}
		});
		
		Button Video = (Button) this.findViewById(R.id.video);
	      Video.setOnClickListener(new OnClickListener() {

	      public void onClick(View view) {
	       Intent intent = new Intent(MusaActivity.this, VidMusaActivity.class);
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
		player = MediaPlayer.create(this, R.raw.msatu);
	}else if (arg==2){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.mdua);
	}else if (arg==3){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.mtiga);
	}else if (arg==4){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.mempat);
	}else if (arg==5){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.mlima);
	}else if (arg==6){
		Toast.makeText(this, isPlaying, Toast.LENGTH_LONG).show();
		player = MediaPlayer.create(this, R.raw.menam);
	}
	player.setLooping(false); // Set looping
	player.start();
}
}