package com.rs.sampleadmob;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private AdView mAdview;
	public static final String ADID = "a152d4e0b07cbc0";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initAdView();
		
	}
	
	private void initAdView( ) {
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		mAdview = new AdView(this);
		mAdview.setAdUnitId(ADID);
		mAdview.setAdSize(AdSize.BANNER);
		
		layout.addView(mAdview);

	    // Initiate a generic request.
	    AdRequest adRequest = new AdRequest.Builder().build();

	    // Load the adView with the ad request.
	    mAdview.loadAd(adRequest);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mAdview.pause();
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mAdview.destroy();
	}

}
