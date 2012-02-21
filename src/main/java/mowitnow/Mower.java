package mowitnow;

public class Mower {

    private Position position = Position.atOrigin();
    private Orientation orientation = Orientation.North;

    private Mower() {
    }

    public Mower(Position initialPosition) {
        this.position = initialPosition;
    }

    public Mower(Position initialPosition, Orientation orientation) {
        this.position = initialPosition;
        this.orientation = orientation;
    }

    Position getPosition() {
        return position;
    }

    public void orient(Orientation orientation) {
        this.orientation = orientation;
    }

    public void move() {
        this.position = orientation.move(position);
    }

    public static Mower createMowerAtOriginFacingNorth() {
        return new Mower();
    }

    public void pivotLeft() {
        this.orientation = orientation.pivotLeft();
    }

    public void pivotRight() {
        this.orientation = orientation.pivotRight();
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
