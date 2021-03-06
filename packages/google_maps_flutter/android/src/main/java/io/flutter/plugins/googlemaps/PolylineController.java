package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;

import java.util.List;

class PolylineController implements PolylineOptionsSink {

    private final Polyline polyline;
    private final onPolylineTappedListener onTappedListener;

    PolylineController(Polyline polyline, onPolylineTappedListener onTappedListener) {
        this.polyline = polyline;
        this.onTappedListener = onTappedListener;
    }

    void onTap() {
        if (onTappedListener != null) {
            onTappedListener.onPolylineTapped(polyline);
        }
    }

    void remove() {
        polyline.remove();
    }

    @Override
    public void setPoints(List<LatLng> points) {
        polyline.setPoints(points);
    }

    @Override
    public void setClickable(boolean clickable) {
       polyline.setClickable(clickable);
    }

    @Override
    public void setColor(int color) {
        polyline.setColor(color);
    }

    @Override
    public void setEndCap(Cap endCap) {
        polyline.setEndCap(endCap);
    }

    @Override
    public void setGeodesic(boolean geodesic) {
        polyline.setGeodesic(geodesic);
    }

    @Override
    public void setJointType(int jointType) {
        polyline.setJointType(jointType);
    }

    @Override
    public void setPattern(List<PatternItem> pattern) {
        polyline.setPattern(pattern);
    }

    @Override
    public void setStartCap(Cap startCap) {
        polyline.setStartCap(startCap);
    }

    @Override
    public void setVisible(boolean visible) {
        polyline.setVisible(visible);
    }

    @Override
    public void setWidth(float width) {
        polyline.setWidth(width);
    }

    @Override
    public void setZIndex(float zIndex) {
        polyline.setZIndex(zIndex);
    }
}
