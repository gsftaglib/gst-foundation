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
package com.fatwire.gst.foundation.controller;

/**
 * This interface represents the context in which an application is running.
 * It's sole purpose is providing access to objects based on a name.
 * <p/>
 * Implementations are either providing their own Factory and Dependency injection framework, or delegate to (a combination of) dependency injections frameworks. 
 * 
 * 
 * @author Dolf.Dijkstra
 * @since 4 April 2012
 * 
 */
public interface AppContext{

    <T> T getBean(String name, Class<T> c);

    void init();

}
