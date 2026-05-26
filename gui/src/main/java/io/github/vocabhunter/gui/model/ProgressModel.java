/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.marked.WordState;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.NumberExpression;
import javafx.beans.property.SimpleIntegerProperty;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class ProgressModel {

    private static final double PERCENT = 100;

    private final SimpleIntegerProperty known = new SimpleIntegerProperty();

    private final SimpleIntegerProperty unknown = new SimpleIntegerProperty();

    private final SimpleIntegerProperty unseenUnfiltered = new SimpleIntegerProperty();

    private final SimpleIntegerProperty unseenFiltered = new SimpleIntegerProperty();

    private final Map<WordState, SimpleIntegerProperty> properties;

    private final NumberBinding marked = known.add(unknown);

    private final NumberBinding totalVisible = known.add(unknown).add(unseenUnfiltered);

    private final NumberBinding total = totalVisible.add(unseenFiltered);

    private final NumberBinding knownPercent = bindPercentage(known, total);

    private final NumberBinding unknownPercent = bindPercentage(unknown, total);

    private final NumberBinding unseenUnfilteredPercent = bindPercentage(unseenUnfiltered, total);

    private final NumberBinding unseenUnfilteredPercentVisible = bindPercentage(unseenUnfiltered, totalVisible);

    private final NumberBinding unseenFilteredPercent = bindPercentage(unseenFiltered, total);

    private final NumberBinding markedPercentVisible = bindPercentage(marked, totalVisible);

    private NumberBinding bindPercentage(final NumberExpression property, final NumberBinding total) {
        return Bindings.when(property.isEqualTo(0)).then(0).otherwise(property.multiply(PERCENT).divide(total));
    }

    public SimpleIntegerProperty knownProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleIntegerProperty unknownProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleIntegerProperty unseenUnfilteredProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding unseenUnfilteredPercentVisibleProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleIntegerProperty unseenFilteredProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding markedProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding totalProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding knownPercentProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding unknownPercentProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding unseenUnfilteredPercentProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding unseenFilteredPercentProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberBinding markedPercentVisibleProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ProgressModel() {
        Map<WordState, SimpleIntegerProperty> map = new EnumMap<>(WordState.class);
        map.put(WordState.KNOWN, known);
        map.put(WordState.UNKNOWN, unknown);
        map.put(WordState.UNSEEN, unseenUnfiltered);
        this.properties = Collections.unmodifiableMap(map);
    }

    public void updateProgress(final int known, final int unknown, final int unseenUnfiltered, final int unseenFiltered) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void updateWord(final WordState oldState, final WordState newState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void updateValue(final SimpleIntegerProperty property, final int delta) {
        property.set(property.get() + delta);
    }
}
