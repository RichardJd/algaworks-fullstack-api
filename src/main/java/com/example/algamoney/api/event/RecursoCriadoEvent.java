package com.example.algamoney.api.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private HttpServletResponse response;
	
	public RecursoCriadoEvent(Object source, Long codigo, HttpServletResponse response) {
		super(source);
		this.codigo = codigo;
		this.response = response;
	}

	public Long getCodigo() {
		return codigo;
	}

	public HttpServletResponse getResponse() {
		return response;
	}
}
