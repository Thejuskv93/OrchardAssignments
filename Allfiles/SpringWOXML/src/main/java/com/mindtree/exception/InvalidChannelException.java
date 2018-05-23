package com.mindtree.exception;

public class InvalidChannelException extends RuntimeException
{
	String msg="Invalid Channel";
	public String getMessage()
	{
		return msg;
	}

}
