package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}


	public void testNumbers()
	{
		assertEquals("5 should be 5", 5, 5);
	}

}
