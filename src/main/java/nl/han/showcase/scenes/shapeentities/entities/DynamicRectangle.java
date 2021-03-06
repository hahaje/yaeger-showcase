package nl.han.showcase.scenes.shapeentities.entities;

import javafx.scene.paint.Color;
import nl.han.yaeger.engine.entities.entity.Location;
import nl.han.yaeger.engine.entities.entity.SceneBorderTouchingWatcher;
import nl.han.yaeger.engine.entities.entity.motion.Direction;
import nl.han.yaeger.engine.entities.entity.shape.rectangle.DynamicRectangleEntity;
import nl.han.yaeger.engine.scenes.SceneBorder;

public class DynamicRectangle extends DynamicRectangleEntity implements SceneBorderTouchingWatcher {

    public DynamicRectangle(Location initialPosition) {
        super(initialPosition);
        setWidth(40);
        setHeight(80);
        setOpacity(0.8);
        setFill(Color.PALEGREEN);
        setStrokeColor(Color.SPRINGGREEN);
        setStrokeWidth(4);
        setMotionTo(5, Direction.RIGHT.getValue());
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        changeDirectionBy(180);
    }
}
