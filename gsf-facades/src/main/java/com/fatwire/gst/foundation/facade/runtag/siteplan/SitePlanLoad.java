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

package com.fatwire.gst.foundation.facade.runtag.siteplan;

import com.fatwire.gst.foundation.facade.runtag.AbstractTagRunner;

/**
 * <siteplan:load name="name" nodeid="nodeid"/>
 * 
 * @author Tony Field
 * @since Sep 28, 2008
 */
public class SitePlanLoad extends AbstractTagRunner {
    public SitePlanLoad() {
        super("SITEPLAN.LOAD");
    }

    public void setName(String name) {
        set("NAME", name);
    }

    public void setNodeid(String nodeid) {
        set("NODEID", nodeid);
    }
}
