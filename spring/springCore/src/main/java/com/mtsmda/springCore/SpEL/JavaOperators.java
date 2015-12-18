package com.mtsmda.springCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "SpELJavaOp")
public class JavaOperators {

    @Value(value = "#{1 == 2}")
    boolean equalsOp;

    @Value(value = "#{1 != 3}")
    boolean notEqualsOp;

    @Value(value = "#{1 < 3}")
    boolean less;

    @Value(value = "#{1 <= 0}")
    boolean lessOrEqual;

    @Value(value = "#{SpELJavaOp.equalsOp and SpELJavaOp.lessOrEqual}")
    boolean simpleAnd;

    @Value(value = "#{SpELJavaOp.equalsOp or SpELJavaOp.notEqualsOp}")
    boolean simpleOr;

    boolean lessThan;
    boolean lessEquals;

    @Value("#{tellBean.get100(50) > 100000 ? 'tellBean.get100(50) > 100000' : 'tellBean.get100(50) > 100000 - this is false'}")
    String arbitrary;

    public boolean isEqualsOp() {
        return equalsOp;
    }

    public void setEqualsOp(boolean equalsOp) {
        this.equalsOp = equalsOp;
    }

    public boolean isNotEqualsOp() {
        return notEqualsOp;
    }

    public void setNotEqualsOp(boolean notEqualsOp) {
        this.notEqualsOp = notEqualsOp;
    }

    public boolean isLess() {
        return less;
    }

    public void setLess(boolean less) {
        this.less = less;
    }

    public boolean isLessOrEqual() {
        return lessOrEqual;
    }

    public void setLessOrEqual(boolean lessOrEqual) {
        this.lessOrEqual = lessOrEqual;
    }

    public boolean isSimpleAnd() {
        return simpleAnd;
    }

    public void setSimpleAnd(boolean simpleAnd) {
        this.simpleAnd = simpleAnd;
    }

    public boolean isSimpleOr() {
        return simpleOr;
    }

    public void setSimpleOr(boolean simpleOr) {
        this.simpleOr = simpleOr;
    }

    public boolean isLessThan() {
        return lessThan;
    }

    public void setLessThan(boolean lessThan) {
        this.lessThan = lessThan;
    }

    public boolean isLessEquals() {
        return lessEquals;
    }

    public void setLessEquals(boolean lessEquals) {
        this.lessEquals = lessEquals;
    }

    public String getArbitrary() {
        return arbitrary;
    }

    public void setArbitrary(String arbitrary) {
        this.arbitrary = arbitrary;
    }

    @Override
    public String toString() {
        return "JavaOperators{" +
                "equalsOp=" + equalsOp +
                ", notEqualsOp=" + notEqualsOp +
                ", less=" + less +
                ", lessOrEqual=" + lessOrEqual +
                ", simpleAnd=" + simpleAnd +
                ", simpleOr=" + simpleOr +
                '}';
    }
}