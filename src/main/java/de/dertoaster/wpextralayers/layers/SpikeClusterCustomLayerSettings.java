package de.dertoaster.wpextralayers.layers;

import org.pepsoft.worldpainter.layers.Layer;
import org.pepsoft.worldpainter.layers.exporters.ExporterSettings;

public class SpikeClusterCustomLayerSettings implements ExporterSettings {
    @Override
    public boolean isApplyEverywhere() {
        return false;
    }

    @Override
    public Layer getLayer() {
        return null;
    }

    @Override
    public ExporterSettings clone() {
        return null;
    }
}
