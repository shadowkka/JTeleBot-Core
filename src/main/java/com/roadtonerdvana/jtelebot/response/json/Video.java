package com.roadtonerdvana.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * This object represents a video file.
 *
 */
public class Video {
	/**
	 * Unique identifier for this file
	 */
	@JsonProperty("file_id")
	private String fileId;
	/**
	 * Video width as defined by sender
	 */
	@JsonProperty("width")
	private Integer width;
	/**
	 * Video height as defined by sender
	 */
	@JsonProperty("height")
	private Integer height;
	/**
	 * Duration of the video in seconds as defined by sender
	 */
	@JsonProperty("duration")
	private Integer duration;
	/**
	 * Video thumbnail
	 */
	@JsonProperty("thumb")
	private PhotoSize thumb;
	/**
	 * Optional. Mime type of a file as defined by sender
	 */
	@JsonProperty("mime_type")
	private String mimeType;
	/**
	 * Optional. File size
	 */
	@JsonProperty("file_size")
	private Integer fileSize;
	/**
	 * Optional. Text description of the video (usually empty)
	 */
	@JsonProperty("caption")
	private String caption;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(final Integer duration) {
		this.duration = duration;
	}
	public PhotoSize getThumb() {
		return thumb;
	}
	public void setThumb(final PhotoSize thumbnail) {
		this.thumb = thumbnail;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(final String mimeType) {
		this.mimeType = mimeType;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(final Integer fileSize) {
		this.fileSize = fileSize;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(final String caption) {
		this.caption = caption;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result
				+ ((fileSize == null) ? 0 : fileSize.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result
				+ ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result
				+ ((thumb == null) ? 0 : thumb.hashCode());
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
		Video other = (Video) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
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
		if (mimeType == null) {
			if (other.mimeType != null)
				return false;
		} else if (!mimeType.equals(other.mimeType))
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
		return "Video [fileId=" + fileId + ", width=" + width + ", height="
				+ height + ", duration=" + duration + ", thumbnail="
				+ thumb + ", mimeType=" + mimeType + ", fileSize="
				+ fileSize + ", caption=" + caption + "]";
	}
	
	
}


