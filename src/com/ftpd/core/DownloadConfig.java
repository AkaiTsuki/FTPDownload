package com.ftpd.core;

public class DownloadConfig {
	/**
	 * The directory that save the downloading file
	 */
	private String downloadDirectory;

	/**
	 * Number of task that can run at same time
	 */
	private int synTask;
	
	/**
	 *  The max size of download buffer 
	 */
	private int maxBufferSize;

	/**
	 * @return the maxBufferSize
	 */
	public int getMaxBufferSize() {
		return maxBufferSize;
	}

	/**
	 * @param maxBufferSize the maxBufferSize to set
	 */
	public void setMaxBufferSize(int maxBufferSize) {
		this.maxBufferSize = maxBufferSize;
	}

	/**
	 * @return the downloadDirectory
	 */
	public String getDownloadDirectory() {
		return downloadDirectory;
	}

	/**
	 * @param downloadDirectory
	 *            the downloadDirectory to set
	 */
	public void setDownloadDirectory(String downloadDirectory) {
		this.downloadDirectory = downloadDirectory;
	}

	/**
	 * @return the synTask
	 */
	public int getSynTask() {
		return synTask;
	}

	/**
	 * @param synTask
	 *            the synTask to set
	 */
	public void setSynTask(int synTask) {
		this.synTask = synTask;
	}
	
	public void validate() throws Exception{
		if(downloadDirectory==null)
			throw new Exception("Unable to find directory.");
		if(synTask<=0)
			throw new Exception("Can not create task. SynTask<=0");
	}

}
