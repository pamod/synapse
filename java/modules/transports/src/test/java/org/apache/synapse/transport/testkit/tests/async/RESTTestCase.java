/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.synapse.transport.testkit.tests.async;

import org.apache.synapse.transport.testkit.listener.AsyncChannel;
import org.apache.synapse.transport.testkit.listener.AsyncMessageSender;
import org.apache.synapse.transport.testkit.listener.AsyncMessageTestCase;
import org.apache.synapse.transport.testkit.listener.ContentTypeMode;
import org.apache.synapse.transport.testkit.message.MessageData;
import org.apache.synapse.transport.testkit.message.RESTMessage;
import org.apache.synapse.transport.testkit.name.DisplayName;
import org.apache.synapse.transport.testkit.server.AsyncEndpointFactory;

@DisplayName("REST")
public class RESTTestCase<C extends AsyncChannel<?>> extends AsyncMessageTestCase<C,RESTMessage,MessageData> {
    public RESTTestCase(C channel, AsyncMessageSender<? super C,RESTMessage> sender, AsyncEndpointFactory<? super C,MessageData> endpointFactory) {
        super(channel, sender, endpointFactory, ContentTypeMode.TRANSPORT, null, null);
    }
    
    @Override
    protected RESTMessage prepareMessage() throws Exception {
        return new RESTMessage();
    }

    @Override
    protected void checkMessageData(RESTMessage message, MessageData messageData) throws Exception {
        // TODO
    }
}