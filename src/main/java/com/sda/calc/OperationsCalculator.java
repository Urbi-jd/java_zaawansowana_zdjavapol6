package com.sda.calc;

public class OperationsCalculator {
    MathematicalOperation operation;

    public OperationsCalculator(MathematicalOperation operation) {
        this.operation = operation;
    }

    public void setOperation(MathematicalOperation operation){
        this.operation = operation;
    }

    double applyOperation(double x, double y){
        return operation.calculate(x, y);
    }
}
