package ru.mirea.PR24;

import java.util.function.Function;

public abstract class AbstractChairFactory {

    protected abstract Chair createChair(ChairType type);
}
