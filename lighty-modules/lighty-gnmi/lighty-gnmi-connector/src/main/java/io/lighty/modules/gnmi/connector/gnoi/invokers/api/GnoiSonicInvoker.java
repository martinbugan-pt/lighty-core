package io.lighty.modules.gnmi.connector.gnoi.invokers.api;

import com.google.common.util.concurrent.ListenableFuture;
import gnoi.sonic.SonicGnoi.ClearNeighborsRequest;
import gnoi.sonic.SonicGnoi.ClearNeighborsResponse;
import gnoi.sonic.SonicGnoi.CopyConfigRequest;
import gnoi.sonic.SonicGnoi.CopyConfigResponse;
import gnoi.sonic.SonicGnoi.ImageDefaultRequest;
import gnoi.sonic.SonicGnoi.ImageDefaultResponse;
import gnoi.sonic.SonicGnoi.ImageInstallRequest;
import gnoi.sonic.SonicGnoi.ImageInstallResponse;
import gnoi.sonic.SonicGnoi.ImageRemoveRequest;
import gnoi.sonic.SonicGnoi.ImageRemoveResponse;
import gnoi.sonic.SonicGnoi.TechsupportRequest;
import gnoi.sonic.SonicGnoi.TechsupportResponse;

/**
 * Interface exposing sonic-gnoi methods.
 */
public interface GnoiSonicInvoker {

    ListenableFuture<ClearNeighborsResponse> clearNeighbors(ClearNeighborsRequest request);

    ListenableFuture<CopyConfigResponse> copyConfig(CopyConfigRequest request);

    ListenableFuture<ImageDefaultResponse> imageDefault(ImageDefaultRequest request);

    ListenableFuture<ImageInstallResponse> imageInstall(ImageInstallRequest request);

    ListenableFuture<ImageRemoveResponse> imageRemove(ImageRemoveRequest request);

    ListenableFuture<TechsupportResponse> showTechsupport(TechsupportRequest request);

}
