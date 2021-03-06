/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.common.security.oauth.exception;

/**
 * Exception thrown when the access token needed for accessing a protected resource
 * cannot be acquired
 */
public class UnableToAcquireAccessTokenException extends Exception
{

    private static final long serialVersionUID = -7852877331906351776L;

    public UnableToAcquireAccessTokenException(Throwable throwable)
    {
        super(throwable);
    }
    
    public UnableToAcquireAccessTokenException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

}
