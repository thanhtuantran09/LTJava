package models;


public abstract class Model {

    @Override
    public abstract String toString();

    public abstract Object[] toRowTable();
}
