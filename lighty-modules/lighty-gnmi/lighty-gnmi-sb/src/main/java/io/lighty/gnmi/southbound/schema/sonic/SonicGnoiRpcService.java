package io.lighty.gnmi.southbound.schema.sonic;

import static io.lighty.gnmi.southbound.schema.sonic.SonicGnoiBuildUtils.buildOutputFromResponse;
import static io.lighty.gnmi.southbound.schema.sonic.SonicGnoiBuildUtils.buildRequestFromInput;

import com.google.common.util.concurrent.Futures;
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
import io.lighty.modules.gnmi.connector.gnoi.session.api.GnoiSession;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ClearNeighborsInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ClearNeighborsOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.CopyConfigInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.CopyConfigOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageDefaultInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageDefaultOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageInstallInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageInstallOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageRemoveInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageRemoveOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ShowTechsupportInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ShowTechsupportOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.SonicGnoiYangService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;

public class SonicGnoiRpcService implements SonicGnoiYangService {

    private static final long RESPONSE_WAIT_TIME_MS = 20_000L;

    private final GnoiSession gnoiSession;

    public SonicGnoiRpcService(final GnoiSession gnoiSession) {
        this.gnoiSession = gnoiSession;
    }

    @Override
    public ListenableFuture<RpcResult<ShowTechsupportOutput>> showTechsupport(ShowTechsupportInput input) {
        final TechsupportRequest request = buildRequestFromInput(input);
        final ListenableFuture<TechsupportResponse> futureResponse =
            gnoiSession.getSonicInvoker().showTechsupport(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @Override
    public ListenableFuture<RpcResult<CopyConfigOutput>> copyConfig(CopyConfigInput input) {
        final CopyConfigRequest request = buildRequestFromInput(input);
        final ListenableFuture<CopyConfigResponse> futureResponse = gnoiSession.getSonicInvoker().copyConfig(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @Override
    public ListenableFuture<RpcResult<ImageInstallOutput>> imageInstall(ImageInstallInput input) {
        final ImageInstallRequest request = buildRequestFromInput(input);
        final ListenableFuture<ImageInstallResponse> futureResponse =
            gnoiSession.getSonicInvoker().imageInstall(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @Override
    public ListenableFuture<RpcResult<ImageRemoveOutput>> imageRemove(ImageRemoveInput input) {
        final ImageRemoveRequest request = buildRequestFromInput(input);
        final ListenableFuture<ImageRemoveResponse> futureResponse = gnoiSession.getSonicInvoker().imageRemove(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @Override
    public ListenableFuture<RpcResult<ImageDefaultOutput>> imageDefault(ImageDefaultInput input) {
        final ImageDefaultRequest request = buildRequestFromInput(input);
        final ListenableFuture<ImageDefaultResponse> futureResponse =
            gnoiSession.getSonicInvoker().imageDefault(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    @Override
    public ListenableFuture<RpcResult<ClearNeighborsOutput>> clearNeighbors(ClearNeighborsInput input) {
        final ClearNeighborsRequest request = buildRequestFromInput(input);
        final ListenableFuture<ClearNeighborsResponse> futureResponse =
            gnoiSession.getSonicInvoker().clearNeighbors(request);

        try {
            return Futures.immediateFuture(
                RpcResultBuilder.success(
                    buildOutputFromResponse(futureResponse.get(RESPONSE_WAIT_TIME_MS, TimeUnit.MILLISECONDS))
                ).build()
            );
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

}
