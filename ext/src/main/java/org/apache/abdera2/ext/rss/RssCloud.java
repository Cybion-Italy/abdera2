/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.abdera2.ext.rss;

import javax.xml.namespace.QName;

import org.apache.abdera2.factory.Factory;
import org.apache.abdera2.model.Element;
import org.apache.abdera2.model.ElementWrapper;

public class RssCloud extends ElementWrapper {

    public RssCloud(Element internal) {
        super(internal);
    }

    public RssCloud(Factory factory, QName qname) {
        super(factory, qname);
    }

    public String getDomain() {
        return getAttributeValue("domain");
    }

    public int getPort() {
        String v = getAttributeValue("port");
        return (v != null) ? Integer.parseInt(v) : -1;
    }

    public String getPath() {
        return getAttributeValue("path");
    }

    public String getRegisterProcedure() {
        return getAttributeValue("registerProcedure");
    }

    public String getProtocol() {
        return getAttributeValue("protocol");
    }
}
