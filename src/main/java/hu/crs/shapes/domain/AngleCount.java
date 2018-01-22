package hu.crs.shapes.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AngleCount {

    ZERO(0), THREE(4), FOUR(4);
    private final int angleCount;
}
