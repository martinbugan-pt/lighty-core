/*
 * Copyright (c) 2021 PANTHEON.tech s.r.o. All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v10.html
 */

package io.lighty.modules.gnmi.connector.gnoi.session.api;

import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiCertInvoker;
import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiFileInvoker;
import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiOsInvoker;
import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiSonicInvoker;
import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiSystemInvoker;

public interface GnoiSession {


    GnoiCertInvoker getCertInvoker();

    GnoiFileInvoker getFileInvoker();

    GnoiSystemInvoker getSystemInvoker();

    GnoiOsInvoker getOsInvoker();

    GnoiSonicInvoker getSonicInvoker();

}
