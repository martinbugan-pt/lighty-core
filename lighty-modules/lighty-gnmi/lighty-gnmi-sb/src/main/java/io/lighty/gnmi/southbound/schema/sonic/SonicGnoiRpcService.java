package io.lighty.gnmi.southbound.schema.sonic;

import com.google.common.util.concurrent.ListenableFuture;
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

public class SonicGnoiRpcService implements SonicGnoiYangService {

    public SonicGnoiRpcService() {}

    @Override
    public ListenableFuture<RpcResult<ShowTechsupportOutput>> showTechsupport(ShowTechsupportInput input) {
        return null;
    }

    @Override
    public ListenableFuture<RpcResult<CopyConfigOutput>> copyConfig(CopyConfigInput input) {
        return null;
    }

    @Override
    public ListenableFuture<RpcResult<ImageInstallOutput>> imageInstall(ImageInstallInput input) {
        return null;
    }

    @Override
    public ListenableFuture<RpcResult<ImageRemoveOutput>> imageRemove(ImageRemoveInput input) {
        return null;
    }

    @Override
    public ListenableFuture<RpcResult<ImageDefaultOutput>> imageDefault(ImageDefaultInput input) {
        return null;
    }

    @Override
    public ListenableFuture<RpcResult<ClearNeighborsOutput>> clearNeighbors(ClearNeighborsInput input) {
        return null;
    }

}
