package org.top.coinusapiapplication.api.message;

public class SideResultMessage implements OutputMessage {
    private final String sideC;
    private final String sideA;
    private final String sideB;
    private final String angle;

    public SideResultMessage(
            String sideC,
            String sideA,
            String sideB,
            String angle) {
        this.sideC = sideC;
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public String getSideC() {
        return sideC;
    }

    public String getSideA() {
        return sideA;
    }

    public String getSideB() {
        return sideB;
    }

    public String getAngle() {
        return angle;
    }
}
