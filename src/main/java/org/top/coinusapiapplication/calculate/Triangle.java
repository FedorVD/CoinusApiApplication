package org.top.coinusapiapplication.calculate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;

import java.io.Serializable;
import java.util.Objects;

@JsonAutoDetect
public class Triangle implements Serializable {
    private Double a;
    private Double b;
    @JsonIgnore
    private @Nullable Double c;
    private Double angle;
    private String angleType;

    public Triangle() {}

    public Triangle(Double a, Double b, Double angle, String angleType) {
        this.a = a;
        this.b = b;
        this.angleType = angleType;

    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    @Nullable
    public Double getC() {
        if (angleType.equals("g")) {
            this.angle = Math.toRadians(angle);
        }
        else {
            this.angle = angle;
        }
        c = Math.sqrt(
            this.a * this.a + this.b * this.b -
            2 * this.a * this.b * Math.cos(this.angle));
        return c;
    }

    public Double getAngle() {
        return angle;
    }

    public String getAngleType() {
        return angleType;
    }

    public void setC(@Nullable Double c) {
        this.c = c;
    }
}
