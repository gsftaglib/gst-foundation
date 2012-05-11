/*
 * Copyright 2011 FatWire Corporation. All Rights Reserved.
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
package com.fatwire.gst.foundation.controller.action.support;

import COM.FutureTense.Interfaces.ICS;

import com.fatwire.gst.foundation.controller.action.Action;
import com.fatwire.gst.foundation.controller.action.Injector;
import com.fatwire.gst.foundation.controller.action.RenderPage;

/**
 * ActionLocator that always returns a {@link RenderPage} action.
 * 
 * @author Dolf Dijkstra
 *
 */
public final class RenderPageActionLocator extends AbstractActionLocator {
    public RenderPageActionLocator(Injector injector) {
        super(injector);
    }

    @Override
    protected Action doFindAction(ICS ics, String name) {
        return new RenderPage();
    }
}