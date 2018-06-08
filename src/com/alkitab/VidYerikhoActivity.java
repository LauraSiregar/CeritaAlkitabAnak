package com.alkitab;

import java.io.File;
import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Environment;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

public class VidYerikhoActivity extends Activity {

   private VideoView myvideo;
   private MediaController mediacontroller;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		getWindow().setFormat(PixelFormat.TRANSLUCENT);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.video);
		//akan membaca file samplevideo.3gp yang ada pada SDCARD (external memrory)
		File clip=new File(Environment.getExternalStorageDirectory(),"Cerita alkitab Yerikho.mp4");

		//Jika file samplevideo.3gp  ditemukan maka video dapat dimainkan
		if (clip.exists()) {
			myvideo=(VideoView)findViewById(R.id.video);
			myvideo.setVideoPath(clip.getAbsolutePath());
			mediacontroller=new MediaController(this);
			mediacontroller.setMediaPlayer(myvideo);
			myvideo.setMediaController(mediacontroller);
			myvideo.requestFocus();
			myvideo.start();
		}
	}
}