/*
 * *
 *  * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *  *
 *  * WSO2 Inc. licenses this file to you under the Apache License,
 *  * Version 2.0 (the "License"); you may not use this file except
 *  * in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package org.wso2.gw.emulator;

import io.netty.handler.codec.http.HttpMethod;
import org.wso2.gw.emulator.core.Emulator;

public class ClientTest {

    public static void main(String args[]) {
        Emulator.getHttpEmulator().producer().host("127.0.0.1").port(6065)
                .when(org.wso2.gw.emulator.http.dsl.dto.producer.IncomingMessage.request().withPath("/user")
                              .withBody("TestRequest").withMethod(HttpMethod.POST))
                .respond(org.wso2.gw.emulator.http.dsl.dto.producer.OutgoingMessage.response().withBody("Test Response1"))
                .operations().send();
    }
}
