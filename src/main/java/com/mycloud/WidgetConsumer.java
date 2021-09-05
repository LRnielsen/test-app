package com.mycloud;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class WidgetConsumer {

	private Widget widget;

	/**
	 * Create new enabled widget 2
	 */
	public WidgetConsumer() {
		widget = new Widget();
	}

	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return widget.isEnabled();
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public WidgetConsumer setEnabled(boolean enabled) {
		this.widget.setEnabled(enabled);
		return this;
	}
}