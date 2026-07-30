package de.dertoaster.wpextralayers.layers.object;

import org.pepsoft.minecraft.Entity;
import org.pepsoft.minecraft.Material;
import org.pepsoft.minecraft.TileEntity;
import org.pepsoft.util.AttributeKey;
import org.pepsoft.worldpainter.layers.bo2.Bo2ObjectProvider;
import org.pepsoft.worldpainter.objects.AbstractObject;
import org.pepsoft.worldpainter.objects.WPObject;

import javax.vecmath.Point3i;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SpikeClusterObjectProvider extends AbstractObject implements Bo2ObjectProvider {
    @Override
    public String getName() {
        return "SpikeClusterObjectProvider";
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public Point3i getDimensions() {
        return null;
    }

    @Override
    public Material getMaterial(int i, int i1, int i2) {
        return null;
    }

    @Override
    public boolean getMask(int i, int i1, int i2) {
        return false;
    }

    @Override
    public List<Entity> getEntities() {
        return List.of();
    }

    @Override
    public List<TileEntity> getTileEntities() {
        return List.of();
    }

    @Override
    public Map<String, Serializable> getAttributes() {
        return Map.of();
    }

    @Override
    public void setAttributes(Map<String, Serializable> map) {

    }

    @Override
    public <T extends Serializable> void setAttribute(AttributeKey<T> attributeKey, T t) {

    }

    @Override
    public WPObject getObject() {
        return this;
    }

    @Override
    public List<WPObject> getAllObjects() {
        return Collections.singletonList(this);
    }

    @Override
    public void setSeed(long l) {
        // Ignore
    }

}
