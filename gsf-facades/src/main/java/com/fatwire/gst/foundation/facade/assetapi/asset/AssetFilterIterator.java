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
package com.fatwire.gst.foundation.facade.assetapi.asset;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Util.ftMessage;

import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetId;
import com.fatwire.gst.foundation.facade.assetapi.AssetAccessTemplate;
import com.fatwire.gst.foundation.facade.assetapi.AssetClosure;
import com.fatwire.gst.foundation.facade.assetapi.AttributeDataUtils;
import com.openmarket.xcelerate.interfaces.IAsset;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AssetFilterIterator implements Iterable<AssetId> {

    final List<AssetId> list = new LinkedList<AssetId>();

    /**
     * @param ics
     * @param saat
     * @param assetIds
     */
    public AssetFilterIterator(final ICS ics, final AssetAccessTemplate saat, final Iterable<AssetId> assetIds) {
        this(ics, saat, new Date(), assetIds);

    }

    /**
     * @param ics
     * @param saat
     * @param date
     * @param assetIds
     */

    public AssetFilterIterator(final ICS ics, final AssetAccessTemplate saat, Date date,
            final Iterable<AssetId> assetIds) {
        super();

        final AssetClosure target = new AssetClosure() {
            public boolean work(final AssetData asset) {
                list.add(asset.getAssetId());
                return true;
            }
        };
        final AssetClosure closure = new DateFilterClosure(ics, date, target);

        saat.readAsset(assetIds, closure, "startdate", "enddate");

    }

    public Iterator<AssetId> iterator() {
        return list.iterator();
    }
}
