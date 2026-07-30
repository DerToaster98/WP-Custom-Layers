package de.dertoaster.wpextralayers.layers.exporters;

import de.dertoaster.wpextralayers.layers.SpikeClusterCustomLayer;
import org.pepsoft.worldpainter.Dimension;
import org.pepsoft.worldpainter.Platform;
import org.pepsoft.worldpainter.exporting.Fixup;
import org.pepsoft.worldpainter.exporting.IncidentalLayerExporter;
import org.pepsoft.worldpainter.exporting.MinecraftWorld;
import org.pepsoft.worldpainter.exporting.SecondPassLayerExporter;
import org.pepsoft.worldpainter.layers.exporters.ExporterSettings;
import org.pepsoft.worldpainter.layers.exporters.WPObjectExporter;

import javax.vecmath.Point3i;
import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SpikeClusterCustomLayerExporter extends WPObjectExporter<SpikeClusterCustomLayer> implements SecondPassLayerExporter, IncidentalLayerExporter {
    public SpikeClusterCustomLayerExporter(Dimension dimension, Platform platform, ExporterSettings settings, SpikeClusterCustomLayer layer) {
        super(dimension, platform, settings, layer);
    }

    @Override
    public Set<Stage> getStages() {
        return Collections.singleton(Stage.ADD_FEATURES);
    }

    @Override
    public List<Fixup> addFeatures(Rectangle area, Rectangle exportedArea, MinecraftWorld minecraftWorld) {
        return null;
    }

    @Override
    public Fixup apply(Point3i point3i, int i, Rectangle rectangle, MinecraftWorld minecraftWorld) {
        return null;
    }
}
