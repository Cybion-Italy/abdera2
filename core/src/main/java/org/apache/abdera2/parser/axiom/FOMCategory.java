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
package org.apache.abdera2.parser.axiom;

import javax.xml.namespace.QName;

import org.apache.abdera2.common.Constants;
import org.apache.abdera2.common.iri.IRI;
import org.apache.abdera2.model.Category;
import org.apache.abdera2.model.Element;
import org.apache.axiom.om.OMContainer;
import org.apache.axiom.om.OMException;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMXMLParserWrapper;

public class FOMCategory extends FOMExtensibleElement implements Category {

    private static final long serialVersionUID = -4313042828936786803L;

    public FOMCategory() {
        super(Constants.CATEGORY);
    }

    public FOMCategory(String term) {
        this();
        setTerm(term);
    }

    public FOMCategory(String term, String scheme, String label) {
        this();
        setTerm(term);
        setScheme(scheme);
        setLabel(label);
    }

    public FOMCategory(String name, OMNamespace namespace, OMContainer parent, OMFactory factory) throws OMException {
        super(name, namespace, parent, factory);
    }

    public FOMCategory(QName qname, OMContainer parent, OMFactory factory) {
        super(qname, parent, factory);
    }

    public FOMCategory(QName qname, OMContainer parent, OMFactory factory, OMXMLParserWrapper builder) {
        super(qname, parent, factory, builder);
    }

    public FOMCategory(OMContainer parent, OMFactory factory) {
        super(CATEGORY, parent, factory);
    }

    public FOMCategory(OMContainer parent, OMFactory factory, OMXMLParserWrapper builder) {
        super(CATEGORY, parent, factory, builder);
    }

    public String getTerm() {
        return getAttributeValue(TERM);
    }

    public Category setTerm(String term) {
      complete();
      return setAttributeValue(TERM,term);
    }

    public IRI getScheme() {
        String value = getAttributeValue(SCHEME);
        return (value != null) ? new IRI(value) : null;
    }

    public Category setScheme(String scheme) {
      complete();
      return setAttributeValue(SCHEME,scheme==null?null:new IRI(scheme).toString());
    }

    public String getLabel() {
        return getAttributeValue(LABEL);
    }

    public Category setLabel(String label) {
      complete();
      return setAttributeValue(LABEL, label);
    }

    public String getValue() {
        return getText();
    }

    public void setValue(String value) {
        complete();
        if (value != null)
            ((Element)this).setText(value);
        else
            _removeAllChildren();
    }

}
