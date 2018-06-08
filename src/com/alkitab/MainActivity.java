package com.alkitab;

import android.app.Activity;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity {
	
	private ImageView Satu;
	private ImageView Dua;
	private ImageView Tiga;
	private ImageView Empat;
	private ImageView Lima;
	private ImageView Enam;
	private ImageView Tujuh;
	private ImageView Delapan;
	private ImageView Sembilan;
	private ImageView Sepuluh;
	private ImageView exit;
	
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        /*done*/
        Satu = (ImageView) this.findViewById(R.id.satu);
        Satu.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, DanielActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Dua = (ImageView) this.findViewById(R.id.dua);
        Dua.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, EsauYakubActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Tiga = (ImageView) this.findViewById(R.id.tiga);
        Tiga.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, KainHabelActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Empat = (ImageView) this.findViewById(R.id.empat);
        Empat.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, MusaActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Lima = (ImageView) this.findViewById(R.id.lima);
        Lima.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, PenciptaanActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Enam = (ImageView) this.findViewById(R.id.enam);
        Enam.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, PerintahActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Tujuh = (ImageView) this.findViewById(R.id.tujuh);
        Tujuh.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, YerikhoActivity.class);
          startActivity(intent);
        }

        });
        
        Delapan = (ImageView) this.findViewById(R.id.delapan);
        Delapan.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, SalibActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Sembilan = (ImageView) this.findViewById(R.id.sembilan);
        Sembilan.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, YunusActivity.class);
          startActivity(intent);
        }

        });
        
        /*done*/
        Sepuluh = (ImageView) this.findViewById(R.id.sepuluh);
        Sepuluh.setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this, ZakheusActivity.class);
          startActivity(intent);
        }

        });
        
		exit = (ImageView)findViewById(R.id.exit);
		exit.setOnClickListener(new View.OnClickListener() {
    	
			public void onClick(View v) {
	            AlertDialog.Builder alertKeluar = new AlertDialog.Builder(MainActivity.this);
	            alertKeluar.setMessage("Are you sure ?")
	            //Button jika cancel
	            .setCancelable(false)
	            //Button jika ya
	            .setPositiveButton("Yes", new AlertDialog.OnClickListener(){

	            	public void onClick(DialogInterface arg0, int arg1) {
	            		finish();
	               }
	               
	            })
	            .setNegativeButton("No",new AlertDialog.OnClickListener(){

	            	 public void onClick(DialogInterface dialog, int which) {
	            		 // TODO Auto-generated method stub
	                  dialog.cancel();
	                  
	               }
	               
	            });
	            AlertDialog a = alertKeluar.create();
	            a.setTitle("Warning");
	            a.setIcon(R.drawable.warning);
	            a.show();
	         }
	      });
	   }
	}