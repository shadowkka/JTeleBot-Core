/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package com.nixabyte.telegram.jtelebot.server.impl;

import com.nixabyte.telegram.jtelebot.client.RequestHandler;
import com.nixabyte.telegram.jtelebot.response.json.Message;
import com.nixabyte.telegram.jtelebot.server.Command;

public abstract class AbstractCommand implements Command {

	protected Message message;
	protected RequestHandler requestHandler;

	public AbstractCommand(final Message message,
			final RequestHandler requestHandler) {
		this.message = message;
		this.requestHandler = requestHandler;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public RequestHandler getRequestHandler() {
		return requestHandler;
	}

	public void setRequestHandler(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
	}

	@Override
	public abstract void execute();

}