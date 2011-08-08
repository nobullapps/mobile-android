/**
 * The Main screen of OpenPhoto
 */
package me.openphoto.android.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * The Main screen of OpenPhoto
 * 
 * @author pas
 */
public class Main extends Activity {
	/**
	 * Called when Main Activity is first loaded
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}