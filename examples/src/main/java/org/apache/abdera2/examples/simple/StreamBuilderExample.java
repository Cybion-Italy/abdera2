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
package org.apache.abdera2.examples.simple;

import org.apache.abdera2.Abdera;
import org.apache.abdera2.factory.StreamBuilder;
import org.apache.abdera2.model.Document;
import org.apache.abdera2.model.Feed;

/**
 * The StreamBuilder is an instance of StreamWriter that constructs a Feed 
 * Object Model instance.
 */
public class StreamBuilderExample {

    public static void main(String... args) throws Exception {

        Abdera abdera = Abdera.getInstance();

        StreamBuilder out = abdera.getWriterFactory().newStreamWriter("fom");
        out.startDocument().startFeed().writeBase("http://example.org").writeLanguage("en-US")
            .writeId("http://example.org").writeTitle("<Testing 123>").writeSubtitle("Foo").writeAuthor("James",
                                                                                                        null,
                                                                                                        null)
            .writeUpdatedNow().writeLink("http://example.org/foo").writeLink("http://example.org/bar", "self")
            .writeCategory("foo").writeCategory("bar").writeLogo("logo").writeIcon("icon")
            .writeGenerator("1.0", "http://example.org", "foo");

        for (int n = 0; n < 100; n++) {
            out.startEntry().writeId("http://example.org/" + n).writeTitle("Entry #" + n).writeUpdatedNow()
                .writePublishedNow().writeEditedNow().writeSummary("This is text summary")
                .writeAuthor("James", null, null).writeContributor("Joe", null, null).startContent("application/xml")
                .startElement("a", "b", "c").startElement("x", "y", "z").writeElementText("This is a test")
                .startElement("a").writeElementText("foo").endElement().startElement("b", "bar")
                .writeAttributeNow("foo").writeAttribute("bar", 123L).writeElementText(123.123).endElement()
                .endElement().endElement().endContent().endEntry();
        }

        Document<Feed> doc = out.endFeed().endDocument().getBase();

        doc.writeTo(System.out);
    }

}
