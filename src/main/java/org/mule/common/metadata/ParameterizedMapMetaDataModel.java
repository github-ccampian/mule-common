/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.common.metadata;

/**
 * Represents a map with unknown keys. For example can be MAP<POJO, POJO>
 */
public interface ParameterizedMapMetaDataModel extends MetaDataModel
{
    public String getName();
    public MetaDataModel getKeyMetaDataModel();
    public MetaDataModel getValueMetaDataModel();
}