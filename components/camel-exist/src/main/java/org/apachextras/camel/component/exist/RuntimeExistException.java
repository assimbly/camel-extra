/**************************************************************************************
 * Copyright (C) 2008 - 2012 Camel Extra Team. All rights reserved.                   *
 * http://code.google.com/a/apache-extras.org/p/camel-extra/                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package org.apachextras.camel.component.exist;

import org.apache.camel.RuntimeCamelException;
import org.xmldb.api.base.XMLDBException;

public class RuntimeExistException extends RuntimeCamelException {
    private ExistEndpoint endpoint;

    public RuntimeExistException(ExistEndpoint endpoint, XMLDBException e) {
        super("Failed to process: " + endpoint + ". Reason: " + e, e);
        this.endpoint = endpoint;
    }

    public ExistEndpoint getEndpoint() {
        return endpoint;
    }
}