package io.lighty.gnmi.southbound.schema.sonic;

import gnoi.sonic.SonicGnoi;
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
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ClearNeighborsInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ClearNeighborsOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ClearNeighborsOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.CopyConfigInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.CopyConfigOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.CopyConfigOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageDefaultInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageDefaultOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageDefaultOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageInstallInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageInstallOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageInstallOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageRemoveInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageRemoveOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ImageRemoveOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ShowTechsupportInput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ShowTechsupportOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.ShowTechsupportOutputBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.clearneighbors.output.ClearNeighborsResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.copyconfig.output.CopyConfigResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.imagedefault.output.ImageDefaultResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.imageinstall.output.ImageInstallResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.imageremove.output.ImageRemoveResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.showtechsupport.output.TechsupportResponseBuilder;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.sonicoutput.SonicOutput;
import org.opendaylight.yang.gen.v1.sonic.gnoi.yang.rev210614.sonicoutput.SonicOutputBuilder;

final class SonicGnoiBuildUtils {

    private SonicGnoiBuildUtils() {
        //Hide constructor
    }

    //REQUEST FROM INPUT
    static TechsupportRequest buildRequestFromInput(ShowTechsupportInput input) {
        return TechsupportRequest.newBuilder()
            .setInput(
                TechsupportRequest.Input.newBuilder()
                    .setDate(input.getTechsupportRequest().getDate())
            ).build();
    }

    static CopyConfigRequest buildRequestFromInput(CopyConfigInput input) {
        return CopyConfigRequest.newBuilder()
            .setInput(
                CopyConfigRequest.Input.newBuilder()
                    .setDestination(input.getCopyConfigRequest().getDestination())
                    .setSource(input.getCopyConfigRequest().getSource())
                    .setOverwrite(input.getCopyConfigRequest().getOverwrite())
                    .build()
            ).build();
    }

    static ImageInstallRequest buildRequestFromInput(ImageInstallInput input) {
        return ImageInstallRequest.newBuilder()
            .setInput(
                ImageInstallRequest.Input.newBuilder()
                    .setImagename(input.getImageInstallRequest().getImagename())
            ).build();
    }

    static ImageRemoveRequest buildRequestFromInput(ImageRemoveInput input) {
        return ImageRemoveRequest.newBuilder()
            .setInput(
                ImageRemoveRequest.Input.newBuilder()
                    .setImagename(input.getImageRemoveRequest().getImagename())
            ).build();
    }

    static ImageDefaultRequest buildRequestFromInput(ImageDefaultInput input) {
        return ImageDefaultRequest.newBuilder()
            .setInput(
                ImageDefaultRequest.Input.newBuilder()
                    .setImagename(input.getImageDefaultRequest().getImagename())
            ).build();
    }

    static ClearNeighborsRequest buildRequestFromInput(ClearNeighborsInput input) {
        return ClearNeighborsRequest.newBuilder()
            .setInput(
                ClearNeighborsRequest.Input.newBuilder()
                    .setIp(input.getClearNeighborsRequest().getIp())
                    .setIfname(input.getClearNeighborsRequest().getIfname())
                    .setFamily(input.getClearNeighborsRequest().getFamily())
                    .setForce(input.getClearNeighborsRequest().getForce())
            ).build();
    }

    //OUTPUT FROM RESPONSE
    static ShowTechsupportOutput buildOutputFromResponse(TechsupportResponse response) {
        return new ShowTechsupportOutputBuilder()
            .setTechsupportResponse(
                new TechsupportResponseBuilder()
                    .setOutputFilename(response.getOutput().getOutputFilename())
                    .build()
            ).build();
    }

    static CopyConfigOutput buildOutputFromResponse(CopyConfigResponse response) {
        return new CopyConfigOutputBuilder()
            .setCopyConfigResponse(
                new CopyConfigResponseBuilder()
                    .setSonicOutput(buildYangSonicOutputFromGnoiSonicOutput(response.getOutput()))
                    .build()
            ).build();
    }

    static ImageInstallOutput buildOutputFromResponse(ImageInstallResponse response) {
        return new ImageInstallOutputBuilder()
            .setImageInstallResponse(
                new ImageInstallResponseBuilder()
                    .setSonicOutput(buildYangSonicOutputFromGnoiSonicOutput(response.getOutput()))
                    .build()
            ).build();
    }

    static ImageRemoveOutput buildOutputFromResponse(ImageRemoveResponse response) {
        return new ImageRemoveOutputBuilder()
            .setImageRemoveResponse(
                new ImageRemoveResponseBuilder()
                    .setSonicOutput(buildYangSonicOutputFromGnoiSonicOutput(response.getOutput()))
                    .build()
            ).build();
    }

    static ImageDefaultOutput buildOutputFromResponse(ImageDefaultResponse response) {
        return new ImageDefaultOutputBuilder()
            .setImageDefaultResponse(
                new ImageDefaultResponseBuilder()
                    .setSonicOutput(buildYangSonicOutputFromGnoiSonicOutput(response.getOutput()))
                    .build()
            ).build();
    }

    static ClearNeighborsOutput buildOutputFromResponse(ClearNeighborsResponse response) {
        return new ClearNeighborsOutputBuilder()
            .setClearNeighborsResponse(
                new ClearNeighborsResponseBuilder()
                    .setResponse(response.getOutput().getResponse())
                    .build()
            ).build();
    }

    //BUILD GNOI SONIC OUTPUT FROM YANG SONIC OUTPUT
    static SonicGnoi.SonicOutput buildGnoiSonicOutputFromYangSonicOutput(SonicOutput output) {
        return SonicGnoi.SonicOutput.newBuilder()
            .setStatusDetail(output.getStatusDetail())
            .setStatus(output.getStatus())
            .build();
    }

    static SonicOutput buildYangSonicOutputFromGnoiSonicOutput(SonicGnoi.SonicOutput output) {
        return new SonicOutputBuilder()
            .setStatus(output.getStatus())
            .setStatusDetail(output.getStatusDetail())
            .build();
    }

}
