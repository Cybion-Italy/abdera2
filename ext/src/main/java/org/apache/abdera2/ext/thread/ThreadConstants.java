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
package org.apache.abdera2.ext.thread;

import javax.xml.namespace.QName;

import org.apache.abdera2.common.Constants;

public interface ThreadConstants extends Constants {

    public static final String THR_NS = "http://purl.org/syndication/thread/1.0";
    public static final String LN_INREPLYTO = "in-reply-to";
    public static final String LN_REF = "ref";
    public static final String LN_COUNT = "count";
    public static final String LN_WHEN = "when";
    public static final String LN_TOTAL = "total";
    public static final String THR_PREFIX = "thr";
    public static final QName IN_REPLY_TO = new QName(THR_NS, LN_INREPLYTO, THR_PREFIX);
    public static final QName THRCOUNT = new QName(THR_NS, LN_COUNT, THR_PREFIX);
    /** @deprecated Use Constants.THRUPDATED */
    public static final QName THRWHEN = new QName(THR_NS, LN_WHEN, THR_PREFIX);
    public static final QName THRUPDATED = new QName(THR_NS, LN_UPDATED, THR_PREFIX);
    public static final QName THRTOTAL = new QName(THR_NS, LN_TOTAL, THR_PREFIX);
    public static final QName THRREF = new QName(LN_REF);
    public static final QName THRSOURCE = new QName(LN_SOURCE);

}
