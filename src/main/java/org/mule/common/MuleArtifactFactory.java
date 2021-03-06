/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.common;

public interface MuleArtifactFactory<R, C>
{

    MuleArtifact getArtifact(R representation, C callback) throws MuleArtifactFactoryException;
    
    MuleArtifact getArtifactForMessageProcessor(R representation, C callback) throws MuleArtifactFactoryException;
    
    void returnArtifact(MuleArtifact artifact);

}
