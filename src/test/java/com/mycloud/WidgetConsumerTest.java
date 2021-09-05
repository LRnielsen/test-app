package com.mycloud;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mycloud.Widget;
import com.mycloud.WidgetConsumer;

import org.junit.Test;

/**
 * Unit tests of {@link Widget} class
 */
public class WidgetConsumerTest {

	/**
	 * Test default enable state of {@link Widget}
	 */
	@Test
	public void defaultState() {
		WidgetConsumer widget = new WidgetConsumer();
		assertTrue(widget.isEnabled());
	}

	/**
	 * Test enabling and disabling a {@link Widget}
	 */
	@Test
	public void updateEnableState() {
		WidgetConsumer widget = new WidgetConsumer();
		widget.setEnabled(false);
		assertFalse(widget.isEnabled());
		widget.setEnabled(true);
		assertTrue(widget.isEnabled());
	}
}