/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package com.nixabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * 	This object represents a sticker.

 *
 */
public class Sticker{
	/**
	 * Unique identifier for this file
	 */
	@JsonProperty("file_id")
	private String fileId;
	/**
	 * Sticker width
	 */
	@JsonProperty("width")
	private Integer width;
	/**
	 * Sticker height
	 */
	@JsonProperty("height")
	private Integer height;
	/**
	 * Sticker thumbnail in .webp or .jpg format
	 */
	@JsonProperty("thumb")
	private PhotoSize thumb;
	/**
	 * Optional. File size
	 */
	@JsonProperty("file_size")
	private Integer fileSize;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(final String fileId) {
		this.fileId = fileId;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(final Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(final Integer height) {
		this.height = height;
	}
	public PhotoSize getThumb() {
		return thumb;
	}
	public void setThumb(final PhotoSize thumb) {
		this.thumb = thumb;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(final Integer fileSize) {
		this.fileSize = fileSize;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result
				+ ((fileSize == null) ? 0 : fileSize.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((thumb == null) ? 0 : thumb.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sticker other = (Sticker) obj;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (fileSize == null) {
			if (other.fileSize != null)
				return false;
		} else if (!fileSize.equals(other.fileSize))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (thumb == null) {
			if (other.thumb != null)
				return false;
		} else if (!thumb.equals(other.thumb))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sticker [fileId=" + fileId + ", width=" + width + ", height="
				+ height + ", thumb=" + thumb + ", fileSize=" + fileSize + "]";
	}

}