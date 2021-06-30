package io.lighty.modules.gnmi.connector.gnoi.invokers.impl;

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
import gnoi.sonic.SonicServiceGrpc;
import gnoi.sonic.SonicServiceGrpc.SonicServiceFutureStub;
import io.grpc.Channel;
import io.lighty.modules.gnmi.connector.gnoi.invokers.api.GnoiSonicInvoker;

public final class GnoiSonicInvokerImpl implements GnoiSonicInvoker {

    private final SonicServiceFutureStub futureStub;

    private GnoiSonicInvokerImpl(final SonicServiceFutureStub futureStub) {
        this.futureStub = futureStub;
    }

    public static GnoiSonicInvokerImpl fromChannel(final Channel channel) {
        return new GnoiSonicInvokerImpl(SonicServiceGrpc.newFutureStub(channel));
    }

    public ListenableFuture<ClearNeighborsResponse> clearNeighbors(ClearNeighborsRequest request) {
        return futureStub.clearNeighbors(request);
    }

    public ListenableFuture<CopyConfigResponse> copyConfig(CopyConfigRequest request) {
        return futureStub.copyConfig(request);
    }

    public ListenableFuture<ImageDefaultResponse> imageDefault(ImageDefaultRequest request) {
        return futureStub.imageDefault(request);
    }

    public ListenableFuture<ImageInstallResponse> imageInstall(ImageInstallRequest request) {
        return futureStub.imageInstall(request);
    }

    public ListenableFuture<ImageRemoveResponse> imageRemove(ImageRemoveRequest request) {
        return futureStub.imageRemove(request);
    }

    public ListenableFuture<TechsupportResponse> showTechsupport(TechsupportRequest request) {
        return futureStub.showTechsupport(request);
    }

}
