package com.ftpd.core;

public abstract class Configurable {
	
	protected DownloadConfig config;

	protected Configurable(DownloadConfig config) {
		super();
		this.config = config;
	}

	public DownloadConfig getConfig() {
		return config;
	}
}
