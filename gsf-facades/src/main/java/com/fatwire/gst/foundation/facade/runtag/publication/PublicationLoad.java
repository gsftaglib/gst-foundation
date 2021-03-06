/*
 * Copyright 2008 FatWire Corporation. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fatwire.gst.foundation.facade.runtag.publication;

import com.fatwire.gst.foundation.facade.runtag.AbstractTagRunner;

/**
 * @author Tony Field
 * @since 2012-03-23
 */
public final class PublicationLoad extends AbstractTagRunner {

    public PublicationLoad() {
        super("PUBLICATION.LOAD");
    }

    public void setName(String s) {
        set("NAME", s);
    }
    
    public void setField(String s) {
        set("FIELD", s);
    }
    public void setValue(String s) {
        set("VALUE", s);
    }
}